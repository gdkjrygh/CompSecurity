// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.util.Log;
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

abstract class k
{
    private static class a
    {

        final k a;
        final Object b[];

        transient a(k k1, Object aobj[])
        {
            a = k1;
            b = aobj;
        }
    }

    private static class b extends Handler
    {

        public void handleMessage(Message message)
        {
            a a1 = (a)message.obj;
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                k.c(a1.a, a1.b[0]);
                return;

            case 2: // '\002'
                a1.a.b(a1.b);
                break;
            }
        }

        private b()
        {
        }

    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        public static final c c;
        private static final c d[];

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(android/support/v4/content/k$c, s);
        }

        public static c[] values()
        {
            return (c[])d.clone();
        }

        static 
        {
            a = new c("PENDING", 0);
            b = new c("RUNNING", 1);
            c = new c("FINISHED", 2);
            d = (new c[] {
                a, b, c
            });
        }

        private c(String s, int j)
        {
            super(s, j);
        }
    }

    private static abstract class d
        implements Callable
    {

        Object b[];

        private d()
        {
        }

    }


    private static final ThreadFactory a;
    private static final BlockingQueue b;
    private static final b c = new b();
    public static final Executor d;
    private static volatile Executor e;
    private final d f = new d() {

        final k a;

        public Object call()
            throws Exception
        {
            k.a(a).set(true);
            Process.setThreadPriority(10);
            return k.a(a, a.a(b));
        }

            
            {
                a = k.this;
                super();
            }
    };
    private final FutureTask g;
    private volatile c h;
    private final AtomicBoolean i = new AtomicBoolean();

    public k()
    {
        h = c.a;
        g = new FutureTask(f) {

            final k a;

            protected void done()
            {
                try
                {
                    Object obj = get();
                    k.b(a, obj);
                    return;
                }
                catch (InterruptedException interruptedexception)
                {
                    Log.w("AsyncTask", interruptedexception);
                    return;
                }
                catch (ExecutionException executionexception)
                {
                    throw new RuntimeException("An error occured while executing doInBackground()", executionexception.getCause());
                }
                catch (CancellationException cancellationexception)
                {
                    k.b(a, null);
                }
                catch (Throwable throwable)
                {
                    throw new RuntimeException("An error occured while executing doInBackground()", throwable);
                }
            }

            
            {
                a = k.this;
                super(callable);
            }
        };
    }

    static Object a(k k1, Object obj)
    {
        return k1.d(obj);
    }

    static AtomicBoolean a(k k1)
    {
        return k1.i;
    }

    static void b(k k1, Object obj)
    {
        k1.c(obj);
    }

    static void c(k k1, Object obj)
    {
        k1.e(obj);
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
        c.obtainMessage(1, new a(this, new Object[] {
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
        h = c.c;
    }

    public final transient k a(Executor executor, Object aobj[])
    {
        if (h == c.a) goto _L2; else goto _L1
_L1:
        static class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[c.values().length];
                try
                {
                    a[c.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[c.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls4.a[h.ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 75
    //                   2 85;
           goto _L2 _L3 _L4
_L2:
        h = c.b;
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
        a = new ThreadFactory() {

            private final AtomicInteger a = new AtomicInteger(1);

            public Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, (new StringBuilder()).append("ModernAsyncTask #").append(a.getAndIncrement()).toString());
            }

        };
        b = new LinkedBlockingQueue(10);
        d = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, b, a);
        e = d;
    }
}
