// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.k;

import android.net.TrafficStats;
import android.os.Process;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package p.k:
//            l, o, s, f, 
//            i, t, n, b

public class g extends Thread
{

    private final BlockingQueue a;
    private final f b;
    private final b c;
    private final o d;
    private volatile boolean e;

    public g(BlockingQueue blockingqueue, f f1, b b1, o o1)
    {
        e = false;
        a = blockingqueue;
        b = f1;
        c = b1;
        d = o1;
    }

    private void a(l l1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            TrafficStats.setThreadStatsTag(l1.b());
        }
    }

    private void a(l l1, s s1)
    {
        s1 = l1.a(s1);
        d.a(l1, s1);
    }

    public void a()
    {
        e = true;
        interrupt();
    }

    public void run()
    {
        Process.setThreadPriority(10);
_L2:
        Object obj;
        s s1;
        try
        {
            obj = (l)a.take();
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
        ((l) (obj)).a("network-queue-take");
        if (((l) (obj)).h())
        {
            ((l) (obj)).b("network-discard-cancelled");
            continue; /* Loop/switch isn't completed */
        }
        a(((l) (obj)));
        Object obj1 = b.a(((l) (obj)));
        ((l) (obj)).a("network-http-complete");
        if (((i) (obj1)).d && ((l) (obj)).w())
        {
            ((l) (obj)).b("not-modified");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj1 = ((l) (obj)).a(((i) (obj1)));
            ((l) (obj)).a("network-parse-complete");
            if (((l) (obj)).r() && ((n) (obj1)).b != null)
            {
                c.a(((l) (obj)).e(), ((n) (obj1)).b);
                ((l) (obj)).a("network-cache-written");
            }
            ((l) (obj)).v();
            d.a(((l) (obj)), ((n) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (s s1)
        {
            a(((l) (obj)), s1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            t.a(((Throwable) (obj1)), "Unhandled exception %s", new Object[] {
                ((Exception) (obj1)).toString()
            });
            d.a(((l) (obj)), new s(((Throwable) (obj1))));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
