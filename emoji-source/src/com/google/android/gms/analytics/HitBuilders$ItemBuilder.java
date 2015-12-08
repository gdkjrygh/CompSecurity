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
        return super.uild();
    }

    public uild setCategory(String s)
    {
        set("&iv", s);
        return this;
    }

    public set setCurrencyCode(String s)
    {
        set("&cu", s);
        return this;
    }

    public set setName(String s)
    {
        set("&in", s);
        return this;
    }

    public set setPrice(double d)
    {
        set("&ip", Double.toString(d));
        return this;
    }

    public set setQuantity(long l)
    {
        set("&iq", Long.toString(l));
        return this;
    }

    public set setSku(String s)
    {
        set("&ic", s);
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
        set("&t", "item");
    }
}
