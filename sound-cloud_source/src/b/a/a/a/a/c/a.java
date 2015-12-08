// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package b.a.a.a.a.c:
//            b, c, d, e

public abstract class b.a.a.a.a.c.a
{
    private static final class a
    {

        final b.a.a.a.a.c.a a;
        final Object b[];

        transient a(b.a.a.a.a.c.a a1, Object aobj[])
        {
            a = a1;
            b = aobj;
        }
    }

    private static final class b extends Handler
    {

        public final void handleMessage(Message message)
        {
            a a1 = (a)message.obj;
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                b.a.a.a.a.c.a.b(a1.a);
                return;

            case 2: // '\002'
                b.a.a.a.a.c.a.e_();
                break;
            }
        }

        public b()
        {
            super(Looper.getMainLooper());
        }
    }

    private static final class c
        implements Executor
    {

        final LinkedList a;
        Runnable b;

        protected final void a()
        {
            this;
            JVM INSTR monitorenter ;
            Runnable runnable;
            runnable = (Runnable)a.poll();
            b = runnable;
            if (runnable == null)
            {
                break MISSING_BLOCK_LABEL_34;
            }
            b.a.a.a.a.c.a.b.execute(b);
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public final void execute(Runnable runnable)
        {
            this;
            JVM INSTR monitorenter ;
            a.offer(new b.a.a.a.a.c.e(this, runnable));
            if (b == null)
            {
                a();
            }
            this;
            JVM INSTR monitorexit ;
            return;
            runnable;
            throw runnable;
        }

        private c()
        {
            a = new LinkedList();
        }

        c(byte byte0)
        {
            this();
        }
    }

    public static final class d extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        private static final int d[];

        public static int[] a()
        {
            return (int[])d.clone();
        }

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = (new int[] {
                a, b, c
            });
        }
    }

    private static abstract class e
        implements Callable
    {

        public Object b[];

        private e()
        {
        }

        e(byte byte0)
        {
            this();
        }
    }


    private static final int a;
    public static final Executor b;
    public static final Executor c;
    private static final int h;
    private static final int i;
    private static final ThreadFactory j;
    private static final BlockingQueue k;
    private static final b l = new b();
    private static volatile Executor m;
    public final e d = new b.a.a.a.a.c.c(this);
    public final FutureTask e;
    public volatile int f;
    public final AtomicBoolean g = new AtomicBoolean();
    private final AtomicBoolean n = new AtomicBoolean();

    public b.a.a.a.a.c.a()
    {
        f = d.a;
        e = new b.a.a.a.a.c.d(this, d);
    }

    static Object a(b.a.a.a.a.c.a a1, Object obj)
    {
        return a1.b(obj);
    }

    static AtomicBoolean a(b.a.a.a.a.c.a a1)
    {
        return a1.n;
    }

    private Object b(Object obj)
    {
        l.obtainMessage(1, new a(this, new Object[] {
            obj
        })).sendToTarget();
        return obj;
    }

    static void b(b.a.a.a.a.c.a a1)
    {
        if (a1.g.get())
        {
            a1.d();
        } else
        {
            a1.c();
        }
        a1.f = d.c;
    }

    static void b(b.a.a.a.a.c.a a1, Object obj)
    {
        if (!a1.n.get())
        {
            a1.b(obj);
        }
    }

    protected static transient void e_()
    {
    }

    public void b()
    {
    }

    public void c()
    {
    }

    public void d()
    {
    }

    public transient abstract Object e();

    public final boolean f_()
    {
        g.set(true);
        return e.cancel(true);
    }

    static 
    {
        int i1 = Runtime.getRuntime().availableProcessors();
        a = i1;
        h = i1 + 1;
        i = a * 2 + 1;
        j = new b.a.a.a.a.c.b();
        k = new LinkedBlockingQueue(128);
        b = new ThreadPoolExecutor(h, i, 1L, TimeUnit.SECONDS, k, j);
        c = new c((byte)0);
        m = c;
    }

    // Unreferenced inner class b/a/a/a/a/c/a$1

/* anonymous class */
    public static final class _cls1
    {

        public static final int a[];

        static 
        {
            a = new int[d.a().length];
            try
            {
                a[d.b - 1] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[d.c - 1] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
