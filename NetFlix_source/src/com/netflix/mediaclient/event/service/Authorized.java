// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.service;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.service:
//            BaseServiceEvent, Service

public abstract class Authorized extends BaseServiceEvent
{

    private String accessToken;
    private Service service;

    public Authorized(String s, Service service1, String s1)
    {
        super(s);
        if (service1 == null)
        {
            throw new IllegalArgumentException("Service is null!");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("Access token is null!");
        } else
        {
            service = service1;
            accessToken = s1;
            return;
        }
    }

    public JSONObject getData()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.put("service", service.getName());
        jsonobject1.put("access_token", accessToken);
        jsonobject1.put("perm_ver", getVersion());
        jsonobject.put("type", getName());
        jsonobject.put("parameters", jsonobject1);
        return jsonobject;
    }

    public abstract int getVersion();
}
