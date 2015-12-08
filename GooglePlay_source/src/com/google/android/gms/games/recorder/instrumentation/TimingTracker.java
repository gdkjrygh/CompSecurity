// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.instrumentation;


public final class TimingTracker
{

    private int mCount;
    private final String mName;
    private long mTotalTime;

    public TimingTracker()
    {
        this("(unnamed)");
    }

    public TimingTracker(String s)
    {
        mTotalTime = 0L;
        mCount = 0;
        mName = s;
    }

    public final String getDescription()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        double d = (double)mTotalTime / 1000000D;
        s = String.format("interval %s: %.0f/%d (avg %f ms)", new Object[] {
            mName, Double.valueOf(d), Integer.valueOf(mCount), Double.valueOf(d / (double)mCount)
        });
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public final void markTime(long l)
    {
        this;
        JVM INSTR monitorenter ;
        mTotalTime = mTotalTime + l;
        mCount = mCount + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
