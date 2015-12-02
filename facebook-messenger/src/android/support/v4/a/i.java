// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a;

import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package android.support.v4.a:
//            j, o, p, k, 
//            l, n, m, q

abstract class i
{

    private static final ThreadFactory a;
    private static final BlockingQueue b;
    private static final o c = new o(null);
    public static final Executor d;
    private static volatile Executor e;
    private final q f = new k(this);
    private final FutureTask g;
    private volatile p h;
    private final AtomicBoolean i = new AtomicBoolean();

    public i()
    {
        h = p.PENDING;
        g = new l(this, f);
    }

    static Object a(i i1, Object obj)
    {
        return i1.d(obj);
    }

    static AtomicBoolean a(i i1)
    {
        return i1.i;
    }

    static void b(i i1, Object obj)
    {
        i1.c(obj);
    }

    static void c(i i1, Object obj)
    {
        i1.e(obj);
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
        c.obtainMessage(1, new n(this, new Object[] {
            obj
        })).sendToTarget();
        return obj;
    }

    private void e(Object obj)
    {
        if (c())
        {
            b(obj);
        } else
        {
            a(obj);
        }
        h = p.FINISHED;
    }

    public final transient i a(Executor executor, Object aobj[])
    {
        if (h == p.PENDING) goto _L2; else goto _L1
_L1:
        m.a[h.ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 75
    //                   2 85;
           goto _L2 _L3 _L4
_L2:
        h = p.RUNNING;
        b();
        f.b = aobj;
        executor.execute(g);
        return this;
_L3:
        throw new IllegalStateException("Cannot execute task: the task is already running.");
_L4:
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    protected transient abstract Object a(Object aobj[]);

    protected void a()
    {
    }

    protected void a(Object obj)
    {
    }

    public final boolean a(boolean flag)
    {
        return g.cancel(flag);
    }

    protected void b()
    {
    }

    protected void b(Object obj)
    {
        a();
    }

    protected transient void b(Object aobj[])
    {
    }

    public final boolean c()
    {
        return g.isCancelled();
    }

    static 
    {
        a = new j();
        b = new LinkedBlockingQueue(10);
        d = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, b, a);
        e = d;
    }
}
