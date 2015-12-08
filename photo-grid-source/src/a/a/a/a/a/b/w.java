// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.b;

import a.a.a.a.f;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package a.a.a.a.a.b:
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
            f.d();
            (new StringBuilder("Executing shutdown hook for ")).append(a);
            b.shutdown();
            if (!b.awaitTermination(c, d))
            {
                f.d();
                (new StringBuilder()).append(a).append(" did not shut down in the allocated time. Requesting immediate shutdown.");
                b.shutdownNow();
            }
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            f.d();
        }
        String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[] {
            a
        });
        b.shutdownNow();
    }
}
