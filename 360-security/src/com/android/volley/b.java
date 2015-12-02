// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.volley:
//            n, a, Request, i, 
//            l, k

public class b extends Thread
{

    private static final boolean f;
    protected final BlockingQueue a;
    protected final BlockingQueue b;
    protected final a c;
    protected final l d;
    protected volatile boolean e;

    public b(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, a a1, l l1)
    {
        e = false;
        a = blockingqueue;
        b = blockingqueue1;
        c = a1;
        d = l1;
    }

    public void a()
    {
        e = true;
        interrupt();
    }

    public void run()
    {
        if (f)
        {
            n.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        c.a();
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
                        obj = (Request)a.take();
                        ((Request) (obj)).a("cache-queue-take");
                        if (!((Request) (obj)).h())
                        {
                            break label0;
                        }
                        ((Request) (obj)).b("cache-discard-canceled");
                    } while (true);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            } while (!e);
            return;
        }
        a.a a1 = c.a(((Request) (obj)).e());
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        ((Request) (obj)).a("cache-miss");
        b.put(obj);
          goto _L1
label1:
        {
            if (!a1.a())
            {
                break label1;
            }
            ((Request) (obj)).a("cache-hit-expired");
            ((Request) (obj)).a(a1);
            b.put(obj);
        }
          goto _L1
        k k1;
label2:
        {
            ((Request) (obj)).a("cache-hit");
            k1 = ((Request) (obj)).a(new i(a1.a, a1.f));
            ((Request) (obj)).a("cache-hit-parsed");
            if (a1.b())
            {
                break label2;
            }
            d.a(((Request) (obj)), k1);
        }
          goto _L1
        ((Request) (obj)).a("cache-hit-refresh-needed");
        ((Request) (obj)).a(a1);
        k1.d = true;
        d.a(((Request) (obj)), k1, new Runnable(((Request) (obj))) {

            final b a;
            private final Request b;

            public void run()
            {
                try
                {
                    a.b.put(b);
                    return;
                }
                catch (InterruptedException interruptedexception)
                {
                    return;
                }
            }

            
            {
                a = b.this;
                b = request;
                super();
            }
        });
          goto _L1
    }

    static 
    {
        f = n.b;
    }
}
