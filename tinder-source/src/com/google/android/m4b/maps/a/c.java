// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.a;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.m4b.maps.a:
//            s, b, k, h, 
//            n, m

public final class c extends Thread
{

    private static final boolean b;
    public volatile boolean a;
    private final BlockingQueue c;
    private final BlockingQueue d;
    private final b e;
    private final n f;

    public c(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, b b1, n n1)
    {
        a = false;
        c = blockingqueue;
        d = blockingqueue1;
        e = b1;
        f = n1;
    }

    static BlockingQueue a(c c1)
    {
        return c1.d;
    }

    public final void run()
    {
        if (b)
        {
            s.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        e.a();
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
                        obj = (k)c.take();
                        ((k) (obj)).a("cache-queue-take");
                        if (!((k) (obj)).h)
                        {
                            break label0;
                        }
                        ((k) (obj)).b("cache-discard-canceled");
                    } while (true);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            } while (!a);
            return;
        }
        b.a a1 = e.a(((k) (obj)).b);
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        ((k) (obj)).a("cache-miss");
        d.put(obj);
          goto _L1
        boolean flag;
        m m1;
        if (a1.e < System.currentTimeMillis())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        ((k) (obj)).a("cache-hit-expired");
        obj.k = a1;
        d.put(obj);
          goto _L1
        ((k) (obj)).a("cache-hit");
        m1 = ((k) (obj)).a(new h(a1.a, a1.g));
        ((k) (obj)).a("cache-hit-parsed");
        if (a1.f < System.currentTimeMillis())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        f.a(((k) (obj)), m1);
          goto _L1
        ((k) (obj)).a("cache-hit-refresh-needed");
        obj.k = a1;
        m1.d = true;
        f.a(((k) (obj)), m1, new Runnable(((k) (obj))) {

            private k a;
            private c b;

            public final void run()
            {
                try
                {
                    c.a(b).put(a);
                    return;
                }
                catch (InterruptedException interruptedexception)
                {
                    return;
                }
            }

            
            {
                b = c.this;
                a = k1;
                super();
            }
        });
          goto _L1
    }

    static 
    {
        b = s.a;
    }
}
