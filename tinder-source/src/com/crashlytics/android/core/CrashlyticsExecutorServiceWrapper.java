// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import android.os.Looper;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

public class CrashlyticsExecutorServiceWrapper
{

    private final ExecutorService a;

    public CrashlyticsExecutorServiceWrapper(ExecutorService executorservice)
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
            c.a().a("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            c.a().c("CrashlyticsCore", "Failed to execute task.", callable);
            return null;
        }
        return callable;
    }

    public final Future a(Runnable runnable)
    {
        try
        {
            runnable = a.submit(new Runnable(runnable) {

                final Runnable a;
                final CrashlyticsExecutorServiceWrapper b;

                public void run()
                {
                    try
                    {
                        a.run();
                        return;
                    }
                    catch (Exception exception)
                    {
                        c.a().c("CrashlyticsCore", "Failed to execute task.", exception);
                    }
                }

            
            {
                b = CrashlyticsExecutorServiceWrapper.this;
                a = runnable;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            c.a().a("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        return runnable;
    }

    final Future b(Callable callable)
    {
        try
        {
            callable = a.submit(new Callable(callable) {

                final Callable a;
                final CrashlyticsExecutorServiceWrapper b;

                public Object call()
                    throws Exception
                {
                    Object obj;
                    try
                    {
                        obj = a.call();
                    }
                    catch (Exception exception)
                    {
                        c.a().c("CrashlyticsCore", "Failed to execute task.", exception);
                        return null;
                    }
                    return obj;
                }

            
            {
                b = CrashlyticsExecutorServiceWrapper.this;
                a = callable;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            c.a().a("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        return callable;
    }
}
