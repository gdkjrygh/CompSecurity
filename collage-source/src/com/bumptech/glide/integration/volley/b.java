// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.integration.volley;

import com.android.volley.k;
import com.android.volley.r;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class b
    implements com.android.volley.m.a, com.android.volley.m.b, Future
{

    private k a;
    private boolean b;
    private Object c;
    private r d;
    private boolean e;

    public b()
    {
        b = false;
        e = false;
    }

    public static b a()
    {
        return new b();
    }

    private Object a(Long long1)
        throws InterruptedException, ExecutionException, TimeoutException
    {
        this;
        JVM INSTR monitorenter ;
        if (d != null)
        {
            throw new ExecutionException(d);
        }
        break MISSING_BLOCK_LABEL_26;
        long1;
        this;
        JVM INSTR monitorexit ;
        throw long1;
        if (!b) goto _L2; else goto _L1
_L1:
        long1 = ((Long) (c));
_L7:
        this;
        JVM INSTR monitorexit ;
        return long1;
_L2:
        if (isCancelled())
        {
            throw new CancellationException();
        }
        if (long1 != null) goto _L4; else goto _L3
_L3:
        wait(0L);
_L6:
        if (d != null)
        {
            throw new ExecutionException(d);
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (long1.longValue() > 0L)
        {
            wait(long1.longValue());
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (isCancelled())
        {
            throw new CancellationException();
        }
        if (!b)
        {
            throw new TimeoutException();
        }
        long1 = ((Long) (c));
          goto _L7
    }

    public void a(k k1)
    {
        this;
        JVM INSTR monitorenter ;
        a = k1;
        if (e && a != null)
        {
            a.i();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        k1;
        throw k1;
    }

    public void a(r r)
    {
        this;
        JVM INSTR monitorenter ;
        d = r;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        r;
        throw r;
    }

    public void a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        b = true;
        c = obj;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public boolean cancel(boolean flag)
    {
        flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = isDone();
        if (!flag1) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        e = true;
        if (a != null)
        {
            a.i();
        }
        notifyAll();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
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

    public Object get(long l, TimeUnit timeunit)
        throws InterruptedException, ExecutionException, TimeoutException
    {
        return a(Long.valueOf(TimeUnit.MILLISECONDS.convert(l, timeunit)));
    }

    public boolean isCancelled()
    {
        return e;
    }

    public boolean isDone()
    {
        this;
        JVM INSTR monitorenter ;
        if (b || d != null) goto _L2; else goto _L1
_L1:
        boolean flag = isCancelled();
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
}
