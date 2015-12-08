// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b.a;

// Referenced classes of package rx.internal.a:
//            aW

final class aX extends X
{

    final X a;
    final aW b;

    aX(aW aw, X x, X x1)
    {
        b = aw;
        a = x1;
        super(x);
    }

    public final void onCompleted()
    {
        a.onCompleted();
        b.a.call();
        return;
        Exception exception;
        exception;
        b.a.call();
        throw exception;
    }

    public final void onError(Throwable throwable)
    {
        a.onError(throwable);
        b.a.call();
        return;
        throwable;
        b.a.call();
        throw throwable;
    }

    public final void onNext(Object obj)
    {
        a.onNext(obj);
    }
}
