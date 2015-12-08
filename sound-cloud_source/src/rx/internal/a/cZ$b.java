// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicInteger;
import rx.X;

// Referenced classes of package rx.internal.a:
//            cZ

private static final class c extends X
{

    private static final Object b = new Object();
    final AtomicInteger a = new AtomicInteger(0);
    private final X c;
    private Object d;

    final void a()
    {
        if (!isUnsubscribed()) goto _L2; else goto _L1
_L1:
        d = null;
_L4:
        return;
_L2:
        Object obj = d;
        d = null;
        if (obj == b)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            c.onNext(obj);
        }
        catch (Throwable throwable)
        {
            c.onError(throwable);
            return;
        }
        if (isUnsubscribed()) goto _L4; else goto _L3
_L3:
        c.onCompleted();
        return;
    }

    public final void onCompleted()
    {
        if (d != b) goto _L2; else goto _L1
_L1:
        c.onCompleted();
_L4:
        return;
_L2:
        int i;
        do
        {
            i = a.get();
            if (i != 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        } while (!a.compareAndSet(0, 1));
        return;
        if (i != 2) goto _L4; else goto _L3
_L3:
        if (a.compareAndSet(2, 3))
        {
            a();
            return;
        }
          goto _L2
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final void onError(Throwable throwable)
    {
        c.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        d = obj;
    }


    (X x)
    {
        d = b;
        c = x;
    }
}
