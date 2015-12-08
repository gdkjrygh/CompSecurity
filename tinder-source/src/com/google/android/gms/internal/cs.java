// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.gms.internal:
//            ct, cu

public class cs
    implements ct
{

    private final Object a = new Object();
    final cu b = new cu();
    private Object c;
    private boolean d;
    private boolean e;

    public cs()
    {
        c = null;
        d = false;
        e = false;
    }

    public final void b(Object obj)
    {
label0:
        {
            synchronized (a)
            {
                if (!e)
                {
                    break label0;
                }
            }
            return;
        }
        if (d)
        {
            throw new IllegalStateException("Provided CallbackFuture with multiple values.");
        }
        break MISSING_BLOCK_LABEL_39;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        d = true;
        c = obj;
        a.notifyAll();
        b.a();
        obj1;
        JVM INSTR monitorexit ;
    }

    public boolean cancel(boolean flag)
    {
        if (!flag)
        {
            return false;
        }
        synchronized (a)
        {
            if (!d)
            {
                break MISSING_BLOCK_LABEL_29;
            }
        }
        return false;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        e = true;
        d = true;
        a.notifyAll();
        b.a();
        obj;
        JVM INSTR monitorexit ;
        return true;
    }

    public Object get()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = d;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        Exception exception;
        Object obj1;
        try
        {
            a.wait();
        }
        catch (InterruptedException interruptedexception) { }
        if (e)
        {
            throw new CancellationException("CallbackFuture was cancelled.");
        }
        break MISSING_BLOCK_LABEL_45;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj1 = c;
        obj;
        JVM INSTR monitorexit ;
        return obj1;
    }

    public Object get(long l, TimeUnit timeunit)
        throws TimeoutException
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = d;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        l = timeunit.toMillis(l);
        if (l == 0L)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        try
        {
            a.wait(l);
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit) { }
        if (!d)
        {
            throw new TimeoutException("CallbackFuture timed out.");
        }
        break MISSING_BLOCK_LABEL_63;
        timeunit;
        obj;
        JVM INSTR monitorexit ;
        throw timeunit;
        if (e)
        {
            throw new CancellationException("CallbackFuture was cancelled.");
        }
        timeunit = ((TimeUnit) (c));
        obj;
        JVM INSTR monitorexit ;
        return timeunit;
    }

    public boolean isCancelled()
    {
        boolean flag;
        synchronized (a)
        {
            flag = e;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isDone()
    {
        boolean flag;
        synchronized (a)
        {
            flag = d;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
