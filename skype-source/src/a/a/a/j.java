// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a;

import com.microsoft.a.a;
import com.microsoft.a.c;
import com.microsoft.a.d;
import com.microsoft.a.f;
import com.microsoft.a.i;
import com.microsoft.a.k;
import com.microsoft.a.l;
import com.microsoft.a.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package a.a.a:
//            g, b

public final class j
{
    public static final class a
    {

        public static final com.microsoft.a.j a;
        public static final d b;
        private static final d c;
        private static final d d;
        private static final d e;
        private static final d f;
        private static final d g;
        private static final d h;
        private static final d i;
        private static final d j;
        private static final d k;

        static d a()
        {
            return c;
        }

        public static l a(com.microsoft.a.j j1)
        {
            short word0;
            l l1;
            l1 = new l();
            l1.a(com.microsoft.a.a.k);
            word0 = 0;
_L3:
            if (word0 >= j1.a().size())
            {
                break MISSING_BLOCK_LABEL_63;
            }
            if (((k)j1.a().get(word0)).a() != b) goto _L2; else goto _L1
_L1:
            l1.a(word0);
            return l1;
_L2:
            word0++;
              goto _L3
            k k1 = new k();
            j1.a().add(k1);
            k1.a(b);
            c c1 = new c();
            c1.a((short)1);
            c1.a(c);
            c1.a().a(com.microsoft.a.a.j);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)2);
            c1.a(d);
            c1.a().a(com.microsoft.a.a.j);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)3);
            c1.a(e);
            c1.a().a(com.microsoft.a.a.j);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)4);
            c1.a(f);
            c1.a().a(com.microsoft.a.a.j);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)5);
            c1.a(g);
            c1.a().a(com.microsoft.a.a.j);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)6);
            c1.a(h);
            c1.a(a.a.a.g.a.a(j1));
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)7);
            c1.a(i);
            c1.a(a.a.a.b.a.a(j1));
            k1.b().add(c1);
            j1 = new c();
            j1.a((short)8);
            j1.a(j);
            j1.a().a(com.microsoft.a.a.n);
            j1.a().b(new l());
            j1.a().a(new l());
            j1.a().b().a(com.microsoft.a.a.j);
            j1.a().a().a(com.microsoft.a.a.j);
            k1.b().add(j1);
            j1 = new c();
            j1.a((short)9);
            j1.a(k);
            j1.a().a(com.microsoft.a.a.j);
            k1.b().add(j1);
              goto _L1
        }

        static d b()
        {
            return d;
        }

        static d c()
        {
            return e;
        }

        static d d()
        {
            return f;
        }

        static d e()
        {
            return g;
        }

        static d f()
        {
            return h;
        }

        static d g()
        {
            return i;
        }

        static d h()
        {
            return j;
        }

        static d i()
        {
            return k;
        }

        static 
        {
            Object obj = new d();
            b = ((d) (obj));
            ((d) (obj)).a("User");
            b.b("clienttelemetry.data.v3.User");
            obj = new d();
            c = ((d) (obj));
            ((d) (obj)).a("Username");
            obj = new d();
            d = ((d) (obj));
            ((d) (obj)).a("Prefix");
            obj = new d();
            e = ((d) (obj));
            ((d) (obj)).a("UiVersion");
            obj = new d();
            f = ((d) (obj));
            ((d) (obj)).a("Endpoint");
            obj = new d();
            g = ((d) (obj));
            ((d) (obj)).a("EndpointType");
            obj = new d();
            h = ((d) (obj));
            ((d) (obj)).a("Pstn");
            obj = new d();
            i = ((d) (obj));
            ((d) (obj)).a("EndpointComposite");
            obj = new d();
            j = ((d) (obj));
            ((d) (obj)).a("UserExtension");
            obj = new d();
            k = ((d) (obj));
            ((d) (obj)).a("Email");
            obj = new com.microsoft.a.j();
            a = ((com.microsoft.a.j) (obj));
            ((com.microsoft.a.j) (obj)).a(a(((com.microsoft.a.j) (obj))));
        }
    }


    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private g f;
    private b g;
    private HashMap h;
    private String i;

    public j()
    {
        a = "";
        b = "";
        c = "";
        d = "";
        e = "";
        f = new g();
        g = new b();
        if (h == null)
        {
            h = new HashMap();
        } else
        {
            h.clear();
        }
        i = "";
    }

    public final String a()
    {
        return a;
    }

    public final void a(g g1)
    {
        f = g1;
    }

    public final void a(i k)
        throws IOException
    {
        boolean flag = k.a(f.d);
        Object obj = a.b;
        int l;
        if (!flag || a != a.a.a.a.a().a().b())
        {
            obj = com.microsoft.a.a.j;
            a.a.a.a.a();
            k.a(((com.microsoft.a.a) (obj)), 1);
            k.a(a);
        } else
        {
            com.microsoft.a.a a2 = com.microsoft.a.a.j;
            a.a.a.a.a();
        }
        if (!flag || b != a.b().a().b())
        {
            obj = com.microsoft.a.a.j;
            a.b();
            k.a(((com.microsoft.a.a) (obj)), 2);
            k.a(b);
        } else
        {
            com.microsoft.a.a a3 = com.microsoft.a.a.j;
            a.b();
        }
        if (!flag || c != a.a.a.a.c().a().b())
        {
            obj = com.microsoft.a.a.j;
            a.a.a.a.c();
            k.a(((com.microsoft.a.a) (obj)), 3);
            k.a(c);
        } else
        {
            com.microsoft.a.a a4 = com.microsoft.a.a.j;
            a.a.a.a.c();
        }
        if (!flag || d != a.a.a.a.d().a().b())
        {
            obj = com.microsoft.a.a.j;
            a.a.a.a.d();
            k.a(((com.microsoft.a.a) (obj)), 4);
            k.a(d);
        } else
        {
            com.microsoft.a.a a5 = com.microsoft.a.a.j;
            a.a.a.a.d();
        }
        if (!flag || e != a.e().a().b())
        {
            obj = com.microsoft.a.a.j;
            a.e();
            k.a(((com.microsoft.a.a) (obj)), 5);
            k.a(e);
        } else
        {
            com.microsoft.a.a a6 = com.microsoft.a.a.j;
            a.e();
        }
        obj = com.microsoft.a.a.k;
        a.a.a.a.f();
        k.a(((com.microsoft.a.a) (obj)), 6);
        f.a(k);
        obj = com.microsoft.a.a.k;
        a.g();
        k.a(((com.microsoft.a.a) (obj)), 7);
        g.a(k);
        l = h.size();
        if (!flag || l != 0)
        {
            com.microsoft.a.a a1 = com.microsoft.a.a.n;
            a.h();
            k.a(a1, 8);
            k.a(h.size(), com.microsoft.a.a.j, com.microsoft.a.a.j);
            java.util.Map.Entry entry;
            for (Iterator iterator = h.entrySet().iterator(); iterator.hasNext(); k.a((String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
                k.a((String)entry.getKey());
            }

        } else
        {
            com.microsoft.a.a a7 = com.microsoft.a.a.n;
            a.h();
        }
        if (!flag || i != a.a.a.a.i().a().b())
        {
            com.microsoft.a.a a8 = com.microsoft.a.a.j;
            a.a.a.a.i();
            k.a(a8, 9);
            k.a(i);
        } else
        {
            com.microsoft.a.a a9 = com.microsoft.a.a.j;
            a.a.a.a.i();
        }
        k.a();
    }

    public final void a(String s)
    {
        a = s;
    }

    public final void b(String s)
    {
        c = s;
    }

    public final volatile Object clone()
        throws CloneNotSupportedException
    {
        return null;
    }
}
