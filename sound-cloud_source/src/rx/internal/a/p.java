// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b;
import rx.b.a;
import rx.d.f;

// Referenced classes of package rx.internal.a:
//            o

final class p
    implements a
{

    final X a;
    final o b;

    p(o o1, X x)
    {
        b = o1;
        a = x;
        super();
    }

    public final void call()
    {
        if (!a.isUnsubscribed())
        {
            b.a.unsafeSubscribe(f.a(a));
        }
    }
}
