// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtils
{

    private JsonUtils()
    {
    }

    public static boolean getBoolean(JSONObject jsonobject, String s, boolean flag)
        throws JSONException
    {
        if (!jsonobject.isNull(s))
        {
            return jsonobject.getBoolean(s);
        } else
        {
            return flag;
        }
    }

    public static int getInt(JSONObject jsonobject, String s, int i)
        throws JSONException
    {
        if (!jsonobject.isNull(s))
        {
            return jsonobject.getInt(s);
        } else
        {
            return i;
        }
    }

    public static Integer getIntegerObject(JSONObject jsonobject, String s, Integer integer)
        throws JSONException
    {
        if (!jsonobject.isNull(s))
        {
            return Integer.valueOf(jsonobject.getInt(s));
        } else
        {
            return integer;
        }
    }

    public static JSONArray getJSONArray(JSONObject jsonobject, String s)
        throws JSONException
    {
        JSONArray jsonarray = null;
        if (!jsonobject.isNull(s))
        {
            jsonarray = jsonobject.getJSONArray(s);
        }
        return jsonarray;
    }

    public static JSONObject getJSONObject(JSONObject jsonobject, String s, JSONObject jsonobject1)
        throws JSONException
    {
        if (!jsonobject.isNull(s))
        {
            return jsonobject.getJSONObject(s);
        } else
        {
            return jsonobject1;
        }
    }

    public static long getLong(JSONObject jsonobject, String s, long l)
        throws JSONException
    {
        if (!jsonobject.isNull(s))
        {
            return jsonobject.getLong(s);
        } else
        {
            return l;
        }
    }

    public static String getString(JSONObject jsonobject, String s, String s1)
        throws JSONException
    {
        if (!jsonobject.isNull(s))
        {
            return jsonobject.getString(s);
        } else
        {
            return s1;
        }
    }
}
