// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal;

import com.worklight.location.api.WLTriggerCallback;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class AbstractTrigger
    implements Cloneable
{

    private WLTriggerCallback callbackFunction;
    private JSONObject event;
    private boolean transmitImmediately;

    public AbstractTrigger()
    {
        callbackFunction = null;
        event = null;
        transmitImmediately = false;
    }

    public abstract AbstractTrigger clone();

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    protected JSONObject cloneEvent()
    {
        JSONObject jsonobject;
        try
        {
            if (event != null)
            {
                return new JSONObject(event.toString());
            }
            jsonobject = event;
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            throw new AssertionError(jsonexception.getMessage());
        }
        return jsonobject;
    }

    public WLTriggerCallback getCallback()
    {
        return callbackFunction;
    }

    public JSONObject getEvent()
    {
        return event;
    }

    public boolean isTransmitImmediately()
    {
        return transmitImmediately;
    }

    public AbstractTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        callbackFunction = wltriggercallback;
        return this;
    }

    public AbstractTrigger setEvent(JSONObject jsonobject)
    {
        event = jsonobject;
        return this;
    }

    public AbstractTrigger setTransmitImmediately(boolean flag)
    {
        transmitImmediately = flag;
        return this;
    }
}
