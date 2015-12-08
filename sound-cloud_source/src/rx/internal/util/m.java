// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import rx.X;
import rx.b;
import rx.b.f;

// Referenced classes of package rx.internal.util:
//            k, n

final class m
    implements rx.b.f
{

    final f a;
    final k b;

    m(k k1, f f1)
    {
        b = k1;
        a = f1;
        super();
    }

    public final void call(Object obj)
    {
        obj = (X)obj;
        b b1 = (b)a.call(k.a(b));
        if (b1.getClass() == rx/internal/util/k)
        {
            ((X) (obj)).onNext(k.a((k)b1));
            ((X) (obj)).onCompleted();
            return;
        } else
        {
            b1.unsafeSubscribe(new n(this, ((X) (obj)), ((X) (obj))));
            return;
        }
    }
}
