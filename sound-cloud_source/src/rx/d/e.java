// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.d;

import rx.P;
import rx.X;

// Referenced classes of package rx.d:
//            d

public final class e extends X
{

    private final P a;

    public e(X x)
    {
        this(x, true);
    }

    public e(X x, boolean flag)
    {
        super(x, flag);
        a = new d(x);
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
        a.onNext(obj);
    }
}
