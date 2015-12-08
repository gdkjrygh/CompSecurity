// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid;

import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid:
//            Response

public class RESTResponse
    implements Response
{

    private String errorCode;
    private String errorMessage;
    private JSONObject jsonObj;
    private String rawResponse;
    private String stat;

    public RESTResponse(String s)
    {
        rawResponse = s;
        parse(rawResponse);
    }

    public JSONObject getData()
    {
        return jsonObj;
    }

    public String getErrorCode()
    {
        return errorCode;
    }

    public String getErrorMessage()
    {
        return errorMessage;
    }

    public String getRawResponse()
    {
        return rawResponse;
    }

    public String getStat()
    {
        return stat;
    }

    public boolean isError()
    {
        return errorCode != null;
    }

    public void parse(String s)
    {
        rawResponse = s;
        jsonObj = new JSONObject(s);
        stat = jsonObj.getString("stat");
        if (!"ok".equals(stat) && "fail".equals(stat))
        {
            errorCode = jsonObj.getString("code");
            errorMessage = jsonObj.getString("message");
        }
    }
}
