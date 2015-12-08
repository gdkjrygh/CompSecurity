// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


class ata.g
{

    String a;
    int b;
    int c;
    boolean d;
    boolean e;
    boolean f;
    double g;
    b h;
    b i;

    boolean a()
    {
        if (!i.a || i.a())
        {
            if (!d)
            {
                return true;
            }
            if (h.a() || i.a())
            {
                return true;
            }
        }
        return false;
    }

    boolean a(ata.g g1)
    {
        if (g1 != null)
        {
            d = g1.h("enabled");
            if (!d)
            {
                return true;
            }
            a = g1.e("uuid");
            b = g1.g("ad_id");
            c = g1.g("ad_campaign_id");
            e = g1.h("dissolve");
            f = g1.h("enable_in_app_store");
            g = g1.f("dissolve_delay");
            h = new <init>();
            if (h.a(g1.b("static")))
            {
                i = new <init>();
                if (i.a(g1.b("html5")))
                {
                    return true;
                }
            }
        }
        return false;
    }

    void b()
    {
        if (!d)
        {
            return;
        } else
        {
            h.b();
            i.b();
            return;
        }
    }

    ata.g()
    {
    }
}
