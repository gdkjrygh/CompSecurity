// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.os.SystemClock;
import android.util.Log;

public class TimingMetric
{

    private final boolean disabled;
    private long duration;
    private final String eventName;
    private long start;
    private final String tag;

    public TimingMetric(String s, String s1)
    {
        eventName = s;
        tag = s1;
        boolean flag;
        if (!Log.isLoggable(s1, 2))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        disabled = flag;
    }

    private void reportToLog()
    {
        Log.v(tag, (new StringBuilder()).append(eventName).append(": ").append(duration).append("ms").toString());
    }

    public long getDuration()
    {
        return duration;
    }

    public void startMeasuring()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = disabled;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        start = SystemClock.elapsedRealtime();
        duration = 0L;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void stopMeasuring()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = disabled;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (duration == 0L)
        {
            duration = SystemClock.elapsedRealtime() - start;
            reportToLog();
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }
}
