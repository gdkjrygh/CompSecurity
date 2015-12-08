// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models;

import com.appboy.support.AppboyLogger;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models:
//            IPutIntoJson

public class GcmMessage
    implements IPutIntoJson
{

    private static final String a = String.format("%s.%s", new Object[] {
        "Appboy", com/appboy/models/GcmMessage.getName()
    });
    private final String b;
    private final String c;
    private final Map d;
    private final String e;
    private final String f;
    private final Integer g;

    public GcmMessage(String s, String s1, Map map, String s2, String s3, Integer integer)
    {
        b = s;
        c = s1;
        if (map != null)
        {
            d = map;
        } else
        {
            d = new HashMap();
        }
        e = s2;
        f = s3;
        g = integer;
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
            jsonobject.put("title", b);
            jsonobject.put("content", c);
            jsonobject.put("extras", new JSONObject(d));
            if (e != null)
            {
                jsonobject.put("collapse_key", e);
            }
            if (f != null)
            {
                jsonobject.put("campaign_id", f);
            }
            if (g != null)
            {
                jsonobject.put("notification_id", g);
            }
        }
        catch (JSONException jsonexception)
        {
            AppboyLogger.e(a, "Caught exception creating gcm message Json.", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }

    public String getCampaignId()
    {
        return f;
    }

    public String getContent()
    {
        return c;
    }

    public Map getExtras()
    {
        return d;
    }

    public Integer getNotificationId()
    {
        return g;
    }

    public String getTitle()
    {
        return b;
    }

}
