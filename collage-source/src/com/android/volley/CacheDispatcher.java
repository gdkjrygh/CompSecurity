// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.volley:
//            s, b, k, g, 
//            n, m

public class CacheDispatcher extends Thread
{

    private static final boolean a;
    private final BlockingQueue b;
    private final BlockingQueue c;
    private final b d;
    private final n e;
    private volatile boolean f;

    public CacheDispatcher(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, b b1, n n1)
    {
        f = false;
        b = blockingqueue;
        c = blockingqueue1;
        d = b1;
        e = n1;
    }

    static BlockingQueue a(CacheDispatcher cachedispatcher)
    {
        return cachedispatcher.c;
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
            s.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        d.a();
_L1:
        Object obj = (k)b.take();
        ((k) (obj)).a("cache-queue-take");
        if (!((k) (obj)).j())
        {
            break MISSING_BLOCK_LABEL_94;
        }
        ((k) (obj)).b("cache-discard-canceled");
          goto _L1
        obj;
        if (!f) goto _L1; else goto _L2
_L2:
        return;
        b.a a1 = d.a(((k) (obj)).g());
label0:
        {
            if (a1 != null)
            {
                break label0;
            }
            try
            {
                ((k) (obj)).a("cache-miss");
                c.put(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                s.a(((Throwable) (obj)), "Unhandled exception %s", new Object[] {
                    ((Exception) (obj)).toString()
                });
            }
        }
          goto _L1
label1:
        {
            if (!a1.a())
            {
                break label1;
            }
            ((k) (obj)).a("cache-hit-expired");
            ((k) (obj)).a(a1);
            c.put(obj);
        }
          goto _L1
        m m1;
label2:
        {
            ((k) (obj)).a("cache-hit");
            m1 = ((k) (obj)).a(new g(a1.a, a1.g));
            ((k) (obj)).a("cache-hit-parsed");
            if (a1.b())
            {
                break label2;
            }
            e.a(((k) (obj)), m1);
        }
          goto _L1
        ((k) (obj)).a("cache-hit-refresh-needed");
        ((k) (obj)).a(a1);
        m1.d = true;
        e.a(((k) (obj)), m1, new Runnable(((k) (obj))) {

            final k a;
            final CacheDispatcher b;

            public void run()
            {
                try
                {
                    CacheDispatcher.a(b).put(a);
                    return;
                }
                catch (InterruptedException interruptedexception)
                {
                    return;
                }
            }

            
            {
                b = CacheDispatcher.this;
                a = k1;
                super();
            }
        });
          goto _L1
    }

    static 
    {
        a = s.b;
    }
}
