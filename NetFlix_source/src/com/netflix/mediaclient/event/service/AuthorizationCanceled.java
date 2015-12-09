// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.service;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.service:
//            BaseServiceEvent, Service

public class AuthorizationCanceled extends BaseServiceEvent
{

    public static final String TYPE = "nrdp-service-authorize-didcancelauthorize";
    protected Service service;

    public AuthorizationCanceled(Service service1)
    {
        super("nrdp-service-authorize-didcancelauthorize");
        if (service1 == null)
        {
            throw new IllegalArgumentException("Service is null!");
        } else
        {
            service = service1;
            return;
        }
    }

    public JSONObject getData()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("service", service.getName());
        jsonobject.put("nrdp-service-authorize-didcancelauthorize", getName());
        return jsonobject;
    }
}
