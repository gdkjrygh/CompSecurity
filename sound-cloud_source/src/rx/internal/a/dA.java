// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;

// Referenced classes of package rx.internal.a:
//            dz

final class dA extends X
{

    final dv.c a;
    final Long b;
    final dz c;

    dA(dz dz, dv.c c1, Long long1)
    {
        c = dz;
        a = c1;
        b = long1;
        super();
    }

    public final void onCompleted()
    {
        a.a(b.longValue());
    }

    public final void onError(Throwable throwable)
    {
        a.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        a.a(b.longValue());
    }
}
