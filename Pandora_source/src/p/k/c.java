// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.k;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package p.k:
//            t, b, l, i, 
//            o, n

public class c extends Thread
{

    private static final boolean a;
    private final BlockingQueue b;
    private final BlockingQueue c;
    private final b d;
    private final o e;
    private volatile boolean f;

    public c(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, b b1, o o1)
    {
        f = false;
        b = blockingqueue;
        c = blockingqueue1;
        d = b1;
        e = o1;
    }

    static BlockingQueue a(c c1)
    {
        return c1.c;
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
            t.a("start new dispatcher", new Object[0]);
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
                        obj = (l)b.take();
                        ((l) (obj)).a("cache-queue-take");
                        if (!((l) (obj)).h())
                        {
                            break label0;
                        }
                        ((l) (obj)).b("cache-discard-canceled");
                    } while (true);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            } while (!f);
            return;
        }
        b.a a1 = d.a(((l) (obj)).e());
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        ((l) (obj)).a("cache-miss");
        c.put(obj);
          goto _L1
label1:
        {
            if (!a1.a())
            {
                break label1;
            }
            ((l) (obj)).a("cache-hit-expired");
            ((l) (obj)).a(a1);
            c.put(obj);
        }
          goto _L1
        n n1;
label2:
        {
            ((l) (obj)).a("cache-hit");
            n1 = ((l) (obj)).a(new i(a1.a, a1.f));
            ((l) (obj)).a("cache-hit-parsed");
            if (a1.b())
            {
                break label2;
            }
            e.a(((l) (obj)), n1);
        }
          goto _L1
        ((l) (obj)).a("cache-hit-refresh-needed");
        ((l) (obj)).a(a1);
        n1.d = true;
        e.a(((l) (obj)), n1, new Runnable(((l) (obj))) {

            final l a;
            final c b;

            public void run()
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
                a = l1;
                super();
            }
        });
          goto _L1
    }

    static 
    {
        a = t.b;
    }
}
