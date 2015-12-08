// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.instrumentation;

import android.os.SystemClock;
import android.util.SparseArray;

public final class Counter
{

    private SparseArray mBuckets;
    private int mCount;
    private long mLastTime;
    private final String mName;
    private final long mStartTime = SystemClock.elapsedRealtime();

    public Counter(String s)
    {
        mName = s;
        mCount = 0;
        mLastTime = mStartTime;
        mBuckets = new SparseArray(90);
    }

    public final int getCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i = mCount;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public final String getDescription()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        long l;
        l = mLastTime - mStartTime;
        obj = new StringBuilder(String.format("counter %s: %d", new Object[] {
            mName, Integer.valueOf(mCount)
        }));
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        ((StringBuilder) (obj)).append(String.format(" (avg %d/s)", new Object[] {
            Long.valueOf((1000L * (long)mCount) / l)
        }));
        int j;
        ((StringBuilder) (obj)).append("\ntime-series (by second) ");
        j = mBuckets.keyAt(mBuckets.size() - 1);
        int i = 0;
_L2:
        if (i > j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((StringBuilder) (obj)).append(mBuckets.get(i, Integer.valueOf(0)));
        ((StringBuilder) (obj)).append(" ");
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj = ((StringBuilder) (obj)).toString();
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public final long getElapsedTime()
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        long l1;
        l = mLastTime;
        l1 = mStartTime;
        this;
        JVM INSTR monitorexit ;
        return l - l1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void markEvent(int i)
    {
        this;
        JVM INSTR monitorenter ;
        mCount = mCount + i;
        long l = SystemClock.elapsedRealtime();
        int j = (int)((l - mStartTime) / 1000L);
        int k = ((Integer)mBuckets.get(j, Integer.valueOf(0))).intValue();
        mBuckets.append(j, Integer.valueOf(k + i));
        mLastTime = l;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
