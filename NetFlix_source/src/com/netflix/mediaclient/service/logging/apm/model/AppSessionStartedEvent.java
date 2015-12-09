// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm.model;

import com.netflix.mediaclient.service.logging.client.model.SessionStartedEvent;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class AppSessionStartedEvent extends SessionStartedEvent
{

    private static final String APP_SESSION_NAME = "appSession";
    public static final String LAST_SHUTDOWN_GRACEFUL = "lastShutdownGraceful";
    private boolean lastShutdownGraceful;

    public AppSessionStartedEvent()
    {
        super("appSession");
        lastShutdownGraceful = true;
    }

    public AppSessionStartedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        lastShutdownGraceful = true;
        jsonobject = JsonUtils.getJSONObject(jsonobject, "data", null);
        if (jsonobject != null)
        {
            lastShutdownGraceful = JsonUtils.getBoolean(jsonobject, "lastShutdownGraceful", true);
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
        jsonobject.put("lastShutdownGraceful", lastShutdownGraceful);
        return jsonobject;
    }

    public boolean isLastShutdownGraceful()
    {
        return lastShutdownGraceful;
    }

    public void setLastShutdownGraceful(boolean flag)
    {
        lastShutdownGraceful = flag;
    }
}
