// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


class ata.g
{

    boolean a;
    boolean b;
    String c;
    String d;
    String e;

    boolean a(ata.g g)
    {
        boolean flag = true;
        if (g == null)
        {
            flag = false;
        } else
        {
            a = g.h("enabled");
            if (a)
            {
                b = g.h("in_app");
                c = g.e("click_action_type");
                e = g.e("click_action");
                d = g.e("label");
                return true;
            }
        }
        return flag;
    }

    ata.g()
    {
    }
}
