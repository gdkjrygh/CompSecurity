// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture.processors;

import com.google.android.libraries.commerce.ocr.util.Stopwatch;
import com.google.android.libraries.commerce.ocr.util.Ticker;
import java.util.concurrent.TimeUnit;

public final class IntervalPolicy
{

    private final int minIntervalInMs;
    private final Stopwatch stopwatch;

    public IntervalPolicy(int i)
    {
        this(i, Ticker.systemTicker());
    }

    private IntervalPolicy(int i, Ticker ticker)
    {
        minIntervalInMs = i;
        stopwatch = Stopwatch.createStarted(ticker);
    }

    public final boolean isOverInterval()
    {
        boolean flag;
        if (stopwatch.elapsed(TimeUnit.MILLISECONDS) >= (long)minIntervalInMs)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            stopwatch.reset().start();
        }
        return flag;
    }
}
