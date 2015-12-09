// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.crashlytics.android.internal:
//            az, cm, cj

final class bm extends az
{

    private String a;
    private ExecutorService b;
    private long c;
    private TimeUnit d;

    bm(String s, ExecutorService executorservice, long l, TimeUnit timeunit)
    {
        a = s;
        b = executorservice;
        c = l;
        d = timeunit;
        super();
    }

    public final void a()
    {
        try
        {
            cm.a().b().a("Crashlytics", (new StringBuilder("Executing shutdown hook for ")).append(a).toString());
            b.shutdown();
            if (!b.awaitTermination(c, d))
            {
                cm.a().b().a("Crashlytics", (new StringBuilder()).append(a).append(" did not shut down in the allocated time. Requesting immediate shutdown.").toString());
                b.shutdownNow();
            }
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            cm.a().b().a("Crashlytics", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[] {
                a
            }));
        }
        b.shutdownNow();
    }
}
