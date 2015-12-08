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
//            pv, pw, rf, py, 
//            px, pz, rl

public final class pu
{

    private static final ExecutorService a = Executors.newFixedThreadPool(10, a("Default"));
    private static final ExecutorService b = Executors.newFixedThreadPool(5, a("Loader"));

    public static rl a(int i, Runnable runnable)
    {
        if (i == 1)
        {
            return a(b, ((Callable) (new pv(runnable))));
        } else
        {
            return a(a, ((Callable) (new pw(runnable))));
        }
    }

    public static rl a(Runnable runnable)
    {
        return a(0, runnable);
    }

    public static rl a(Callable callable)
    {
        return a(a, callable);
    }

    private static rl a(ExecutorService executorservice, Callable callable)
    {
        rf rf1 = new rf();
        try
        {
            rf1.b(new py(rf1, executorservice.submit(new px(rf1, callable))));
        }
        // Misplaced declaration of an exception variable
        catch (ExecutorService executorservice)
        {
            zzb.zzd("Thread execution is rejected.", executorservice);
            rf1.cancel(true);
            return rf1;
        }
        return rf1;
    }

    private static ThreadFactory a(String s)
    {
        return new pz(s);
    }

}
