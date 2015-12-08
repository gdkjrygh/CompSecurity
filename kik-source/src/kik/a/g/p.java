// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.r;
import kik.a.d.n;
import kik.a.f.f.ag;

// Referenced classes of package kik.a.g:
//            b

final class p extends r
{

    final r a;
    final b b;

    p(b b1, r r1)
    {
        b = b1;
        a = r1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (ag)obj;
        super.a(obj);
        Object obj1 = ((ag) (obj)).e();
        obj1 = kik.a.g.b.b(b).a(((String) (obj1)), false);
        if (obj1 != null && (obj1 instanceof n))
        {
            ((n)obj1).f(((ag) (obj)).d());
            kik.a.g.b.b(b).a(((kik.a.d.k) (obj1)), true, true);
        }
        kik.a.g.b.b(b).j();
        a.a(obj);
    }

    public final void a(Throwable throwable)
    {
        super.a(throwable);
        a.a(throwable);
    }
}
