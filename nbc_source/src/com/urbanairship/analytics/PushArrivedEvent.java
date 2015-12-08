// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import com.urbanairship.Logger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.analytics:
//            Event, DefaultEnvironment, Environment

public class PushArrivedEvent extends Event
{

    static final String TYPE = "push_arrived";
    private String pushId;

    public PushArrivedEvent(Environment environment, String s)
    {
        super(environment);
        pushId = s;
    }

    public PushArrivedEvent(String s)
    {
        this(((Environment) (new DefaultEnvironment())), s);
    }

    JSONObject getData()
    {
        JSONObject jsonobject = new JSONObject();
        Environment environment = getEnvironment();
        try
        {
            jsonobject.put("session_id", environment.getSessionId());
            jsonobject.put("push_id", pushId);
            jsonobject.put("connection_type", environment.getConnectionType());
            String s = environment.getConnectionSubType();
            if (s.length() > 0)
            {
                jsonobject.put("connection_subtype", s);
            }
            jsonobject.put("carrier", environment.getCarrier());
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
        return "push_arrived";
    }
}
