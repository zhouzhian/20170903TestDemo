package com.andy.test.testdemo;

/**
 * Created by Administrator on 2017/9/3 0003.
 */

public class TestSin {

    private static TestSin mTestSin = null;
    private TestSin(){}
    public static TestSin getInstance(){
        synchronized(TestSin.class){
            if(mTestSin == null){
                mTestSin = new TestSin();
            }
        }
        return mTestSin;
    }
}
