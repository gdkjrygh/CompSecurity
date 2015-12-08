// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.internal:
//            le, z, ia, gs, 
//            iy, iw

public final class ba extends Thread
{

    private static final boolean a;
    private final BlockingQueue b;
    private final BlockingQueue c;
    private final z d;
    private final iy e;
    private volatile boolean f;

    public ba(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, z z1, iy iy1)
    {
        f = false;
        b = blockingqueue;
        c = blockingqueue1;
        d = z1;
        e = iy1;
    }

    static BlockingQueue a(ba ba1)
    {
        return ba1.c;
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
            le.a("start new dispatcher", new Object[0]);
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
                        obj = (ia)b.take();
                        ((ia) (obj)).a("cache-queue-take");
                        if (!((ia) (obj)).g())
                        {
                            break label0;
                        }
                        ((ia) (obj)).b("cache-discard-canceled");
                    } while (true);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            } while (!f);
            return;
        }
        z.a a1 = d.a(((ia) (obj)).e());
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        ((ia) (obj)).a("cache-miss");
        c.put(obj);
          goto _L1
        boolean flag;
        iw iw1;
        if (a1.e < System.currentTimeMillis())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        ((ia) (obj)).a("cache-hit-expired");
        ((ia) (obj)).a(a1);
        c.put(obj);
          goto _L1
        ((ia) (obj)).a("cache-hit");
        iw1 = ((ia) (obj)).a(new gs(a1.a, a1.g));
        ((ia) (obj)).a("cache-hit-parsed");
        if (a1.f < System.currentTimeMillis())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        e.a(((ia) (obj)), iw1);
          goto _L1
        ((ia) (obj)).a("cache-hit-refresh-needed");
        ((ia) (obj)).a(a1);
        iw1.d = true;
        e.a(((ia) (obj)), iw1, new Runnable(((ia) (obj))) {

            final ia a;
            final ba b;

            public final void run()
            {
                try
                {
                    ba.a(b).put(a);
                    return;
                }
                catch (InterruptedException interruptedexception)
                {
                    return;
                }
            }

            
            {
                b = ba.this;
                a = ia1;
                super();
            }
        });
          goto _L1
    }

    static 
    {
        a = le.b;
    }
}
