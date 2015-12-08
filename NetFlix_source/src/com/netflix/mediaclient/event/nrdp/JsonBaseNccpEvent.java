// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp:
//            BaseNccpEvent

public abstract class JsonBaseNccpEvent extends BaseNccpEvent
{

    protected static final String TAG = "nf_event";
    protected JSONObject json;

    public JsonBaseNccpEvent(String s)
    {
        super(s);
    }

    public JsonBaseNccpEvent(String s, JSONObject jsonobject)
        throws JSONException
    {
        super(s);
        if (jsonobject == null)
        {
            throw new IllegalArgumentException("JSON is null");
        } else
        {
            json = jsonobject;
            populate(jsonobject);
            return;
        }
    }

    public JSONObject getData()
        throws JSONException
    {
        return json;
    }

    protected String getJSON()
    {
        return json.toString();
    }

    public String getName()
    {
        return getType();
    }

    public int getNrdSource()
    {
        return 0;
    }

    protected abstract void populate(JSONObject jsonobject)
        throws JSONException;
}
