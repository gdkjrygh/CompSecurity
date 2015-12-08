// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


// Referenced classes of package com.jirbo.adcolony:
//            a, d, o

class ata.g
{

    boolean a;
    int b;
    int c;
    int d;
    int e;
    String f;
    String g;
    String h;
    String i;
    String j;
    String k;
    String l;
    String m;
    String n;
    String o;
    String p;

    boolean a()
    {
        if (a)
        {
            if (!a.l.c.a(f))
            {
                return false;
            }
            if (!a.l.c.a(h))
            {
                return false;
            }
        }
        return true;
    }

    boolean a(ata.g g1)
    {
        if (g1 == null)
        {
            return false;
        } else
        {
            a = g1.a("enabled", true);
            e = g1.g("delay");
            b = g1.g("width");
            c = g1.g("height");
            d = g1.g("scale");
            f = g1.e("image_normal");
            g = g1.e("image_normal_last_modified");
            h = g1.e("image_down");
            i = g1.e("image_down_last_modified");
            j = g1.e("click_action");
            k = g1.e("click_action_type");
            l = g1.e("label");
            m = g1.e("label_rgba");
            n = g1.e("label_shadow_rgba");
            o = g1.e("label_html");
            p = g1.e("event");
            return true;
        }
    }

    void b()
    {
        a.l.c.a(f, g);
        a.l.c.a(h, i);
    }

    ata.g()
    {
    }
}
