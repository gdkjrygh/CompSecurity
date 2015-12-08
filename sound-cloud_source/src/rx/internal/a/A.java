// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicLong;
import rx.Q;
import rx.X;
import rx.a;

// Referenced classes of package rx.internal.a:
//            z

final class A extends X
{

    boolean a;
    final z b;

    A(z z1)
    {
        b = z1;
        super();
    }

    public final void onCompleted()
    {
        if (!a)
        {
            a = true;
            unsubscribe();
            b.b.onNext(rx.a.a());
        }
    }

    public final void onError(Throwable throwable)
    {
        if (!a)
        {
            a = true;
            unsubscribe();
            b.b.onNext(rx.a.a(throwable));
        }
    }

    public final void onNext(Object obj)
    {
        if (!a)
        {
            b.a.onNext(obj);
            long l;
            do
            {
                l = b.d.get();
            } while (l != 0x7fffffffffffffffL && !b.d.compareAndSet(l, l - 1L));
            b.c.a();
        }
    }

    public final void setProducer(Q q)
    {
        b.c.a(q);
    }
}
