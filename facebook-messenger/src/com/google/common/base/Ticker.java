// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


public abstract class Ticker
{

    private static final Ticker SYSTEM_TICKER = new _cls1();

    protected Ticker()
    {
    }

    public static Ticker systemTicker()
    {
        return SYSTEM_TICKER;
    }

    public abstract long read();


    private class _cls1 extends Ticker
    {

        public long read()
        {
            return Platform.systemNanoTime();
        }

        _cls1()
        {
        }
    }

}
