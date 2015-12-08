// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.e;

import kik.a.d.a.g;
import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.e:
//            g, i

public class f
    implements kik.a.f.e.g, i
{

    public f()
    {
    }

    public final long a(o o1, g g1)
    {
        o1.a("is-typing");
        if (((kik.a.d.a.f)g1).a())
        {
            g1 = "true";
        } else
        {
            g1 = "false";
        }
        o1.a("val", g1);
        o1.b("is-typing");
        return 0L;
    }

    public final g a(n n1)
    {
        kik.a.d.a.f f1 = null;
        if (n1.a("is-typing"))
        {
            f1 = new kik.a.d.a.f("true".equals(n1.getAttributeValue(null, "val")));
        }
        return f1;
    }
}
