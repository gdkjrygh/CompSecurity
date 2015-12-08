// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.jsonstore.util:
//            JSONStoreLogger

public static class stackTrace
{

    Throwable cause;
    String message;
    StackTraceElement stackTrace[];
    String tag;
    long timeLogged;
    String type;

    public JSONArray convertStackTraceElementToJSONArray(StackTraceElement astacktraceelement[])
    {
        JSONArray jsonarray = new JSONArray();
        StackTraceElement stacktraceelement;
        JSONObject jsonobject;
        int i;
        int j;
        try
        {
            j = astacktraceelement.length;
        }
        // Misplaced declaration of an exception variable
        catch (StackTraceElement astacktraceelement[])
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        stacktraceelement = astacktraceelement[i];
        jsonobject = new JSONObject();
        jsonobject.put("line", stacktraceelement.getLineNumber());
        jsonobject.put("class", stacktraceelement.getClassName());
        jsonobject.put("method", stacktraceelement.getMethodName());
        jsonobject.put("file", stacktraceelement.getFileName());
        jsonarray.put(jsonobject);
        i++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L1:
        return jsonarray;
    }

    public JSONObject convertThrowableToJSONObject(Throwable throwable)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("throwableStackTrace", convertStackTraceElementToJSONArray(throwable.getStackTrace()));
            jsonobject.put("message", throwable.getMessage());
            jsonobject.put("tag", tag);
            jsonobject.put("type", type);
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    public JSONObject convertToMetadata()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("message", message);
            jsonobject.put("time", timeLogged);
            if (cause != null)
            {
                jsonobject.put("causedBy", convertThrowableToJSONObject(cause));
            }
            jsonobject.put("stackTrace", convertStackTraceElementToJSONArray(stackTrace));
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    public (String s, String s1, String s2, Throwable throwable)
    {
        tag = s;
        type = s1;
        message = s2;
        cause = throwable;
        timeLogged = System.currentTimeMillis() / 1000L;
        stackTrace = Thread.currentThread().getStackTrace();
    }
}
