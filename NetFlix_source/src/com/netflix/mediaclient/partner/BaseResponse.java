// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.partner;

import android.content.ComponentName;
import com.netflix.mediaclient.Log;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.partner:
//            Response

public abstract class BaseResponse
    implements Response
{

    public static final int RESULT_FAILURE = 1;
    public static final int RESULT_NOUSER = 2;
    public static final int RESULT_OK = 0;
    public static final int RESULT_USERCANCEL = 3;
    public static final String RESULT_errcode = "errcode";
    public static final String RESULT_idx = "idx";
    public static final String RESULT_msg = "msg";
    public static final String RESULT_service = "service";
    public static final String RESULT_status = "status";
    public static final String RESULT_token = "token";
    public static final String RESULT_userid = "userid";
    protected String id;
    protected ComponentName originator;
    protected String service;

    BaseResponse(String s, String s1)
    {
    }

    BaseResponse(String s, String s1, ComponentName componentname)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Service is null");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("Session id is null");
        } else
        {
            service = s;
            id = s1;
            originator = componentname;
            return;
        }
    }

    public static String noNull(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        return s1;
    }

    public static JSONObject toJSon(String s)
    {
        if (s == null)
        {
            return null;
        }
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject(s);
        }
        catch (Exception exception)
        {
            Log.e("", (new StringBuilder()).append("Failed to convert ").append(s).append(" to JSON!").toString(), exception);
            return null;
        }
        return jsonobject;
    }

    public String getId()
    {
        return id;
    }

    protected JSONObject getJson()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("idx", id);
        jsonobject.put("service", service);
        return jsonobject;
    }

    public ComponentName getResponder()
    {
        return originator;
    }

    public String getService()
    {
        return service;
    }
}
