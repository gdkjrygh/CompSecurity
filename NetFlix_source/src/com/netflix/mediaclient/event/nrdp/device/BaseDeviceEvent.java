// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.device;

import com.netflix.mediaclient.event.nrdp.JsonBaseNccpEvent;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseDeviceEvent extends JsonBaseNccpEvent
{

    public BaseDeviceEvent(String s)
    {
        super(s);
    }

    public BaseDeviceEvent(String s, JSONObject jsonobject)
        throws JSONException
    {
        super(s, jsonobject);
    }

    public String getObject()
    {
        return "nrdp.device";
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
    }
}
