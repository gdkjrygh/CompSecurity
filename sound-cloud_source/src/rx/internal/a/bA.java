// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicLong;
import rx.X;
import rx.b.b;

// Referenced classes of package rx.internal.a:
//            by

final class bA extends X
{

    final X a;
    final AtomicLong b;
    final by c;

    bA(by by1, X x, X x1, AtomicLong atomiclong)
    {
        c = by1;
        a = x1;
        b = atomiclong;
        super(x);
    }

    public final void onCompleted()
    {
        a.onCompleted();
    }

    public final void onError(Throwable throwable)
    {
        a.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        if (b.get() > 0L)
        {
            a.onNext(obj);
            b.decrementAndGet();
        } else
        if (c.a != null)
        {
            c.a.call(obj);
            return;
        }
    }

    public final void onStart()
    {
        request(0x7fffffffffffffffL);
    }
}
