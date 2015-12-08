// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


class ata.g
{

    boolean a;
    b b;
    b c;

    boolean a()
    {
        while (!b.a() || !c.a()) 
        {
            return false;
        }
        return true;
    }

    boolean a(ata.g g)
    {
        if (g != null)
        {
            a = g.h("enabled");
            if (!a)
            {
                return true;
            }
            b = new <init>();
            if (b.a(g.b("pre_popup")))
            {
                c = new <init>();
                if (c.a(g.b("post_popup")))
                {
                    return true;
                }
            }
        }
        return false;
    }

    void b()
    {
        if (!a)
        {
            return;
        } else
        {
            b.b();
            c.b();
            return;
        }
    }

    ata.g()
    {
    }
}
