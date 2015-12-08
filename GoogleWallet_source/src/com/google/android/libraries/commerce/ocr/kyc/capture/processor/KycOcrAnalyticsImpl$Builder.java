// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.capture.processor;

import com.google.android.libraries.commerce.ocr.util.Stopwatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.libraries.commerce.ocr.kyc.capture.processor:
//            KycOcrAnalyticsImpl

public static final class firstFrameStopwatch
{

    private Stopwatch firstFrameStopwatch;
    private Long timeToCapture;
    private Long timeToConfirm;
    private Long timeToFirstFocusedFrame;
    private Long timeToFirstFrame;

    public final com.google.android.libraries.commerce.ocr.kyc.pub.sImpl.Builder build()
    {
        this;
        JVM INSTR monitorenter ;
        KycOcrAnalyticsImpl kycocranalyticsimpl = new KycOcrAnalyticsImpl(timeToFirstFrame, timeToFirstFocusedFrame, timeToCapture, timeToConfirm);
        this;
        JVM INSTR monitorexit ;
        return kycocranalyticsimpl;
        Exception exception;
        exception;
        throw exception;
    }

    public final timeToConfirm recordCapturedTime()
    {
        this;
        JVM INSTR monitorenter ;
        if (timeToCapture == null)
        {
            timeToCapture = Long.valueOf(firstFrameStopwatch.elapsed(TimeUnit.MILLISECONDS));
        }
        this;
        JVM INSTR monitorexit ;
        return this;
        Exception exception;
        exception;
        throw exception;
    }

    public final firstFrameStopwatch recordConfirmedTime()
    {
        this;
        JVM INSTR monitorenter ;
        if (timeToConfirm == null)
        {
            timeToConfirm = Long.valueOf(firstFrameStopwatch.elapsed(TimeUnit.MILLISECONDS));
        }
        this;
        JVM INSTR monitorexit ;
        return this;
        Exception exception;
        exception;
        throw exception;
    }

    public final firstFrameStopwatch recordFirstFrameFocusedTime()
    {
        this;
        JVM INSTR monitorenter ;
        if (timeToFirstFocusedFrame == null)
        {
            timeToFirstFocusedFrame = Long.valueOf(firstFrameStopwatch.elapsed(TimeUnit.MILLISECONDS));
        }
        this;
        JVM INSTR monitorexit ;
        return this;
        Exception exception;
        exception;
        throw exception;
    }

    public final firstFrameStopwatch recordFirstFrameSentTime()
    {
        this;
        JVM INSTR monitorenter ;
        if (timeToFirstFrame == null)
        {
            timeToFirstFrame = Long.valueOf(firstFrameStopwatch.elapsed(TimeUnit.MILLISECONDS));
        }
        this;
        JVM INSTR monitorexit ;
        return this;
        Exception exception;
        exception;
        throw exception;
    }

    public a()
    {
        firstFrameStopwatch = Stopwatch.createStarted();
    }
}
