// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.customerevents.legacy;

import android.content.Context;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.UserData;
import com.netflix.mediaclient.util.AndroidManifestUtils;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.webapi.AuthorizationCredentials;
import com.netflix.mediaclient.webapi.CommonRequestParameters;

// Referenced classes of package com.netflix.mediaclient.service.logging.customerevents.legacy:
//            PushNotificationOptInStatus, CustomerEventCommand

public class NotificationOptIn
    implements Runnable
{

    private static final String TAG = "nf_rest";
    private Context mContext;
    private String mDeviceToken;
    private boolean mOptIn;
    private UserData mUser;

    public NotificationOptIn(Context context, boolean flag, String s, UserData userdata)
    {
        mContext = context;
        mOptIn = flag;
        mDeviceToken = s;
        mUser = userdata;
    }

    protected CommonRequestParameters getCommonRequestParameters(Context context, UserData userdata)
    {
        CommonRequestParameters commonrequestparameters = CommonRequestParameters.getInstanceWithCredentials();
        commonrequestparameters.userId = userdata.currentProfileUserId;
        commonrequestparameters.osVersion = String.valueOf(AndroidUtils.getAndroidVersion());
        commonrequestparameters.deviceCategory = mUser.deviceCategory;
        commonrequestparameters.appVersion = AndroidManifestUtils.getVersion(context);
        commonrequestparameters.uiVersion = commonrequestparameters.appVersion;
        commonrequestparameters.country = userdata.accountCountry;
        commonrequestparameters.geolocationCountry = userdata.geoLocationCountry;
        commonrequestparameters.languages = userdata.languages;
        return commonrequestparameters;
    }

    public void run()
    {
        try
        {
            Object obj = new AuthorizationCredentials(mUser.netflixId, mUser.secureNetflixId);
            Object obj1 = getCommonRequestParameters(mContext, mUser);
            obj1 = new PushNotificationOptInStatus(mUser.esn, ((CommonRequestParameters) (obj1)), mDeviceToken, mOptIn, true, ((AuthorizationCredentials) (obj)));
            obj = new CustomerEventCommand(mUser.esn, ((AuthorizationCredentials) (obj)), ((PushNotificationOptInStatus) (obj1)).toString());
            Log.d("nf_rest", "Executing NotificationOptInCommand WebAPI call start");
            obj = ((CustomerEventCommand) (obj)).execute();
            Log.d("nf_rest", "Executing NotificationOptInCommand WebAPI call done");
            Log.d("nf_rest", (new StringBuilder()).append("NotificationOptInCommand response: ").append(((String) (obj))).toString());
            return;
        }
        catch (Throwable throwable)
        {
            Log.e("nf_rest", "Failed to execute both WebAPI call!", throwable);
        }
    }
}
