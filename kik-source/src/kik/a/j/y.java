// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.b.a.n;
import com.kik.g.as;
import com.kik.g.s;

// Referenced classes of package kik.a.j:
//            u, z

final class y
    implements as
{

    final as a;
    final String b;
    final String c;
    final Long d;
    final u e;

    y(u u1, as as1, String s1, String s2, Long long1)
    {
        e = u1;
        a = as1;
        b = s1;
        c = s2;
        d = long1;
        super();
    }

    public final Object a(Object obj)
    {
        obj = (n)obj;
        obj = (n)a.a(obj);
        return s.b(e.b(b, c, ((n) (obj)), d), new z(this, ((n) (obj))));
    }
}
