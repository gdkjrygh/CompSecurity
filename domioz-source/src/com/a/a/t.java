// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.os.Looper;
import b.a.a.a.f;
import b.a.a.a.q;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.a.a:
//            u, v

final class t
{

    private final ExecutorService a;

    public t(ExecutorService executorservice)
    {
        a = executorservice;
    }

    final Object a(Callable callable)
    {
        try
        {
            if (Looper.getMainLooper() == Looper.myLooper())
            {
                return a.submit(callable).get(4L, TimeUnit.SECONDS);
            }
            callable = ((Callable) (a.submit(callable).get()));
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            f.c().a("Fabric", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            f.c().c("Fabric", "Failed to execute task.", callable);
            return null;
        }
        return callable;
    }

    final Future a(Runnable runnable)
    {
        try
        {
            runnable = a.submit(new u(this, runnable));
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            f.c().a("Fabric", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        return runnable;
    }

    final Future b(Callable callable)
    {
        try
        {
            callable = a.submit(new v(this, callable));
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            f.c().a("Fabric", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        return callable;
    }
}
