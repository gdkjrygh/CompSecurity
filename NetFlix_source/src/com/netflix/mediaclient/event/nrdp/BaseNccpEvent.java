// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp;

import com.netflix.mediaclient.event.UIEvent;
import com.netflix.mediaclient.util.JsonUtils;
import java.net.URLDecoder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseNccpEvent
    implements UIEvent
{

    protected String eventType;

    public BaseNccpEvent(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Event type can not be null");
        } else
        {
            eventType = s;
            return;
        }
    }

    protected static boolean getBoolean(JSONObject jsonobject, String s, boolean flag)
        throws JSONException
    {
        return JsonUtils.getBoolean(jsonobject, s, flag);
    }

    protected static int getInt(JSONObject jsonobject, String s, int i)
        throws JSONException
    {
        return JsonUtils.getInt(jsonobject, s, i);
    }

    protected static JSONObject getJSONObject(JSONObject jsonobject, String s, JSONObject jsonobject1)
        throws JSONException
    {
        return JsonUtils.getJSONObject(jsonobject, s, jsonobject1);
    }

    protected static JSONArray getJsonArray(JSONObject jsonobject, String s)
        throws JSONException
    {
        return JsonUtils.getJSONArray(jsonobject, s);
    }

    protected static String getString(JSONObject jsonobject, String s, String s1)
        throws JSONException
    {
        return JsonUtils.getString(jsonobject, s, s1);
    }

    protected static String getUrlDecodedString(JSONObject jsonobject, String s, String s1)
        throws JSONException
    {
        jsonobject = JsonUtils.getString(jsonobject, s, s1);
        if (jsonobject == null || "".equals(jsonobject.trim()))
        {
            return jsonobject;
        }
        try
        {
            s = URLDecoder.decode(jsonobject, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return jsonobject;
        }
        return s;
    }

    protected abstract String getJSON();

    public String getType()
    {
        return eventType;
    }
}
