// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            BackgroundPriorityRunnable, ExecutorUtils

final class tyRunnable extends BackgroundPriorityRunnable
{

    final String a;
    final ExecutorService b;
    final long c;
    final TimeUnit d;

    public void a()
    {
        try
        {
            Fabric.g().a("Fabric", (new StringBuilder()).append("Executing shutdown hook for ").append(a).toString());
            b.shutdown();
            if (!b.awaitTermination(c, d))
            {
                Fabric.g().a("Fabric", (new StringBuilder()).append(a).append(" did not shut down in the").append(" allocated time. Requesting immediate shutdown.").toString());
                b.shutdownNow();
            }
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Fabric.g().a("Fabric", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[] {
                a
            }));
        }
        b.shutdownNow();
    }

    tyRunnable(String s, ExecutorService executorservice, long l, TimeUnit timeunit)
    {
        a = s;
        b = executorservice;
        c = l;
        d = timeunit;
        super();
    }
}
