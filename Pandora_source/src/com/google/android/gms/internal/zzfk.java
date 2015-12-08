// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            zzfs, zzfv, zzfc

public final class zzfk
{

    private static final ExecutorService zzCl = Executors.newFixedThreadPool(10, zzac("Default"));
    private static final ExecutorService zzCm = Executors.newFixedThreadPool(5, zzac("Loader"));

    public static zzfv zza(int i, Runnable runnable)
    {
        if (i == 1)
        {
            return zza(zzCm, new Callable(runnable) {

                final Runnable a;

                public Void a()
                {
                    a.run();
                    return null;
                }

                public Object call()
                    throws Exception
                {
                    return a();
                }

            
            {
                a = runnable;
                super();
            }
            });
        } else
        {
            return zza(zzCl, new Callable(runnable) {

                final Runnable a;

                public Void a()
                {
                    a.run();
                    return null;
                }

                public Object call()
                    throws Exception
                {
                    return a();
                }

            
            {
                a = runnable;
                super();
            }
            });
        }
    }

    public static zzfv zza(Runnable runnable)
    {
        return zza(0, runnable);
    }

    public static zzfv zza(Callable callable)
    {
        return zza(zzCl, callable);
    }

    public static zzfv zza(ExecutorService executorservice, Callable callable)
    {
        zzfs zzfs1 = new zzfs();
        try
        {
            executorservice.submit(new Runnable(zzfs1, callable) {

                final zzfs a;
                final Callable b;

                public void run()
                {
                    try
                    {
                        Process.setThreadPriority(10);
                        a.zzc(b.call());
                        return;
                    }
                    catch (Exception exception)
                    {
                        zzh.zzaT().zzc(exception, true);
                    }
                    a.cancel(true);
                }

            
            {
                a = zzfs1;
                b = callable;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (ExecutorService executorservice)
        {
            zzb.zzd("Thread execution is rejected.", executorservice);
            zzfs1.cancel(true);
            return zzfs1;
        }
        return zzfs1;
    }

    private static ThreadFactory zzac(String s)
    {
        return new ThreadFactory(s) {

            final String a;
            private final AtomicInteger b = new AtomicInteger(1);

            public Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, (new StringBuilder()).append("AdWorker(").append(a).append(") #").append(b.getAndIncrement()).toString());
            }

            
            {
                a = s;
                super();
            }
        };
    }

}
