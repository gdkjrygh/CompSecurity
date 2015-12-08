// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import com.roidapp.baselib.c.ae;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            p, o, m, x

public final class a extends Thread
{

    private final p a;
    private final BlockingQueue b;
    private final BlockingQueue c;
    private volatile boolean d;

    public a(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, p p1)
    {
        super("SNS - CacheDispatcher");
        b = blockingqueue;
        c = blockingqueue1;
        a = p1;
    }

    public final void a()
    {
        d = true;
        interrupt();
    }

    public final void run()
    {
        a.a();
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
                        obj = (o)b.take();
                        if (!((o) (obj)).j() && !((o) (obj)).k())
                        {
                            break label0;
                        }
                        m.c((new StringBuilder("cacheDispatcher --- request canceled :")).append(((o) (obj)).j()).append(" finished: ").append(((o) (obj)).k()).append(" --- ").append(((o) (obj)).o()).append("---").append(((o) (obj)).p()).toString());
                        if (!((o) (obj)).k())
                        {
                            ((o) (obj)).q();
                        }
                    } while (true);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            } while (!d);
            m.a("CacheDispatcher has quited");
            a.c();
            b.clear();
            ae.a(this);
            return;
        }
        Object obj1 = a.a(((o) (obj)).p());
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        x x1 = ((o) (obj)).i();
        if (x1 == null)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        obj1 = ((o) (obj)).a(((String) (obj1)), false);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        try
        {
            m.b((new StringBuilder("hit cache --- ")).append(((o) (obj)).o()).append(" --- ").append(((o) (obj)).p()).toString());
            x1.b(obj1);
        }
        catch (Exception exception) { }
        if (((o) (obj)).j())
        {
            break MISSING_BLOCK_LABEL_235;
        }
        c.put(obj);
          goto _L1
        ((o) (obj)).q();
          goto _L1
    }
}
