// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.volley:
//            x, b, n, k, 
//            s, r, d

public final class c extends Thread
{

    private static final boolean a;
    private final BlockingQueue b;
    private final BlockingQueue c;
    private final b d;
    private final s e;
    private volatile boolean f;

    public c(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, b b1, s s1)
    {
        f = false;
        b = blockingqueue;
        c = blockingqueue1;
        d = b1;
        e = s1;
    }

    static BlockingQueue a(c c1)
    {
        return c1.c;
    }

    public final void a()
    {
        f = true;
        interrupt();
    }

    public final void run()
    {
        if (a)
        {
            x.a("start new dispatcher", new Object[0]);
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
                        obj = (n)b.take();
                        ((n) (obj)).a("cache-queue-take");
                        if (!((n) (obj)).h())
                        {
                            break label0;
                        }
                        ((n) (obj)).b("cache-discard-canceled");
                    } while (true);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            } while (!f);
            return;
        }
        b.a a1 = d.a(((n) (obj)).e());
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        ((n) (obj)).a("cache-miss");
        c.put(obj);
          goto _L1
label1:
        {
            if (!a1.a())
            {
                break label1;
            }
            ((n) (obj)).a("cache-hit-expired");
            ((n) (obj)).a(a1);
            c.put(obj);
        }
          goto _L1
        r r1;
label2:
        {
            ((n) (obj)).a("cache-hit");
            r1 = ((n) (obj)).a(new k(a1.a, a1.f));
            ((n) (obj)).a("cache-hit-parsed");
            if (a1.b())
            {
                break label2;
            }
            e.a(((n) (obj)), r1);
        }
          goto _L1
        ((n) (obj)).a("cache-hit-refresh-needed");
        ((n) (obj)).a(a1);
        r1.d = true;
        e.a(((n) (obj)), r1, new d(this, ((n) (obj))));
          goto _L1
    }

    static 
    {
        a = x.b;
    }
}
