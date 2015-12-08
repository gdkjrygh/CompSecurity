// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            d

public static class a extends a
{

    public a a(double d1)
    {
        a("&tr", Double.toString(d1));
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
        a("&cu", s);
        return this;
    }

    public ()
    {
        a("&t", "transaction");
    }
}
