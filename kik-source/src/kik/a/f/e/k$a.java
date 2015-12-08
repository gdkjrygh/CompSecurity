// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.e;

import com.kik.m.e;
import kik.a.f.n;
import kik.a.f.o;
import kik.a.h.g;

// Referenced classes of package kik.a.f.e:
//            g, i, k

public static class ct
    implements kik.a.f.e.g, i
{

    public final long a(o o1, kik.a.d.a.g g1)
    {
        g1 = (k)g1;
        if (g1 == null)
        {
            return 0L;
        } else
        {
            o1.a("ri");
            o1.c(e.a(g.a(g1.b())));
            o1.b("ri");
            return 0L;
        }
    }

    public final kik.a.d.a.g a(n n1)
    {
        if (n1.a("ri"))
        {
            return new k(n1.nextText());
        } else
        {
            return null;
        }
    }

    public ct()
    {
    }
}
