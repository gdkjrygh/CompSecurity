// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.mdx.session;

import com.netflix.mediaclient.event.nrdp.JsonBaseNccpEvent;
import org.json.JSONException;
import org.json.JSONObject;

public class StartSessionResponseEvent extends JsonBaseNccpEvent
{

    private static final String ATTR_pairingContext = "pairingContext";
    private static final String ATTR_sid = "sid";
    public static final com.netflix.mediaclient.javabridge.ui.Mdx.Events TYPE;
    private String pairingContext;
    private int sid;

    public StartSessionResponseEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(TYPE.getName(), jsonobject);
    }

    public String getObject()
    {
        return "nrdp.mdx";
    }

    public String getPairingContext()
    {
        return pairingContext;
    }

    public int getSid()
    {
        return sid;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        pairingContext = getUrlDecodedString(jsonobject, "pairingContext", null);
        sid = getInt(jsonobject, "sid", 0x80000000);
    }

    static 
    {
        TYPE = com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_session_startSessionResponse;
    }
}
