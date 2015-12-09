// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.util.concurrent:
//            ListenableFuture, Futures

static abstract class <init>
    implements ListenableFuture
{

    private static final Logger log = Logger.getLogger(com/google/common/util/concurrent/Futures$ImmediateFuture.getName());

    public final void addListener(Runnable runnable, Executor executor)
    {
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        try
        {
            executor.execute(runnable);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            log.log(Level.SEVERE, (new StringBuilder("RuntimeException while executing runnable ")).append(runnable).append(" with executor ").append(executor).toString(), runtimeexception);
        }
    }

    public boolean cancel(boolean flag)
    {
        return false;
    }

    public abstract Object get()
        throws ExecutionException;

    public Object get(long l, TimeUnit timeunit)
        throws ExecutionException
    {
        Preconditions.checkNotNull(timeunit);
        return get();
    }

    public boolean isCancelled()
    {
        return false;
    }

    public boolean isDone()
    {
        return true;
    }


    private ()
    {
    }

    ( )
    {
        this();
    }
}
