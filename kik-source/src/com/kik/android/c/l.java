// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.c;

import android.content.Context;
import com.kik.g.aq;
import com.kik.g.as;
import com.kik.g.p;
import com.kik.g.s;
import com.kik.m.e;
import com.kik.n.a.j.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kik.a.d.ab;
import kik.a.e.v;
import kik.a.j.n;
import kik.android.d.b;
import kik.android.d.c;
import kik.android.d.k;
import kik.android.util.ar;

// Referenced classes of package com.kik.android.c:
//            d, m, n, o, 
//            a, e, p, q, 
//            r

public final class l
    implements d
{

    private final d a;
    private final n b;
    private final v c;
    private final c d;
    private final as e = new m(this);
    private final as f = new com.kik.android.c.n(this);

    public l(d d1, n n1, v v1, c c1, Context context, ar ar)
    {
        a = d1;
        b = n1;
        c = v1;
        d = c1;
        d1 = d;
        n1 = new o(this);
        d1.a(new k(context, "smiley-config-xdata-debounce", Long.valueOf(0x2932e00L), new Long[] {
            Long.valueOf(0x2932e00L), Long.valueOf(0x36ee80L), Long.valueOf(0x493e0L), Long.valueOf(60000L)
        }, n1, ar));
    }

    static d a(l l1)
    {
        return l1.a;
    }

    private static String a(a a1)
    {
        if (a1 == null || a1.b() == null)
        {
            return null;
        }
        try
        {
            a1 = com.kik.m.e.b(a1.b().getBytes());
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            return null;
        }
        return a1;
    }

    static v b(l l1)
    {
        return l1.c;
    }

    public final long a(com.kik.android.c.e e1)
    {
        return a.a(e1);
    }

    public final com.kik.android.c.e a(String s1)
    {
        return a.a(s1);
    }

    public final List a()
    {
        return a.a();
    }

    public final void a(com.kik.android.c.a a1)
    {
        if (a1 != null)
        {
            a.a(a1);
            a1 = a1.a();
            String s1 = a(((a) (a1)));
            if (s1 != null)
            {
                ArrayList arraylist = new ArrayList();
                arraylist.add(ab.a("smiley_alternate", s1, a1));
                b.a(arraylist, (Long)d.a("smiley-config-xdata-debounce").b());
                return;
            }
        }
    }

    public final void a(List list)
    {
        a.a(list);
        ArrayList arraylist = new ArrayList();
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.kik.n.a.j.c c1 = ((com.kik.android.c.e)iterator.next()).b();
            if (c1 == null)
            {
                list = null;
            } else
            {
                list = c1.c();
            }
            if (list != null)
            {
                arraylist.add(ab.a("smiley_list", list, c1));
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            b.a(arraylist);
        }
    }

    public final void b()
    {
        a.b();
    }

    public final void b(com.kik.android.c.a a1)
    {
        a.b(a1);
        b.b("smiley_alternate", a1.b(), null);
    }

    public final void b(com.kik.android.c.e e1)
    {
        a.b(e1);
    }

    public final void b(String s1)
    {
        if (s1 == null)
        {
            return;
        }
        a.b(s1);
        com.kik.android.c.a a1 = c(s1);
        if (a1 != null)
        {
            b(a1);
        }
        b.b("smiley_list", s1, null);
    }

    public final com.kik.android.c.a c(String s1)
    {
        return a.c(s1);
    }

    public final void c()
    {
        a.c();
    }

    public final Map d()
    {
        return a.d();
    }

    public final long e()
    {
        return a.e();
    }

    public final void f()
    {
        a.f();
    }

    public final boolean g()
    {
        return a.g();
    }

    public final void h()
    {
        a.h();
    }

    public final boolean i()
    {
        return a.i();
    }

    public final void j()
    {
        a.j();
    }

    public final p k()
    {
        p p1 = new p();
        if (!c.p("com.kik.android.smileys.xSmileyManagerStorage.restored").booleanValue())
        {
            p p2 = s.b(b.c("smiley_list", com/kik/n/a/j/c), s.a(e));
            p p3 = s.b(b.c("smiley_alternate", com/kik/n/a/j/a), s.a(f));
            p3.a(new com.kik.android.c.p(this));
            s.a(p3, p2).a(new q(this, p1));
            p2.a(new r(this, p1));
            return p1;
        } else
        {
            p1.a(Boolean.valueOf(false));
            return p1;
        }
    }
}
