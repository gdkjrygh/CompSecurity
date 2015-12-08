// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.c;

import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package a.a.a.a.a.c:
//            b, h, g, j, 
//            c, d, f, e, 
//            k

public abstract class a
{

    private static final int a;
    public static final Executor b;
    public static final Executor c;
    private static final int d;
    private static final int e;
    private static final ThreadFactory f;
    private static final BlockingQueue g;
    private static final g h = new g();
    private static volatile Executor i;
    private final k j = new c(this);
    private final FutureTask k;
    private volatile int l;
    private final AtomicBoolean m = new AtomicBoolean();
    private final AtomicBoolean n = new AtomicBoolean();

    public a()
    {
        l = j.a;
        k = new d(this, j);
    }

    static Object a(a a1, Object obj)
    {
        return a1.b(obj);
    }

    static AtomicBoolean a(a a1)
    {
        return a1.n;
    }

    private Object b(Object obj)
    {
        h.obtainMessage(1, new f(this, new Object[] {
            obj
        })).sendToTarget();
        return obj;
    }

    static void b(a a1)
    {
        if (a1.m.get())
        {
            a1.d();
        } else
        {
            a1.c();
        }
        a1.l = j.c;
    }

    static void b(a a1, Object obj)
    {
        if (!a1.n.get())
        {
            a1.b(obj);
        }
    }

    protected static transient void t_()
    {
    }

    public final transient a a(Executor executor, Object aobj[])
    {
        if (l == j.a) goto _L2; else goto _L1
_L1:
        e.a[l - 1];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 75
    //                   2 85;
           goto _L2 _L3 _L4
_L2:
        l = j.b;
        b();
        j.b = aobj;
        executor.execute(k);
        return this;
_L3:
        throw new IllegalStateException("Cannot execute task: the task is already running.");
_L4:
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    protected void b()
    {
    }

    protected void c()
    {
    }

    protected void d()
    {
    }

    protected transient abstract Object e();

    public final boolean h()
    {
        return m.get();
    }

    public final boolean i()
    {
        m.set(true);
        return k.cancel(true);
    }

    public final int s_()
    {
        return l;
    }

    static 
    {
        int i1 = Runtime.getRuntime().availableProcessors();
        a = i1;
        d = i1 + 1;
        e = a * 2 + 1;
        f = new b();
        g = new LinkedBlockingQueue(128);
        b = new ThreadPoolExecutor(d, e, 1L, TimeUnit.SECONDS, g, f);
        c = new h((byte)0);
        i = c;
    }
}
