// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class oti
    implements osv
{

    public volatile boolean a;
    private final osu b;
    private CountDownLatch c;

    public oti(osu osu1)
    {
        a = false;
        b = osu1;
    }

    public final void a()
    {
        a = false;
        if (c != null)
        {
            c.countDown();
        }
    }

    public final void a(long l)
    {
label0:
        {
            synchronized (b)
            {
                if (!c())
                {
                    break label0;
                }
            }
            return;
        }
        c = new CountDownLatch(1);
        osu1;
        JVM INSTR monitorexit ;
        if (l > 0L)
        {
            c.await(l, TimeUnit.MILLISECONDS);
            return;
        } else
        {
            c.await();
            return;
        }
        exception;
        osu1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        a = true;
    }

    public final boolean c()
    {
        return b.a(this);
    }

    public final void d()
    {
        b.b(this);
    }
}
