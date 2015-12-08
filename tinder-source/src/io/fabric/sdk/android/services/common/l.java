// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            h

public final class l
{

    public static final ThreadFactory a(String s)
    {
        return new ThreadFactory(s, new AtomicLong(1L)) {

            final String a;
            final AtomicLong b;

            public final Thread newThread(Runnable runnable)
            {
                runnable = Executors.defaultThreadFactory().newThread(new h(this, runnable) {

                    final Runnable a;
                    final _cls1 b;

                    public final void a()
                    {
                        a.run();
                    }

            
            {
                b = _pcls1;
                a = runnable;
                super();
            }
                });
                runnable.setName((new StringBuilder()).append(a).append(b.getAndIncrement()).toString());
                return runnable;
            }

            
            {
                a = s;
                b = atomiclong;
                super();
            }
        };
    }

    public static final void a(String s, ExecutorService executorservice)
    {
        TimeUnit timeunit = TimeUnit.SECONDS;
        Runtime.getRuntime().addShutdownHook(new Thread(new h(s, executorservice, timeunit) {

            final String a;
            final ExecutorService b;
            final long c = 2L;
            final TimeUnit d;

            public final void a()
            {
                try
                {
                    io.fabric.sdk.android.c.a().a("Fabric", (new StringBuilder("Executing shutdown hook for ")).append(a).toString());
                    b.shutdown();
                    if (!b.awaitTermination(c, d))
                    {
                        io.fabric.sdk.android.c.a().a("Fabric", (new StringBuilder()).append(a).append(" did not shut down in the allocated time. Requesting immediate shutdown.").toString());
                        b.shutdownNow();
                    }
                    return;
                }
                catch (InterruptedException interruptedexception)
                {
                    io.fabric.sdk.android.c.a().a("Fabric", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[] {
                        a
                    }));
                }
                b.shutdownNow();
            }

            
            {
                a = s;
                b = executorservice;
                d = timeunit;
                super();
            }
        }, (new StringBuilder("Crashlytics Shutdown Hook for ")).append(s).toString()));
    }
}
