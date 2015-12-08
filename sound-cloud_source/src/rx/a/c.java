// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.a;

import rx.X;
import rx.b;

// Referenced classes of package rx.a:
//            b, a

final class c extends X
{

    final X a;
    final rx.a.b b;

    c(rx.a.b b1, X x)
    {
        b = b1;
        a = x;
        super();
    }

    public final void onCompleted()
    {
        a.onCompleted();
    }

    public final void onError(Throwable throwable)
    {
        a.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        a.access$202(b.b, (b)b.b.call(obj));
        a.onNext(obj);
        if (a.access$200(b.b) == a.access$300())
        {
            a.access$000(b.b).onCompleted();
        }
    }
}
