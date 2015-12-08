// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.p;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p.k.l;
import p.k.s;

public class a
    implements Future, p.k.n.a, p.k.n.b
{

    private l a;
    private boolean b;
    private Object c;
    private s d;
    private boolean e;

    public a()
    {
        b = false;
        e = false;
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

    public static a a()
    {
        return new a();
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

    public void a(l l1)
    {
        this;
        JVM INSTR monitorenter ;
        a = l1;
        if (e && a != null)
        {
            a.g();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        l1;
        throw l1;
    }

    public void a(s s)
    {
        this;
        JVM INSTR monitorenter ;
        d = s;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
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
            a.g();
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

    public Object get(long l1, TimeUnit timeunit)
        throws InterruptedException, ExecutionException, TimeoutException
    {
        return a(Long.valueOf(TimeUnit.MILLISECONDS.convert(l1, timeunit)));
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
