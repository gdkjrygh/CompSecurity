// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm.model;

import com.netflix.mediaclient.service.logging.client.model.DeviceUniqueId;
import com.netflix.mediaclient.service.logging.client.model.SessionEndedEvent;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class UIBrowseStartupSessionEndedEvent extends SessionEndedEvent
{

    public static final String ERROR = "error";
    public static final String SUCCESS = "success";
    public static final String TIME_TO_BROWSE_INTERACTIVE = "timeToBrowseInteractive";
    private static final String UI_BROWSE_STARTUP_SESSION_NAME = "uiBrowseStartup";
    private UIError error;
    private boolean success;
    private long timeToBrowseInteractive;

    public UIBrowseStartupSessionEndedEvent(long l, long l1)
    {
        super("uiBrowseStartup", new DeviceUniqueId(), l);
        success = true;
        timeToBrowseInteractive = l1;
    }

    public UIBrowseStartupSessionEndedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        success = true;
        jsonobject = JsonUtils.getJSONObject(jsonobject, "data", null);
        if (jsonobject != null)
        {
            success = JsonUtils.getBoolean(jsonobject, "success", true);
            error = UIError.createInstance(JsonUtils.getJSONObject(jsonobject, "error", null));
            timeToBrowseInteractive = JsonUtils.getLong(jsonobject, "timeToBrowseInteractive", 0L);
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
        jsonobject.put("success", success);
        jsonobject.put("timeToBrowseInteractive", timeToBrowseInteractive);
        if (error != null)
        {
            jsonobject.put("error", error.toJSONObject());
        }
        return jsonobject;
    }

    public UIError getError()
    {
        return error;
    }

    public long getTimeToBrowseInteractive()
    {
        return timeToBrowseInteractive;
    }

    public boolean isSuccess()
    {
        return success;
    }

    public void setError(UIError uierror)
    {
        error = uierror;
    }

    public void setSuccess(boolean flag)
    {
        success = flag;
    }

    public void setTimeToBrowseInteractive(long l)
    {
        timeToBrowseInteractive = l;
    }
}
