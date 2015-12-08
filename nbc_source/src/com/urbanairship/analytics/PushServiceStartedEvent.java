// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import com.urbanairship.Logger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.analytics:
//            Event, DefaultEnvironment, Environment

public class PushServiceStartedEvent extends Event
{

    static final String TYPE = "push_service_started";

    public PushServiceStartedEvent()
    {
        this(((Environment) (new DefaultEnvironment())));
    }

    public PushServiceStartedEvent(Environment environment)
    {
        super(environment);
    }

    JSONObject getData()
    {
        JSONObject jsonobject = new JSONObject();
        Environment environment = getEnvironment();
        try
        {
            jsonobject.put("session_id", environment.getSessionId());
            jsonobject.put("connection_type", environment.getConnectionType());
            String s = environment.getConnectionSubType();
            if (s.length() > 0)
            {
                jsonobject.put("connection_subtype", s);
            }
            jsonobject.put("carrier", environment.getCarrier());
            jsonobject.put("apid", environment.getApid());
            jsonobject.put("transport", environment.getPushTransport());
            jsonobject.put("push_enabled", environment.isPushEnabled());
        }
        catch (JSONException jsonexception)
        {
            Logger.error((new StringBuilder()).append("Error constructing JSON data for ").append(getType()).toString());
            return jsonobject;
        }
        return jsonobject;
    }

    String getType()
    {
        return "push_service_started";
    }
}
