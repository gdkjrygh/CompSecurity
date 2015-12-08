// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.Y;

// Referenced classes of package rx.internal.a:
//            t

final class c extends X
{

    final X a;
    final a b;
    private final Y c;

    public final void onCompleted()
    {
        a.onCompleted();
        c.unsubscribe();
    }

    public final void onError(Throwable throwable)
    {
        a.onError(throwable);
        c.unsubscribe();
    }

    public final void onNext(Object obj)
    {
        a.onNext(obj);
    }

    public ( , X x, Y y)
    {
        b = ;
        super(x);
        a = x;
        c = y;
    }
}
