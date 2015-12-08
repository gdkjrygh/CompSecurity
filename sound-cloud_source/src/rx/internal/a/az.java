// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;

// Referenced classes of package rx.internal.a:
//            aA, ay, aB, aC

final class az extends X
{

    boolean a;
    final rx.R.a b;
    final X c;
    final ay d;

    az(ay ay1, X x, rx.R.a a1, X x1)
    {
        d = ay1;
        b = a1;
        c = x1;
        super(x);
    }

    public final void onCompleted()
    {
        b.a(new aA(this), d.b, d.c);
    }

    public final void onError(Throwable throwable)
    {
        b.a(new aB(this, throwable));
    }

    public final void onNext(Object obj)
    {
        b.a(new aC(this, obj), d.b, d.c);
    }
}
