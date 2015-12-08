// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

abstract class aq
{
    static final class a
    {

        final aq a;
        final Object b[];

        transient a(aq aq1, Object aobj[])
        {
            a = aq1;
            b = aobj;
        }
    }

    static final class b extends Handler
    {

        public final void handleMessage(Message message)
        {
            a a1 = (a)message.obj;
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                aq.c(a1.a, a1.b[0]);
                return;

            case 2: // '\002'
                aq.c();
                break;
            }
        }

        private b()
        {
        }

        b(byte byte0)
        {
            this();
        }
    }

    public static final class c extends Enum
    {

        private static final int a[] = {
            1, 2, 3
        };

        public static int[] a()
        {
            return (int[])a.clone();
        }

    }

    static abstract class d
        implements Callable
    {

        private d()
        {
        }

        d(byte byte0)
        {
            this();
        }
    }


    private static final ThreadFactory a;
    public static final Executor b;
    private static final BlockingQueue f;
    private static final b g = new b((byte)0);
    private static volatile Executor h;
    final d c = new d() {

        private aq a;

        public final Object call()
        {
            aq.a(a).set(true);
            Process.setThreadPriority(10);
            return aq.a(a, a.b());
        }

            
            {
                a = aq.this;
                super((byte)0);
            }
    };
    final FutureTask d;
    volatile int e;
    private final AtomicBoolean i = new AtomicBoolean();

    public aq()
    {
        e = 1;
        d = new FutureTask(c) {

            private aq a;

            protected final void done()
            {
                try
                {
                    Object obj = get();
                    aq.b(a, obj);
                    return;
                }
                catch (InterruptedException interruptedexception)
                {
                    return;
                }
                catch (ExecutionException executionexception)
                {
                    throw new RuntimeException("An error occured while executing doInBackground()", executionexception.getCause());
                }
                catch (CancellationException cancellationexception)
                {
                    aq.b(a, null);
                }
                catch (Throwable throwable)
                {
                    throw new RuntimeException("An error occured while executing doInBackground()", throwable);
                }
            }

            
            {
                a = aq.this;
                super(callable);
            }
        };
    }

    static Object a(aq aq1, Object obj)
    {
        return aq1.b(obj);
    }

    static AtomicBoolean a(aq aq1)
    {
        return aq1.i;
    }

    private Object b(Object obj)
    {
        g.obtainMessage(1, new a(this, new Object[] {
            obj
        })).sendToTarget();
        return obj;
    }

    static void b(aq aq1, Object obj)
    {
        if (!aq1.i.get())
        {
            aq1.b(obj);
        }
    }

    protected static transient void c()
    {
    }

    static void c(aq aq1, Object obj)
    {
        if (aq1.d.isCancelled())
        {
            aq1.a();
        } else
        {
            aq1.a(obj);
        }
        aq1.e = 3;
    }

    protected void a()
    {
    }

    protected void a(Object obj)
    {
    }

    protected transient abstract Object b();

    static 
    {
        a = new ThreadFactory() {

            private final AtomicInteger a = new AtomicInteger(1);

            public final Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, (new StringBuilder("ModernAsyncTask #")).append(a.getAndIncrement()).toString());
            }

        };
        f = new LinkedBlockingQueue(10);
        b = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, f, a);
        h = b;
    }

    // Unreferenced inner class aq$4

/* anonymous class */
    static final class _cls4
    {

        static final int a[];

        static 
        {
            a = new int[c.a().length];
            try
            {
                a[1] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[2] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
