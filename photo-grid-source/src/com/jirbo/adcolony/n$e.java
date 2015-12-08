// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.util.ArrayList;

// Referenced classes of package com.jirbo.adcolony:
//            l

class e
{

    boolean a;
    boolean b;
    String c;
    String d;
    boolean e;
    boolean f;
    double g;
    String h;
    String i;
    String j;
    .a k;
    .a l;
    ArrayList m;
     n;
     o;

    void a()
    {
        l.a.b("Caching media");
        if (a)
        {
            int i1 = 0;
            while (i1 < n.a()) 
            {
                n.a(i1).l();
                i1++;
            }
        }
    }

    boolean a(ata.g g1)
    {
        if (g1 != null)
        {
            a = g1.h("enabled");
            b = g1.h("log_screen_overlay");
            c = g1.e("last_country");
            d = g1.e("last_ip");
            f = g1.h("collect_iap_enabled");
            g = g1.f("media_pool_size");
            h = g1.e("log_level");
            i = g1.e("view_network_pass_filter");
            j = g1.e("cache_network_pass_filter");
            e = g1.h("hardware_acceleration_disabled");
            if (i == null || i.equals(""))
            {
                i = "all";
            }
            if (j == null || j.equals(""))
            {
                j = "all";
            }
            k = new <init>();
            if (k.a(g1.b("tracking")))
            {
                l = new <init>();
                if (l.a(g1.b("third_party_tracking")))
                {
                    m = g1.d("console_messages");
                    l.a.b("Parsing zones");
                    n = new ();
                    if (n.a(g1.c("zones")))
                    {
                        o = new <init>();
                        if (o.a(g1.b("device")))
                        {
                            l.a.b("Finished parsing app info");
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    boolean a(String s)
    {
        return a(s, false, true);
    }

    boolean a(String s, boolean flag, boolean flag1)
    {
        if (a)
        {
            if ((s = n.a(s)) != null)
            {
                return s.a(flag, flag1);
            }
        }
        return false;
    }

    ata.g()
    {
        e = false;
    }
}
