// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


// Referenced classes of package com.jirbo.adcolony:
//            a, d, o

class ata.g
{

    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    b h;
    b i;
    b j;
    b k;
    b l;
    b m;

    boolean a()
    {
        while (!a.l.c.a(a) || !a.l.c.a(c) || !a.l.c.a(e) || !h.a() || !i.a() || !j.a() || !k.a() || !l.a() || !m.a()) 
        {
            return false;
        }
        return true;
    }

    boolean a(ata.g g1)
    {
        if (g1 != null)
        {
            a = g1.e("tiny_glow_image");
            b = g1.e("tiny_glow_image_last_modified;");
            c = g1.e("background_bar_image");
            d = g1.e("background_bar_image_last_modified");
            e = g1.e("background_tile_image");
            f = g1.e("background_tile_image_last_modified");
            g = g1.e("background_color");
            h = new <init>();
            if (h.a(g1.b("logo")))
            {
                h = new <init>();
                if (h.a(g1.b("logo")))
                {
                    i = new <init>();
                    if (i.a(g1.b("stop")))
                    {
                        j = new <init>();
                        if (j.a(g1.b("back")))
                        {
                            k = new <init>();
                            if (k.a(g1.b("close")))
                            {
                                l = new <init>();
                                if (l.a(g1.b("forward")))
                                {
                                    m = new <init>();
                                    if (m.a(g1.b("reload")))
                                    {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    void b()
    {
        a.l.c.a(a, b);
        a.l.c.a(c, d);
        a.l.c.a(e, f);
        h.b();
        i.b();
        j.b();
        k.b();
        l.b();
        m.b();
    }

    ata.g()
    {
    }
}
