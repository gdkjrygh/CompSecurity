// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.b;

import android.os.Handler;
import com.qihoo.security.engine.a;
import com.qihoo.security.services.d;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.qihoo.security.engine.b:
//            c, f

public class g
    implements com.qihoo.security.engine.a.a
{
    class a extends ThreadPoolExecutor
    {

        volatile com.qihoo.security.engine.a a;
        volatile boolean b;
        final g c;

        boolean a()
        {
            return a == null;
        }

        protected void afterExecute(Runnable runnable, Throwable throwable)
        {
            super.afterExecute(runnable, throwable);
            if (throwable == null);
            synchronized (a)
            {
                a = null;
            }
            c.d.decrementAndGet();
            return;
            throwable;
            runnable;
            JVM INSTR monitorexit ;
            throw throwable;
        }

        void b()
        {
            b = true;
            BlockingQueue blockingqueue = getQueue();
            do
            {
                if ((com.qihoo.security.engine.a)blockingqueue.poll() == null)
                {
                    if (a != null)
                    {
                        synchronized (a)
                        {
                            a.a();
                        }
                    }
                    return;
                }
                c.d.decrementAndGet();
            } while (true);
            exception;
            a1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected void beforeExecute(Thread thread, Runnable runnable)
        {
            a = (com.qihoo.security.engine.a)runnable;
            c.c.postDelayed(new f(a), 0x2bf20L);
            super.beforeExecute(thread, runnable);
        }

        a()
        {
            c = g.this;
            super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
            a = null;
            b = false;
        }
    }


    final Runnable a = new Runnable() {

        final g a;

        public void run()
        {
            if (a.d() && a.f)
            {
                a.b();
                a.f = false;
            }
        }

            
            {
                a = g.this;
                super();
            }
    };
    final c b;
    final Handler c;
    final AtomicInteger d = new AtomicInteger(0);
    final a e = new a();
    boolean f;

    public g(c c1, Handler handler)
    {
        f = false;
        b = c1;
        c = handler;
    }

    public void a()
    {
        b.a();
        f = true;
    }

    public void a(int i, int j, List list)
    {
        if (b.h())
        {
            c();
        }
    }

    public void a(int i, List list)
    {
        if (b.h())
        {
            c();
        }
    }

    public void a(int i, List list, String s)
    {
    }

    public void a(long l)
    {
        c.postDelayed(new Runnable() {

            final g a;

            public void run()
            {
                a.e.b();
            }

            
            {
                a = g.this;
                super();
            }
        }, l);
    }

    public void a(List list)
    {
        if (!f)
        {
            a();
        }
        d.incrementAndGet();
        list = new com.qihoo.security.engine.a(7, b.e, list, this);
        e.execute(list);
    }

    public void b()
    {
        try
        {
            b.e.e().d(7);
        }
        catch (Exception exception) { }
        b.b();
    }

    public void c()
    {
        c.postDelayed(a, 300L);
    }

    public boolean d()
    {
        return d.get() == 0 && e.getQueue().isEmpty() && e.a();
    }
}
