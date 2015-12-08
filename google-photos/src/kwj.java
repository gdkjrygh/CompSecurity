// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class kwj extends Thread
{

    volatile boolean a;
    private final BlockingQueue b;
    private final kvh c;
    private final ksv d;
    private final lan e;

    public kwj(BlockingQueue blockingqueue, kvh kvh1, ksv ksv1, lan lan1)
    {
        a = false;
        b = blockingqueue;
        c = kvh1;
        d = ksv1;
        e = lan1;
    }

    public final void run()
    {
        Process.setThreadPriority(10);
_L2:
        Object obj;
        Object obj1;
        SystemClock.elapsedRealtime();
        try
        {
            obj = (kyw)b.take();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (a)
            {
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        ((kyw) (obj)).a("network-queue-take");
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            TrafficStats.setThreadStatsTag(((kyw) (obj)).c);
        }
        obj1 = c.a(((kyw) (obj)));
        ((kyw) (obj)).a("network-http-complete");
        if (((kwt) (obj1)).c && ((kyw) (obj)).h)
        {
            ((kyw) (obj)).b("not-modified");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj1 = ((kyw) (obj)).a(((kwt) (obj1)));
            ((kyw) (obj)).a("network-parse-complete");
            if (((kyw) (obj)).g && ((laa) (obj1)).b != null)
            {
                d.a(((kyw) (obj)).b, ((laa) (obj1)).b);
                ((kyw) (obj)).a("network-cache-written");
            }
            obj.h = true;
            e.a(((kyw) (obj)), ((laa) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            SystemClock.elapsedRealtime();
            obj1 = kyw.a(((lev) (obj1)));
            e.a(((kyw) (obj)), ((lev) (obj1)));
        }
        catch (Exception exception)
        {
            lew.a(exception, "Unhandled exception %s", new Object[] {
                exception.toString()
            });
            lev lev1 = new lev(exception);
            SystemClock.elapsedRealtime();
            e.a(((kyw) (obj)), lev1);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
