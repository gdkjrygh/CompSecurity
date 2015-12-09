// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui;

import com.netflix.mediaclient.javabridge.Bridge;
import com.netflix.mediaclient.javabridge.NrdpObject;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseNrdObject
    implements NrdpObject
{

    protected static final String JSON_FIELD_DATA = "data";
    protected static final String JSON_FIELD_NAME = "name";
    protected static final String JSON_FIELD_OBJECT = "object";
    protected static final String JSON_FIELD_PROPERTIES = "properties";
    protected static final String JSON_FIELD_TYPE = "type";
    protected static final String NAME_IMC = "IMediaControl";
    protected static final String TYPE_EVENT = "Event";
    protected static final String TYPE_PROP_UPDATE = "PropertyUpdate";
    protected Bridge bridge;

    public BaseNrdObject(Bridge bridge1)
    {
        if (bridge1 == null)
        {
            throw new IllegalArgumentException("bridge is null!");
        } else
        {
            bridge = bridge1;
            return;
        }
    }

    protected boolean getBoolean(JSONObject jsonobject, String s, boolean flag)
        throws JSONException
    {
        return JsonUtils.getBoolean(jsonobject, s, flag);
    }

    protected int getInt(JSONObject jsonobject, String s, int i)
        throws JSONException
    {
        return JsonUtils.getInt(jsonobject, s, i);
    }

    protected JSONArray getJSONArray(JSONObject jsonobject, String s)
        throws JSONException
    {
        return JsonUtils.getJSONArray(jsonobject, s);
    }

    protected JSONObject getJSONObject(JSONObject jsonobject, String s, JSONObject jsonobject1)
        throws JSONException
    {
        return JsonUtils.getJSONObject(jsonobject, s, jsonobject1);
    }

    protected long getLong(JSONObject jsonobject, String s, long l)
        throws JSONException
    {
        return JsonUtils.getLong(jsonobject, s, l);
    }

    protected String getString(JSONObject jsonobject, String s, String s1)
        throws JSONException
    {
        return JsonUtils.getString(jsonobject, s, s1);
    }
}
