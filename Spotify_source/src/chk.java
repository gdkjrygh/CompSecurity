// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.gms.internal.zzk;
import com.google.android.gms.internal.zzr;
import java.util.concurrent.BlockingQueue;

public final class chk extends Thread
{

    volatile boolean a;
    private final BlockingQueue b;
    private final cfx c;
    private final bzx d;
    private final cnw e;

    public chk(BlockingQueue blockingqueue, cfx cfx1, bzx bzx1, cnw cnw1)
    {
        a = false;
        b = blockingqueue;
        c = cfx1;
        d = bzx1;
        e = cnw1;
    }

    public final void run()
    {
        Process.setThreadPriority(10);
_L2:
        Object obj;
        Object obj1;
        long l;
        l = SystemClock.elapsedRealtime();
        try
        {
            obj = (zzk)b.take();
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
        ((zzk) (obj)).a("network-queue-take");
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            TrafficStats.setThreadStatsTag(((zzk) (obj)).b);
        }
        obj1 = c.a(((zzk) (obj)));
        ((zzk) (obj)).a("network-http-complete");
        if (((cjd) (obj1)).c && ((zzk) (obj)).g)
        {
            ((zzk) (obj)).b("not-modified");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj1 = ((zzk) (obj)).a(((cjd) (obj1)));
            ((zzk) (obj)).a("network-parse-complete");
            if (((zzk) (obj)).f && ((cnb) (obj1)).b != null)
            {
                d.a(((zzk) (obj)).a, ((cnb) (obj1)).b);
                ((zzk) (obj)).a("network-cache-written");
            }
            obj.g = true;
            e.a(((zzk) (obj)), ((cnb) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj1.zzC = SystemClock.elapsedRealtime() - l;
            obj1 = zzk.a(((zzr) (obj1)));
            e.a(((zzk) (obj)), ((zzr) (obj1)));
        }
        catch (Exception exception)
        {
            cop.a(exception, "Unhandled exception %s", new Object[] {
                exception.toString()
            });
            zzr zzr1 = new zzr(exception);
            zzr1.zzC = SystemClock.elapsedRealtime() - l;
            e.a(((zzk) (obj)), zzr1);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
