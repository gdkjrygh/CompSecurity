// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class ktb extends Thread
{

    private static final boolean b;
    volatile boolean a;
    private final BlockingQueue c;
    private final BlockingQueue d;
    private final ksv e;
    private final lan f;

    public ktb(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, ksv ksv1, lan lan1)
    {
        a = false;
        c = blockingqueue;
        d = blockingqueue1;
        e = ksv1;
        f = lan1;
    }

    static BlockingQueue a(ktb ktb1)
    {
        return ktb1.d;
    }

    public final void run()
    {
        if (b)
        {
            lew.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        e.a();
_L1:
        Object obj;
        ksw ksw1;
        obj = (kyw)c.take();
        ((kyw) (obj)).a("cache-queue-take");
        ksw1 = e.a(((kyw) (obj)).b);
        if (ksw1 != null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        ((kyw) (obj)).a("cache-miss");
        d.put(obj);
          goto _L1
        obj;
        if (!a) goto _L1; else goto _L2
_L2:
        return;
        boolean flag;
        laa laa1;
        if (ksw1.e < System.currentTimeMillis())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        ((kyw) (obj)).a("cache-hit-expired");
        obj.j = ksw1;
        d.put(obj);
          goto _L1
        ((kyw) (obj)).a("cache-hit");
        laa1 = ((kyw) (obj)).a(new kwt(ksw1.a, ksw1.g));
        ((kyw) (obj)).a("cache-hit-parsed");
        if (ksw1.f < System.currentTimeMillis())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        f.a(((kyw) (obj)), laa1);
          goto _L1
        ((kyw) (obj)).a("cache-hit-refresh-needed");
        obj.j = ksw1;
        laa1.d = true;
        f.a(((kyw) (obj)), laa1, new ktc(this, ((kyw) (obj))));
          goto _L1
    }

    static 
    {
        b = lew.a;
    }
}
