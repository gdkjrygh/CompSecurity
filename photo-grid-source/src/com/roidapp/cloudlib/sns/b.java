// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import com.roidapp.baselib.c.ae;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            o, m

public final class b extends Thread
{

    private final BlockingQueue a;
    private volatile boolean b;

    public b(BlockingQueue blockingqueue)
    {
        super("SNS - NetworkDispatcher");
        a = blockingqueue;
    }

    public final void a()
    {
        b = true;
        interrupt();
    }

    public final void run()
    {
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
                        obj = (o)a.take();
                        if (!((o) (obj)).j() && !((o) (obj)).k())
                        {
                            break label0;
                        }
                        m.c((new StringBuilder("NetworkDispatcher --- request canceled :")).append(((o) (obj)).j()).append(" finished: ").append(((o) (obj)).k()).append(" --- ").append(((o) (obj)).o()).append(" --- ").append(((o) (obj)).p()).toString());
                        if (!((o) (obj)).k())
                        {
                            ((o) (obj)).q();
                        }
                    } while (true);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            } while (!b);
            m.a("NetworkDispatcher has quited");
            a.clear();
            ae.a(this);
            return;
        }
        ((o) (obj)).run();
        ((o) (obj)).q();
          goto _L1
    }
}
