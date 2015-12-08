// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d.b;

import bo.app.eq;
import com.appboy.d;
import com.appboy.d.e;
import org.json.JSONException;
import org.json.JSONObject;

public class b
    implements e
{

    private static final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public b(String s, String s1, String s2, String s3)
    {
        b = s;
        c = s1;
        d = s2;
        e = s3;
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            if (!eq.c(b))
            {
                jsonobject.put("source", b);
            }
            if (!eq.c(c))
            {
                jsonobject.put("campaign", c);
            }
            if (!eq.c(d))
            {
                jsonobject.put("adgroup", d);
            }
            if (!eq.c(e))
            {
                jsonobject.put("ad", e);
            }
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    public Object forJsonPut()
    {
        return a();
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, com/appboy/d/b/b.getName()
        });
    }
}
