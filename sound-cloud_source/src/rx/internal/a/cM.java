// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b;

// Referenced classes of package rx.internal.a:
//            cN, cL

final class cM extends X
{

    final X a;
    final rx.R.a b;
    final cL c;

    cM(cL cl, X x, X x1, rx.R.a a1)
    {
        c = cl;
        a = x1;
        b = a1;
        super(x);
    }

    public final void onCompleted()
    {
    }

    public final void onError(Throwable throwable)
    {
        a.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        obj = (b)obj;
        b.a(new cN(this, ((b) (obj))));
    }
}
