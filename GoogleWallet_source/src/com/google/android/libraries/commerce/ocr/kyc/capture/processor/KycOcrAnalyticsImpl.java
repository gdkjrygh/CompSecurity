// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.capture.processor;

import com.google.android.libraries.commerce.ocr.util.Stopwatch;
import java.util.concurrent.TimeUnit;

public final class KycOcrAnalyticsImpl
    implements com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics
{
    public static final class Builder
    {

        private Stopwatch firstFrameStopwatch;
        private Long timeToCapture;
        private Long timeToConfirm;
        private Long timeToFirstFocusedFrame;
        private Long timeToFirstFrame;

        public final com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics build()
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

        public final Builder recordCapturedTime()
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

        public final Builder recordConfirmedTime()
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

        public final Builder recordFirstFrameFocusedTime()
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

        public final Builder recordFirstFrameSentTime()
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

        public Builder()
        {
            firstFrameStopwatch = Stopwatch.createStarted();
        }
    }


    private final Long timeToCaptureMillis;
    private final Long timeToConfirmMillis;
    private final Long timeToFirstFocusedFrameMillis;
    private final Long timeToFirstFrameMillis;

    KycOcrAnalyticsImpl(Long long1, Long long2, Long long3, Long long4)
    {
        timeToFirstFrameMillis = long1;
        timeToFirstFocusedFrameMillis = long2;
        timeToCaptureMillis = long3;
        timeToConfirmMillis = long4;
    }

    public final Long timeToCaptureMillis()
    {
        return timeToCaptureMillis;
    }

    public final Long timeToConfirmMillis()
    {
        return timeToConfirmMillis;
    }

    public final Long timeToFirstFocusedFrameMillis()
    {
        return timeToFirstFocusedFrameMillis;
    }

    public final Long timeToFirstFrameMillis()
    {
        return timeToFirstFrameMillis;
    }

    public final String toString()
    {
        String s = String.valueOf(timeToFirstFrameMillis);
        String s1 = String.valueOf(timeToFirstFocusedFrameMillis);
        String s2 = String.valueOf(timeToCaptureMillis);
        String s3 = String.valueOf(timeToConfirmMillis);
        return (new StringBuilder(String.valueOf(s).length() + 121 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append("KycOcrAnalyticsImpl [timeToFirstFrameMillis=").append(s).append(", timeToFirstFocusedFrameMillis=").append(s1).append(", timeToCaptureMillis=").append(s2).append(", timeToConfirmMillis=").append(s3).append("]").toString();
    }
}
