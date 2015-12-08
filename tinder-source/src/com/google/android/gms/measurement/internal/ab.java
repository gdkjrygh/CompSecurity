// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.ef;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            af, aa, ac, u, 
//            c, h, w, z, 
//            j

public final class ab extends af
{
    private final class a extends FutureTask
    {

        final ab a;
        private final String b;

        protected final void setException(Throwable throwable)
        {
            a.l().a.a(b, throwable);
            super.setException(throwable);
        }

        a(Runnable runnable, String s)
        {
            a = ab.this;
            super(runnable, null);
            u.a(s);
            b = s;
        }
    }

    private final class b
        implements Thread.UncaughtExceptionHandler
    {

        final ab a;
        private final String b;

        public final void uncaughtException(Thread thread, Throwable throwable)
        {
            this;
            JVM INSTR monitorenter ;
            a.l().a.a(b, throwable);
            this;
            JVM INSTR monitorexit ;
            return;
            thread;
            throw thread;
        }

        public b(String s)
        {
            a = ab.this;
            super();
            u.a(s);
            b = s;
        }
    }

    private final class c extends Thread
    {

        final BlockingQueue a = new LinkedBlockingQueue();
        final ab b;

        final void a(InterruptedException interruptedexception)
        {
            b.l().b.a((new StringBuilder()).append(getName()).append(" was interrupted").toString(), interruptedexception);
        }

        public final void run()
        {
            boolean flag = false;
_L3:
            if (b.c && flag)
            {
                break; /* Loop/switch isn't completed */
            }
_L1:
            FutureTask futuretask = (FutureTask)a.poll(0L, TimeUnit.MICROSECONDS);
            if (futuretask == null)
            {
                break MISSING_BLOCK_LABEL_50;
            }
            futuretask.run();
              goto _L1
            InterruptedException interruptedexception;
            interruptedexception;
            a(interruptedexception);
            boolean flag1 = b.b.a();
            flag = flag1;
            continue; /* Loop/switch isn't completed */
            interruptedexception;
            a(interruptedexception);
            if (true) goto _L3; else goto _L2
_L2:
            b.l().f.a("Scheduler thread exiting");
            return;
        }

        public c(String s)
        {
            b = ab.this;
            super();
            u.a(s);
            setName(s);
        }
    }


    final c a = new c("Measurement Network");
    final aa b;
    volatile boolean c;
    volatile boolean d;
    private final c e = new c("Measurement Worker");

    ab(ac ac)
    {
        super(ac);
        e.setUncaughtExceptionHandler(new b("Thread death: Uncaught exception on worker thread"));
        a.setUncaughtExceptionHandler(new b("Thread death: Uncaught exception on network thread"));
        ac = new HashSet();
        ac.add(Long.valueOf(e.getId()));
        ac.add(Long.valueOf(a.getId()));
        b = new aa(ac);
    }

    protected final void a()
    {
        e.start();
        a.start();
    }

    public final void a(Runnable runnable)
        throws IllegalStateException
    {
        a(runnable, e, "Task exception on worker thread");
    }

    final void a(Runnable runnable, c c1, String s)
        throws IllegalStateException
    {
        t();
        u.a(runnable);
        runnable = new a(runnable, s);
        u.a(runnable);
        if (c1.b.d)
        {
            throw new IllegalStateException("Cannot schedule task; thread was already shut down.");
        }
        try
        {
            c1.a.put(runnable);
            c1.b.b.a(c1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            c1.a(runnable);
        }
    }

    public final volatile void c()
    {
        super.c();
    }

    public final void d()
    {
        if (Thread.currentThread() != a)
        {
            throw new IllegalStateException("Call expected from network thread");
        } else
        {
            return;
        }
    }

    public final void e()
    {
        if (Thread.currentThread() != e)
        {
            throw new IllegalStateException("Call expected from worker thread");
        } else
        {
            return;
        }
    }

    public final volatile com.google.android.gms.measurement.internal.u f()
    {
        return super.f();
    }

    public final volatile com.google.android.gms.measurement.internal.c g()
    {
        return super.g();
    }

    public final volatile ef h()
    {
        return super.h();
    }

    public final volatile Context i()
    {
        return super.i();
    }

    public final volatile h j()
    {
        return super.j();
    }

    public final volatile ab k()
    {
        return super.k();
    }

    public final volatile w l()
    {
        return super.l();
    }

    public final volatile z m()
    {
        return super.m();
    }

    public final volatile j n()
    {
        return super.n();
    }
}
