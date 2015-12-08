// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            d, y

public static class a extends a
{

    public a a(double d1)
    {
        a("&ip", Double.toString(d1));
        return this;
    }

    public a a(long l)
    {
        a("&iq", Long.toString(l));
        return this;
    }

    public a a(String s)
    {
        a("&ti", s);
        return this;
    }

    public volatile Map a()
    {
        return super.a();
    }

    public a b(String s)
    {
        a("&in", s);
        return this;
    }

    public a c(String s)
    {
        a("&ic", s);
        return this;
    }

    public a h(String s)
    {
        a("&iv", s);
        return this;
    }

    public a i(String s)
    {
        a("&cu", s);
        return this;
    }

    public ()
    {
        y.a().a(Z);
        a("&t", "item");
    }
}
