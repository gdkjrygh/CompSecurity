// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm.model;

import com.netflix.mediaclient.service.logging.client.model.DeviceUniqueId;
import com.netflix.mediaclient.service.logging.client.model.SessionEndedEvent;
import org.json.JSONException;
import org.json.JSONObject;

public class WiredNetworkConnectionSessionEndedEvent extends SessionEndedEvent
{

    private static final String NETWORK_CONNECTION_SESSION_NAME = "wiredNetworkConnection";

    public WiredNetworkConnectionSessionEndedEvent(DeviceUniqueId deviceuniqueid, long l)
    {
        super("wiredNetworkConnection", deviceuniqueid, l);
    }

    public WiredNetworkConnectionSessionEndedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
    }
}
