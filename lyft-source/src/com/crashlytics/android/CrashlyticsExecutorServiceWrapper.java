// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.os.Looper;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

class CrashlyticsExecutorServiceWrapper
{

    private final ExecutorService a;

    public CrashlyticsExecutorServiceWrapper(ExecutorService executorservice)
    {
        a = executorservice;
    }

    Object a(Callable callable)
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
            Fabric.g().a("Fabric", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            Fabric.g().d("Fabric", "Failed to execute task.", callable);
            return null;
        }
        return callable;
    }

    Future a(Runnable runnable)
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
                        Fabric.g().d("Fabric", "Failed to execute task.", exception);
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
            Fabric.g().a("Fabric", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        return runnable;
    }

    Future b(Callable callable)
    {
        try
        {
            callable = a.submit(new Callable(callable) {

                final Callable a;
                final CrashlyticsExecutorServiceWrapper b;

                public Object call()
                {
                    Object obj;
                    try
                    {
                        obj = a.call();
                    }
                    catch (Exception exception)
                    {
                        Fabric.g().d("Fabric", "Failed to execute task.", exception);
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
            Fabric.g().a("Fabric", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        return callable;
    }
}
