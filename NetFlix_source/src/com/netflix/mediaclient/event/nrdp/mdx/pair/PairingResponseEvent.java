// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.mdx.pair;

import com.netflix.mediaclient.event.nrdp.JsonBaseNccpEvent;
import org.json.JSONException;
import org.json.JSONObject;

public class PairingResponseEvent extends JsonBaseNccpEvent
{

    private static final String ATTR_errorCode = "errorCode";
    private static final String ATTR_errorMessage = "errorMessage";
    private static final String ATTR_match = "match";
    private static final String ATTR_pairingContext = "pairingContext";
    private static final String ATTR_remoteDevice = "remoteDevice";
    public static final com.netflix.mediaclient.javabridge.ui.Mdx.Events TYPE;
    private String errorCode;
    private String errorDesc;
    private int match;
    private String pairingContext;
    private String remoteDevice;

    public PairingResponseEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(TYPE.getName(), jsonobject);
    }

    public String getErrorCode()
    {
        return errorCode;
    }

    public String getErrorDesc()
    {
        return errorDesc;
    }

    public String getObject()
    {
        return "nrdp.mdx";
    }

    public String getPairingContext()
    {
        return pairingContext;
    }

    public String getRemoteDevice()
    {
        return remoteDevice;
    }

    public boolean isMatch()
    {
        return match > 0;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        errorCode = getString(jsonobject, "errorCode", null);
        errorDesc = getString(jsonobject, "errorMessage", null);
        match = getInt(jsonobject, "match", 0);
        pairingContext = getUrlDecodedString(jsonobject, "pairingContext", null);
        remoteDevice = getUrlDecodedString(jsonobject, "remoteDevice", null);
    }

    static 
    {
        TYPE = com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_pair_pairingresponse;
    }
}
