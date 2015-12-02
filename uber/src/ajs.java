// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ajs
    implements ajw
{

    private final Object a = new Object();
    private Object b;
    private boolean c;
    private boolean d;
    private final ajx e = new ajx();

    public ajs()
    {
        b = null;
        c = false;
        d = false;
    }

    public final void a(Object obj)
    {
        Object obj1 = a;
        obj1;
        JVM INSTR monitorenter ;
        if (c)
        {
            throw new IllegalStateException("Provided CallbackFuture with multiple values.");
        }
        break MISSING_BLOCK_LABEL_29;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        c = true;
        b = obj;
        a.notifyAll();
        e.a();
        obj1;
        JVM INSTR monitorexit ;
    }

    public final void a(Runnable runnable)
    {
        e.a(runnable);
    }

    public final boolean cancel(boolean flag)
    {
        if (!flag)
        {
            return false;
        }
        synchronized (a)
        {
            if (!c)
            {
                break MISSING_BLOCK_LABEL_29;
            }
        }
        return false;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        d = true;
        c = true;
        a.notifyAll();
        e.a();
        obj;
        JVM INSTR monitorexit ;
        return true;
    }

    public final Object get()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = c;
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
        if (d)
        {
            throw new CancellationException("CallbackFuture was cancelled.");
        }
        break MISSING_BLOCK_LABEL_45;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj1 = b;
        obj;
        JVM INSTR monitorexit ;
        return obj1;
    }

    public final Object get(long l, TimeUnit timeunit)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = c;
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
        if (!c)
        {
            throw new TimeoutException("CallbackFuture timed out.");
        }
        break MISSING_BLOCK_LABEL_63;
        timeunit;
        obj;
        JVM INSTR monitorexit ;
        throw timeunit;
        if (d)
        {
            throw new CancellationException("CallbackFuture was cancelled.");
        }
        timeunit = ((TimeUnit) (b));
        obj;
        JVM INSTR monitorexit ;
        return timeunit;
    }

    public final boolean isCancelled()
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

    public final boolean isDone()
    {
        boolean flag;
        synchronized (a)
        {
            flag = c;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
