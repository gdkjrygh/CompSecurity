// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b;
import rx.b.f;
import rx.exceptions.OnErrorThrowable;

// Referenced classes of package rx.internal.a:
//            bl, bo

final class bn extends X
{

    final X a;
    final bl b;

    bn(bl bl1, X x, X x1)
    {
        b = bl1;
        a = x1;
        super(x);
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
        try
        {
            a.onNext(((b)b.a.call(obj)).map(new bo(this, obj)));
            return;
        }
        catch (Throwable throwable)
        {
            a.onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
        }
    }
}
