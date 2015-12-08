// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.e;

import com.kik.i.a.a.c;
import com.kik.m.e;
import java.io.IOException;
import kik.a.d.a.g;
import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.e:
//            g, i

public class k extends g
{
    public static class a
        implements kik.a.f.e.g, i
    {

        public final long a(o o1, g g1)
        {
            g1 = (k)g1;
            if (g1 == null)
            {
                return 0L;
            } else
            {
                o1.a("ri");
                o1.c(e.a(kik.a.h.g.a(g1.b())));
                o1.b("ri");
                return 0L;
            }
        }

        public final g a(n n1)
        {
            if (n1.a("ri"))
            {
                return new k(n1.nextText());
            } else
            {
                return null;
            }
        }

        public a()
        {
        }
    }


    private c a;

    public k(c c1)
    {
        super(true, false);
        a = c1;
    }

    public k(String s)
    {
        super(true, false);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        a = (c)kik.a.h.g.a(e.a(s), com/kik/i/a/a/c);
        return;
        s;
    }

    public final String a()
    {
        return e.a(kik.a.h.g.a(a));
    }

    public final c b()
    {
        return a;
    }
}
