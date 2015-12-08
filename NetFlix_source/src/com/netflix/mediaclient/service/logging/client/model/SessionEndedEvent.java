// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.model;

import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.client.model:
//            SessionEvent, SessionStartedEvent, EventType, DeviceUniqueId

public abstract class SessionEndedEvent extends SessionEvent
{

    public static final String DURATION = "duration";
    private static final String EXT = ".ended";
    protected long duration;

    public SessionEndedEvent(SessionStartedEvent sessionstartedevent, long l)
    {
        super(sessionstartedevent.getSessionName());
        type = EventType.sessionEnded;
        name = (new StringBuilder()).append(sessionName).append(".ended").toString();
        sessionId = sessionstartedevent.getSessionId();
        duration = l;
    }

    public SessionEndedEvent(String s)
    {
        super(s);
        type = EventType.sessionEnded;
        name = (new StringBuilder()).append(s).append(".ended").toString();
        sessionId = new DeviceUniqueId();
        duration = 0L;
    }

    public SessionEndedEvent(String s, DeviceUniqueId deviceuniqueid, long l)
    {
        super(s);
        type = EventType.sessionEnded;
        name = (new StringBuilder()).append(s).append(".ended").toString();
        sessionId = deviceuniqueid;
        duration = l;
    }

    public SessionEndedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        duration = JsonUtils.getLong(jsonobject, "duration", 0L);
    }

    public long getDuration()
    {
        return duration;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONObject jsonobject = super.toJSONObject();
        jsonobject.put("duration", duration);
        return jsonobject;
    }
}
