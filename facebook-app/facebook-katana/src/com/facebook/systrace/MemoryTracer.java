// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.systrace;

import android.os.Debug;
import android.os.SystemClock;

// Referenced classes of package com.facebook.systrace:
//            TraceConfig, Systrace

public final class MemoryTracer
    implements Runnable
{

    private volatile boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private long f;

    public MemoryTracer()
    {
        a = false;
    }

    public static void a()
    {
        TraceConfig.a(new _cls1());
    }

    private void c()
    {
        int i = Debug.getGlobalAllocCount();
        int j = Debug.getGlobalAllocSize();
        int k = Debug.getLoadedClassCount();
        int l = Debug.getGlobalClassInitCount();
        long l1 = SystemClock.elapsedRealtime();
        if ((int)(l1 - f) == 0)
        {
            return;
        } else
        {
            Runtime runtime = Runtime.getRuntime();
            long l2 = runtime.totalMemory();
            long l3 = runtime.freeMemory();
            Systrace.a(1024L, "Java bytes allocated", j - c);
            Systrace.a(1024L, "# Java allocations", i - b);
            Systrace.a(1024L, "classinits", l - e);
            Systrace.a(1024L, "classloads", k - d);
            Systrace.a(1024L, "free Java heap", (int)l3);
            Systrace.a(1024L, "used Java heap", (int)(l2 - l3));
            Systrace.a(1024L, "total Java heap", (int)l2);
            Systrace.a(1024L, "initialized classes", l);
            Systrace.a(1024L, "loaded classes", k);
            b = i;
            c = j;
            d = k;
            e = l;
            f = l1;
            return;
        }
    }

    private static void d()
    {
        try
        {
            Thread.sleep(100L);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }

    public final void b()
    {
        a = true;
    }

    public final void run()
    {
        Debug.startAllocCounting();
        b = Debug.getGlobalAllocCount();
        c = Debug.getGlobalAllocSize();
        d = Debug.getLoadedClassCount();
        e = Debug.getGlobalClassInitCount();
        f = SystemClock.elapsedRealtime();
_L1:
        if (a)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        Systrace.a(1024L, "MemoryTracer");
        c();
        Systrace.a(1024L);
        d();
          goto _L1
        Exception exception;
        exception;
        Debug.stopAllocCounting();
        throw exception;
        exception;
        Systrace.a(1024L);
        throw exception;
        Debug.stopAllocCounting();
        return;
    }

    private class _cls1
        implements TraceListener
    {

        MemoryTracer a;

        public final void a()
        {
            if (!Systrace.b(1024L))
            {
                return;
            } else
            {
                a = new MemoryTracer();
                (new Thread(a, "MemoryTracer")).start();
                return;
            }
        }

        public final void b()
        {
            if (a == null)
            {
                return;
            } else
            {
                a.b();
                a = null;
                return;
            }
        }

        _cls1()
        {
        }
    }

}
