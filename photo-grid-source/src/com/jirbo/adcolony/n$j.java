// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


// Referenced classes of package com.jirbo.adcolony:
//            q, a, l

class ata.g
{

    boolean a;
    double b;
    boolean c;
    boolean d;
    String e;
    b f;
    String g;
    b h;
    b i;
    b j;

    boolean a()
    {
        boolean flag1 = false;
        boolean flag;
        if (!q.c())
        {
            a.ac = 8;
            flag = l.c.b("Ad not ready due to no network connection.");
        } else
        {
            flag = flag1;
            if (a)
            {
                flag = flag1;
                if (f.a())
                {
                    flag = flag1;
                    if (h.a())
                    {
                        flag = flag1;
                        if (i.a())
                        {
                            flag = flag1;
                            if (j.a())
                            {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    boolean a(ata.g g1)
    {
        if (g1 != null)
        {
            a = g1.h("enabled");
            b = g1.f("load_timeout");
            c = g1.h("load_timeout_enabled");
            d = g1.h("load_spinner_enabled");
            e = g1.e("background_color");
            g = g1.e("html5_tag");
            f = new <init>();
            if (f.a(g1.b("mraid_js")))
            {
                h = new <init>();
                if (h.a(g1.b("background_logo")))
                {
                    i = new <init>();
                    if (i.a(g1.b("replay")))
                    {
                        j = new <init>();
                        if (j.a(g1.b("close")))
                        {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    void b()
    {
        if (a)
        {
            if (f != null)
            {
                f.b();
            }
            if (h != null)
            {
                h.b();
            }
            if (i != null)
            {
                i.b();
            }
            if (j != null)
            {
                j.b();
                return;
            }
        }
    }

    ata.g()
    {
    }
}
