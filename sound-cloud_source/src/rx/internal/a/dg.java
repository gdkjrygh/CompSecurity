// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;

// Referenced classes of package rx.internal.a:
//            de

final class dg extends X
{

    final X a;
    final de b;

    dg(de de, X x)
    {
        b = de;
        a = x;
        super();
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
        onCompleted();
    }

    public final void onStart()
    {
        request(0x7fffffffffffffffL);
    }
}
