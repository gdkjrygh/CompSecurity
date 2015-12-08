// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.internal:
//            kp, ia, iy, ea, 
//            gs, le, iw, z

public final class fb extends Thread
{

    private final BlockingQueue a;
    private final ea b;
    private final z c;
    private final iy d;
    private volatile boolean e;

    public fb(BlockingQueue blockingqueue, ea ea1, z z1, iy iy1)
    {
        e = false;
        a = blockingqueue;
        b = ea1;
        c = z1;
        d = iy1;
    }

    public final void a()
    {
        e = true;
        interrupt();
    }

    public final void run()
    {
        Process.setThreadPriority(10);
_L2:
        Object obj;
        long l;
        l = SystemClock.elapsedRealtime();
        kp kp1;
        kp kp2;
        try
        {
            obj = (ia)a.take();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (e)
            {
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        ((ia) (obj)).a("network-queue-take");
        if (((ia) (obj)).g())
        {
            ((ia) (obj)).b("network-discard-cancelled");
            continue; /* Loop/switch isn't completed */
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            TrafficStats.setThreadStatsTag(((ia) (obj)).c());
        }
        Object obj1 = b.a(((ia) (obj)));
        ((ia) (obj)).a("network-http-complete");
        if (((gs) (obj1)).d && ((ia) (obj)).m())
        {
            ((ia) (obj)).b("not-modified");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj1 = ((ia) (obj)).a(((gs) (obj1)));
            ((ia) (obj)).a("network-parse-complete");
            if (((ia) (obj)).i() && ((iw) (obj1)).b != null)
            {
                c.a(((ia) (obj)).e(), ((iw) (obj1)).b);
                ((ia) (obj)).a("network-cache-written");
            }
            ((ia) (obj)).l();
            d.a(((ia) (obj)), ((iw) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (kp kp1)
        {
            kp1.a(SystemClock.elapsedRealtime() - l);
            kp2 = ia.a(kp1);
            d.a(((ia) (obj)), kp2);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            le.a(((Throwable) (obj1)), "Unhandled exception %s", new Object[] {
                ((Exception) (obj1)).toString()
            });
            obj1 = new kp(((Throwable) (obj1)));
            ((kp) (obj1)).a(SystemClock.elapsedRealtime() - l);
            d.a(((ia) (obj)), ((kp) (obj1)));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
