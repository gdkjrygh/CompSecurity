// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.log;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class LogMessageBouncer
{

    private static final long INTERVAL_LENGTH_MILLIS;
    private final AtomicInteger count;
    private final long intervalLengthMillis;
    private final AtomicLong intervalStart;
    private final int maxMessagesPerInterval;

    LogMessageBouncer()
    {
        this(50, INTERVAL_LENGTH_MILLIS);
    }

    private LogMessageBouncer(int i, long l)
    {
        intervalStart = new AtomicLong(0L);
        count = new AtomicInteger(0);
        maxMessagesPerInterval = i;
        intervalLengthMillis = l;
    }

    public final boolean permitLogMessage()
    {
        long l = SystemClock.elapsedRealtime();
        long l1 = intervalStart.get();
        if (l1 == 0L)
        {
            intervalStart.set(l);
            count.incrementAndGet();
        } else
        {
            if (l - l1 >= intervalLengthMillis)
            {
                intervalStart.set(l);
                count.set(1);
                return true;
            }
            if (count.incrementAndGet() > maxMessagesPerInterval)
            {
                return false;
            }
        }
        return true;
    }

    static 
    {
        INTERVAL_LENGTH_MILLIS = TimeUnit.HOURS.toMillis(12L);
    }
}
