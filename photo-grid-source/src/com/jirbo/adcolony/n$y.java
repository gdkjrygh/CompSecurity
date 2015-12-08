// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.util.ArrayList;

class ata.g
{

    String a;
    String b;
    boolean c;

    boolean a()
    {
        return true;
    }

    boolean a(ata.g g)
    {
        if (g == null)
        {
            return false;
        }
        c = g.h("enabled");
        if (!c)
        {
            return true;
        } else
        {
            a = (String)g.d("product_ids").get(0);
            b = g.e("in_progress");
            return true;
        }
    }

    ata.g()
    {
    }
}
