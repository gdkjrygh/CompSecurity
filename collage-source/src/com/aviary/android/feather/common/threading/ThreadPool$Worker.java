// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.threading;

import android.os.Handler;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.aviary.android.feather.common.threading:
//            a, ThreadPool, b

public abstract class d
    implements a, Runnable
{

    b d;
    h e;
    Object f;
    Exception g;
    boolean h;
    boolean i;
    final ThreadPool j;

    protected void a(Exception exception)
    {
        g = exception;
    }

    protected void a(Object obj)
    {
        f = obj;
    }

    public boolean a()
    {
        f();
        return g != null;
    }

    public Exception b()
    {
        f();
        return g;
    }

    protected void c()
    {
        if (e != null)
        {
            ThreadPool.b(j).post(new Runnable() {

                final ThreadPool.Worker a;

                public void run()
                {
                    a.e.a();
                }

            
            {
                a = ThreadPool.Worker.this;
                super();
            }
            });
        }
    }

    public boolean cancel(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        flag = i;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return false;
_L2:
        i = true;
        c();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected void d()
    {
        if (d != null)
        {
            ThreadPool.b(j).post(new Runnable(this) {

                final a a;
                final ThreadPool.Worker b;

                public void run()
                {
                    b.d.a(a);
                }

            
            {
                b = ThreadPool.Worker.this;
                a = a1;
                super();
            }
            });
        }
    }

    protected void e()
    {
        h = true;
    }

    public void f()
    {
        get();
    }

    public Object get()
    {
        this;
        JVM INSTR monitorenter ;
_L1:
        boolean flag = h;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        wait();
          goto _L1
        Object obj;
        obj;
        ThreadPool.b().b(((Throwable) (obj)).getMessage());
        ((Throwable) (obj)).printStackTrace();
          goto _L1
        obj;
        throw obj;
        Object obj1 = f;
        this;
        JVM INSTR monitorexit ;
        return obj1;
    }

    public Object get(long l, TimeUnit timeunit)
        throws InterruptedException, ExecutionException, TimeoutException
    {
        throw new TimeoutException("non implemented");
    }

    public boolean isCancelled()
    {
        return i;
    }

    public boolean isDone()
    {
        return h;
    }

    public transient _cls2.a(ThreadPool threadpool, _cls2.a a1, b b1, Object aobj[])
    {
        j = threadpool;
        super();
        d = b1;
    }
}
