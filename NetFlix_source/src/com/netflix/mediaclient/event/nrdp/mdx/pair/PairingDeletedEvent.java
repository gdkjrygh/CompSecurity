// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.mdx.pair;

import com.netflix.mediaclient.event.nrdp.JsonBaseNccpEvent;
import org.json.JSONException;
import org.json.JSONObject;

public class PairingDeletedEvent extends JsonBaseNccpEvent
{

    private static final String ATTR_pairingContext = "pairingContext";
    public static final com.netflix.mediaclient.javabridge.ui.Mdx.Events TYPE;
    private String pairingContext;

    public PairingDeletedEvent(JSONObject jsonobject)
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

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        pairingContext = getUrlDecodedString(jsonobject, "pairingContext", null);
    }

    static 
    {
        TYPE = com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_pair_pairingdeleted;
    }
}
