// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.assist;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class SysclearAsyncTask19
{
    public static final class Status extends Enum
    {

        public static final Status FINISHED;
        public static final Status PENDING;
        public static final Status RUNNING;
        private static final Status a[];

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status, s);
        }

        public static Status[] values()
        {
            Status astatus[] = a;
            int i1 = astatus.length;
            Status astatus1[] = new Status[i1];
            System.arraycopy(astatus, 0, astatus1, 0, i1);
            return astatus1;
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

        private Status(String s, int i1)
        {
            super(s, i1);
        }
    }

    private static class a
    {

        final SysclearAsyncTask19 a;
        final Object b[];

        transient a(SysclearAsyncTask19 sysclearasynctask19, Object aobj[])
        {
            a = sysclearasynctask19;
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
                SysclearAsyncTask19.a(a1.a, a1.b[0]);
                return;

            case 2: // '\002'
                a1.a.b(a1.b);
                break;
            }
        }

        private b()
        {
        }

        b(b b1)
        {
            this();
        }
    }

    private static abstract class c
        implements Callable
    {

        Object b[];

        private c()
        {
        }

        c(c c1)
        {
            this();
        }
    }


    public static final Executor a;
    public static final Executor b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final ThreadFactory f;
    private static final BlockingQueue g;
    private static final b h = new b(null);
    private static volatile Executor i;
    private static int o[];
    private final c j = new c() {

        final SysclearAsyncTask19 a;

        public Object call()
            throws Exception
        {
            SysclearAsyncTask19.a(a).set(true);
            Process.setThreadPriority(10);
            return SysclearAsyncTask19.b(a, a.a(b));
        }

            
            {
                a = SysclearAsyncTask19.this;
                super(null);
            }
    };
    private final FutureTask k;
    private volatile Status l;
    private final AtomicBoolean m = new AtomicBoolean();
    private final AtomicBoolean n = new AtomicBoolean();

    public SysclearAsyncTask19()
    {
        l = Status.PENDING;
        k = new FutureTask(j) {

            final SysclearAsyncTask19 a;

            protected void done()
            {
                try
                {
                    SysclearAsyncTask19.c(a, get());
                    return;
                }
                catch (InterruptedException interruptedexception)
                {
                    Log.w("SysclearAsyncTask19", interruptedexception);
                    return;
                }
                catch (ExecutionException executionexception)
                {
                    throw new RuntimeException("An error occured while executing doInBackground()", executionexception.getCause());
                }
                catch (CancellationException cancellationexception)
                {
                    SysclearAsyncTask19.c(a, null);
                }
            }

            
            {
                a = SysclearAsyncTask19.this;
                super(callable);
            }
        };
    }

    static AtomicBoolean a(SysclearAsyncTask19 sysclearasynctask19)
    {
        return sysclearasynctask19.n;
    }

    static void a(SysclearAsyncTask19 sysclearasynctask19, Object obj)
    {
        sysclearasynctask19.e(obj);
    }

    static Object b(SysclearAsyncTask19 sysclearasynctask19, Object obj)
    {
        return sysclearasynctask19.d(obj);
    }

    static void c(SysclearAsyncTask19 sysclearasynctask19, Object obj)
    {
        sysclearasynctask19.c(obj);
    }

    private void c(Object obj)
    {
        if (!n.get())
        {
            d(obj);
        }
    }

    private Object d(Object obj)
    {
        h.obtainMessage(1, new a(this, new Object[] {
            obj
        })).sendToTarget();
        return obj;
    }

    static int[] d()
    {
        int ai[] = o;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[Status.values().length];
        try
        {
            ai[Status.FINISHED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[Status.PENDING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[Status.RUNNING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        o = ai;
        return ai;
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
        l = Status.FINISHED;
    }

    public final transient SysclearAsyncTask19 a(Executor executor, Object aobj[])
    {
        if (l == Status.PENDING) goto _L2; else goto _L1
_L1:
        d()[l.ordinal()];
        JVM INSTR tableswitch 2 3: default 44
    //                   2 75
    //                   3 85;
           goto _L2 _L3 _L4
_L2:
        l = Status.RUNNING;
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

    protected final transient void c(Object aobj[])
    {
        if (!c())
        {
            h.obtainMessage(2, new a(this, aobj)).sendToTarget();
        }
    }

    public final boolean c()
    {
        return m.get();
    }

    static 
    {
        c = Runtime.getRuntime().availableProcessors();
        d = c + 1;
        e = c * 2 + 1;
        f = new ThreadFactory() {

            private final AtomicInteger a = new AtomicInteger(1);

            public Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, (new StringBuilder("SysclearAsyncTask19 #")).append(a.getAndIncrement()).toString());
            }

        };
        g = new LinkedBlockingQueue(128);
        a = new ThreadPoolExecutor(d, e, 1L, TimeUnit.SECONDS, g, f);
        b = Executors.newSingleThreadExecutor();
        i = b;
    }
}
