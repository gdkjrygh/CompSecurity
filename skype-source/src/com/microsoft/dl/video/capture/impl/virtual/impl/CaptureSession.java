// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.virtual.impl;

import com.microsoft.dl.utils.Clock;
import com.microsoft.dl.video.capture.impl.virtual.VirtualCameraManagerImpl;
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.atomic.AtomicLong;

public class CaptureSession
    implements Closeable
{

    private final AtomicLong a = new AtomicLong();
    private final long b = Clock.getPlatformTime();
    private final Object c = new Object();
    private long d;

    public CaptureSession()
    {
        d = openLogFile((new StringBuilder()).append(VirtualCameraManagerImpl.DIR).append(File.pathSeparator).append("capture.log").toString());
    }

    private static native void closeLogFile(long l);

    private static native void logFrame(long l, int i, long l1, long l2, long l3);

    private static native void logPreviewStart(long l, int i, int j, int k, String s, String s1, String s2, 
            int i1, int j1, int k1);

    private static native long openLogFile(String s);

    public final void close()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (d == 0L)
        {
            throw new IllegalStateException("Log file is closed");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        closeLogFile(d);
        d = 0L;
        obj;
        JVM INSTR monitorexit ;
    }

    public final long countFrame()
    {
        return a.incrementAndGet();
    }

    public final long getElapsedTime(long l)
    {
        return Clock.getDurationUs(b, l) / 1000L;
    }

    public final void logFrame(int i, long l, long l1, long l2)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (d == 0L)
        {
            throw new IllegalStateException("Log file is closed");
        }
        break MISSING_BLOCK_LABEL_36;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        logFrame(d, i, l, l1, l2);
        obj;
        JVM INSTR monitorexit ;
    }

    public final void logPreviewStart(int i, int j, int k, String s, String s1, String s2, int l, 
            int i1, int j1)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (d == 0L)
        {
            throw new IllegalStateException("Log file is closed");
        }
        break MISSING_BLOCK_LABEL_36;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        logPreviewStart(d, i, j, k, s, s1, s2, l, i1, j1);
        obj;
        JVM INSTR monitorexit ;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [frameCounter=").append(a).append(", initialTimestamp=").append(b).append(", nativeLogFile=").append(d).append("]").toString();
    }
}
