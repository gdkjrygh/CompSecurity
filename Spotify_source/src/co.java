// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import android.support.v4.content.ModernAsyncTask;
import android.support.v4.os.OperationCanceledException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

final class co extends ModernAsyncTask
    implements Runnable
{

    boolean a;
    private final CountDownLatch f = new CountDownLatch(1);
    private cn g;

    co(cn cn1)
    {
        g = cn1;
        super();
    }

    private transient Object c()
    {
        Object obj;
        try
        {
            obj = g.d();
        }
        catch (OperationCanceledException operationcanceledexception)
        {
            if (!super.d.isCancelled())
            {
                throw operationcanceledexception;
            } else
            {
                return null;
            }
        }
        return obj;
    }

    protected final Object a()
    {
        return c();
    }

    protected final void a(Object obj)
    {
        cn cn1 = g;
        if (cn1.a == this) goto _L2; else goto _L1
_L1:
        cn1.a(this, obj);
_L3:
        f.countDown();
        return;
_L2:
        if (!((da) (cn1)).g)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        cn1.a(obj);
          goto _L3
        obj;
        f.countDown();
        throw obj;
        cn1.j = false;
        cn1.c = SystemClock.uptimeMillis();
        cn1.a = null;
        cn1.b(obj);
          goto _L3
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
