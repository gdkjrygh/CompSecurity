// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.List;
import rx.X;
import rx.h.b;

final class aj extends X
{

    final List a;
    final ah.a b;

    aj(ah.a a1, List list)
    {
        b = a1;
        a = list;
        super();
    }

    public final void onCompleted()
    {
        b.d.b(this);
        b.a(a);
    }

    public final void onError(Throwable throwable)
    {
        b.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        b.d.b(this);
        b.a(a);
    }
}
