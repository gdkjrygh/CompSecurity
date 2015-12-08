// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import android.content.Context;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.app.BackgroundTask;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.service.logging.cmpevents.legacy.NotificationFeedback;
import com.netflix.mediaclient.service.pushnotification.MessageData;
import com.netflix.mediaclient.service.pushnotification.UserFeedbackOnReceivedPushNotification;
import com.netflix.mediaclient.service.webclient.UserCredentialRegistry;
import com.netflix.mediaclient.servicemgr.CmpEventLogging;
import com.netflix.mediaclient.servicemgr.UserProfile;
import com.netflix.mediaclient.util.DeviceCategory;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            UserData, LoggingAgent

public final class LegacyCmpEventLoggingImpl
    implements CmpEventLogging
{

    private static final String TAG = "nf_log";
    private Context mContext;
    private LoggingAgent mOwner;

    LegacyCmpEventLoggingImpl(LoggingAgent loggingagent, Context context)
    {
        mOwner = loggingagent;
        mContext = context;
    }

    private UserData getUserData()
    {
        UserData userdata = new UserData();
        userdata.esn = mOwner.getConfigurationAgent().getEsnProvider().getEsn();
        userdata.deviceCategory = mOwner.getConfigurationAgent().getDeviceCategory().getValue();
        Object obj = mOwner.getUser();
        if (obj == null)
        {
            Log.w("nf_log", "User agent should not be null here!");
            obj = null;
        } else
        {
            Object obj1 = ((com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface) (obj)).getUserCredentialRegistry();
            if (obj1 != null)
            {
                userdata.netflixId = ((UserCredentialRegistry) (obj1)).getNetflixID();
                userdata.secureNetflixId = ((UserCredentialRegistry) (obj1)).getSecureNetflixID();
            }
            userdata.userId = mOwner.getUserId();
            obj1 = ((com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface) (obj)).getCurrentProfile();
            if (obj1 != null)
            {
                userdata.currentProfileUserId = ((UserProfile) (obj1)).getUserId();
            }
            userdata.accountCountry = ((com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface) (obj)).getReqCountry();
            userdata.accountCountry = ((com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface) (obj)).getGeoCountry();
            userdata.languages = ((com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface) (obj)).getLanguagesInCsv();
            obj = userdata;
            if (Log.isLoggable("nf_log", 3))
            {
                Log.d("nf_log", (new StringBuilder()).append("GetUserData: ").append(userdata).toString());
                return userdata;
            }
        }
        return ((UserData) (obj));
    }

    public void reportUserFeedbackOnReceivedPushNotification(MessageData messagedata, UserFeedbackOnReceivedPushNotification userfeedbackonreceivedpushnotification)
    {
        messagedata = new NotificationFeedback(mContext, messagedata, userfeedbackonreceivedpushnotification, getUserData());
        Log.d("nf_log", "Execute feedback beacon...");
        (new BackgroundTask()).execute(messagedata);
        Log.d("nf_log", "Beacon send in background");
    }
}
