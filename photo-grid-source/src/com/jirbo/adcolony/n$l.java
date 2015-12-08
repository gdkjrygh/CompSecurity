// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


// Referenced classes of package com.jirbo.adcolony:
//            a, d, o

class ata.g
{

    int a;
    int b;
    int c;
    String d;
    String e;
    boolean f;

    boolean a()
    {
        if (!f)
        {
            return true;
        } else
        {
            return a.l.c.a(d);
        }
    }

    boolean a(ata.g g)
    {
        boolean flag = true;
        if (g == null)
        {
            flag = false;
        } else
        {
            f = g.a("enabled", true);
            a = g.g("width");
            b = g.g("height");
            c = g.g("scale");
            d = g.e("image");
            e = g.e("image_last_modified");
            if (e.equals(""))
            {
                e = g.e("last_modified");
                return true;
            }
        }
        return flag;
    }

    void b()
    {
        a.l.c.a(d, e);
    }

    ata.g()
    {
    }
}
