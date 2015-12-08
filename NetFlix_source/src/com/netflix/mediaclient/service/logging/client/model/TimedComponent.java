// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.model;

import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class TimedComponent
{

    public static final String ELAPSED = "elapsed";
    public static final String NAME = "name";
    private long elapsed;
    private String name;

    public TimedComponent()
    {
    }

    public TimedComponent(String s, long l)
    {
        name = s;
        elapsed = l;
    }

    public static TimedComponent createInstance(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject == null)
        {
            return null;
        } else
        {
            TimedComponent timedcomponent = new TimedComponent();
            timedcomponent.name = JsonUtils.getString(jsonobject, "name", null);
            timedcomponent.elapsed = JsonUtils.getLong(jsonobject, "elapsed", 0L);
            return timedcomponent;
        }
    }

    public long getElapsed()
    {
        return elapsed;
    }

    public String getName()
    {
        return name;
    }

    public void setElapsed(long l)
    {
        elapsed = l;
    }

    public void setName(String s)
    {
        name = s;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        if (name != null)
        {
            jsonobject.put("name", name);
        }
        jsonobject.put("elapsed", elapsed);
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("TimedComponent [name=").append(name).append(", elapsed=").append(elapsed).append("]").toString();
    }
}
