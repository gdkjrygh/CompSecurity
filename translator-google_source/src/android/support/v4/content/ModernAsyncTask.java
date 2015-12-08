// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

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

// Referenced classes of package android.support.v4.content:
//            t, u, v, y, 
//            x, z

abstract class ModernAsyncTask
{

    private static final ThreadFactory a;
    private static final BlockingQueue b;
    public static final Executor c;
    private static y g;
    private static volatile Executor h;
    final z d = new u(this);
    final FutureTask e;
    volatile Status f;
    private final AtomicBoolean i = new AtomicBoolean();

    public ModernAsyncTask()
    {
        f = Status.PENDING;
        e = new v(this, d);
    }

    static Object a(ModernAsyncTask modernasynctask, Object obj)
    {
        return modernasynctask.c(obj);
    }

    static AtomicBoolean a(ModernAsyncTask modernasynctask)
    {
        return modernasynctask.i;
    }

    protected static transient void b()
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
        y y1;
        if (g == null)
        {
            g = new y();
        }
        y1 = g;
        android/support/v4/content/ModernAsyncTask;
        JVM INSTR monitorexit ;
        return y1;
        Exception exception;
        exception;
        android/support/v4/content/ModernAsyncTask;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private Object c(Object obj)
    {
        c().obtainMessage(1, new x(this, new Object[] {
            obj
        })).sendToTarget();
        return obj;
    }

    static void c(ModernAsyncTask modernasynctask, Object obj)
    {
        if (modernasynctask.e.isCancelled())
        {
            modernasynctask.b(obj);
        } else
        {
            modernasynctask.a(obj);
        }
        modernasynctask.f = Status.FINISHED;
    }

    protected transient abstract Object a();

    protected void a(Object obj)
    {
    }

    protected void b(Object obj)
    {
    }

    static 
    {
        a = new t();
        b = new LinkedBlockingQueue(10);
        ThreadPoolExecutor threadpoolexecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, b, a);
        c = threadpoolexecutor;
        h = threadpoolexecutor;
    }

    private class Status extends Enum
    {

        public static final Status FINISHED;
        public static final Status PENDING;
        public static final Status RUNNING;
        private static final Status a[];

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(android/support/v4/content/ModernAsyncTask$Status, s);
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

        private Status(String s, int j)
        {
            super(s, j);
        }
    }

}
