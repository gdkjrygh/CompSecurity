// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.b;

import com.qihoo.security.engine.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class e
{
    class a extends Thread
    {

        final _cls1 a;

        public void run()
        {
            super.run();
        }

        public a(_cls1 _pcls1, Runnable runnable, String s)
        {
            a = _pcls1;
            super(runnable, s);
        }
    }

    public static interface a
    {

        public abstract void i();

        public abstract void j();
    }

    class b extends ThreadPoolExecutor
    {

        LinkedList a;
        final e b;
        private volatile boolean c;

        boolean a()
        {
            LinkedList linkedlist = a;
            linkedlist;
            JVM INSTR monitorenter ;
            Exception exception;
            boolean flag;
            if (a.isEmpty() && !c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            linkedlist;
            JVM INSTR monitorexit ;
            return flag;
            exception;
            linkedlist;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected void afterExecute(Runnable runnable, Throwable throwable)
        {
            super.afterExecute(runnable, throwable);
            if (throwable == null);
            throwable = (com.qihoo.security.engine.a)runnable;
            runnable = a;
            runnable;
            JVM INSTR monitorenter ;
            if (!a.remove(throwable));
            if (!c) goto _L2; else goto _L1
_L1:
            return;
_L2:
            if (a.isEmpty() && getQueue().isEmpty())
            {
                b.d.i();
            }
            if (true) goto _L1; else goto _L3
_L3:
            throwable;
            runnable;
            JVM INSTR monitorexit ;
            throw throwable;
        }

        void b()
        {
            Object obj;
            c = true;
            obj = getQueue();
_L5:
            if ((com.qihoo.security.engine.a)((BlockingQueue) (obj)).poll() != null) goto _L2; else goto _L1
_L1:
            obj = a;
            obj;
            JVM INSTR monitorenter ;
            Iterator iterator = a.iterator();
_L3:
            if (iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_79;
            }
            shutdown();
            b.d.j();
            return;
_L2:
            b.c.decrementAndGet();
            continue; /* Loop/switch isn't completed */
            ((com.qihoo.security.engine.a)iterator.next()).a();
              goto _L3
            Exception exception;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            if (true) goto _L5; else goto _L4
_L4:
        }

        protected void beforeExecute(Thread thread, Runnable runnable)
        {
_L4:
            boolean flag;
            if (!b.a)
            {
                break MISSING_BLOCK_LABEL_21;
            }
            flag = c;
            Object obj;
            com.qihoo.security.engine.a a1;
            if (!flag)
            {
                try
                {
                    Thread.sleep(100L);
                    continue; /* Loop/switch isn't completed */
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            a1 = (com.qihoo.security.engine.a)runnable;
            obj = a;
            obj;
            JVM INSTR monitorenter ;
            b.c.decrementAndGet();
            if (!c)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            a1.a();
_L2:
            super.beforeExecute(thread, runnable);
            return;
            a.add(a1);
            if (true) goto _L2; else goto _L1
_L1:
            thread;
            obj;
            JVM INSTR monitorexit ;
            throw thread;
            if (true) goto _L4; else goto _L3
_L3:
        }

        b()
        {
            b = e.this;
            super(2, 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), e.f());
            c = false;
            a = new LinkedList();
        }
    }


    private static final byte e[] = new byte[0];
    private static final ThreadFactory f = new ThreadFactory() {

        private final AtomicInteger a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable)
        {
            return new a(this, runnable, (new StringBuilder("TaskWorkThread #")).append(a.getAndIncrement()).toString());
        }

    };
    volatile boolean a;
    volatile boolean b;
    AtomicInteger c;
    final a d;
    private b g;

    public e(a a1)
    {
        a = false;
        b = false;
        c = new AtomicInteger(0);
        d = a1;
        g = new b();
    }

    static ThreadFactory f()
    {
        return f;
    }

    void a()
    {
        b = true;
        synchronized (e)
        {
            if (g != null)
            {
                g.b();
                g = null;
            }
        }
        return;
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void a(com.qihoo.security.engine.a a1)
    {
        if (b)
        {
            return;
        }
        synchronized (e)
        {
            if (g == null)
            {
                g = new b();
            }
            c.incrementAndGet();
            g.execute(a1);
        }
        return;
        a1;
        abyte0;
        JVM INSTR monitorexit ;
        throw a1;
    }

    void b()
    {
        b = false;
        a = false;
        synchronized (e)
        {
            if (g == null)
            {
                g = new b();
            }
        }
        return;
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void c()
    {
        a = true;
    }

    void d()
    {
        a = false;
    }

    public boolean e()
    {
        byte abyte0[] = e;
        abyte0;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (g == null || g.a() && g.getQueue().isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        abyte0;
        JVM INSTR monitorexit ;
        return b || c.get() == 0 && flag;
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
