// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.debug;

import com.google.common.base.Stopwatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.debug:
//            DebugInfo

public class InstrumentationSupervisor
{

    private final Stopwatch stopwatch;
    private long timeOfFirstClientResult;
    private long timeOfFirstServerResult;
    private long timeOfFirstValidFrame;

    public InstrumentationSupervisor()
    {
        this(Stopwatch.createUnstarted());
    }

    private InstrumentationSupervisor(Stopwatch stopwatch1)
    {
        stopwatch = stopwatch1;
    }

    private void reset()
    {
        stopwatch.reset();
        timeOfFirstValidFrame = 0L;
        timeOfFirstClientResult = 0L;
        timeOfFirstServerResult = 0L;
    }

    public final void finish()
    {
        if (stopwatch.isRunning())
        {
            stopwatch.stop();
        }
    }

    public final DebugInfo mergeTo(DebugInfo debuginfo)
    {
        this;
        JVM INSTR monitorenter ;
        if (timeOfFirstValidFrame != 0L)
        {
            debuginfo.setTimeToFirstValidFrameInMs(Long.valueOf(timeOfFirstValidFrame));
        }
        if (timeOfFirstClientResult != 0L)
        {
            debuginfo.setTimeToFirstClientResultInMs(Long.valueOf(timeOfFirstClientResult));
        }
        if (timeOfFirstServerResult != 0L)
        {
            debuginfo.setTimeToFirstServerResultInMs(Long.valueOf(timeOfFirstServerResult));
        }
        debuginfo.setTimeSinceStartInMs(stopwatch.elapsed(TimeUnit.MILLISECONDS));
        this;
        JVM INSTR monitorexit ;
        return debuginfo;
        debuginfo;
        throw debuginfo;
    }

    public final void onClientResult()
    {
        this;
        JVM INSTR monitorenter ;
        if (timeOfFirstClientResult == 0L)
        {
            timeOfFirstClientResult = stopwatch.elapsed(TimeUnit.MILLISECONDS);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void onServerResult()
    {
        this;
        JVM INSTR monitorenter ;
        if (timeOfFirstServerResult == 0L)
        {
            timeOfFirstServerResult = stopwatch.elapsed(TimeUnit.MILLISECONDS);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void onValidFrame()
    {
        this;
        JVM INSTR monitorenter ;
        if (timeOfFirstValidFrame == 0L)
        {
            timeOfFirstValidFrame = stopwatch.elapsed(TimeUnit.MILLISECONDS);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void start()
    {
        this;
        JVM INSTR monitorenter ;
        reset();
        stopwatch.start();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
