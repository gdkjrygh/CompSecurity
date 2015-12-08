// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.util;


public abstract class Ticker
{

    private static final Ticker SYSTEM_TICKER = new Ticker() {

        public final long read()
        {
            return System.nanoTime();
        }

    };

    protected Ticker()
    {
    }

    public static Ticker systemTicker()
    {
        return SYSTEM_TICKER;
    }

    public abstract long read();

}
