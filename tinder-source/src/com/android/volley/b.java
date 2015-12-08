// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.volley:
//            l, a, Request, NetworkResponse, 
//            j, i

public final class b extends Thread
{

    private static final boolean b;
    volatile boolean a;
    private final BlockingQueue c;
    private final BlockingQueue d;
    private final a e;
    private final j f;

    public b(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, a a1, j j1)
    {
        a = false;
        c = blockingqueue;
        d = blockingqueue1;
        e = a1;
        f = j1;
    }

    static BlockingQueue a(b b1)
    {
        return b1.d;
    }

    public final void run()
    {
        if (b)
        {
            l.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        e.a();
_L1:
        Object obj = (Request)c.take();
        ((Request) (obj)).a("cache-queue-take");
        if (!((Request) (obj)).h)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        ((Request) (obj)).b("cache-discard-canceled");
          goto _L1
        obj;
        if (!a) goto _L1; else goto _L2
_L2:
        return;
        a.a a1 = e.a(((Request) (obj)).c());
label0:
        {
            if (a1 != null)
            {
                break label0;
            }
            try
            {
                ((Request) (obj)).a("cache-miss");
                d.put(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                l.a(((Throwable) (obj)), "Unhandled exception %s", new Object[] {
                    ((Exception) (obj)).toString()
                });
            }
        }
          goto _L1
        boolean flag;
        i k;
        if (a1.e < System.currentTimeMillis())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        ((Request) (obj)).a("cache-hit-expired");
        obj.k = a1;
        d.put(obj);
          goto _L1
        ((Request) (obj)).a("cache-hit");
        k = ((Request) (obj)).a(new NetworkResponse(a1.a, a1.g));
        ((Request) (obj)).a("cache-hit-parsed");
        if (a1.f < System.currentTimeMillis())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        f.a(((Request) (obj)), k);
          goto _L1
        ((Request) (obj)).a("cache-hit-refresh-needed");
        obj.k = a1;
        k.d = true;
        f.a(((Request) (obj)), k, new Runnable(((Request) (obj))) {

            final Request a;
            final b b;

            public final void run()
            {
                try
                {
                    b.a(b).put(a);
                    return;
                }
                catch (InterruptedException interruptedexception)
                {
                    return;
                }
            }

            
            {
                b = b.this;
                a = request;
                super();
            }
        });
          goto _L1
    }

    static 
    {
        b = l.b;
    }
}
