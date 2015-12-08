// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.Q;
import rx.X;

// Referenced classes of package rx.internal.a:
//            cN, cM, cP

final class cO extends X
{

    final Thread a;
    final cN b;

    cO(cN cn, X x, Thread thread)
    {
        b = cn;
        a = thread;
        super(x);
    }

    public final void onCompleted()
    {
        b.b.a.onCompleted();
    }

    public final void onError(Throwable throwable)
    {
        b.b.a.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        b.b.a.onNext(obj);
    }

    public final void setProducer(Q q)
    {
        b.b.a.setProducer(new cP(this, q));
    }
}
