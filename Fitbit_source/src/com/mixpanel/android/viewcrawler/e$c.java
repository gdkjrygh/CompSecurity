// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            e

public static class f
{

    public static final int g = 0;
    public static final int h = 1;
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;

    public String toString()
    {
        Object obj;
        try
        {
            obj = new JSONObject();
            if (a == 1)
            {
                ((JSONObject) (obj)).put("prefix", "shortest");
            }
            if (b != null)
            {
                ((JSONObject) (obj)).put("view_class", b);
            }
            if (c > -1)
            {
                ((JSONObject) (obj)).put("index", c);
            }
            if (d > -1)
            {
                ((JSONObject) (obj)).put("id", d);
            }
            if (e != null)
            {
                ((JSONObject) (obj)).put("contentDescription", e);
            }
            if (f != null)
            {
                ((JSONObject) (obj)).put("tag", f);
            }
            obj = ((JSONObject) (obj)).toString();
        }
        catch (JSONException jsonexception)
        {
            throw new RuntimeException("Can't serialize PathElement to String", jsonexception);
        }
        return ((String) (obj));
    }

    public (int i, String s, int j, int k, String s1, String s2)
    {
        a = i;
        b = s;
        c = j;
        d = k;
        e = s1;
        f = s2;
    }
}
