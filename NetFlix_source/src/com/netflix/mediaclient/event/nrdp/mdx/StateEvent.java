// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.mdx;

import com.netflix.mediaclient.event.nrdp.JsonBaseNccpEvent;
import org.json.JSONException;
import org.json.JSONObject;

public class StateEvent extends JsonBaseNccpEvent
{

    private static final String ATTR_status = "status";
    public static final com.netflix.mediaclient.javabridge.ui.Mdx.Events TYPE;
    private static final String VALUE_status_NOT_READY = "NOT_READY";
    private static final String VALUE_status_READY = "READY";
    private boolean ready;

    public StateEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(TYPE.getName(), jsonobject);
    }

    public String getObject()
    {
        return "nrdp.mdx";
    }

    public boolean isReady()
    {
        return ready;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        ready = "READY".equalsIgnoreCase(getString(jsonobject, "status", "NOT_READY"));
    }

    static 
    {
        TYPE = com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_mdxstate;
    }
}
