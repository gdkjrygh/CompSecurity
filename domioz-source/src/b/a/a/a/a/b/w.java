// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.b;

import b.a.a.a.f;
import b.a.a.a.q;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package b.a.a.a.a.b:
//            k

final class w extends k
{

    final String a;
    final ExecutorService b;
    final long c = 2L;
    final TimeUnit d;

    w(String s, ExecutorService executorservice, TimeUnit timeunit)
    {
        a = s;
        b = executorservice;
        d = timeunit;
        super();
    }

    public final void a()
    {
        try
        {
            f.c().a("Fabric", (new StringBuilder("Executing shutdown hook for ")).append(a).toString());
            b.shutdown();
            if (!b.awaitTermination(c, d))
            {
                f.c().a("Fabric", (new StringBuilder()).append(a).append(" did not shut down in the allocated time. Requesting immediate shutdown.").toString());
                b.shutdownNow();
            }
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            f.c().a("Fabric", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[] {
                a
            }));
        }
        b.shutdownNow();
    }
}
