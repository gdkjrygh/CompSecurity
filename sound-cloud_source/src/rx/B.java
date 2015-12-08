// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.b.a;
import rx.b.b;

// Referenced classes of package rx:
//            X, b

final class B extends X
{

    final a a;
    final b b;
    final b c;
    final rx.b d;

    B(rx.b b1, a a1, b b2, b b3)
    {
        d = b1;
        a = a1;
        b = b2;
        c = b3;
        super();
    }

    public final void onCompleted()
    {
        a.call();
    }

    public final void onError(Throwable throwable)
    {
        b.call(throwable);
    }

    public final void onNext(Object obj)
    {
        c.call(obj);
    }
}
