// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui;

import com.netflix.mediaclient.event.CallbackEvent;
import com.netflix.mediaclient.event.nrdp.JsonBaseNccpEvent;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseCommandCompletedEvent extends JsonBaseNccpEvent
    implements CallbackEvent
{

    protected static final String PROP_idx = "idx";
    protected static final String PROP_result = "result";
    protected static final String VALUE_COMPLETE_result = "COMPLETE";
    protected boolean failed;
    protected int idx;
    protected String result;

    public BaseCommandCompletedEvent(String s)
    {
        super(s);
    }

    public BaseCommandCompletedEvent(String s, JSONObject jsonobject)
        throws JSONException
    {
        super(s, jsonobject);
    }

    public int getCallerId()
    {
        return idx;
    }

    public String getResult()
    {
        return result;
    }

    public boolean isFailed()
    {
        return failed;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        idx = Integer.parseInt(getString(jsonobject, "idx", null));
        boolean flag;
        if (!"COMPLETE".equals(getString(jsonobject, "result", null)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        failed = flag;
    }
}
