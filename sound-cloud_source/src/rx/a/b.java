// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.a;

import rx.X;
import rx.g.c;

// Referenced classes of package rx.a:
//            a, c

final class b
    implements rx.f
{

    final rx.b a;
    final a b;

    b(a a1, rx.b b1)
    {
        b = a1;
        a = b1;
        super();
    }

    public final void call(Object obj)
    {
        obj = (X)obj;
        a.access$002(b, c.a());
        a.access$102(b, rx.b.switchOnNext(a.access$000(b)).subscribe(new rx.a.c(this, ((X) (obj)))));
        ((X) (obj)).add(a.access$100(b));
        a.access$000(b).onNext(a);
    }
}
