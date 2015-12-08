// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.mdx.session;

import com.netflix.mediaclient.event.nrdp.JsonBaseNccpEvent;
import org.json.JSONException;
import org.json.JSONObject;

public class MessageEvent extends JsonBaseNccpEvent
{

    private static final String ATTR_msgObject = "msgObject";
    private static final String ATTR_pairingContext = "pairingContext";
    private static final String ATTR_sid = "sid";
    private static final String ATTR_transactionId = "transactionId";
    private static final String ATTR_type = "type";
    public static final com.netflix.mediaclient.javabridge.ui.Mdx.Events TYPE;
    private JSONObject msgObject;
    private String pairingContext;
    private int sid;
    private int transactionId;
    private String type;

    public MessageEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(TYPE.getName(), jsonobject);
    }

    public JSONObject getMsgObject()
    {
        return msgObject;
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

    public int getTransactionId()
    {
        return transactionId;
    }

    public String getType()
    {
        return type;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        pairingContext = getUrlDecodedString(jsonobject, "pairingContext", null);
        transactionId = getInt(jsonobject, "transactionId", -1);
        type = getString(jsonobject, "type", null);
        sid = getInt(jsonobject, "sid", -1);
        msgObject = getJSONObject(jsonobject, "msgObject", null);
    }

    static 
    {
        TYPE = com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_session_message;
    }
}
