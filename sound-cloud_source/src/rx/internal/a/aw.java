// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.d.e;

// Referenced classes of package rx.internal.a:
//            ax, av

final class aw extends X
{

    final av.a a = new av.a();
    final X b = this;
    final rx.h.e c;
    final rx.R.a d;
    final e e;
    final av f;

    aw(av av1, X x, rx.h.e e1, rx.R.a a1, e e2)
    {
        f = av1;
        c = e1;
        d = a1;
        e = e2;
        super(x);
    }

    public final void onCompleted()
    {
        a.a(e, this);
    }

    public final void onError(Throwable throwable)
    {
        e.onError(throwable);
        unsubscribe();
        a.a();
    }

    public final void onNext(Object obj)
    {
        int i = a.a(obj);
        c.a(d.a(new ax(this, i), f.a, f.b));
    }

    public final void onStart()
    {
        request(0x7fffffffffffffffL);
    }
}
