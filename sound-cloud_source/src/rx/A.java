// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.b.b;

// Referenced classes of package rx:
//            X, b

final class A extends X
{

    final b a;
    final b b;
    final rx.b c;

    A(rx.b b1, b b2, b b3)
    {
        c = b1;
        a = b2;
        b = b3;
        super();
    }

    public final void onCompleted()
    {
    }

    public final void onError(Throwable throwable)
    {
        a.call(throwable);
    }

    public final void onNext(Object obj)
    {
        b.call(obj);
    }
}
