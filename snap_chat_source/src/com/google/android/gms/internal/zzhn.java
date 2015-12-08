// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            zzhx, zzhr, zzab, zzhg

public final class zzhn
{

    private static final ThreadFactory zzzk;
    private static final ExecutorService zzzl;
    private static final ExecutorService zzzm;

    public static Future submit(Callable callable)
    {
        return zza(zzzl, callable);
    }

    public static Future zza(int i, Runnable runnable)
    {
        if (i == 1)
        {
            return zza(zzzm, new Callable(runnable) {

                final Runnable zzzn;

                public final Object call()
                {
                    return zzer();
                }

                public final Void zzer()
                {
                    zzzn.run();
                    return null;
                }

            
            {
                zzzn = runnable;
                super();
            }
            });
        } else
        {
            return zza(zzzl, new Callable(runnable) {

                final Runnable zzzn;

                public final Object call()
                {
                    return zzer();
                }

                public final Void zzer()
                {
                    zzzn.run();
                    return null;
                }

            
            {
                zzzn = runnable;
                super();
            }
            });
        }
    }

    public static Future zza(ExecutorService executorservice, Callable callable)
    {
        try
        {
            executorservice = executorservice.submit(new Callable(callable) {

                final Callable zzzo;

                public final Object call()
                {
                    Object obj;
                    try
                    {
                        Process.setThreadPriority(10);
                        obj = zzzo.call();
                    }
                    catch (Exception exception)
                    {
                        zzab.zzaP().zze(exception);
                        throw exception;
                    }
                    return obj;
                }

            
            {
                zzzo = callable;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (ExecutorService executorservice)
        {
            zzhx.zzd("Thread execution is rejected.", executorservice);
            return new zzhr(null);
        }
        return executorservice;
    }

    public static Future zzb(Runnable runnable)
    {
        return zza(0, runnable);
    }

    static 
    {
        zzzk = new ThreadFactory() {

            private final AtomicInteger zzzp = new AtomicInteger(1);

            public final Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, (new StringBuilder("AdWorker #")).append(zzzp.getAndIncrement()).toString());
            }

        };
        zzzl = Executors.newFixedThreadPool(10, zzzk);
        zzzm = Executors.newFixedThreadPool(5, zzzk);
    }
}
