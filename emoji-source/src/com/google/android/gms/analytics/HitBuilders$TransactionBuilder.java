// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            HitBuilders, u

public static class set extends set
{

    public volatile Map build()
    {
        return super.set();
    }

    public set setAffiliation(String s)
    {
        set("&ta", s);
        return this;
    }

    public set setCurrencyCode(String s)
    {
        set("&cu", s);
        return this;
    }

    public set setRevenue(double d)
    {
        set("&tr", Double.toString(d));
        return this;
    }

    public set setShipping(double d)
    {
        set("&ts", Double.toString(d));
        return this;
    }

    public set setTax(double d)
    {
        set("&tt", Double.toString(d));
        return this;
    }

    public set setTransactionId(String s)
    {
        set("&ti", s);
        return this;
    }

    public ()
    {
        u.cU().a();
        set("&t", "transaction");
    }
}
