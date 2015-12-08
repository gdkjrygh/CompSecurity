// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service.config;

import com.connectsdk.core.Util;
import org.json.JSONException;
import org.json.JSONObject;

public class ServiceConfig
{

    private long lastDetected;
    private String serviceUUID;

    public ServiceConfig(String s)
    {
        lastDetected = 0x7fffffffffffffffL;
        serviceUUID = s;
    }

    public void detect()
    {
        lastDetected = Util.getTime();
    }

    public long getLastDetected()
    {
        return lastDetected;
    }

    public String getServiceUUID()
    {
        return serviceUUID;
    }

    public void setLastDetected(long l)
    {
        lastDetected = l;
    }

    public JSONObject toJSONObject()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("class", getClass().toString());
            jsonobject.put("lastDetection", lastDetected);
            jsonobject.put("UUID", serviceUUID);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }

    public String toString()
    {
        return serviceUUID;
    }
}
