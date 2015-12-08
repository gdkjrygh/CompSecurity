// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.loader;

import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.cleanmaster.ui.app.market.loader:
//            b, g, c, d, 
//            f, e, h

public abstract class AsyncTaskEx
{

    private static final ThreadFactory a;
    private static final BlockingQueue b;
    private static final g c = new g((byte)0);
    private static volatile Executor d;
    public static final Executor e;
    private final h f = new c(this);
    private final FutureTask g;
    private volatile Status h;
    private final AtomicBoolean i = new AtomicBoolean();

    public AsyncTaskEx()
    {
        h = Status.PENDING;
        g = new d(this, f);
    }

    static Object a(AsyncTaskEx asynctaskex, Object obj)
    {
        return asynctaskex.d(obj);
    }

    static AtomicBoolean a(AsyncTaskEx asynctaskex)
    {
        return asynctaskex.i;
    }

    static void b(AsyncTaskEx asynctaskex, Object obj)
    {
        asynctaskex.c(obj);
    }

    static void c(AsyncTaskEx asynctaskex, Object obj)
    {
        asynctaskex.e(obj);
    }

    private void c(Object obj)
    {
        if (!i.get())
        {
            d(obj);
        }
    }

    private Object d(Object obj)
    {
        c.obtainMessage(1, new f(this, new Object[] {
            obj
        })).sendToTarget();
        return obj;
    }

    private void e(Object obj)
    {
        if (f())
        {
            b(obj);
        } else
        {
            a(obj);
        }
        h = Status.FINISHED;
    }

    public final transient AsyncTaskEx a(Executor executor, Object aobj[])
    {
        if (h == Status.PENDING) goto _L2; else goto _L1
_L1:
        e.a[h.ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 75
    //                   2 85;
           goto _L2 _L3 _L4
_L2:
        h = Status.RUNNING;
        d();
        f.b = aobj;
        executor.execute(g);
        return this;
_L3:
        throw new IllegalStateException("Cannot execute task: the task is already running.");
_L4:
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    protected transient abstract Object a(Object aobj[]);

    protected void a(Object obj)
    {
    }

    public final boolean a(boolean flag)
    {
        return g.cancel(flag);
    }

    protected void b(Object obj)
    {
        e();
    }

    protected transient void b(Object aobj[])
    {
    }

    public final Status c()
    {
        return h;
    }

    public final transient AsyncTaskEx c(Object aobj[])
    {
        return a(d, aobj);
    }

    protected void d()
    {
    }

    protected void e()
    {
    }

    public final boolean f()
    {
        return g.isCancelled();
    }

    static 
    {
        a = new b();
        b = new LinkedBlockingQueue(10);
        e = new ThreadPoolExecutor(3, 128, 1L, TimeUnit.SECONDS, b, a);
        d = e;
    }

    private class Status extends Enum
    {

        public static final Status FINISHED;
        public static final Status PENDING;
        public static final Status RUNNING;
        private static final Status a[];

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])a.clone();
        }

        static 
        {
            PENDING = new Status("PENDING", 0);
            RUNNING = new Status("RUNNING", 1);
            FINISHED = new Status("FINISHED", 2);
            a = (new Status[] {
                PENDING, RUNNING, FINISHED
            });
        }

        private Status(String s, int j)
        {
            super(s, j);
        }
    }

}
