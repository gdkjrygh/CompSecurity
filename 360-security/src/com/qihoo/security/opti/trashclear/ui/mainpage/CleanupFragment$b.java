// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            CleanupFragment

private static class i extends Thread
{

    private Queue a;
    private long b;
    private long c;
    private boolean d;
    private boolean e;
    private final a f;
    private long g;
    private int h;
    private long i;
    private int j;

    public void a()
    {
        start();
    }

    public void a(long l)
    {
        c = l;
        if (c < b)
        {
            c = b;
        }
        LinkedBlockingQueue linkedblockingqueue = new LinkedBlockingQueue();
        if (c - b >= i)
        {
            for (int k = 1; k <= h; k++)
            {
                linkedblockingqueue.add(Long.valueOf(b + ((c - b) * (long)k) / (long)h));
            }

        } else
        {
            linkedblockingqueue.add(Long.valueOf(c));
        }
        a = linkedblockingqueue;
    }

    public void b()
    {
        d = true;
    }

    public void c()
    {
        e = true;
    }

    public void d()
    {
        if (j == 2)
        {
            g = 50L;
            h = 20;
            return;
        }
        if (j == 1)
        {
            g = 200L;
            h = 5;
            i = 0L;
            return;
        } else
        {
            g = 200L;
            h = 5;
            i = 0L;
            return;
        }
    }

    public void run()
    {
        Long long1 = null;
_L2:
        if (d)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        if (a != null)
        {
            long1 = (Long)a.poll();
        }
        if (long1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        b = long1.longValue();
        if (f != null)
        {
            f.a(long1.longValue(), g);
        }
_L4:
        try
        {
            Thread.sleep(g);
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (!e) goto _L4; else goto _L3
_L3:
        if (f != null)
        {
            f.a();
        }
    }

    public ( , int k)
    {
        f = ;
        j = k;
        if (k == 2)
        {
            g = 50L;
            h = 60;
            return;
        }
        if (k == 1)
        {
            g = 200L;
            h = 15;
            i = 0L;
            return;
        } else
        {
            g = 200L;
            h = 15;
            i = 0L;
            return;
        }
    }
}
