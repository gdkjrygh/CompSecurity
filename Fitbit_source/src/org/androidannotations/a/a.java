// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.a;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class org.androidannotations.a.a
{
    public static abstract class a
        implements Runnable
    {

        private String a;
        private int b;
        private long c;
        private String d;
        private boolean e;
        private Future f;
        private AtomicBoolean g;

        static String a(a a1)
        {
            return a1.d;
        }

        static Future a(a a1, Future future)
        {
            a1.f = future;
            return future;
        }

        static boolean a(a a1, boolean flag)
        {
            a1.e = flag;
            return flag;
        }

        static int b(a a1)
        {
            return a1.b;
        }

        private void b()
        {
            if (a == null && d == null)
            {
                return;
            }
            org/androidannotations/a/a;
            JVM INSTR monitorenter ;
            a a1;
            org.androidannotations.a.a.a().remove(this);
            if (d == null)
            {
                break MISSING_BLOCK_LABEL_75;
            }
            a1 = org.androidannotations.a.a.a(d);
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_75;
            }
            if (a1.b != 0)
            {
                a1.b = Math.max(0, (int)(c - System.currentTimeMillis()));
            }
            org.androidannotations.a.a.a(a1);
            org/androidannotations/a/a;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            org/androidannotations/a/a;
            JVM INSTR monitorexit ;
            throw exception;
        }

        static String c(a a1)
        {
            return a1.a;
        }

        static Future d(a a1)
        {
            return a1.f;
        }

        static AtomicBoolean e(a a1)
        {
            return a1.g;
        }

        static void f(a a1)
        {
            a1.b();
        }

        static boolean g(a a1)
        {
            return a1.e;
        }

        public abstract void a();

        public void run()
        {
            if (g.getAndSet(true))
            {
                return;
            }
            a();
            b();
            return;
            Exception exception;
            exception;
            b();
            throw exception;
        }

        public a(String s, int i, String s1)
        {
            g = new AtomicBoolean();
            if (!"".equals(s))
            {
                a = s;
            }
            if (i > 0)
            {
                b = i;
                c = System.currentTimeMillis() + (long)i;
            }
            if (!"".equals(s1))
            {
                d = s1;
            }
        }
    }


    public static Executor a;
    private static final String b = "BackgroundExecutor";
    private static Executor c;
    private static final List d = new ArrayList();

    public org.androidannotations.a.a()
    {
    }

    static List a()
    {
        return d;
    }

    static a a(String s)
    {
        return c(s);
    }

    public static void a(Runnable runnable)
    {
        b(runnable, 0);
    }

    public static void a(Runnable runnable, int i)
    {
        b(runnable, i);
    }

    public static void a(Runnable runnable, String s, int i, String s1)
    {
        a(((a) (new a(s, i, s1, runnable) {

            final Runnable a;

            public void a()
            {
                a.run();
            }

            
            {
                a = runnable;
                super(s, i, s1);
            }
        })));
    }

    public static void a(Runnable runnable, String s, String s1)
    {
        a(runnable, s, 0, s1);
    }

    public static void a(String s, boolean flag)
    {
        org/androidannotations/a/a;
        JVM INSTR monitorenter ;
        int i = d.size() - 1;
_L2:
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        a a1;
        a1 = (a)d.get(i);
        if (!s.equals(a.c(a1)))
        {
            break MISSING_BLOCK_LABEL_144;
        }
        if (a.d(a1) != null)
        {
            a.d(a1).cancel(flag);
            if (!a.e(a1).getAndSet(true))
            {
                a.f(a1);
            }
            break MISSING_BLOCK_LABEL_144;
        }
        if (a.g(a1))
        {
            Log.w("BackgroundExecutor", (new StringBuilder()).append("A task with id ").append(a.c(a1)).append(" cannot be cancelled (the executor set does not support it)").toString());
            break MISSING_BLOCK_LABEL_144;
        }
        break MISSING_BLOCK_LABEL_127;
        s;
        throw s;
        d.remove(i);
        break MISSING_BLOCK_LABEL_144;
        org/androidannotations/a/a;
        JVM INSTR monitorexit ;
        return;
        i--;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void a(Executor executor)
    {
        c = executor;
    }

    public static void a(a a1)
    {
        org/androidannotations/a/a;
        JVM INSTR monitorenter ;
        Future future = null;
        if (a.a(a1) == null || !b(a.a(a1)))
        {
            a.a(a1, true);
            future = b(a1, a.b(a1));
        }
        if (a.c(a1) != null || a.a(a1) != null)
        {
            a.a(a1, future);
            d.add(a1);
        }
        org/androidannotations/a/a;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    private static Future b(Runnable runnable, int i)
    {
        if (i > 0)
        {
            if (!(c instanceof ScheduledExecutorService))
            {
                throw new IllegalArgumentException("The executor set does not support scheduling");
            } else
            {
                return ((ScheduledExecutorService)c).schedule(runnable, i, TimeUnit.MILLISECONDS);
            }
        }
        if (c instanceof ExecutorService)
        {
            return ((ExecutorService)c).submit(runnable);
        } else
        {
            c.execute(runnable);
            return null;
        }
    }

    private static boolean b(String s)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            a a1 = (a)iterator.next();
            if (a.g(a1) && s.equals(a.a(a1)))
            {
                return true;
            }
        }

        return false;
    }

    private static a c(String s)
    {
        int j = d.size();
        for (int i = 0; i < j; i++)
        {
            if (s.equals(a.a((a)d.get(i))))
            {
                return (a)d.remove(i);
            }
        }

        return null;
    }

    static 
    {
        a = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() * 2);
        c = a;
    }
}
