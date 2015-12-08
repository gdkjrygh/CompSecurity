// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.k;
import com.kik.g.r;
import kik.a.d.n;
import kik.a.f.f.o;

// Referenced classes of package kik.a.g:
//            b

final class h extends r
{

    final String a;
    final String b;
    final b c;

    h(b b1, String s, String s1)
    {
        c = b1;
        a = s;
        b = s1;
        super();
    }

    public final void a(Object obj)
    {
        super.a((o)obj);
        obj = c.a(a, true);
        ((n) (obj)).i(b);
        c.b(((n) (obj)));
        kik.a.g.b.b(c).a(((kik.a.d.k) (obj)), false, true);
        kik.a.g.b.b(c).j();
    }

    public final void a(Throwable throwable)
    {
        kik.a.g.b.d(c).a(throwable);
    }
}
