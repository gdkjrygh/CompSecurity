// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.os.SystemClock;
import android.support.v4.os.OperationCanceledException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

// Referenced classes of package android.support.v4.content:
//            ModernAsyncTask, a, p

final class b extends ModernAsyncTask
    implements Runnable
{

    boolean a;
    final a b;
    private final CountDownLatch g = new CountDownLatch(1);

    b(a a1)
    {
        b = a1;
        super();
    }

    private transient Object c()
    {
        Object obj;
        try
        {
            obj = b.d();
        }
        catch (OperationCanceledException operationcanceledexception)
        {
            if (!super.e.isCancelled())
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
        a a1 = b;
        if (a1.a == this) goto _L2; else goto _L1
_L1:
        a1.a(this, obj);
_L3:
        g.countDown();
        return;
_L2:
        if (!((p) (a1)).s)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        a1.a(obj);
          goto _L3
        obj;
        g.countDown();
        throw obj;
        a1.v = false;
        a1.d = SystemClock.uptimeMillis();
        a1.a = null;
        a1.b(obj);
          goto _L3
    }

    protected final void b(Object obj)
    {
        b.a(this, obj);
        g.countDown();
        return;
        obj;
        g.countDown();
        throw obj;
    }

    public final void run()
    {
        a = false;
        b.c();
    }
}
