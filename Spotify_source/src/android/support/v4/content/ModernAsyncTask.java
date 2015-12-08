// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import dh;
import di;
import dj;
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

public abstract class ModernAsyncTask
{

    private static final ThreadFactory a;
    public static final Executor b;
    private static final BlockingQueue f;
    private static di g;
    private static volatile Executor h;
    public final dj c = new dj() {

        private ModernAsyncTask a;

        public final Object call()
        {
            ModernAsyncTask.a(a).set(true);
            Process.setThreadPriority(10);
            return ModernAsyncTask.a(a, a.a());
        }

            
            {
                a = ModernAsyncTask.this;
                super((byte)0);
            }
    };
    public final FutureTask d;
    public volatile Status e;
    private final AtomicBoolean i = new AtomicBoolean();

    public ModernAsyncTask()
    {
        e = Status.a;
        d = new FutureTask(c) {

            private ModernAsyncTask a;

            protected final void done()
            {
                try
                {
                    Object obj = get();
                    ModernAsyncTask.b(a, obj);
                    return;
                }
                catch (InterruptedException interruptedexception)
                {
                    Log.w("AsyncTask", interruptedexception);
                    return;
                }
                catch (ExecutionException executionexception)
                {
                    throw new RuntimeException("An error occurred while executing doInBackground()", executionexception.getCause());
                }
                catch (CancellationException cancellationexception)
                {
                    ModernAsyncTask.b(a, null);
                }
                catch (Throwable throwable)
                {
                    throw new RuntimeException("An error occurred while executing doInBackground()", throwable);
                }
            }

            
            {
                a = ModernAsyncTask.this;
                super(callable);
            }
        };
    }

    static Object a(ModernAsyncTask modernasynctask, Object obj)
    {
        return modernasynctask.c(obj);
    }

    static AtomicBoolean a(ModernAsyncTask modernasynctask)
    {
        return modernasynctask.i;
    }

    public static transient void b()
    {
    }

    static void b(ModernAsyncTask modernasynctask, Object obj)
    {
        if (!modernasynctask.i.get())
        {
            modernasynctask.c(obj);
        }
    }

    private static Handler c()
    {
        android/support/v4/content/ModernAsyncTask;
        JVM INSTR monitorenter ;
        di di1;
        if (g == null)
        {
            g = new di();
        }
        di1 = g;
        android/support/v4/content/ModernAsyncTask;
        JVM INSTR monitorexit ;
        return di1;
        Exception exception;
        exception;
        android/support/v4/content/ModernAsyncTask;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private Object c(Object obj)
    {
        c().obtainMessage(1, new dh(this, new Object[] {
            obj
        })).sendToTarget();
        return obj;
    }

    public static void c(ModernAsyncTask modernasynctask, Object obj)
    {
        if (modernasynctask.d.isCancelled())
        {
            modernasynctask.b(obj);
        } else
        {
            modernasynctask.a(obj);
        }
        modernasynctask.e = Status.c;
    }

    public transient abstract Object a();

    public void a(Object obj)
    {
    }

    public void b(Object obj)
    {
    }

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
        ThreadPoolExecutor threadpoolexecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, f, a);
        b = threadpoolexecutor;
        h = threadpoolexecutor;
    }

    // Unreferenced inner class android/support/v4/content/ModernAsyncTask$4

/* anonymous class */
    public final class _cls4
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


    private class Status extends Enum
    {

        public static final Status a;
        public static final Status b;
        public static final Status c;
        private static final Status d[];

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(android/support/v4/content/ModernAsyncTask$Status, s);
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

        private Status(String s, int j)
        {
            super(s, j);
        }
    }

}
