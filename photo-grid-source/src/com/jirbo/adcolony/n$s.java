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
    b c;
    b d;

    boolean a()
    {
        while (!a.l.c.a(a) || !c.a() || !d.a()) 
        {
            return false;
        }
        return true;
    }

    boolean a(ata.g g)
    {
        a = g.e("background_image");
        b = g.e("background_image_last_modified");
        c = new <init>();
        if (c.a(g.b("background_logo")))
        {
            d = new <init>();
            if (d.a(g.b("dialog")))
            {
                return true;
            }
        }
        return false;
    }

    void b()
    {
        a.l.c.a(a, b);
        d.b();
    }

    ata.g()
    {
    }
}
