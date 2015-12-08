// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.b.b;

// Referenced classes of package rx:
//            P, a, b

final class J
    implements P
{

    final b a;
    final rx.b b;

    J(rx.b b1, b b2)
    {
        b = b1;
        a = b2;
        super();
    }

    public final void onCompleted()
    {
        a.call(rx.a.a());
    }

    public final void onError(Throwable throwable)
    {
        a.call(rx.a.a(throwable));
    }

    public final void onNext(Object obj)
    {
        a.call(rx.a.a(obj));
    }
}
