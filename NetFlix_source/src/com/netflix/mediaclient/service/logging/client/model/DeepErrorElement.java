// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.model;

import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class DeepErrorElement
{
    public static class Debug
    {

        public static final String MESSAGE = "message";
        public static final String STACKTRACE = "stackTrace";
        private JSONObject message;
        private String stackTrace;

        public static Debug createInstance(JSONObject jsonobject)
            throws JSONException
        {
            if (jsonobject == null)
            {
                return null;
            } else
            {
                Debug debug1 = new Debug();
                debug1.stackTrace = JsonUtils.getString(jsonobject, "stackTrace", null);
                debug1.message = JsonUtils.getJSONObject(jsonobject, "message", null);
                return debug1;
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

        public Debug()
        {
        }
    }


    public static final String DEBUG = "debug";
    public static final String ERROR_CODE = "errorCode";
    public static final String FATAL = "fatal";
    private Debug debug;
    private String errorCode;
    private boolean fatal;

    public DeepErrorElement()
    {
    }

    public static DeepErrorElement createInstance(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject == null)
        {
            return null;
        } else
        {
            DeepErrorElement deeperrorelement = new DeepErrorElement();
            deeperrorelement.debug = Debug.createInstance(JsonUtils.getJSONObject(jsonobject, "debug", null));
            deeperrorelement.errorCode = JsonUtils.getString(jsonobject, "errorCode", null);
            deeperrorelement.fatal = JsonUtils.getBoolean(jsonobject, "fatal", false);
            return deeperrorelement;
        }
    }

    public Debug getDebug()
    {
        return debug;
    }

    public String getErrorCode()
    {
        return errorCode;
    }

    public boolean isFatal()
    {
        return fatal;
    }

    public void setDebug(Debug debug1)
    {
        debug = debug1;
    }

    public void setErrorCode(String s)
    {
        errorCode = s;
    }

    public void setFatal(boolean flag)
    {
        fatal = flag;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        if (debug != null)
        {
            jsonobject.put("debug", debug.toJSONObject());
        }
        if (errorCode != null)
        {
            jsonobject.put("errorCode", errorCode);
        }
        jsonobject.put("fatal", fatal);
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("DeepErrorElement [errorCode=").append(errorCode).append(", fatal=").append(fatal).append(", debug=").append(debug).append("]").toString();
    }
}
