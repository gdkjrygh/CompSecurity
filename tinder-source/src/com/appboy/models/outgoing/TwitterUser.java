// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models.outgoing;

import bo.app.ep;
import com.appboy.Constants;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import org.json.JSONException;
import org.json.JSONObject;

public class TwitterUser
    implements IPutIntoJson
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

    public TwitterUser(Integer integer, String s, String s1, String s2, Integer integer1, Integer integer2, Integer integer3, 
            String s3)
    {
        b = integer;
        c = s;
        d = s1;
        e = s2;
        f = integer1;
        g = integer2;
        h = integer3;
        i = s3;
    }

    public volatile Object forJsonPut()
    {
        return forJsonPut();
    }

    public JSONObject forJsonPut()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            if (!ep.c(c))
            {
                jsonobject.put("screen_name", c);
            }
            if (!ep.c(d))
            {
                jsonobject.put("name", d);
            }
            if (!ep.c(e))
            {
                jsonobject.put("description", e);
            }
            if (!ep.c(i))
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
            AppboyLogger.e(a, "Caught exception creating twitter user Json.", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/models/outgoing/TwitterUser.getName()
        });
    }
}
