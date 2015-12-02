// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;

public final class ajb
{

    private static final ExecutorService a = Executors.newFixedThreadPool(10, a("Default"));
    private static final ExecutorService b = Executors.newFixedThreadPool(5, a("Loader"));

    public static ajw a(int i, Runnable runnable)
    {
        if (i == 1)
        {
            return a(b, ((Callable) (new _cls1(runnable))));
        } else
        {
            return a(a, ((Callable) (new _cls2(runnable))));
        }
    }

    public static ajw a(Runnable runnable)
    {
        return a(0, runnable);
    }

    public static ajw a(Callable callable)
    {
        return a(a, callable);
    }

    private static ajw a(ExecutorService executorservice, Callable callable)
    {
        ajs ajs1 = new ajs();
        try
        {
            executorservice.submit(new _cls3(ajs1, callable));
        }
        // Misplaced declaration of an exception variable
        catch (ExecutorService executorservice)
        {
            of.d("Thread execution is rejected.", executorservice);
            ajs1.cancel(true);
            return ajs1;
        }
        return ajs1;
    }

    private static ThreadFactory a(String s)
    {
        return new _cls4(s);
    }


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}

}
