// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.types;

import com.worklight.jsonstore.jackson.JacksonSerializedJSONArray;
import com.worklight.jsonstore.jackson.JacksonSerializedJSONObject;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONObject;

public class JacksonSerializedResult extends PluginResult
{

    public JacksonSerializedResult(org.apache.cordova.PluginResult.Status status, JSONArray jsonarray)
    {
        super(status, new JacksonSerializedJSONArray(jsonarray));
    }

    public JacksonSerializedResult(org.apache.cordova.PluginResult.Status status, JSONObject jsonobject)
    {
        super(status, new JacksonSerializedJSONObject(jsonobject));
    }
}
