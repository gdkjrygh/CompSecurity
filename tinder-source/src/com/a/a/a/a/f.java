// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a.a;

import org.json.JSONException;
import org.json.JSONObject;

public final class f
{

    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final Double f;
    public final String g;

    public f(JSONObject jsonobject)
        throws JSONException
    {
        String s1 = jsonobject.optString("type");
        String s = s1;
        if (s1 == null)
        {
            s = "inapp";
        }
        a = jsonobject.optString("productId");
        b = jsonobject.optString("title");
        c = jsonobject.optString("description");
        d = s.equalsIgnoreCase("subs");
        e = jsonobject.optString("price_currency_code");
        f = Double.valueOf(jsonobject.optDouble("price_amount_micros") / 1000000D);
        g = jsonobject.optString("price");
    }

    public final String toString()
    {
        return String.format("%s: %s(%s) %f in %s (%s)", new Object[] {
            a, b, c, f, e, g
        });
    }
}
