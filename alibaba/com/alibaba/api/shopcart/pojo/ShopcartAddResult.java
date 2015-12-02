// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.shopcart.pojo;


public class ShopcartAddResult
{
    public class AcquireCoinResult
    {

        public boolean acquireCoinSuccess;
        public int acquiredCoinNum;
        public String coinUrl;
        public int remainCoinChanceCount;
        final ShopcartAddResult this$0;

        public AcquireCoinResult()
        {
            this$0 = ShopcartAddResult.this;
            super();
        }
    }


    public AcquireCoinResult acquireCoinResult;
    public int count;
    public int errorCode;
    public String errorMsg;
    public boolean isSuccess;
    public String shopcartId;

    public ShopcartAddResult()
    {
    }
}
