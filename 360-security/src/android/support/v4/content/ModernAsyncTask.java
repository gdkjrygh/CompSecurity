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
import java.util.concurrent.atomic.AtomicInteger;

abstract class ModernAsyncTask
{
    public static final class Status extends Enum
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

        private Status(String s, int i)
        {
            super(s, i);
        }
    }

    private static class a
    {

        final ModernAsyncTask a;
        final Object b[];
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
                ModernAsyncTask.a(a1.a, a1.b[0]);
                return;

            case 2: // '\002'
                a1.a.a(a1.b);
                break;
            }
        }

        private b()
        {
        }

    }


    public static final Executor a;
    private static final ThreadFactory b;
    private static final BlockingQueue c;
    private static final b d = new b();
    private static volatile Executor e;
    private final FutureTask f;
    private volatile Status g;

    static void a(ModernAsyncTask modernasynctask, Object obj)
    {
        modernasynctask.c(obj);
    }

    private void c(Object obj)
    {
        if (b())
        {
            b(obj);
        } else
        {
            a(obj);
        }
        g = Status.FINISHED;
    }

    protected void a()
    {
    }

    protected void a(Object obj)
    {
    }

    protected transient void a(Object aobj[])
    {
    }

    protected void b(Object obj)
    {
        a();
    }

    public final boolean b()
    {
        return f.isCancelled();
    }

    static 
    {
        b = new ThreadFactory() {

            private final AtomicInteger a = new AtomicInteger(1);

            public Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, (new StringBuilder()).append("ModernAsyncTask #").append(a.getAndIncrement()).toString());
            }

        };
        c = new LinkedBlockingQueue(10);
        a = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, c, b);
        e = a;
    }
}
