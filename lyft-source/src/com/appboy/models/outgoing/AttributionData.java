// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models.outgoing;

import bo.app.ev;
import com.appboy.Constants;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import org.json.JSONException;
import org.json.JSONObject;

public class AttributionData
    implements IPutIntoJson
{

    private static final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public AttributionData(String s, String s1, String s2, String s3)
    {
        b = s;
        c = s1;
        d = s2;
        e = s3;
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
            if (!ev.c(b))
            {
                jsonobject.put("source", b);
            }
            if (!ev.c(c))
            {
                jsonobject.put("campaign", c);
            }
            if (!ev.c(d))
            {
                jsonobject.put("adgroup", d);
            }
            if (!ev.c(e))
            {
                jsonobject.put("ad", e);
            }
        }
        catch (JSONException jsonexception)
        {
            AppboyLogger.e(a, "Caught exception creating AttributionData Json.", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/models/outgoing/AttributionData.getName()
        });
    }
}
