// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ag;

import p.af.e;
import p.q.g;
import p.s.k;
import p.t.c;

// Referenced classes of package p.ag:
//            a, b

public class f
    implements g
{

    private final g a;
    private final g b;

    f(g g1, g g2)
    {
        a = g1;
        b = g2;
    }

    public f(c c, g g1)
    {
        this(g1, ((g) (new e(g1, c))));
    }

    public String a()
    {
        return a.a();
    }

    public k a(k k1, int i, int j)
    {
        k k2 = ((a)k1.b()).b();
        k k4 = ((a)k1.b()).c();
        Object obj;
        if (k2 != null && a != null)
        {
            k4 = a.a(k2, i, j);
            obj = k1;
            if (!k2.equals(k4))
            {
                obj = new b(new a(k4, ((a)k1.b()).c()));
            }
        } else
        {
            obj = k1;
            if (k4 != null)
            {
                obj = k1;
                if (b != null)
                {
                    k k3 = b.a(k4, i, j);
                    obj = k1;
                    if (!k4.equals(k3))
                    {
                        return new b(new a(((a)k1.b()).b(), k3));
                    }
                }
            }
        }
        return ((k) (obj));
    }
}
