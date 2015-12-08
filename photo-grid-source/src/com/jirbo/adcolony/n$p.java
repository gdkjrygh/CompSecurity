// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


// Referenced classes of package com.jirbo.adcolony:
//            a, d, o

class ata.g
{

    boolean a;
    boolean b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    b j;
    b k;
    b l;

    boolean a()
    {
        while (!a || !a.l.c.a(c) || !a.l.c.a(g) || !k.a() || !l.a()) 
        {
            return false;
        }
        return true;
    }

    boolean a(ata.g g1)
    {
        if (g1 != null)
        {
            a = g1.h("enabled");
            c = g1.e("poster_image");
            d = g1.e("advertiser_name");
            e = g1.e("description");
            f = g1.e("title");
            g = g1.e("thumb_image");
            h = g1.e("poster_image_last_modified");
            i = g1.e("thumb_image_last_modified");
            k = new <init>();
            if (k.a(g1.b("mute")))
            {
                b = k.f;
                l = new <init>();
                if (l.a(g1.b("unmute")))
                {
                    j = new <init>();
                    if (j.a(g1.b("overlay")))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    void b()
    {
        a.l.c.a(c, h);
        a.l.c.a(g, i);
        k.b();
        l.b();
    }

    ata.g()
    {
    }
}
