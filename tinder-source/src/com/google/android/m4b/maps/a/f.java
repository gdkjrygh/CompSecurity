// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.a;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.m4b.maps.a:
//            r, k, n, e, 
//            h, s, m, b

public final class f extends Thread
{

    public volatile boolean a;
    private final BlockingQueue b;
    private final e c;
    private final b d;
    private final n e;

    public f(BlockingQueue blockingqueue, e e1, b b1, n n1)
    {
        a = false;
        b = blockingqueue;
        c = e1;
        d = b1;
        e = n1;
    }

    public final void run()
    {
        Process.setThreadPriority(10);
_L2:
        Object obj;
        long l;
        l = SystemClock.elapsedRealtime();
        r r1;
        r r2;
        try
        {
            obj = (k)b.take();
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
        ((k) (obj)).a("network-queue-take");
        if (((k) (obj)).h)
        {
            ((k) (obj)).b("network-discard-cancelled");
            continue; /* Loop/switch isn't completed */
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            TrafficStats.setThreadStatsTag(((k) (obj)).c);
        }
        Object obj1 = c.a(((k) (obj)));
        ((k) (obj)).a("network-http-complete");
        if (((h) (obj1)).d && ((k) (obj)).i)
        {
            ((k) (obj)).b("not-modified");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj1 = ((k) (obj)).a(((h) (obj1)));
            ((k) (obj)).a("network-parse-complete");
            if (((k) (obj)).g && ((m) (obj1)).b != null)
            {
                d.a(((k) (obj)).b, ((m) (obj1)).b);
                ((k) (obj)).a("network-cache-written");
            }
            obj.i = true;
            e.a(((k) (obj)), ((m) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (r r1)
        {
            r1.b = SystemClock.elapsedRealtime() - l;
            r2 = k.a(r1);
            e.a(((k) (obj)), r2);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            s.a(((Throwable) (obj1)), "Unhandled exception %s", new Object[] {
                ((Exception) (obj1)).toString()
            });
            obj1 = new r(((Throwable) (obj1)));
            obj1.b = SystemClock.elapsedRealtime() - l;
            e.a(((k) (obj)), ((r) (obj1)));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
