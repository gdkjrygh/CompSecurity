// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


// Referenced classes of package com.jirbo.adcolony:
//            f, k, a, d, 
//            u

class ata.g
{

    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    ata.g h;

    boolean a(ata.g g1)
    {
        if (g1 == null)
        {
            return true;
        }
        a = g1.a("update", null);
        b = g1.a("install", null);
        c = g1.a("dynamic_interests", null);
        d = g1.a("user_meta_data", null);
        e = g1.a("in_app_purchase", null);
        g = g1.a("session_end", null);
        f = g1.a("session_start", null);
        h = new ata.g();
        h.b("update", a);
        h.b("install", b);
        h.b("dynamic_interests", c);
        h.b("user_meta_data", d);
        h.b("in_app_purchase", e);
        h.b("session_end", g);
        h.b("session_start", f);
        g1 = new f("iap_cache.txt");
        ata.c c1 = k.c(g1);
        if (c1 != null)
        {
            for (int i = 0; i < c1.i(); i++)
            {
                ata.g g2 = c1.a(i, new ata.g());
                a.l.d.a("in_app_purchase", g2);
            }

            g1.c();
            a.Z.j();
        }
        a.F = true;
        return true;
    }

    ata.g()
    {
    }
}
