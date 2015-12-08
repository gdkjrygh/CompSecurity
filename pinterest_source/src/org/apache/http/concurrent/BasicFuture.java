// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package org.apache.http.concurrent:
//            Cancellable, FutureCallback

public class BasicFuture
    implements Future, Cancellable
{

    private final FutureCallback callback;
    private volatile boolean cancelled;
    private volatile boolean completed;
    private volatile Exception ex;
    private volatile Object result;

    public BasicFuture(FutureCallback futurecallback)
    {
        callback = futurecallback;
    }

    private Object getResult()
    {
        if (ex != null)
        {
            throw new ExecutionException(ex);
        } else
        {
            return result;
        }
    }

    public boolean cancel()
    {
        return cancel(true);
    }

    public boolean cancel(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!completed)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        completed = true;
        cancelled = true;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        Exception exception;
        if (callback != null)
        {
            callback.cancelled();
            return true;
        } else
        {
            return true;
        }
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean completed(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (!completed)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        completed = true;
        result = obj;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        if (callback != null)
        {
            callback.completed(obj);
            return true;
        } else
        {
            return true;
        }
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public boolean failed(Exception exception)
    {
        this;
        JVM INSTR monitorenter ;
        if (!completed)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        completed = true;
        ex = exception;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        if (callback != null)
        {
            callback.failed(exception);
            return true;
        } else
        {
            return true;
        }
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object get()
    {
        this;
        JVM INSTR monitorenter ;
        while (!completed) 
        {
            wait();
        }
        break MISSING_BLOCK_LABEL_21;
        Exception exception;
        exception;
        throw exception;
        Object obj = getResult();
        this;
        JVM INSTR monitorexit ;
        return obj;
    }

    public Object get(long l, TimeUnit timeunit)
    {
        this;
        JVM INSTR monitorenter ;
        long l2 = timeunit.toMillis(l);
        if (l2 > 0L) goto _L2; else goto _L1
_L1:
        l = 0L;
_L5:
        if (!completed) goto _L4; else goto _L3
_L3:
        timeunit = ((TimeUnit) (getResult()));
_L6:
        this;
        JVM INSTR monitorexit ;
        return timeunit;
_L2:
        l = System.currentTimeMillis();
          goto _L5
_L4:
        if (l2 > 0L)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        throw new TimeoutException();
        timeunit;
        this;
        JVM INSTR monitorexit ;
        throw timeunit;
        long l1 = l2;
_L8:
label0:
        {
            wait(l1);
            if (!completed)
            {
                break label0;
            }
            timeunit = ((TimeUnit) (getResult()));
        }
          goto _L6
        long l3 = l2 - (System.currentTimeMillis() - l);
        l1 = l3;
        if (l3 > 0L) goto _L8; else goto _L7
_L7:
        throw new TimeoutException();
          goto _L5
    }

    public boolean isCancelled()
    {
        return cancelled;
    }

    public boolean isDone()
    {
        return completed;
    }
}
