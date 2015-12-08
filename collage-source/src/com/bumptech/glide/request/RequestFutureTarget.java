// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.bumptech.glide.g.h;
import com.bumptech.glide.request.a.c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.bumptech.glide.request:
//            a, c

public class RequestFutureTarget
    implements com.bumptech.glide.request.a, Runnable
{
    static class a
    {

        public void a(Object obj)
        {
            obj.notifyAll();
        }

        public void a(Object obj, long l1)
            throws InterruptedException
        {
            obj.wait(l1);
        }

        a()
        {
        }
    }


    private static final a a = new a();
    private final Handler b;
    private final int c;
    private final int d;
    private final boolean e;
    private final a f;
    private Object g;
    private com.bumptech.glide.request.c h;
    private boolean i;
    private Exception j;
    private boolean k;
    private boolean l;

    private Object a(Long long1)
        throws ExecutionException, InterruptedException, TimeoutException
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            com.bumptech.glide.g.h.b();
        }
        if (i)
        {
            throw new CancellationException();
        }
        break MISSING_BLOCK_LABEL_32;
        long1;
        this;
        JVM INSTR monitorexit ;
        throw long1;
        if (l)
        {
            throw new ExecutionException(j);
        }
        if (!k) goto _L2; else goto _L1
_L1:
        long1 = ((Long) (g));
_L7:
        this;
        JVM INSTR monitorexit ;
        return long1;
_L2:
        if (long1 != null) goto _L4; else goto _L3
_L3:
        f.a(this, 0L);
_L6:
        if (Thread.interrupted())
        {
            throw new InterruptedException();
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (long1.longValue() > 0L)
        {
            f.a(this, long1.longValue());
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (l)
        {
            throw new ExecutionException(j);
        }
        if (i)
        {
            throw new CancellationException();
        }
        if (!k)
        {
            throw new TimeoutException();
        }
        long1 = ((Long) (g));
          goto _L7
    }

    public com.bumptech.glide.request.c a()
    {
        return h;
    }

    public void a(Drawable drawable)
    {
    }

    public void a(com.bumptech.glide.request.b.h h1)
    {
        h1.a(c, d);
    }

    public void a(com.bumptech.glide.request.c c1)
    {
        h = c1;
    }

    public void a(Exception exception, Drawable drawable)
    {
        this;
        JVM INSTR monitorenter ;
        l = true;
        j = exception;
        f.a(this);
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        throw exception;
    }

    public void a(Object obj, c c1)
    {
        this;
        JVM INSTR monitorenter ;
        k = true;
        g = obj;
        f.a(this);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public void b()
    {
        b.post(this);
    }

    public void b(Drawable drawable)
    {
    }

    public boolean cancel(boolean flag)
    {
        boolean flag1 = true;
        boolean flag2 = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag3 = i;
        if (!flag3) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag2;
_L2:
        Exception exception;
        if (isDone())
        {
            flag1 = false;
        }
        flag2 = flag1;
        if (!flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = true;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        b();
        f.a(this);
        flag2 = flag1;
        if (true) goto _L1; else goto _L3
_L3:
        exception;
        throw exception;
    }

    public void d()
    {
    }

    public void e()
    {
    }

    public void f()
    {
    }

    public Object get()
        throws InterruptedException, ExecutionException
    {
        Object obj;
        try
        {
            obj = a(((Long) (null)));
        }
        catch (TimeoutException timeoutexception)
        {
            throw new AssertionError(timeoutexception);
        }
        return obj;
    }

    public Object get(long l1, TimeUnit timeunit)
        throws InterruptedException, ExecutionException, TimeoutException
    {
        return a(Long.valueOf(timeunit.toMillis(l1)));
    }

    public boolean isCancelled()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = i;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isDone()
    {
        this;
        JVM INSTR monitorenter ;
        if (i) goto _L2; else goto _L1
_L1:
        boolean flag = k;
        if (!flag) goto _L3; else goto _L2
_L2:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public void run()
    {
        if (h != null)
        {
            h.d();
            cancel(false);
        }
    }

}
