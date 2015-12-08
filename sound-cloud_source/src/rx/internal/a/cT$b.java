// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.Q;
import rx.X;
import rx.b;
import rx.h.e;
import rx.internal.b.a;

// Referenced classes of package rx.internal.a:
//            cT

private static final class e extends X
{

    private boolean a;
    private final X b;
    private final e c;
    private final a d;
    private final b e;

    public final void onCompleted()
    {
        if (!a)
        {
            b.onCompleted();
        } else
        if (!b.isUnsubscribed())
        {
            e e1 = new <init>(b, d);
            c.a(e1);
            e.unsafeSubscribe(e1);
            return;
        }
    }

    public final void onError(Throwable throwable)
    {
        b.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        a = false;
        b.onNext(obj);
        d.a();
    }

    public final void setProducer(Q q)
    {
        d.a(q);
    }

    (X x, e e1, a a1, b b1)
    {
        a = true;
        b = x;
        c = e1;
        d = a1;
        e = b1;
    }
}
