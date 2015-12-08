// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class i
{

    private final String a;
    private final String b;
    private final String c;
    private final List d;
    private final String e;
    private final String f;

    private i(String s, String s1, String s2, List list, String s3, String s4)
    {
        a = s;
        b = s1;
        c = s2;
        d = list;
        e = s3;
        f = s4;
    }

    public static i a(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return null;
        }
        String s = jsonobject.optString("package");
        String s1 = jsonobject.optString("appsite");
        String s2 = jsonobject.optString("appsite_url");
        JSONArray jsonarray = jsonobject.optJSONArray("key_hashes");
        ArrayList arraylist = new ArrayList();
        if (jsonarray != null)
        {
            for (int j = 0; j < jsonarray.length(); j++)
            {
                arraylist.add(jsonarray.optString(j));
            }

        }
        return new i(s, s1, s2, arraylist, jsonobject.optString("market_uri"), jsonobject.optString("fallback_url"));
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
        return c;
    }
}
