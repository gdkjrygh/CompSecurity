// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.google.gson.Gson;
import com.kochava.android.tracker.Feature;
import com.mobileapptracker.MobileAppTracker;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;
import me.lyft.android.LyftApplication;
import me.lyft.android.analytics.session.AnalyticsSession;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.geo.IEtaAnalyticService;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.application.system.ILyftSystemRepository;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.logging.L;
import me.lyft.android.providers.AdvertisingIdProvider;

// Referenced classes of package me.lyft.android.analytics.trackers:
//            AnalyticsApi, AnalyticsService, AppEventTracker, GoogleEventTracker, 
//            LeanplumTracker, LogEventTracker, MixpanelWrapper, RedshiftEventTracker, 
//            RealTimeEventTracker

public class AnalyticsModule
{

    public AnalyticsModule()
    {
    }

    AnalyticsApi provideAnalyticsApi(LyftApplication lyftapplication, ILyftPreferences ilyftpreferences)
    {
        return new AnalyticsApi(lyftapplication, ilyftpreferences.getAnalyticsUrl());
    }

    AnalyticsService provideAnalyticsInitializer(AnalyticsApi analyticsapi, IDevice idevice, IUserProvider iuserprovider, GoogleEventTracker googleeventtracker, RedshiftEventTracker redshifteventtracker, AppEventTracker appeventtracker, LogEventTracker logeventtracker, 
            LeanplumTracker leanplumtracker, RealTimeEventTracker realtimeeventtracker, ILyftPreferences ilyftpreferences)
    {
        return new AnalyticsService(analyticsapi, idevice, iuserprovider, googleeventtracker, redshifteventtracker, appeventtracker, logeventtracker, leanplumtracker, realtimeeventtracker, ilyftpreferences);
    }

    AnalyticsSession provideAnalyticsSessionProvider(ILyftPreferences ilyftpreferences, IDevice idevice)
    {
        return new AnalyticsSession(ilyftpreferences, idevice);
    }

    AppEventTracker provideAppEventTracker(IEtaAnalyticService ietaanalyticservice, Feature feature, MobileAppTracker mobileapptracker, IUserSession iusersession, Gson gson, IDevice idevice, ILyftPreferences ilyftpreferences, 
            AdvertisingIdProvider advertisingidprovider, IRideRequestSession iriderequestsession, ILyftSystemRepository ilyftsystemrepository)
    {
        return new AppEventTracker(ietaanalyticservice, iusersession, iriderequestsession, feature, mobileapptracker, gson, idevice, ilyftpreferences, advertisingidprovider, ilyftsystemrepository);
    }

    GoogleEventTracker provideGoogleTracker(LyftApplication lyftapplication)
    {
        lyftapplication = GoogleAnalytics.a(lyftapplication).a(0x7f050001);
        lyftapplication.c(true);
        return new GoogleEventTracker(lyftapplication);
    }

    Feature provideKochavaAnalytics(LyftApplication lyftapplication)
    {
        return new Feature(lyftapplication, lyftapplication.getString(0x7f0701d0));
    }

    LeanplumTracker provideLeanplumTracker()
    {
        return new LeanplumTracker();
    }

    LogEventTracker provideLogEventTracker()
    {
        return new LogEventTracker();
    }

    MixpanelWrapper provideMixpanelWrapper(AnalyticsApi analyticsapi, IUserSession iusersession, ILocationService ilocationservice, ILyftPreferences ilyftpreferences, IDevice idevice, IAppForegroundDetector iappforegrounddetector, AnalyticsSession analyticssession)
    {
        return new MixpanelWrapper(analyticsapi, iusersession, ilocationservice, ilyftpreferences, idevice, iappforegrounddetector, analyticssession);
    }

    MobileAppTracker provideMobileAppTracker(LyftApplication lyftapplication, ILyftPreferences ilyftpreferences)
    {
        try
        {
            MobileAppTracker.a(lyftapplication, lyftapplication.getString(0x7f070189), lyftapplication.getString(0x7f07018a));
            lyftapplication = MobileAppTracker.a();
            ilyftpreferences.setMatId(lyftapplication.d());
        }
        // Misplaced declaration of an exception variable
        catch (LyftApplication lyftapplication)
        {
            L.e(lyftapplication, "provideMobileAppTracker failed", new Object[0]);
            return null;
        }
        return lyftapplication;
    }

    RedshiftEventTracker provideRedshiftEventTracker(MixpanelWrapper mixpanelwrapper)
    {
        return new RedshiftEventTracker(mixpanelwrapper);
    }

    RealTimeEventTracker provideRedshiftEventTracker2(AnalyticsApi analyticsapi, AnalyticsSession analyticssession, ILyftPreferences ilyftpreferences, ILocationService ilocationservice, IUserProvider iuserprovider, IRideRequestSession iriderequestsession, IDevice idevice, 
            IAppForegroundDetector iappforegrounddetector, IUserSession iusersession)
    {
        return new RealTimeEventTracker(analyticsapi, analyticssession, ilyftpreferences, ilocationservice, iuserprovider, iriderequestsession, idevice, iappforegrounddetector, iusersession);
    }
}
