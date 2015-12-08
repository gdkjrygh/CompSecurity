// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

final class dz extends eq
    implements Runnable
{

    boolean a;
    private final CountDownLatch f = new CountDownLatch(1);
    private dy g;

    dz(dy dy1)
    {
        g = dy1;
        super();
    }

    private transient Object b()
    {
        Object obj;
        try
        {
            obj = g.d();
        }
        catch (in in1)
        {
            if (!super.d.isCancelled())
            {
                throw in1;
            } else
            {
                return null;
            }
        }
        return obj;
    }

    protected final Object a(Object aobj[])
    {
        return b();
    }

    protected final void a(Object obj)
    {
        dy dy1 = g;
        if (dy1.a == this) goto _L2; else goto _L1
_L1:
        dy1.a(this, obj);
_L4:
        f.countDown();
        return;
_L2:
        if (((ei) (dy1)).h) goto _L4; else goto _L3
_L3:
        dy1.k = false;
        dy1.b = SystemClock.uptimeMillis();
        dy1.a = null;
        dy1.a(obj);
          goto _L4
        obj;
        f.countDown();
        throw obj;
    }

    protected final void b(Object obj)
    {
        g.a(this, obj);
        f.countDown();
        return;
        obj;
        f.countDown();
        throw obj;
    }

    public final void run()
    {
        a = false;
        g.c();
    }
}
