// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class r
{

    private static List a = new ArrayList();
    private static ExecutorService b = Executors.newSingleThreadExecutor();
    private static long c = 5L;
    private static ScheduledExecutorService d = Executors.newSingleThreadScheduledExecutor();

    public static void a()
    {
        Iterator iterator = a.iterator();
_L1:
        ScheduledFuture scheduledfuture;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_49;
        }
        scheduledfuture = (ScheduledFuture)((WeakReference)iterator.next()).get();
        if (scheduledfuture != null)
        {
            try
            {
                scheduledfuture.cancel(false);
            }
            catch (Exception exception)
            {
                return;
            }
        }
          goto _L1
        a.clear();
        if (!b.isShutdown())
        {
            b.shutdown();
        }
        if (!d.isShutdown())
        {
            d.shutdown();
        }
        b.awaitTermination(c, TimeUnit.SECONDS);
        d.awaitTermination(c, TimeUnit.SECONDS);
        return;
    }

    public static void a(Runnable runnable)
    {
        if (b.isShutdown())
        {
            b = Executors.newSingleThreadExecutor();
        }
        b.execute(runnable);
    }

    public static void a(Runnable runnable, long l)
    {
        com/b/a/r;
        JVM INSTR monitorenter ;
        if (d.isShutdown())
        {
            d = Executors.newSingleThreadScheduledExecutor();
        }
        a.add(new WeakReference(d.schedule(runnable, l, TimeUnit.MILLISECONDS)));
        com/b/a/r;
        JVM INSTR monitorexit ;
        return;
        runnable;
        throw runnable;
    }

    public static void b(Runnable runnable)
    {
        com/b/a/r;
        JVM INSTR monitorenter ;
        if (d.isShutdown())
        {
            d = Executors.newSingleThreadScheduledExecutor();
        }
        d.execute(runnable);
        com/b/a/r;
        JVM INSTR monitorexit ;
        return;
        runnable;
        throw runnable;
    }

}
