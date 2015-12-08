// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.a;

import org.json.JSONObject;

public final class o
{

    String a;
    String b;
    String c;
    String d;
    long e;
    int f;
    String g;
    String h;
    String i;
    String j;

    public o(String s, String s1, String s2)
    {
        a = s;
        i = s1;
        s = new JSONObject(i);
        b = s.optString("orderId");
        c = s.optString("packageName");
        d = s.optString("productId");
        e = s.optLong("purchaseTime");
        f = s.optInt("purchaseState");
        g = s.optString("developerPayload");
        h = s.optString("token", s.optString("purchaseToken"));
        j = s2;
    }

    public final String a()
    {
        return d;
    }

    public final int b()
    {
        return f;
    }

    public final String toString()
    {
        return (new StringBuilder("PurchaseInfo(type:")).append(a).append("):").append(i).toString();
    }
}
