// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.model;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.client.model:
//            SessionEvent, EventType, DeviceUniqueId

public abstract class SessionStartedEvent extends SessionEvent
{

    private static final String EXT = ".started";

    public SessionStartedEvent(String s)
    {
        super(s);
        type = EventType.sessionStarted;
        name = (new StringBuilder()).append(s).append(".started").toString();
        sessionId = new DeviceUniqueId();
    }

    public SessionStartedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
    }
}
