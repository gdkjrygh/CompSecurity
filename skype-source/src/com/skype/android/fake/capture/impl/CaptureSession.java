// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.fake.capture.impl;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicLong;

public class CaptureSession
    implements Closeable
{

    private final AtomicLong a = new AtomicLong();
    private final long b = getPlatformTime();
    private final Object c = new Object();
    private long d;

    public CaptureSession()
    {
        d = 0L;
    }

    private static native void closeLogFile(long l);

    public static native long getPlatformTime();

    private static native void logFrame(long l, int i, long l1, long l2, long l3);

    private static native void logPreviewStart(long l, int i, int j, int k, String s, String s1, String s2, 
            int i1, int j1, int k1);

    private static native long openLogFile(String s);

    public final long a()
    {
        return a.incrementAndGet();
    }

    public final long a(long l)
    {
        return l - b;
    }

    public final void a(int i, int j, int k, String s, String s1, String s2, int l, 
            int i1, int j1)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (d == 0L)
        {
            d = openLogFile("/sdcard/fakecam/capture.log");
            if (d == 0L)
            {
                throw new IllegalStateException("Log file is closed");
            }
        }
        break MISSING_BLOCK_LABEL_54;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        logPreviewStart(d, i, j, k, s, s1, s2, l, i1, j1);
        obj;
        JVM INSTR monitorexit ;
    }

    public final void a(int i, long l, long l1, long l2)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (d == 0L)
        {
            d = openLogFile("/sdcard/fakecam/capture.log");
            if (d == 0L)
            {
                throw new IllegalStateException("Log file is closed");
            }
        }
        break MISSING_BLOCK_LABEL_54;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        logFrame(d, i, l, l1, l2);
        obj;
        JVM INSTR monitorexit ;
    }

    public void close()
    {
        synchronized (c)
        {
            if (d != 0L)
            {
                closeLogFile(d);
                d = 0L;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [frameCounter=").append(a).append(", initialTimestamp=").append(b).append(", nativeLogFile=").append(d).append("]").toString();
    }
}
