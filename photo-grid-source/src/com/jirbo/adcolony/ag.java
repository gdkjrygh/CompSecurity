// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.io.Serializable;

class ag
    implements Serializable
{

    String a;
    int b;
    int c;
    int d;

    ag()
    {
        a = "";
    }

    ag(String s)
    {
        a = "";
        a = s;
    }

    ADCData.g a()
    {
        ADCData.g g = new ADCData.g();
        g.b("uuid", a);
        g.b("skipped_plays", b);
        g.b("play_order_index", c);
        return g;
    }

    boolean a(ADCData.g g)
    {
        if (g == null)
        {
            return false;
        } else
        {
            a = g.a("uuid", "error");
            b = g.g("skipped_plays");
            c = g.g("play_order_index");
            return true;
        }
    }
}
