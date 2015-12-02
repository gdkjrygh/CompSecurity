// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.core;

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

// Referenced classes of package com.android.core:
//            ArrayDeque

public abstract class AsyncTask
{
    public static final class Status extends Enum
    {

        public static final Status FINISHED;
        public static final Status PENDING;
        public static final Status RUNNING;
        private static final Status a[];

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/android/core/AsyncTask$Status, s);
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

        private Status(String s, int k)
        {
            super(s, k);
        }
    }

    private static class a
    {

        final AsyncTask a;
        final Object b[];

        transient a(AsyncTask asynctask, Object aobj[])
        {
            a = asynctask;
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
                AsyncTask.c(a1.a, a1.b[0]);
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

    private static class c
        implements Executor
    {

        final ArrayDeque a;
        Runnable b;

        protected void a()
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
            AsyncTask.a.execute(b);
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public void execute(Runnable runnable)
        {
            this;
            JVM INSTR monitorenter ;
            a.offer(new Runnable(this, runnable) {

                final Runnable a;
                final c b;

                public void run()
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
            a = new ArrayDeque();
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


    public static final Executor a;
    public static final Executor b;
    private static final ThreadFactory c;
    private static final BlockingQueue d;
    private static final b e = new b();
    private static volatile Executor f;
    private final d g = new d() {

        final AsyncTask a;

        public Object call()
            throws Exception
        {
            AsyncTask.a(a).set(true);
            Process.setThreadPriority(10);
            return AsyncTask.a(a, a.a(b));
        }

            
            {
                a = AsyncTask.this;
                super();
            }
    };
    private final FutureTask h;
    private volatile Status i;
    private final AtomicBoolean j = new AtomicBoolean();

    public AsyncTask()
    {
        i = Status.PENDING;
        h = new FutureTask(g) {

            final AsyncTask a;

            protected void done()
            {
                try
                {
                    Object obj = get();
                    AsyncTask.b(a, obj);
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
                catch (Throwable throwable)
                {
                    throw new RuntimeException("An error occured while executing doInBackground()", throwable);
                }
            }

            
            {
                a = AsyncTask.this;
                super(callable);
            }
        };
    }

    static Object a(AsyncTask asynctask, Object obj)
    {
        return asynctask.d(obj);
    }

    static AtomicBoolean a(AsyncTask asynctask)
    {
        return asynctask.j;
    }

    static void b(AsyncTask asynctask, Object obj)
    {
        asynctask.c(obj);
    }

    static void c(AsyncTask asynctask, Object obj)
    {
        asynctask.e(obj);
    }

    private void c(Object obj)
    {
        if (!j.get())
        {
            d(obj);
        }
    }

    private Object d(Object obj)
    {
        e.obtainMessage(1, new a(this, new Object[] {
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
        i = Status.FINISHED;
    }

    public final transient AsyncTask a(Executor executor, Object aobj[])
    {
        if (i == Status.PENDING) goto _L2; else goto _L1
_L1:
        static class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[Status.values().length];
                try
                {
                    a[Status.RUNNING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Status.FINISHED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls4.a[i.ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 75
    //                   2 85;
           goto _L2 _L3 _L4
_L2:
        i = Status.RUNNING;
        a();
        g.b = aobj;
        executor.execute(h);
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

    protected void b()
    {
    }

    protected void b(Object obj)
    {
        b();
    }

    protected transient void b(Object aobj[])
    {
    }

    public final transient AsyncTask c(Object aobj[])
    {
        return a(f, aobj);
    }

    public final boolean c()
    {
        return h.isCancelled();
    }

    protected final transient void d(Object aobj[])
    {
        if (!c())
        {
            e.obtainMessage(2, new a(this, aobj)).sendToTarget();
        }
    }

    static 
    {
        c = new ThreadFactory() {

            private final AtomicInteger a = new AtomicInteger(1);

            public Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, (new StringBuilder()).append("AsyncTask #").append(a.getAndIncrement()).toString());
            }

        };
        d = new LinkedBlockingQueue(10);
        a = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, d, c);
        b = new c();
        f = b;
    }
}
