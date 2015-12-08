// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cc;

import org.json.JSONException;
import org.json.JSONObject;

public class e
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
    String k;

    public e(String s, String s1, String s2)
        throws JSONException
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

    public e(String s, String s1, String s2, String s3, String s4)
    {
        h = s1;
        b = s2;
        d = s3;
        k = s;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return d;
    }

    public long d()
    {
        return e;
    }

    public int e()
    {
        return f;
    }

    public String f()
    {
        return h;
    }

    public String g()
    {
        return i;
    }

    public String h()
    {
        return j;
    }

    public String i()
    {
        return k;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PurchaseInfo(type:").append(a).append("):").append(i).toString();
    }
}
