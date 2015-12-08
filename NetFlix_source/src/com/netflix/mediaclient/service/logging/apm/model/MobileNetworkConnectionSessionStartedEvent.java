// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm.model;

import com.netflix.mediaclient.service.logging.client.model.SessionStartedEvent;
import org.json.JSONException;
import org.json.JSONObject;

public class MobileNetworkConnectionSessionStartedEvent extends SessionStartedEvent
{

    private static final String NETWORK_CONNECTION_SESSION_NAME = "mobileNetworkConnection";

    public MobileNetworkConnectionSessionStartedEvent()
    {
        super("mobileNetworkConnection");
    }

    public MobileNetworkConnectionSessionStartedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
    }
}
