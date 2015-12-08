// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.cmpevents.legacy;

import android.content.Context;
import com.netflix.mediaclient.service.logging.UserData;
import com.netflix.mediaclient.util.AndroidManifestUtils;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.webapi.CommonRequestParameters;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseCmpEvent
{

    protected static final String DATA = "data";
    protected static final String DATA_ACCOUNT_COUNTRY = "accountCountry";
    protected static final String DATA_ACTION = "action";
    protected static final String DATA_APP_NAME = "appName";
    protected static final String DATA_APP_VERSION = "app_version";
    protected static final String DATA_DEVICE_CAT = "device_cat";
    protected static final String DATA_DEVICE_TYPE = "device_type";
    protected static final String DATA_ESN = "esn";
    protected static final String DATA_EVENTS = "events";
    protected static final String DATA_GEOLOCATION_COUNTRY = "geolocation_country";
    protected static final String DATA_LANGUAGES = "languages";
    protected static final String DATA_NAME = "name";
    protected static final String DATA_NETFLIX_ID = "netflixId";
    protected static final String DATA_ORIENTATION = "orientation";
    protected static final String DATA_OS_VERSION = "os_version";
    protected static final String DATA_SECURE_NETFLIX_ID = "secureNetflixId";
    protected static final String DATA_SENDER_APP = "senderApp";
    protected static final String DATA_TIME = "time";
    protected static final String DATA_UI_VERSION = "ui_version";
    protected static final String DATA_USER_ID = "user_id";
    protected static final String TAG = "nf_rest";
    protected static final String VALUE_APP_NAME = "Android";
    protected UserData mUser;

    public BaseCmpEvent(UserData userdata)
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
}
