// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.util;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class f
{

    String a;
    int b;
    int c;
    String d;
    int e;
    String f;
    String g;
    int h;
    int i;
    int j;

    public f(String s, int k, int l, String s1)
    {
        this(s, k, l, s1, 0, 0, 0);
    }

    public f(String s, int k, int l, String s1, int i1, int j1, int k1)
    {
        if (!TextUtils.isEmpty(s))
        {
            a = s.replace("&", "_");
        }
        b = k;
        c = l;
        d = s1;
        h = i1;
        i = j1;
        j = k1;
    }

    public f a(int k)
    {
        e = k;
        return this;
    }

    public String a()
    {
        JSONObject jsonobject = a(a, b, c, d, f, g, h, i, j);
        if (jsonobject != null)
        {
            return jsonobject.toString();
        } else
        {
            return null;
        }
    }

    public JSONObject a(String s, int k, int l, String s1, String s2, String s3, int i1, 
            int j1, int k1)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("pkg", s);
            jsonobject.put("sug", k);
            jsonobject.put("res", l);
            jsonobject.put("des", s1);
            if (!TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s3))
            {
                jsonobject.put("fbpos", s2);
                jsonobject.put("fbmeta", s3);
            }
            if (e > 0)
            {
                jsonobject.put("seq", e);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return jsonobject;
        }
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        jsonobject.put("duration", i1);
        jsonobject.put("playtime", j1);
        jsonobject.put("event", k1);
        return jsonobject;
    }

    public void a(String s, String s1)
    {
        f = s;
        g = s1;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("pkg    =").append(a).append("\n");
        stringbuilder.append(" * sug =").append(b).append("\n");
        stringbuilder.append(" * res =").append(c).append("\n");
        stringbuilder.append(" * des =").append(d).append("\n");
        stringbuilder.append(" * seq =").append(e).append("\n");
        stringbuilder.append(" * placementid=").append(f).append("\n");
        stringbuilder.append(" * rawJson=").append(g).append("\n");
        stringbuilder.append(" * duration=").append(h).append("\n");
        stringbuilder.append(" * playtime=").append(i).append("\n");
        stringbuilder.append(" * event=").append(j).append("\n");
        return stringbuilder.toString();
    }
}
