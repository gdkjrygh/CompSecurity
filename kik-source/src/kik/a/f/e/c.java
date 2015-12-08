// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.e;

import kik.a.d.a.g;
import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.e:
//            g, i

public class c
    implements kik.a.f.e.g, i
{

    public c()
    {
    }

    public final long a(o o1, g g1)
    {
        g1 = (kik.a.d.a.c)g1;
        if (g1 == null)
        {
            return 0L;
        }
        boolean flag = g1.a();
        o1.a("flag");
        if (flag)
        {
            g1 = "1";
        } else
        {
            g1 = "0";
        }
        o1.a("is", g1);
        o1.b("flag");
        return 0L;
    }

    public final g a(n n1)
    {
        kik.a.d.a.c c1 = null;
        if (n1.a("flag"))
        {
            c1 = new kik.a.d.a.c("1".equals(n1.getAttributeValue(null, "is")));
        }
        return c1;
    }
}
