// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.model;

import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.client.model:
//            DeepErrorElement

public static class Q
{

    public static final String MESSAGE = "message";
    public static final String STACKTRACE = "stackTrace";
    private JSONObject message;
    private String stackTrace;

    public static Q createInstance(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject == null)
        {
            return null;
        } else
        {
            Q q = new <init>();
            q.stackTrace = JsonUtils.getString(jsonobject, "stackTrace", null);
            q.message = JsonUtils.getJSONObject(jsonobject, "message", null);
            return q;
        }
    }

    public JSONObject getMessage()
    {
        return message;
    }

    public String getStackTrace()
    {
        return stackTrace;
    }

    public void setMessage(JSONObject jsonobject)
    {
        message = jsonobject;
    }

    public void setStackTrace(String s)
    {
        stackTrace = s;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        if (stackTrace != null)
        {
            jsonobject.put("stackTrace", stackTrace);
        }
        if (message != null)
        {
            jsonobject.put("message", message);
        }
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Debug [stackTrace=").append(stackTrace).append(", message=").append(message).append("]").toString();
    }

    public Q()
    {
    }
}
