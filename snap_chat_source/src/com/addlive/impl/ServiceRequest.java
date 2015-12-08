// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.addlive.impl:
//            Log

public class ServiceRequest
{

    private static final String gIdPropertyName = "id";
    private static final String gMethodPropertyName = "methodName";
    private static final String gParamsPropertyName = "params";
    private JSONArray params;
    private JSONObject storage;

    public ServiceRequest(String s)
    {
        try
        {
            storage = new JSONObject();
            storage.put("methodName", s);
            params = new JSONArray();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("AddLive_SDK", "Failed to create service request json", s);
        }
    }

    public String getMethod()
    {
        String s;
        try
        {
            s = storage.getString("methodName");
        }
        catch (JSONException jsonexception)
        {
            return "undefined";
        }
        return s;
    }

    public JSONArray getParams()
    {
        return params;
    }

    public void setId(String s)
    {
        try
        {
            storage.put("id", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("AddLive_SDK", "Failed to create service request json", s);
        }
    }

    public String toJSON()
    {
        storage.put("params", params);
        return storage.toString();
    }
}
