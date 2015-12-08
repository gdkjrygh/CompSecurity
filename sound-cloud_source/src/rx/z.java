// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.b.b;
import rx.exceptions.OnErrorNotImplementedException;

// Referenced classes of package rx:
//            X, b

final class z extends X
{

    final b a;
    final rx.b b;

    z(rx.b b1, b b2)
    {
        b = b1;
        a = b2;
        super();
    }

    public final void onCompleted()
    {
    }

    public final void onError(Throwable throwable)
    {
        throw new OnErrorNotImplementedException(throwable);
    }

    public final void onNext(Object obj)
    {
        a.call(obj);
    }
}
