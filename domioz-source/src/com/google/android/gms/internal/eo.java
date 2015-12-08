// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.google.android.gms.internal:
//            er, ep, eq, fj, 
//            fd

public final class eo
{

    private static final ThreadFactory a;
    private static final ExecutorService b;
    private static final ExecutorService c;

    public static Future a(Runnable runnable)
    {
        return a(b, ((Callable) (new ep(runnable))));
    }

    private static Future a(ExecutorService executorservice, Callable callable)
    {
        try
        {
            executorservice = executorservice.submit(new eq(callable));
        }
        // Misplaced declaration of an exception variable
        catch (ExecutorService executorservice)
        {
            fj.c("Thread execution is rejected.", executorservice);
            return new fd();
        }
        return executorservice;
    }

    static 
    {
        a = new er();
        b = Executors.newFixedThreadPool(10, a);
        c = Executors.newFixedThreadPool(5, a);
    }
}
