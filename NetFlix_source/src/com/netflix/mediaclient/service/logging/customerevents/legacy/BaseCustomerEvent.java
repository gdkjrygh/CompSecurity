// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.customerevents.legacy;

import android.content.Context;
import com.netflix.mediaclient.service.logging.UserData;
import com.netflix.mediaclient.util.AndroidManifestUtils;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.webapi.AuthorizationCredentials;
import com.netflix.mediaclient.webapi.CommonRequestParameters;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseCustomerEvent
{

    protected static final String DATA = "data";
    protected static final String DATA_APP_VERSION = "app_version";
    protected static final String DATA_COUNTRY = "country";
    protected static final String DATA_DEEPLINK_MSG_PARAMS = "deeplinkMsgParams";
    protected static final String DATA_DEVICETOKEN = "deviceToken";
    protected static final String DATA_DEVICE_CAT = "device_cat";
    protected static final String DATA_DEVICE_TYPE = "device_type";
    protected static final String DATA_GEOLOCATION_COUNTRY = "geolocation_country";
    protected static final String DATA_LANGUAGES = "languages";
    protected static final String DATA_LOGGEDIN = "loggedIn";
    protected static final String DATA_NETFLIX_ID = "netflixId";
    protected static final String DATA_OS_VERSION = "os_version";
    protected static final String DATA_PUSHOPTSTATUS = "pushOptStatus";
    protected static final String DATA_SECURE_NETFLIX_ID = "secureNetflixId";
    protected static final String DATA_SOURCE = "source";
    protected static final String DATA_TIMESTAMP = "timestamp";
    protected static final String DATA_UI_VERSION = "ui_version";
    protected static final String DATA_USER_ID = "user_id";
    protected static final String ESN = "Esn";
    protected static final String EVENT_NAME = "EventName";
    protected static final String EVENT_TIME = "EventTime";
    protected static final String TAG = "nf_rest";
    protected static final String VALUE_SOURCE_PN = "pn";
    protected UserData mUser;

    protected BaseCustomerEvent(UserData userdata)
    {
        mUser = userdata;
    }

    protected static void addIfNotNull(JSONObject jsonobject, String s, String s1)
        throws JSONException
    {
        if (s1 != null)
        {
            jsonobject.put(s, s1);
        }
    }

    protected CommonRequestParameters getCommonRequestParameters(Context context)
    {
        CommonRequestParameters commonrequestparameters = CommonRequestParameters.getInstanceWithCredentials();
        commonrequestparameters.userId = mUser.currentProfileUserId;
        commonrequestparameters.osVersion = String.valueOf(AndroidUtils.getAndroidVersion());
        commonrequestparameters.deviceCategory = mUser.deviceCategory;
        commonrequestparameters.appVersion = AndroidManifestUtils.getVersion(context);
        commonrequestparameters.uiVersion = commonrequestparameters.appVersion;
        commonrequestparameters.country = mUser.accountCountry;
        commonrequestparameters.geolocationCountry = mUser.geoLocationCountry;
        commonrequestparameters.languages = mUser.languages;
        return commonrequestparameters;
    }

    protected JSONObject getEvent(String s, CommonRequestParameters commonrequestparameters, AuthorizationCredentials authorizationcredentials, long l, String s1)
        throws JSONException
    {
        s = new JSONObject();
        addIfNotNull(s, "user_id", commonrequestparameters.userId);
        addIfNotNull(s, "app_version", commonrequestparameters.appVersion);
        addIfNotNull(s, "os_version", commonrequestparameters.osVersion);
        addIfNotNull(s, "ui_version", commonrequestparameters.uiVersion);
        s.put("timestamp", l);
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
        if (StringUtils.isNotEmpty(s1))
        {
            addIfNotNull(s, "deeplinkMsgParams", s1);
        }
        return s;
    }
}
