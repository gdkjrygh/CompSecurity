// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d.b;

import bo.app.eq;
import com.appboy.d;
import com.appboy.d.e;
import org.json.JSONException;
import org.json.JSONObject;

public class f
    implements e
{

    private static final String a;
    private final Integer b;
    private final String c;
    private final String d;
    private final String e;
    private final Integer f;
    private final Integer g;
    private final Integer h;
    private final String i;

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            if (!eq.c(c))
            {
                jsonobject.put("screen_name", c);
            }
            if (!eq.c(d))
            {
                jsonobject.put("name", d);
            }
            if (!eq.c(e))
            {
                jsonobject.put("description", e);
            }
            if (!eq.c(i))
            {
                jsonobject.put("profile_image_url", i);
            }
            jsonobject.put("id", b);
            jsonobject.put("followers_count", f);
            jsonobject.put("friends_count", g);
            jsonobject.put("statuses_count", h);
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
            d.a, com/appboy/d/b/f.getName()
        });
    }
}
