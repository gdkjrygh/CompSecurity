// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.internal:
//            zzr, zzk, en, bj, 
//            ci, ez, dv, g

public final class bz extends Thread
{

    volatile boolean a;
    private final BlockingQueue b;
    private final bj c;
    private final g d;
    private final en e;

    public bz(BlockingQueue blockingqueue, bj bj1, g g1, en en1)
    {
        a = false;
        b = blockingqueue;
        c = bj1;
        d = g1;
        e = en1;
    }

    public final void run()
    {
        Process.setThreadPriority(10);
_L2:
        Object obj;
        long l;
        l = SystemClock.elapsedRealtime();
        zzr zzr1;
        zzr zzr2;
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
        if (((zzk) (obj)).j)
        {
            ((zzk) (obj)).b("network-discard-cancelled");
            continue; /* Loop/switch isn't completed */
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            TrafficStats.setThreadStatsTag(((zzk) (obj)).e);
        }
        Object obj1 = c.a(((zzk) (obj)));
        ((zzk) (obj)).a("network-http-complete");
        if (((ci) (obj1)).d && ((zzk) (obj)).k)
        {
            ((zzk) (obj)).b("not-modified");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj1 = ((zzk) (obj)).a(((ci) (obj1)));
            ((zzk) (obj)).a("network-parse-complete");
            if (((zzk) (obj)).i && ((dv) (obj1)).b != null)
            {
                d.a(((zzk) (obj)).d, ((dv) (obj1)).b);
                ((zzk) (obj)).a("network-cache-written");
            }
            obj.k = true;
            e.a(((zzk) (obj)), ((dv) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (zzr zzr1)
        {
            zzr1.b = SystemClock.elapsedRealtime() - l;
            zzr2 = zzk.a(zzr1);
            e.a(((zzk) (obj)), zzr2);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            ez.a(((Throwable) (obj1)), "Unhandled exception %s", new Object[] {
                ((Exception) (obj1)).toString()
            });
            obj1 = new zzr(((Throwable) (obj1)));
            obj1.b = SystemClock.elapsedRealtime() - l;
            e.a(((zzk) (obj)), ((zzr) (obj1)));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
