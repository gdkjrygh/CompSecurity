// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.internal:
//            xv, bd, tj, be, 
//            pl, wp, vo, db

public final class da extends Thread
{

    private static final boolean a;
    private final BlockingQueue b;
    private final BlockingQueue c;
    private final bd d;
    private final wp e;
    private volatile boolean f;

    public da(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, bd bd1, wp wp1)
    {
        f = false;
        b = blockingqueue;
        c = blockingqueue1;
        d = bd1;
        e = wp1;
    }

    static BlockingQueue a(da da1)
    {
        return da1.c;
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
            xv.a("start new dispatcher", new Object[0]);
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
                        obj = (tj)b.take();
                        ((tj) (obj)).a("cache-queue-take");
                        if (!((tj) (obj)).g())
                        {
                            break label0;
                        }
                        ((tj) (obj)).b("cache-discard-canceled");
                    } while (true);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            } while (!f);
            return;
        }
        be be1 = d.a(((tj) (obj)).e());
        if (be1 != null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        ((tj) (obj)).a("cache-miss");
        c.put(obj);
          goto _L1
        boolean flag;
        vo vo1;
        if (be1.e < System.currentTimeMillis())
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
        ((tj) (obj)).a("cache-hit-expired");
        ((tj) (obj)).a(be1);
        c.put(obj);
          goto _L1
        ((tj) (obj)).a("cache-hit");
        vo1 = ((tj) (obj)).a(new pl(be1.a, be1.g));
        ((tj) (obj)).a("cache-hit-parsed");
        if (be1.f < System.currentTimeMillis())
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
        e.a(((tj) (obj)), vo1);
          goto _L1
        ((tj) (obj)).a("cache-hit-refresh-needed");
        ((tj) (obj)).a(be1);
        vo1.d = true;
        e.a(((tj) (obj)), vo1, new db(this, ((tj) (obj))));
          goto _L1
    }

    static 
    {
        a = xv.b;
    }
}
