// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

final class alw
{

    private final ExecutorService a;

    public alw(ExecutorService executorservice)
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
            gya.a().a("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            gya.a().c("CrashlyticsCore", "Failed to execute task.", callable);
            return null;
        }
        return callable;
    }

    final Future a(Runnable runnable)
    {
        try
        {
            runnable = a.submit(new Runnable(runnable) {

                private Runnable a;

                public final void run()
                {
                    try
                    {
                        a.run();
                        return;
                    }
                    catch (Exception exception)
                    {
                        gya.a().c("CrashlyticsCore", "Failed to execute task.", exception);
                    }
                }

            
            {
                a = runnable;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            gya.a().a("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        return runnable;
    }

    final Future b(Callable callable)
    {
        try
        {
            callable = a.submit(new Callable(callable) {

                private Callable a;

                public final Object call()
                {
                    Object obj;
                    try
                    {
                        obj = a.call();
                    }
                    catch (Exception exception)
                    {
                        gya.a().c("CrashlyticsCore", "Failed to execute task.", exception);
                        return null;
                    }
                    return obj;
                }

            
            {
                a = callable;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            gya.a().a("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        return callable;
    }
}
