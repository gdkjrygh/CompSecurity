// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds.billing.util;

import org.json.JSONException;
import org.json.JSONObject;

public class h
{

    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;

    public h(String s, String s1)
        throws JSONException
    {
        a = s;
        g = s1;
        s = new JSONObject(g);
        b = s.optString("productId");
        c = s.optString("type");
        d = s.optString("price");
        e = s.optString("title");
        f = s.optString("description");
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return d;
    }

    public String toString()
    {
        return (new StringBuilder()).append("SkuDetails:").append(g).toString();
    }
}
