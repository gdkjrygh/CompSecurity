// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.addlive.impl:
//            Log

public class ServiceResponse
{

    private static final String gErrorCodePropertyName = "errorCode";
    private static final String gErrorMessagePropertyName = "errorMessage";
    private static final String gIdPropertyName = "id";
    private static final String gResultPropertyName = "result";
    private static final String gStatusPropertyName = "status";
    private int errorCode;
    private String errorMessage;
    private String id;
    private Object result;
    private boolean status;

    public ServiceResponse()
    {
    }

    public ServiceResponse(String s)
    {
        try
        {
            JSONObject jsonobject = new JSONObject(s);
            id = jsonobject.getString("id");
            status = jsonobject.getBoolean("status");
            errorCode = jsonobject.getInt("errorCode");
            errorMessage = jsonobject.getString("errorMessage");
            result = jsonobject.get("result");
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.e("AddLive_SDK", "Failed to parse JSON response", jsonexception);
        }
        status = false;
        errorCode = 1006;
        errorMessage = (new StringBuilder("Failed to parse AddLiveService response. This is caused by an SDK error, please report it to AddLive. Faulty input:")).append(s).toString();
    }

    public int getErrorCode()
    {
        return errorCode;
    }

    public String getErrorMessage()
    {
        return errorMessage;
    }

    public String getId()
    {
        return id;
    }

    public Object getResult()
    {
        return result;
    }

    public boolean getStatus()
    {
        return status;
    }

    public void setErrorCode(int i)
    {
        errorCode = i;
    }

    public void setErrorMessage(String s)
    {
        errorMessage = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setResult(Object obj)
    {
        result = obj;
    }

    public void setStatus(boolean flag)
    {
        status = flag;
    }
}
