// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import android.os.Looper;
import b.a.a.a.d;
import b.a.a.a.o;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.a.a.c:
//            s, t

final class r
{

    private final ExecutorService a;

    public r(ExecutorService executorservice)
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
            d.c();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            d.c().b("Fabric", "Failed to execute task.", callable);
            return null;
        }
        return callable;
    }

    final Future a(Runnable runnable)
    {
        try
        {
            runnable = a.submit(new s(this, runnable));
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            d.c();
            return null;
        }
        return runnable;
    }

    final Future b(Callable callable)
    {
        try
        {
            callable = a.submit(new t(this, callable));
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            d.c();
            return null;
        }
        return callable;
    }
}
