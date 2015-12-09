// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm.model;

import com.netflix.mediaclient.service.logging.client.model.DeviceUniqueId;
import com.netflix.mediaclient.service.logging.client.model.SessionEndedEvent;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.apm.model:
//            UserSessionStartedEvent

public final class UserSessionEndedEvent extends SessionEndedEvent
{

    public static final String END_REASON = "endReason";
    public static final String LAST_USER_ACTIVITY_TIME = "lastUserActivityTime";
    public static final String USER_SESSION_DURATION = "userSessionDuration";
    private static final String USER_SESSION_NAME = "userSession";
    private com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.EndReason endReason;
    private long lastUserActivityTime;
    private long userSessionDuration;

    public UserSessionEndedEvent(UserSessionStartedEvent usersessionstartedevent, long l, com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.EndReason endreason, long l1)
    {
        super(usersessionstartedevent, l);
        userSessionDuration = l;
        lastUserActivityTime = l1;
        if (endreason == null)
        {
            throw new IllegalArgumentException("End reason is null!");
        } else
        {
            endReason = endreason;
            return;
        }
    }

    public UserSessionEndedEvent(DeviceUniqueId deviceuniqueid, long l, com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.EndReason endreason, long l1)
    {
        super("userSession", deviceuniqueid, l);
        userSessionDuration = l;
        lastUserActivityTime = l1;
        if (endreason == null)
        {
            throw new IllegalArgumentException("End reason is null!");
        } else
        {
            endReason = endreason;
            return;
        }
    }

    public UserSessionEndedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        jsonobject = JsonUtils.getJSONObject(jsonobject, "data", null);
        if (jsonobject != null)
        {
            String s = JsonUtils.getString(jsonobject, "endReason", null);
            if (s != null)
            {
                endReason = (com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.EndReason)com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.EndReason.valueOf(com/netflix/mediaclient/servicemgr/ApplicationPerformanceMetricsLogging$EndReason, s);
            }
            lastUserActivityTime = JsonUtils.getLong(jsonobject, "lastUserActivityTime", 0L);
            userSessionDuration = JsonUtils.getLong(jsonobject, "userSessionDuration", 0L);
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
        jsonobject.put("lastUserActivityTime", lastUserActivityTime);
        jsonobject.put("userSessionDuration", userSessionDuration);
        return jsonobject;
    }

    public com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.EndReason getEndReason()
    {
        return endReason;
    }

    public long getLastUserActivityTime()
    {
        return lastUserActivityTime;
    }

    public long getUserSessionDuration()
    {
        return userSessionDuration;
    }
}
