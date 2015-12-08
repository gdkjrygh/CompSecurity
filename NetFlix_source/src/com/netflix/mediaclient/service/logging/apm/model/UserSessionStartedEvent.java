// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm.model;

import com.netflix.mediaclient.service.logging.client.model.SessionStartedEvent;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class UserSessionStartedEvent extends SessionStartedEvent
{

    public static final String IDLE_TIME = "idleTime";
    public static final String TRIGGER = "trigger";
    private static final String USER_SESSION_NAME = "userSession";
    private long idleTime;
    private com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.Trigger trigger;

    public UserSessionStartedEvent(com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.Trigger trigger1, long l)
    {
        super("userSession");
        if (trigger1 == null)
        {
            throw new IllegalArgumentException("Trigger is null!");
        } else
        {
            trigger = trigger1;
            idleTime = l;
            return;
        }
    }

    public UserSessionStartedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        jsonobject = JsonUtils.getJSONObject(jsonobject, "data", null);
        if (jsonobject != null)
        {
            String s = JsonUtils.getString(jsonobject, "trigger", null);
            if (s != null)
            {
                trigger = (com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.Trigger)com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.Trigger.valueOf(com/netflix/mediaclient/servicemgr/ApplicationPerformanceMetricsLogging$Trigger, s);
            }
            idleTime = JsonUtils.getLong(jsonobject, "idleTime", 0L);
        }
    }

    protected JSONObject getData()
        throws JSONException
    {
        JSONObject jsonobject1 = super.getData();
        JSONObject jsonobject = jsonobject1;
        if (jsonobject1 == null)
        {
            jsonobject = new JSONObject();
        }
        jsonobject.put("trigger", trigger.name());
        jsonobject.put("idleTime", idleTime);
        return jsonobject;
    }

    public long getIdleTime()
    {
        return idleTime;
    }

    public com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.Trigger getTrigger()
    {
        return trigger;
    }
}
