// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.Q;
import rx.X;
import rx.a;

// Referenced classes of package rx.internal.a:
//            B, w

final class C extends X
{

    final X a;
    final B b;

    C(B b1, X x, X x1)
    {
        b = b1;
        a = x1;
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
        obj = (a)obj;
        if (((a) (obj)).c() && w.b(b.a))
        {
            a.onCompleted();
            return;
        }
        if (((a) (obj)).b() && w.c(b.a))
        {
            a.onError(((a) (obj)).b);
            return;
        } else
        {
            a.onNext(obj);
            return;
        }
    }

    public final void setProducer(Q q)
    {
        q.a(0x7fffffffffffffffL);
    }
}
