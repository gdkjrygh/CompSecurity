// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.model;

import com.netflix.mediaclient.util.JsonUtils;
import com.netflix.mediaclient.util.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.client.model:
//            Event, DeviceUniqueId

public abstract class SessionEvent extends Event
{

    public static final String CATEGORY_VALUE = "uiQOE";
    public static final String SESSION_ID = "sessionId";
    public static final String SESSION_NAME = "sessionName";
    protected DeviceUniqueId sessionId;
    protected transient String sessionName;

    public SessionEvent(String s)
    {
        if (StringUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Seasssion name can not be null!");
        } else
        {
            category = "uiQOE";
            sessionName = s;
            return;
        }
    }

    public SessionEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        sessionId = new DeviceUniqueId(JsonUtils.getLong(jsonobject, "sessionId", 0L));
        sessionName = JsonUtils.getString(jsonobject, "sessionName", null);
    }

    public DeviceUniqueId getSessionId()
    {
        return sessionId;
    }

    public String getSessionName()
    {
        return sessionName;
    }

    public void setSessionId(DeviceUniqueId deviceuniqueid)
    {
        sessionId = deviceuniqueid;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONObject jsonobject = super.toJSONObject();
        if (sessionName != null)
        {
            jsonobject.put("sessionName", sessionName);
        }
        if (sessionId != null)
        {
            jsonobject.put("sessionId", sessionId.getValue());
        }
        return jsonobject;
    }
}
