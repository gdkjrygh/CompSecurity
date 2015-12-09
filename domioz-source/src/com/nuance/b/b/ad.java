// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.nuance.b.b:
//            gn

final class ad
{

    final Runnable a = new gn(this);
    private int b;
    private final ScheduledExecutorService c = Executors.newScheduledThreadPool(1);
    private ScheduledFuture d;
    private final AtomicReference e = new AtomicReference(null);
    private final Object f = new Object();

    ad()
    {
        b = 0xcd140;
        d = null;
    }

    static AtomicReference a(ad ad1)
    {
        return ad1.e;
    }

    final void a()
    {
        synchronized (f)
        {
            d();
            d = c.schedule(a, b, TimeUnit.MILLISECONDS);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void a(int i)
    {
        b = i;
    }

    final void b()
    {
        e.compareAndSet(null, new CountDownLatch(1));
    }

    final void c()
    {
        CountDownLatch countdownlatch = (CountDownLatch)e.getAndSet(null);
        if (countdownlatch != null)
        {
            countdownlatch.countDown();
        }
    }

    final void d()
    {
        synchronized (f)
        {
            if (d != null)
            {
                d.cancel(true);
                d = null;
                e.set(null);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
