// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.concurrent;

import android.os.ConditionVariable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public class CompletableFuture
    implements Future
{

    private final AtomicBoolean complete = new AtomicBoolean();
    private ConditionVariable condition;
    private Throwable error;
    private Object result;

    public CompletableFuture()
    {
        condition = new ConditionVariable();
    }

    public static CompletableFuture completedFuture(Object obj)
    {
        CompletableFuture completablefuture = new CompletableFuture();
        completablefuture.complete(obj);
        return completablefuture;
    }

    public boolean cancel(boolean flag)
    {
        if (complete.get())
        {
            return false;
        } else
        {
            completeExceptionally(new CancellationException());
            return true;
        }
    }

    protected void complete()
    {
        complete.set(true);
        condition.open();
    }

    public void complete(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (complete.get())
        {
            throw new IllegalStateException("already complete");
        }
        break MISSING_BLOCK_LABEL_27;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        result = obj;
        complete();
        this;
        JVM INSTR monitorexit ;
    }

    public boolean completeExceptionally(Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        if (!complete.get())
        {
            break MISSING_BLOCK_LABEL_16;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        error = throwable;
        complete();
        this;
        JVM INSTR monitorexit ;
        return true;
        throwable;
        this;
        JVM INSTR monitorexit ;
        throw throwable;
    }

    public Object get()
        throws InterruptedException, ExecutionException
    {
        condition.block();
        if (error != null)
        {
            throw new ExecutionException(error);
        } else
        {
            return result;
        }
    }

    public Object get(long l, TimeUnit timeunit)
        throws InterruptedException, ExecutionException, TimeoutException
    {
        if (condition.block(timeunit.toMillis(l)))
        {
            if (error != null)
            {
                throw new ExecutionException(error);
            } else
            {
                return result;
            }
        } else
        {
            throw new TimeoutException();
        }
    }

    public Object getNow(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (!complete.get())
        {
            break MISSING_BLOCK_LABEL_21;
        }
        obj = result;
        return obj;
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public boolean isCancelled()
    {
        return error instanceof CancellationException;
    }

    public boolean isCompletedExceptionally()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (!complete.get())
        {
            break MISSING_BLOCK_LABEL_27;
        }
        if (error != null)
        {
            flag = true;
        }
        return flag;
        this;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isDone()
    {
        return complete.get();
    }

    public Object join()
    {
        Object obj;
        try
        {
            obj = get();
        }
        catch (InterruptedException interruptedexception)
        {
            throw new RuntimeException(interruptedexception);
        }
        catch (ExecutionException executionexception)
        {
            throw new RuntimeException(executionexception);
        }
        return obj;
    }
}
