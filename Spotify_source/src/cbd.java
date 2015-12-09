// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;
import com.google.android.gms.internal.zzk;
import java.util.concurrent.BlockingQueue;

public final class cbd extends Thread
{

    private static final boolean b;
    volatile boolean a;
    private final BlockingQueue c;
    private final BlockingQueue d;
    private final bzx e;
    private final cnw f;

    public cbd(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, bzx bzx1, cnw cnw1)
    {
        a = false;
        c = blockingqueue;
        d = blockingqueue1;
        e = bzx1;
        f = cnw1;
    }

    static BlockingQueue a(cbd cbd1)
    {
        return cbd1.d;
    }

    public final void run()
    {
        if (b)
        {
            cop.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        e.a();
_L1:
        Object obj;
        bzy bzy1;
        obj = (zzk)c.take();
        ((zzk) (obj)).a("cache-queue-take");
        bzy1 = e.a(((zzk) (obj)).a);
        if (bzy1 != null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        ((zzk) (obj)).a("cache-miss");
        d.put(obj);
          goto _L1
        obj;
        if (!a) goto _L1; else goto _L2
_L2:
        return;
        boolean flag;
        cnb cnb1;
        if (bzy1.e < System.currentTimeMillis())
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
        ((zzk) (obj)).a("cache-hit-expired");
        obj.i = bzy1;
        d.put(obj);
          goto _L1
        ((zzk) (obj)).a("cache-hit");
        cnb1 = ((zzk) (obj)).a(new cjd(bzy1.a, bzy1.g));
        ((zzk) (obj)).a("cache-hit-parsed");
        if (bzy1.f < System.currentTimeMillis())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        f.a(((zzk) (obj)), cnb1);
          goto _L1
        ((zzk) (obj)).a("cache-hit-refresh-needed");
        obj.i = bzy1;
        cnb1.d = true;
        f.a(((zzk) (obj)), cnb1, new Runnable(((zzk) (obj))) {

            private zzk a;
            private cbd b;

            public final void run()
            {
                try
                {
                    cbd.a(b).put(a);
                    return;
                }
                catch (InterruptedException interruptedexception)
                {
                    return;
                }
            }

            
            {
                b = cbd.this;
                a = zzk1;
                super();
            }
        });
          goto _L1
    }

    static 
    {
        b = cop.a;
    }
}
