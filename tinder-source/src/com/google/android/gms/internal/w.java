// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.internal:
//            ez, g, zzk, ci, 
//            en, dv

public final class w extends Thread
{

    private static final boolean b;
    volatile boolean a;
    private final BlockingQueue c;
    private final BlockingQueue d;
    private final g e;
    private final en f;

    public w(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, g g1, en en1)
    {
        a = false;
        c = blockingqueue;
        d = blockingqueue1;
        e = g1;
        f = en1;
    }

    static BlockingQueue a(w w1)
    {
        return w1.d;
    }

    public final void run()
    {
        if (b)
        {
            ez.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        e.a();
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
                        obj = (zzk)c.take();
                        ((zzk) (obj)).a("cache-queue-take");
                        if (!((zzk) (obj)).j)
                        {
                            break label0;
                        }
                        ((zzk) (obj)).b("cache-discard-canceled");
                    } while (true);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            } while (!a);
            return;
        }
        g.a a1 = e.a(((zzk) (obj)).d);
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        ((zzk) (obj)).a("cache-miss");
        d.put(obj);
          goto _L1
        boolean flag;
        dv dv1;
        if (a1.e < System.currentTimeMillis())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        ((zzk) (obj)).a("cache-hit-expired");
        obj.m = a1;
        d.put(obj);
          goto _L1
        ((zzk) (obj)).a("cache-hit");
        dv1 = ((zzk) (obj)).a(new ci(a1.a, a1.g));
        ((zzk) (obj)).a("cache-hit-parsed");
        if (a1.f < System.currentTimeMillis())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        f.a(((zzk) (obj)), dv1);
          goto _L1
        ((zzk) (obj)).a("cache-hit-refresh-needed");
        obj.m = a1;
        dv1.d = true;
        f.a(((zzk) (obj)), dv1, new Runnable(((zzk) (obj))) {

            final zzk a;
            final w b;

            public final void run()
            {
                try
                {
                    w.a(b).put(a);
                    return;
                }
                catch (InterruptedException interruptedexception)
                {
                    return;
                }
            }

            
            {
                b = w.this;
                a = zzk1;
                super();
            }
        });
          goto _L1
    }

    static 
    {
        b = ez.b;
    }
}
