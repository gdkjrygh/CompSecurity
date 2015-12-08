// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.models;

import com.google.gson.JsonArray;
import org.json.JSONArray;
import org.json.JSONException;

public class BigEvent
{

    JsonArray events;
    int interval;

    public BigEvent()
    {
    }

    public JSONArray getEvents()
    {
        JSONArray jsonarray;
        try
        {
            jsonarray = new JSONArray(events.toString());
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return null;
        }
        return jsonarray;
    }

    public int getInterval()
    {
        return interval;
    }
}
