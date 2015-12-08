// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;

public final class kwv
{

    private static final ExecutorService a = Executors.newFixedThreadPool(10, a("Default"));
    private static final ExecutorService b = Executors.newFixedThreadPool(5, a("Loader"));

    private static ThreadFactory a(String s)
    {
        return new kwy(s);
    }

    public static kxs a(Runnable runnable)
    {
        return a(a, ((Callable) (new kww(runnable))));
    }

    private static kxs a(ExecutorService executorservice, Callable callable)
    {
        kxs kxs1 = new kxs();
        try
        {
            executorservice.submit(new kwx(kxs1, callable));
        }
        // Misplaced declaration of an exception variable
        catch (ExecutorService executorservice)
        {
            b.b("Thread execution is rejected.", executorservice);
            kxs1.cancel(true);
            return kxs1;
        }
        return kxs1;
    }

}
