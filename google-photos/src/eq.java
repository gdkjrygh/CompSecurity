// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class eq
{

    private static final ThreadFactory a;
    public static final Executor b;
    private static final BlockingQueue f;
    private static ew g;
    private static volatile Executor h;
    final ey c = new es(this);
    final FutureTask d;
    volatile int e;
    private final AtomicBoolean i = new AtomicBoolean();

    public eq()
    {
        e = ex.a;
        d = new et(this, c);
    }

    static Object a(eq eq1, Object obj)
    {
        return eq1.c(obj);
    }

    static AtomicBoolean a(eq eq1)
    {
        return eq1.i;
    }

    protected static transient void a()
    {
    }

    private static Handler b()
    {
        eq;
        JVM INSTR monitorenter ;
        ew ew1;
        if (g == null)
        {
            g = new ew();
        }
        ew1 = g;
        eq;
        JVM INSTR monitorexit ;
        return ew1;
        Exception exception;
        exception;
        eq;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void b(eq eq1, Object obj)
    {
        if (!eq1.i.get())
        {
            eq1.c(obj);
        }
    }

    private Object c(Object obj)
    {
        b().obtainMessage(1, new ev(this, new Object[] {
            obj
        })).sendToTarget();
        return obj;
    }

    static void c(eq eq1, Object obj)
    {
        if (eq1.d.isCancelled())
        {
            eq1.b(obj);
        } else
        {
            eq1.a(obj);
        }
        eq1.e = ex.c;
    }

    protected transient abstract Object a(Object aobj[]);

    protected void a(Object obj)
    {
    }

    protected void b(Object obj)
    {
    }

    static 
    {
        a = new er();
        f = new LinkedBlockingQueue(10);
        ThreadPoolExecutor threadpoolexecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, f, a);
        b = threadpoolexecutor;
        h = threadpoolexecutor;
    }
}
