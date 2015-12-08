// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.filetransfer;

import org.json.JSONException;
import org.json.JSONObject;

public class FileUploadResult
{

    private long bytesSent;
    private String objectId;
    private String response;
    private int responseCode;

    public FileUploadResult()
    {
        bytesSent = 0L;
        responseCode = -1;
        response = null;
        objectId = null;
    }

    public long getBytesSent()
    {
        return bytesSent;
    }

    public String getObjectId()
    {
        return objectId;
    }

    public String getResponse()
    {
        return response;
    }

    public int getResponseCode()
    {
        return responseCode;
    }

    public void setBytesSent(long l)
    {
        bytesSent = l;
    }

    public void setObjectId(String s)
    {
        objectId = s;
    }

    public void setResponse(String s)
    {
        response = s;
    }

    public void setResponseCode(int i)
    {
        responseCode = i;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        return new JSONObject((new StringBuilder()).append("{bytesSent:").append(bytesSent).append(",responseCode:").append(responseCode).append(",response:").append(JSONObject.quote(response)).append(",objectId:").append(JSONObject.quote(objectId)).append("}").toString());
    }
}
