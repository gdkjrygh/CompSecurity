// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.d;

import rx.X;

final class h extends X
{

    final X a;

    h(X x, X x1)
    {
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
        a.onNext(obj);
    }
}
