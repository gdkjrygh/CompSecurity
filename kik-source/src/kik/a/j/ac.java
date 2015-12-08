// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.kik.g.p;
import com.kik.g.r;
import com.kik.g.s;
import java.util.List;
import kik.a.e.x;
import kik.a.f.q;

// Referenced classes of package kik.a.j:
//            ab, u, ad

final class ac extends r
{

    final ab a;

    ac(ab ab1)
    {
        a = ab1;
        super();
    }

    public final void a(Object obj)
    {
        s.b(u.g(a.d).a(a.b), a.c);
    }

    public final void a(Throwable throwable)
    {
        if (throwable instanceof q)
        {
            q q1 = (q)throwable;
            if (q1.a() == 202)
            {
                throwable = (List)q1.b();
                u.g(a.d).a(throwable).a(new ad(this, q1));
                return;
            }
        }
        a.c.a(throwable);
    }
}
