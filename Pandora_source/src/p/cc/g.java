// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cc;

import org.json.JSONException;
import org.json.JSONObject;

public class g
{

    String a;
    String b;
    String c;
    String d;
    String e;
    String f;

    public g(String s, String s1)
        throws JSONException
    {
        f = s1;
        s = new JSONObject(f);
        a = s.optString("productId");
        b = s.optString("type");
        c = s.optString("price");
        d = s.optString("title");
        e = s.optString("description");
    }

    public String a()
    {
        return a;
    }

    public String toString()
    {
        return (new StringBuilder()).append("SkuDetails:").append(f).toString();
    }
}
