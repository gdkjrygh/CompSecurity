// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import android.os.Bundle;
import com.google.android.gms.gcm.GcmListenerService;
import com.google.gson.Gson;
import java.util.Iterator;
import java.util.Set;
import me.lyft.android.IAppStateHandler;
import me.lyft.android.IUserSession;
import me.lyft.android.LyftApplication;
import me.lyft.android.analytics.studies.PushNotificationAnalytics;
import me.lyft.android.common.Strings;
import me.lyft.android.development.DeveloperTools;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.logging.L;
import me.lyft.android.notifications.IStatusBarNotificationsService;

// Referenced classes of package me.lyft.android.services:
//            AppService

public class GcmService extends GcmListenerService
{

    private static final String EVENT_PARAM = "event";
    private static final String HIDE_MESSAGE_EVENT = "clear_all_messages";
    private static final String PUSH_ID_PARAM = "push_id";
    private static final String RIDE_PARAM = "ride";
    private static final String RIDE_UPDATE_EVENT = "rideUpdate";
    private static final String SHOW_MESSAGE_EVENT = "message";
    private static final String START_SERVICE_EVENT = "start_service";
    private static final String TIMESTAMP_PARAM = "timestamp";
    private static final String USER_PARAM = "user";
    IAppStateHandler appStateHandler;
    DeveloperTools developerTools;
    Gson gson;
    IStatusBarNotificationsService statusBarNotificationsService;
    IUserSession userSession;

    public GcmService()
    {
    }

    private AppStateDTO cloneAppState()
    {
        return (AppStateDTO)gson.a(gson.a(userSession.getAppState()), me/lyft/android/infrastructure/lyft/AppStateDTO);
    }

    private RideDTO getRide(Bundle bundle, AppStateDTO appstatedto)
    {
        bundle = bundle.getString("ride");
        if (!Strings.isNullOrEmpty(bundle))
        {
            appstatedto = (RideDTO)gson.a(bundle, me/lyft/android/infrastructure/lyft/ride/RideDTO);
            bundle = appstatedto;
            if (appstatedto.isNull())
            {
                bundle = null;
            }
            return bundle;
        } else
        {
            return appstatedto.getRide();
        }
    }

    private UserDTO getUser(Bundle bundle, AppStateDTO appstatedto)
    {
        bundle = bundle.getString("user");
        if (!Strings.isNullOrEmpty(bundle))
        {
            return (UserDTO)gson.a(bundle, me/lyft/android/infrastructure/lyft/profile/UserDTO);
        } else
        {
            return appstatedto.user;
        }
    }

    private void handleRideUpdateEvent(Bundle bundle)
    {
        try
        {
            AppStateDTO appstatedto = cloneAppState();
            bundle = new AppStateDTO((Long)gson.a(bundle.getString("timestamp"), java/lang/Long), appstatedto.preTimestamp, getUser(bundle, appstatedto), appstatedto.ride, appstatedto.topDestinations, getRide(bundle, appstatedto), appstatedto.system, appstatedto.appInfo, appstatedto.banners, appstatedto.rideTypes, appstatedto.preRideInfo, appstatedto.marker, appstatedto.markerDestination, appstatedto.contributorRequests, appstatedto.prefillLocations);
            appStateHandler.setAppState(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            L.e(bundle, "handleRideUpdateEvent", new Object[0]);
        }
    }

    private void handleStartServiceEvent()
    {
        AppService.start(this);
    }

    public LyftApplication getLyftApplication()
    {
        return (LyftApplication)getApplicationContext();
    }

    public void onCreate()
    {
        super.onCreate();
        getLyftApplication().inject(this);
    }

    public void onMessageReceived(String s, Bundle bundle)
    {
        super.onMessageReceived(s, bundle);
        if (!bundle.isEmpty())
        {
            Object obj = bundle.keySet();
            if (developerTools.isDeveloperMode())
            {
                s = new StringBuilder();
                String s1;
                String s2;
                for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.append(" ").append(s1).append(": ").append(s2))
                {
                    s1 = (String)((Iterator) (obj)).next();
                    s2 = bundle.get(s1).toString();
                }

                L.d((new StringBuilder()).append("onMessage: ").append(s.toString()).toString(), new Object[0]);
            }
            s = bundle.getString("event");
            PushNotificationAnalytics.trackPushReceived(bundle.getString("push_id"), s);
            if (!Strings.isNullOrEmpty(s))
            {
                if (s.equalsIgnoreCase("rideUpdate"))
                {
                    handleRideUpdateEvent(bundle);
                    return;
                }
                if (s.equalsIgnoreCase("message"))
                {
                    statusBarNotificationsService.showMessage(this, bundle);
                    return;
                }
                if (s.equalsIgnoreCase("clear_all_messages"))
                {
                    statusBarNotificationsService.hideMessage(bundle);
                    return;
                }
                if (s.equalsIgnoreCase("start_service"))
                {
                    handleStartServiceEvent();
                    return;
                }
            }
        }
    }
}
