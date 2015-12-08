// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            h, l

static final class nit> extends h
{

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

    (String s, ExecutorService executorservice, TimeUnit timeunit)
    {
        a = s;
        b = executorservice;
        d = timeunit;
        super();
    }
}
