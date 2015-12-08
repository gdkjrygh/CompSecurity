// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.Q;
import rx.X;
import rx.internal.b.a;

// Referenced classes of package rx.internal.a:
//            cT

private static final class a extends X
{

    private final a a;
    private final X b;

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
        b.onNext(obj);
        a.a();
    }

    public final void setProducer(Q q)
    {
        a.a(q);
    }

    (X x, a a1)
    {
        b = x;
        a = a1;
    }
}
