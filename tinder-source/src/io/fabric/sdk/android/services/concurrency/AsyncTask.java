// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.LinkedList;
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

public abstract class AsyncTask
{
    public static final class Status extends Enum
    {

        public static final Status a;
        public static final Status b;
        public static final Status c;
        private static final Status d[];

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(io/fabric/sdk/android/services/concurrency/AsyncTask$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])d.clone();
        }

        static 
        {
            a = new Status("PENDING", 0);
            b = new Status("RUNNING", 1);
            c = new Status("FINISHED", 2);
            d = (new Status[] {
                a, b, c
            });
        }

        private Status(String s, int i1)
        {
            super(s, i1);
        }
    }

    private static final class a
    {

        final AsyncTask a;
        final Object b[];

        transient a(AsyncTask asynctask, Object aobj[])
        {
            a = asynctask;
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
                AsyncTask.b(a1.a);
                return;

            case 2: // '\002'
                AsyncTask.D_();
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
            AsyncTask.b.execute(b);
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
            a.offer(new Runnable(this, runnable) {

                final Runnable a;
                final c b;

                public final void run()
                {
                    a.run();
                    b.a();
                    return;
                    Exception exception;
                    exception;
                    b.a();
                    throw exception;
                }

            
            {
                b = c1;
                a = runnable;
                super();
            }
            });
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

    private static abstract class d
        implements Callable
    {

        public Object b[];

        private d()
        {
        }

        d(byte byte0)
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
    public final d d = new d() {

        final AsyncTask a;

        public final Object call()
            throws Exception
        {
            AsyncTask.a(a).set(true);
            Process.setThreadPriority(10);
            return AsyncTask.a(a, a.e());
        }

            
            {
                a = AsyncTask.this;
                super((byte)0);
            }
    };
    public final FutureTask e;
    public volatile Status f;
    public final AtomicBoolean g = new AtomicBoolean();
    private final AtomicBoolean n = new AtomicBoolean();

    public AsyncTask()
    {
        f = Status.a;
        e = new FutureTask(d) {

            final AsyncTask a;

            protected final void done()
            {
                try
                {
                    AsyncTask.b(a, get());
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
                    AsyncTask.b(a, null);
                }
            }

            
            {
                a = AsyncTask.this;
                super(callable);
            }
        };
    }

    protected static transient void D_()
    {
    }

    static Object a(AsyncTask asynctask, Object obj)
    {
        return asynctask.b(obj);
    }

    static AtomicBoolean a(AsyncTask asynctask)
    {
        return asynctask.n;
    }

    private Object b(Object obj)
    {
        l.obtainMessage(1, new a(this, new Object[] {
            obj
        })).sendToTarget();
        return obj;
    }

    static void b(AsyncTask asynctask)
    {
        if (asynctask.g.get())
        {
            asynctask.d();
        } else
        {
            asynctask.c();
        }
        asynctask.f = Status.c;
    }

    static void b(AsyncTask asynctask, Object obj)
    {
        if (!asynctask.n.get())
        {
            asynctask.b(obj);
        }
    }

    public final boolean E_()
    {
        g.set(true);
        return e.cancel(true);
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

    static 
    {
        int i1 = Runtime.getRuntime().availableProcessors();
        a = i1;
        h = i1 + 1;
        i = a * 2 + 1;
        j = new ThreadFactory() {

            private final AtomicInteger a = new AtomicInteger(1);

            public final Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, (new StringBuilder("AsyncTask #")).append(a.getAndIncrement()).toString());
            }

        };
        k = new LinkedBlockingQueue(128);
        b = new ThreadPoolExecutor(h, i, 1L, TimeUnit.SECONDS, k, j);
        c = new c((byte)0);
        m = c;
    }

    // Unreferenced inner class io/fabric/sdk/android/services/concurrency/AsyncTask$4

/* anonymous class */
    public static final class _cls4
    {

        public static final int a[];

        static 
        {
            a = new int[Status.values().length];
            try
            {
                a[Status.b.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[Status.c.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
