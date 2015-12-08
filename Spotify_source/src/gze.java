// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class gze
{

    public static final ThreadFactory a(String s)
    {
        return new ThreadFactory(s, new AtomicLong(1L)) {

            private String a;
            private AtomicLong b;

            public final Thread newThread(Runnable runnable)
            {
                runnable = Executors.defaultThreadFactory().newThread(new gyy(runnable) {

                    private Runnable a;

                    public final void a()
                    {
                        a.run();
                    }

            
            {
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
        Runtime.getRuntime().addShutdownHook(new Thread(new gyy(s, executorservice, timeunit) {

            private String a;
            private ExecutorService b;
            private long c;
            private TimeUnit d;

            public final void a()
            {
                try
                {
                    gya.a().a("Fabric", (new StringBuilder("Executing shutdown hook for ")).append(a).toString());
                    b.shutdown();
                    if (!b.awaitTermination(c, d))
                    {
                        gya.a().a("Fabric", (new StringBuilder()).append(a).append(" did not shut down in the allocated time. Requesting immediate shutdown.").toString());
                        b.shutdownNow();
                    }
                    return;
                }
                catch (InterruptedException interruptedexception)
                {
                    gya.a().a("Fabric", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[] {
                        a
                    }));
                }
                b.shutdownNow();
            }

            
            {
                a = s;
                b = executorservice;
                c = 2L;
                d = timeunit;
                super();
            }
        }, (new StringBuilder("Crashlytics Shutdown Hook for ")).append(s).toString()));
    }
}
