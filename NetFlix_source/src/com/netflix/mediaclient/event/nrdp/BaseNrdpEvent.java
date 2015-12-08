// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp:
//            JsonBaseNccpEvent

public abstract class BaseNrdpEvent extends JsonBaseNccpEvent
{

    public BaseNrdpEvent(String s)
    {
        super(s);
    }

    public BaseNrdpEvent(String s, JSONObject jsonobject)
        throws JSONException
    {
        super(s, jsonobject);
    }

    public String getObject()
    {
        return "nrdp";
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
    }
}
