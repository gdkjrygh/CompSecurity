// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b;
import rx.d.f;

// Referenced classes of package rx.internal.a:
//            q

final class r extends X
{

    final X a;
    final q b;

    r(q q1, X x)
    {
        b = q1;
        a = x;
        super();
    }

    public final void onCompleted()
    {
        b.a.unsafeSubscribe(f.a(a));
    }

    public final void onError(Throwable throwable)
    {
        a.onError(throwable);
    }

    public final void onNext(Object obj)
    {
    }
}
