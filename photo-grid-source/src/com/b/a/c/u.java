// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import a.a.a.a.f;
import a.a.a.a.s;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.b.a.c:
//            v, w

final class u
{

    private final ExecutorService a;

    public u(ExecutorService executorservice)
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
            f.d();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            f.d().b("CrashlyticsCore", "Failed to execute task.", callable);
            return null;
        }
        return callable;
    }

    final Future a(Runnable runnable)
    {
        try
        {
            runnable = a.submit(new v(this, runnable));
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            f.d();
            return null;
        }
        return runnable;
    }

    final Future b(Callable callable)
    {
        try
        {
            callable = a.submit(new w(this, callable));
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            f.d();
            return null;
        }
        return callable;
    }
}
