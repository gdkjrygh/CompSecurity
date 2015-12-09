// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.registration;

import com.netflix.mediaclient.Log;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.registration:
//            BaseRegistrationEvent

public class ActivateEvent extends BaseRegistrationEvent
{

    private static final String ACTION_ID = "ACTION_ID";
    private static final String COMPLETE = "COMPLETE";
    public static final String NAME = "activateComplete";
    private static final String NETWORK_ERROR = "NETWORK_ERROR";
    public static final String TYPE = "activate";
    private int actionID;
    private boolean actionId;
    private String bcp47;
    private String cookies;
    private String message;
    private boolean networkError;
    private boolean ok;
    private int reasonCode;

    public ActivateEvent(JSONObject jsonobject)
        throws JSONException
    {
        super("activate", jsonobject);
    }

    public boolean failed()
    {
        return !ok;
    }

    public int getActionID()
    {
        return actionID;
    }

    public String getBcp47()
    {
        return bcp47;
    }

    public String getCookies()
    {
        return cookies;
    }

    public String getMessage()
    {
        return message;
    }

    public int getReasonCode()
    {
        return reasonCode;
    }

    public boolean isActionId()
    {
        return actionId;
    }

    public boolean isNetworkError()
    {
        return networkError;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        String s = getString(jsonobject, "result", null);
        if (Log.isLoggable("nf_event", 3))
        {
            Log.d("nf_event", (new StringBuilder()).append("Device activated as ").append(cookies).append(", status: ").append(s).toString());
        }
        if ("COMPLETE".equalsIgnoreCase(s))
        {
            Log.d("nf_event", "Activation was success");
            ok = true;
            actionId = false;
            networkError = false;
            cookies = getString(jsonobject, "cookies", null);
        } else
        {
            Log.d("nf_event", "Activation failed");
            ok = false;
            actionID = getInt(jsonobject, "actionID", 0);
            reasonCode = getInt(jsonobject, "reasonCode", 0);
            message = getString(jsonobject, "message", null);
            bcp47 = getString(jsonobject, "bcp47", null);
            if ("ACTION_ID".equalsIgnoreCase(s))
            {
                actionId = true;
                networkError = false;
                return;
            }
            if ("NETWORK_ERROR".equalsIgnoreCase(s))
            {
                actionId = false;
                networkError = true;
                return;
            }
        }
    }
}
