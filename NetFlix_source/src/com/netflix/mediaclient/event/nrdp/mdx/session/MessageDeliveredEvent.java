// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.mdx.session;

import com.netflix.mediaclient.event.nrdp.JsonBaseNccpEvent;
import org.json.JSONException;
import org.json.JSONObject;

public class MessageDeliveredEvent extends JsonBaseNccpEvent
{

    private static final String ATTR_pairingContext = "pairingContext";
    private static final String ATTR_transactionId = "transactionId";
    public static final com.netflix.mediaclient.javabridge.ui.Mdx.Events TYPE;
    private String pairingContext;
    private int transactionId;

    public MessageDeliveredEvent(JSONObject jsonobject)
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

    public int getTransactionId()
    {
        return transactionId;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        pairingContext = getUrlDecodedString(jsonobject, "pairingContext", null);
        transactionId = getInt(jsonobject, "transactionId", -1);
    }

    static 
    {
        TYPE = com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_session_messagedelivered;
    }
}
