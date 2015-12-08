// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            d, y

public static class b extends b
{

    public b a(long l)
    {
        a("&utt", Long.toString(l));
        return this;
    }

    public a a(String s)
    {
        a("&utv", s);
        return this;
    }

    public volatile Map a()
    {
        return super.a();
    }

    public a b(String s)
    {
        a("&utc", s);
        return this;
    }

    public a c(String s)
    {
        a("&utl", s);
        return this;
    }

    public ()
    {
        y.a().a(J);
        a("&t", "timing");
    }

    public a(String s, String s1, long l)
    {
        this();
        a(s1);
        a(l);
        b(s);
    }
}
