// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.registration;

import com.netflix.mediaclient.event.nrdp.JsonBaseNccpEvent;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseRegistrationEvent extends JsonBaseNccpEvent
{

    public BaseRegistrationEvent(String s)
    {
        super(s);
    }

    public BaseRegistrationEvent(String s, JSONObject jsonobject)
        throws JSONException
    {
        super(s, jsonobject);
    }

    public String getObject()
    {
        return "nrdp.registration";
    }
}
