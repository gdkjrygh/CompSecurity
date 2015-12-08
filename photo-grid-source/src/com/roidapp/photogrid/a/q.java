// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.a;

import org.json.JSONObject;

public final class q
{

    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;

    public q(String s, String s1)
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

    public final String toString()
    {
        return (new StringBuilder("SkuDetails:")).append(g).toString();
    }
}
