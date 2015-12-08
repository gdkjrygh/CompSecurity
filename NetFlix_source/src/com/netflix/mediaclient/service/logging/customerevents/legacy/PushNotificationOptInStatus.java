// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.customerevents.legacy;

import com.netflix.mediaclient.webapi.AuthorizationCredentials;
import com.netflix.mediaclient.webapi.CommonRequestParameters;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.customerevents.legacy:
//            BaseCustomerEvent

public final class PushNotificationOptInStatus extends BaseCustomerEvent
{

    private static final String NAME = "UI Push Notification Opt-In Status";
    protected JSONArray event;

    public PushNotificationOptInStatus(String s, CommonRequestParameters commonrequestparameters, String s1, boolean flag, boolean flag1, AuthorizationCredentials authorizationcredentials)
        throws JSONException
    {
        super(null);
        long l = System.currentTimeMillis();
        event = new JSONArray();
        JSONObject jsonobject = new JSONObject();
        event.put(jsonobject);
        jsonobject.put("EventName", "UI Push Notification Opt-In Status");
        jsonobject.put("EventTime", l);
        jsonobject.put("Esn", s);
        s = new JSONObject();
        jsonobject.put("data", s);
        addIfNotNull(s, "user_id", commonrequestparameters.userId);
        addIfNotNull(s, "app_version", commonrequestparameters.appVersion);
        addIfNotNull(s, "os_version", commonrequestparameters.osVersion);
        addIfNotNull(s, "ui_version", commonrequestparameters.uiVersion);
        addIfNotNull(s, "deviceToken", s1);
        s.put("pushOptStatus", flag);
        s.put("loggedIn", flag1);
        s.put("timestamp", l);
        s.put("source", "pn");
        addIfNotNull(s, "device_cat", commonrequestparameters.deviceCategory);
        addIfNotNull(s, "device_type", commonrequestparameters.deviceType);
        addIfNotNull(s, "country", commonrequestparameters.country);
        addIfNotNull(s, "geolocation_country", commonrequestparameters.geolocationCountry);
        addIfNotNull(s, "languages", commonrequestparameters.languages);
        if (authorizationcredentials != null)
        {
            addIfNotNull(s, "netflixId", authorizationcredentials.netflixId);
            addIfNotNull(s, "secureNetflixId", authorizationcredentials.secureNetflixId);
        }
    }

    public String toString()
    {
        return event.toString();
    }
}
