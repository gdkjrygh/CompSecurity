// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b;

import com.b.a.b.a.a.c;
import com.b.a.b.a.g;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class com.b.a.b.a
{
    private static final class a
        implements ThreadFactory
    {

        private static final AtomicInteger a = new AtomicInteger(1);
        private final ThreadGroup b;
        private final AtomicInteger c = new AtomicInteger(1);
        private final String d;
        private final int e;

        public final Thread newThread(Runnable runnable)
        {
            runnable = new Thread(b, runnable, (new StringBuilder()).append(d).append(c.getAndIncrement()).toString(), 0L);
            if (runnable.isDaemon())
            {
                runnable.setDaemon(false);
            }
            runnable.setPriority(e);
            return runnable;
        }


        a(int i, String s)
        {
            e = i;
            Object obj = System.getSecurityManager();
            if (obj != null)
            {
                obj = ((SecurityManager) (obj)).getThreadGroup();
            } else
            {
                obj = Thread.currentThread().getThreadGroup();
            }
            b = ((ThreadGroup) (obj));
            d = (new StringBuilder()).append(s).append(a.getAndIncrement()).append("-thread-").toString();
        }
    }


    public static Executor a(int i, int j, int k)
    {
        Object obj;
        if (k == g.b)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            obj = new c();
        } else
        {
            obj = new LinkedBlockingQueue();
        }
        obj = (BlockingQueue)obj;
        return new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, ((BlockingQueue) (obj)), a(j, "uil-pool-"));
    }

    static ThreadFactory a(int i, String s)
    {
        return new a(i, s);
    }
}
