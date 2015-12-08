// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.Q;
import rx.X;

// Referenced classes of package rx.internal.a:
//            cw

final class cx extends X
{

    int a;
    final X b;
    final cw c;

    cx(cw cw1, X x, X x1)
    {
        c = cw1;
        b = x1;
        super(x);
        a = 0;
    }

    public final void onCompleted()
    {
        b.onCompleted();
    }

    public final void onError(Throwable throwable)
    {
        b.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        if (a >= c.a)
        {
            b.onNext(obj);
            return;
        } else
        {
            a = a + 1;
            return;
        }
    }

    public final void setProducer(Q q)
    {
        b.setProducer(q);
        q.a(c.a);
    }
}
