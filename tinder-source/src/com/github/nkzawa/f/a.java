// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.f;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class a extends Thread
{

    private static final ThreadFactory a = new ThreadFactory() {

        public final Thread newThread(Runnable runnable)
        {
            a.a(new a(runnable, (byte)0));
            a.a().setName("EventThread");
            return a.a();
        }

    };
    private static a b;
    private static ExecutorService c;
    private static int d = 0;

    private a(Runnable runnable)
    {
        super(runnable);
    }

    a(Runnable runnable, byte byte0)
    {
        this(runnable);
    }

    static a a()
    {
        return b;
    }

    static a a(a a1)
    {
        b = a1;
        return a1;
    }

    public static void a(Runnable runnable)
    {
        boolean flag;
        if (currentThread() == b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            runnable.run();
            return;
        } else
        {
            b(runnable);
            return;
        }
    }

    static int b()
    {
        int i = d;
        d = i - 1;
        return i;
    }

    public static void b(Runnable runnable)
    {
        com/github/nkzawa/f/a;
        JVM INSTR monitorenter ;
        ExecutorService executorservice;
        d++;
        if (c == null)
        {
            c = Executors.newSingleThreadExecutor(a);
        }
        executorservice = c;
        com/github/nkzawa/f/a;
        JVM INSTR monitorexit ;
        executorservice.execute(new Runnable(runnable) {

            final Runnable a;

            public final void run()
            {
                a.run();
                com/github/nkzawa/f/a;
                JVM INSTR monitorenter ;
                a.b();
                if (a.c() == 0)
                {
                    a.d().shutdown();
                    a.e();
                    a.a(null);
                }
                com/github/nkzawa/f/a;
                JVM INSTR monitorexit ;
                return;
                Exception exception;
                exception;
                com/github/nkzawa/f/a;
                JVM INSTR monitorexit ;
                throw exception;
                exception;
                com/github/nkzawa/f/a;
                JVM INSTR monitorenter ;
                a.b();
                if (a.c() == 0)
                {
                    a.d().shutdown();
                    a.e();
                    a.a(null);
                }
                com/github/nkzawa/f/a;
                JVM INSTR monitorexit ;
                throw exception;
                exception;
                com/github/nkzawa/f/a;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = runnable;
                super();
            }
        });
        return;
        runnable;
        com/github/nkzawa/f/a;
        JVM INSTR monitorexit ;
        throw runnable;
    }

    static int c()
    {
        return d;
    }

    static ExecutorService d()
    {
        return c;
    }

    static ExecutorService e()
    {
        c = null;
        return null;
    }

}
