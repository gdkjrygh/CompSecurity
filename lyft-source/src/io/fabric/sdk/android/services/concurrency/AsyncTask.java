// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

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

public abstract class AsyncTask
{

    private static final int a;
    public static final Executor b;
    public static final Executor c;
    private static final int d;
    private static final int e;
    private static final ThreadFactory f;
    private static final BlockingQueue g;
    private static final InternalHandler h = new InternalHandler();
    private static volatile Executor i;
    private final WorkerRunnable j = new WorkerRunnable() {
            private class WorkerRunnable
                implements Callable
            {

                Object b[];

                private WorkerRunnable()
                {
                }

            }


        final AsyncTask a;

        public Object call()
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
    private final FutureTask k;
    private volatile Status l;
    private final AtomicBoolean m = new AtomicBoolean();
    private final AtomicBoolean n = new AtomicBoolean();

    public AsyncTask()
    {
        l = Status.a;
        k = new FutureTask(j) {

            final AsyncTask a;

            protected void done()
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

    static Object a(AsyncTask asynctask, Object obj)
    {
        return asynctask.e(obj);
    }

    static AtomicBoolean a(AsyncTask asynctask)
    {
        return asynctask.n;
    }

    static void b(AsyncTask asynctask, Object obj)
    {
        asynctask.d(obj);
    }

    static void c(AsyncTask asynctask, Object obj)
    {
        asynctask.f(obj);
    }

    private void d(Object obj)
    {
        if (!n.get())
        {
            e(obj);
        }
    }

    private Object e(Object obj)
    {
        h.obtainMessage(1, new AsyncTaskResult(new Object[] {
            obj
        })).sendToTarget();
        return obj;
    }

    private void f(Object obj)
    {
        if (e())
        {
            b(obj);
        } else
        {
            a(obj);
        }
        l = Status.c;
    }

    public final transient AsyncTask a(Executor executor, Object aobj[])
    {
        if (l == Status.a) goto _L2; else goto _L1
_L1:
        class _cls4
        {

            static final int a[];

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

        _cls4.a[l.ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 75
    //                   2 85;
           goto _L2 _L3 _L4
_L2:
        l = Status.b;
        a();
        j.b = aobj;
        executor.execute(k);
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
        m.set(true);
        return k.cancel(flag);
    }

    protected void b(Object obj)
    {
        j_();
    }

    protected transient void b(Object aobj[])
    {
    }

    public final boolean e()
    {
        return m.get();
    }

    public final Status i_()
    {
        return l;
    }

    protected void j_()
    {
    }

    static 
    {
        a = Runtime.getRuntime().availableProcessors();
        d = a + 1;
        e = a * 2 + 1;
        f = new ThreadFactory() {

            private final AtomicInteger a = new AtomicInteger(1);

            public Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, (new StringBuilder()).append("AsyncTask #").append(a.getAndIncrement()).toString());
            }

        };
        g = new LinkedBlockingQueue(128);
        b = new ThreadPoolExecutor(d, e, 1L, TimeUnit.SECONDS, g, f);
        c = new SerialExecutor();
        i = c;
    }

    private class Status extends Enum
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


    private class AsyncTaskResult
    {

        final AsyncTask a;
        final Object b[];

        transient AsyncTaskResult(Object aobj[])
        {
            a = AsyncTask.this;
            b = aobj;
        }
    }


    private class InternalHandler extends Handler
    {

        public void handleMessage(Message message)
        {
            AsyncTaskResult asynctaskresult = (AsyncTaskResult)message.obj;
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                AsyncTask.c(asynctaskresult.a, asynctaskresult.b[0]);
                return;

            case 2: // '\002'
                asynctaskresult.a.b(asynctaskresult.b);
                break;
            }
        }

        public InternalHandler()
        {
            super(Looper.getMainLooper());
        }
    }


    private class SerialExecutor
        implements Executor
    {

        final LinkedList a;
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
            AsyncTask.b.execute(b);
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
            a.offer(new Runnable(runnable) {

                final Runnable a;
                final SerialExecutor b;

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
                    b = SerialExecutor.this;
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

        private SerialExecutor()
        {
            a = new LinkedList();
        }

    }

}
