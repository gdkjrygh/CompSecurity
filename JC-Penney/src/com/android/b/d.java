// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.b;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.b:
//            ad, b, q, c, 
//            n, y, v, e

public class d extends Thread
{

    private static final boolean a;
    private final BlockingQueue b;
    private final BlockingQueue c;
    private final b d;
    private final y e;
    private volatile boolean f;

    public d(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, b b1, y y1)
    {
        f = false;
        b = blockingqueue;
        c = blockingqueue1;
        d = b1;
        e = y1;
    }

    static BlockingQueue a(d d1)
    {
        return d1.c;
    }

    public void a()
    {
        f = true;
        interrupt();
    }

    public void run()
    {
        if (a)
        {
            ad.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        d.a();
_L1:
        Object obj;
label0:
        {
            do
            {
                try
                {
                    do
                    {
                        obj = (q)b.take();
                        ((q) (obj)).a("cache-queue-take");
                        if (!((q) (obj)).g())
                        {
                            break label0;
                        }
                        ((q) (obj)).b("cache-discard-canceled");
                    } while (true);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            } while (!f);
            return;
        }
        c c1 = d.a(((q) (obj)).e());
        if (c1 != null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        ((q) (obj)).a("cache-miss");
        c.put(obj);
          goto _L1
label1:
        {
            if (!c1.a())
            {
                break label1;
            }
            ((q) (obj)).a("cache-hit-expired");
            ((q) (obj)).a(c1);
            c.put(obj);
        }
          goto _L1
        v v1;
label2:
        {
            ((q) (obj)).a("cache-hit");
            v1 = ((q) (obj)).a(new n(c1.a, c1.g));
            ((q) (obj)).a("cache-hit-parsed");
            if (c1.b())
            {
                break label2;
            }
            e.a(((q) (obj)), v1);
        }
          goto _L1
        ((q) (obj)).a("cache-hit-refresh-needed");
        ((q) (obj)).a(c1);
        v1.d = true;
        e.a(((q) (obj)), v1, new e(this, ((q) (obj))));
          goto _L1
    }

    static 
    {
        a = ad.b;
    }
}
