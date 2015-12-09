// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import android.content.Context;
import android.os.Handler;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.app.BackgroundTask;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.service.logging.customerevents.legacy.LaunchedFromDeepLink;
import com.netflix.mediaclient.service.logging.customerevents.legacy.MdpFromDeepLink;
import com.netflix.mediaclient.service.logging.customerevents.legacy.MdxLoggingManager;
import com.netflix.mediaclient.service.logging.customerevents.legacy.NotificationOptIn;
import com.netflix.mediaclient.service.webclient.UserCredentialRegistry;
import com.netflix.mediaclient.servicemgr.CustomerEventLogging;
import com.netflix.mediaclient.servicemgr.UserProfile;
import com.netflix.mediaclient.util.DeviceCategory;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            UserData, LoggingAgent

public final class LegacyCustomerEventLoggingImpl
    implements CustomerEventLogging
{

    private static final String TAG = "nf_log";
    private Context mContext;
    private MdxLoggingManager mMdxLoggingManager;
    private LoggingAgent mOwner;
    private Handler mWorkerHandler;

    LegacyCustomerEventLoggingImpl(LoggingAgent loggingagent, Context context, Handler handler)
    {
        mOwner = loggingagent;
        mContext = context;
        mWorkerHandler = handler;
        mMdxLoggingManager = new MdxLoggingManager(mWorkerHandler, mOwner);
    }

    private UserData getUserData()
    {
        UserData userdata = new UserData();
        userdata.esn = mOwner.getConfigurationAgent().getEsnProvider().getEsn();
        userdata.deviceCategory = mOwner.getConfigurationAgent().getDeviceCategory().getValue();
        userdata.netflixId = mOwner.getUser().getUserCredentialRegistry().getNetflixID();
        userdata.secureNetflixId = mOwner.getUser().getUserCredentialRegistry().getSecureNetflixID();
        userdata.userId = mOwner.getUserId();
        if (mOwner.getUser().getCurrentProfile() != null)
        {
            userdata.currentProfileUserId = mOwner.getUser().getCurrentProfile().getUserId();
        }
        userdata.accountCountry = mOwner.getUser().getReqCountry();
        userdata.accountCountry = mOwner.getUser().getGeoCountry();
        userdata.languages = mOwner.getUser().getLanguagesInCsv();
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("GetUserData: ").append(userdata).toString());
        }
        return userdata;
    }

    public void logMdxPlaybackStart(String s, String s1, String s2, int i)
    {
        mMdxLoggingManager.logPlaybackStart(s, s1, s2, i, mOwner.getUser());
    }

    public void logMdxTarget(String s, String s1, String s2, String s3)
    {
        mMdxLoggingManager.logTarget(s, s1, s2, s3, mOwner.getUser());
    }

    public void logMdxTargetSelection(String s)
    {
        mMdxLoggingManager.logTargetSelection(s, mOwner.getUser());
    }

    public void reportApplicationLaunchedFromDeepLinking(String s, String s1, String s2)
    {
        s = new LaunchedFromDeepLink(mContext, getUserData(), s, s1, s2);
        Log.d("nf_log", "Execute reportApplicationLaunchFromDeepLinking beacon...");
        (new BackgroundTask()).execute(s);
        Log.d("nf_log", "Beacon send in background");
    }

    public void reportMdpFromDeepLinking(String s)
    {
        s = new MdpFromDeepLink(mContext, getUserData(), s);
        Log.d("nf_log", "Execute reportMdpFromDeepLinking beacon...");
        (new BackgroundTask()).execute(s);
        Log.d("nf_log", "Beacon send in background");
    }

    public void reportNotificationOptIn(boolean flag, String s)
    {
        s = new NotificationOptIn(mContext, flag, s, getUserData());
        Log.d("nf_log", "Execute opt in beacon...");
        (new BackgroundTask()).execute(s);
        Log.d("nf_log", "Beacon send in background");
    }
}
