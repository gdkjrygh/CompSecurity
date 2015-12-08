// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.mdx.pair;

import com.netflix.mediaclient.event.nrdp.JsonBaseNccpEvent;
import org.json.JSONException;
import org.json.JSONObject;

public class RegPairResponseEvent extends JsonBaseNccpEvent
{

    private static final String ATTR_cookies = "cookies";
    private static final String ATTR_errorCode = "errorCode";
    private static final String ATTR_errorDesc = "errorDesc";
    private static final String ATTR_pairingContext = "pairingContext";
    private static final String ATTR_remoteDevice = "remoteDevice";
    public static final com.netflix.mediaclient.javabridge.ui.Mdx.Events TYPE;
    private String cookies;
    private String errorCode;
    private String errorDesc;
    private String pairingContext;
    private String remoteDevice;

    public RegPairResponseEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(TYPE.getName(), jsonobject);
    }

    public String getCookies()
    {
        return cookies;
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

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        errorCode = getString(jsonobject, "errorCode", null);
        errorDesc = getString(jsonobject, "errorDesc", null);
        pairingContext = getUrlDecodedString(jsonobject, "pairingContext", null);
        remoteDevice = getUrlDecodedString(jsonobject, "remoteDevice", null);
        cookies = getString(jsonobject, "cookies", null);
    }

    static 
    {
        TYPE = com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_pair_regpairresponse;
    }
}
