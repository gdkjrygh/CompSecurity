// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.Q;
import rx.X;

// Referenced classes of package rx.internal.a:
//            D

final class E extends X
{

    final D a;

    E(D d, X x)
    {
        a = d;
        super(x);
    }

    public final void onCompleted()
    {
        a.b.onCompleted();
    }

    public final void onError(Throwable throwable)
    {
        a.b.onError(throwable);
    }

    public final void onNext(Object obj)
    {
label0:
        {
            if (!a.b.isUnsubscribed())
            {
                if (a.c.get() <= 0L)
                {
                    break label0;
                }
                a.d.a(a.e);
            }
            return;
        }
        a.f.compareAndSet(false, true);
    }

    public final void setProducer(Q q)
    {
        q.a(0x7fffffffffffffffL);
    }
}
