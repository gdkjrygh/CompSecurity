// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            zzhs, zzhv, zzhc

public final class zzhk
{

    private static final ExecutorService zzGe = Executors.newFixedThreadPool(10, zzas("Default"));
    private static final ExecutorService zzGf = Executors.newFixedThreadPool(5, zzas("Loader"));

    public static zzhv zza(int i, Runnable runnable)
    {
        if (i == 1)
        {
            return zza(zzGf, new Callable(runnable) {

                final Runnable zzGg;

                public Object call()
                    throws Exception
                {
                    return zzgk();
                }

                public Void zzgk()
                {
                    zzGg.run();
                    return null;
                }

            
            {
                zzGg = runnable;
                super();
            }
            });
        } else
        {
            return zza(zzGe, new Callable(runnable) {

                final Runnable zzGg;

                public Object call()
                    throws Exception
                {
                    return zzgk();
                }

                public Void zzgk()
                {
                    zzGg.run();
                    return null;
                }

            
            {
                zzGg = runnable;
                super();
            }
            });
        }
    }

    public static zzhv zza(Runnable runnable)
    {
        return zza(0, runnable);
    }

    public static zzhv zza(Callable callable)
    {
        return zza(zzGe, callable);
    }

    public static zzhv zza(ExecutorService executorservice, Callable callable)
    {
        zzhs zzhs1 = new zzhs();
        try
        {
            executorservice.submit(new Runnable(zzhs1, callable) {

                final Callable zzGh;
                final zzhs zzqX;

                public void run()
                {
                    try
                    {
                        Process.setThreadPriority(10);
                        zzqX.zzf(zzGh.call());
                        return;
                    }
                    catch (Exception exception)
                    {
                        zzo.zzby().zzc(exception, true);
                    }
                    zzqX.cancel(true);
                }

            
            {
                zzqX = zzhs1;
                zzGh = callable;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (ExecutorService executorservice)
        {
            zzb.zzd("Thread execution is rejected.", executorservice);
            zzhs1.cancel(true);
            return zzhs1;
        }
        return zzhs1;
    }

    private static ThreadFactory zzas(String s)
    {
        return new ThreadFactory(s) {

            private final AtomicInteger zzGi = new AtomicInteger(1);
            final String zzGj;

            public Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, (new StringBuilder()).append("AdWorker(").append(zzGj).append(") #").append(zzGi.getAndIncrement()).toString());
            }

            
            {
                zzGj = s;
                super();
            }
        };
    }

}
