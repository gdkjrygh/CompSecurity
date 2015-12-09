// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.mdx.session;

import com.netflix.mediaclient.event.nrdp.JsonBaseNccpEvent;
import org.json.JSONException;
import org.json.JSONObject;

public class SessionEndedEvent extends JsonBaseNccpEvent
{

    private static final String ATTR_sid = "sid";
    public static final com.netflix.mediaclient.javabridge.ui.Mdx.Events TYPE;
    private int sid;

    public SessionEndedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(TYPE.getName(), jsonobject);
    }

    public String getObject()
    {
        return "nrdp.mdx";
    }

    public int getSid()
    {
        return sid;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        sid = getInt(jsonobject, "sid", -1);
    }

    static 
    {
        TYPE = com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_session_sessionended;
    }
}
