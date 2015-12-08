// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.google.android.gms.internal:
//            hh, hk

public final class gv
{

    private static final ExecutorService a = Executors.newFixedThreadPool(10, a("Default"));
    private static final ExecutorService b = Executors.newFixedThreadPool(5, a("Loader"));

    public static hk a(int i, Runnable runnable)
    {
        if (i == 1)
        {
            return a(b, ((Callable) (new _cls1(runnable))));
        } else
        {
            return a(a, ((Callable) (new _cls2(runnable))));
        }
    }

    public static hk a(Runnable runnable)
    {
        return a(0, runnable);
    }

    public static hk a(Callable callable)
    {
        return a(a, callable);
    }

    public static hk a(ExecutorService executorservice, Callable callable)
    {
        hh hh1 = new hh();
        try
        {
            executorservice.submit(new zzht._cls3(hh1, callable));
        }
        // Misplaced declaration of an exception variable
        catch (ExecutorService executorservice)
        {
            zzb.zzd("Thread execution is rejected.", executorservice);
            hh1.cancel(true);
            return hh1;
        }
        return hh1;
    }

    private static ThreadFactory a(String s)
    {
        return new _cls3(s);
    }


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
