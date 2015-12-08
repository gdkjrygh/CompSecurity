// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b;
import rx.d.e;
import rx.d.f;
import rx.g.c;

// Referenced classes of package rx.internal.a:
//            aE

public final class aD
    implements rx.b.g
{

    final b a;
    final rx.b.f b;

    public aD(b b1, rx.b.f f1)
    {
        a = b1;
        b = f1;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        e e1 = new e(((X) (obj)));
        c c1 = c.a();
        ((X) (obj)).add(rx.b.merge(c1).unsafeSubscribe(f.a(e1)));
        return new aE(this, ((X) (obj)), c1, e1);
    }
}
