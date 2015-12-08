// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b;
import rx.b.f;
import rx.d.e;

// Referenced classes of package rx.internal.a:
//            as, au

final class at extends X
{

    final av.a a = new av.a();
    final X b = this;
    final e c;
    final rx.h.e d;
    final as e;

    at(as as1, X x, e e1, rx.h.e e2)
    {
        e = as1;
        c = e1;
        d = e2;
        super(x);
    }

    public final void onCompleted()
    {
        a.a(c, this);
    }

    public final void onError(Throwable throwable)
    {
        c.onError(throwable);
        unsubscribe();
        a.a();
    }

    public final void onNext(Object obj)
    {
        b b1;
        try
        {
            b1 = (b)e.a.call(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            onError(((Throwable) (obj)));
            return;
        }
        obj = new au(this, a.a(obj));
        d.a(((rx.Y) (obj)));
        b1.unsafeSubscribe(((X) (obj)));
    }

    public final void onStart()
    {
        request(0x7fffffffffffffffL);
    }
}
