// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.Translator;
import com.skype.TranslatorImpl;
import com.skype.android.ads.AdManager;
import com.skype.android.ads.AdPlacer;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.analytics.FlurryAccess;
import com.skype.android.analytics.SkypeTelemetryProviderFactory;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.mnv.MnvAnalytics;
import com.skype.android.app.token.SkypeTokenAccess;
import com.skype.android.app.token.SkypeTokenRequest;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.concurrent.ConditionalHandlerAsyncService;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.config.LoggingConfig;
import com.skype.android.config.ecs.EcsClient;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.config.ecs.SkyLibEcsClient;
import com.skype.android.crash.CrashReporter;
import com.skype.android.crash.HockeyAppCrashReporter;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;
import com.skype.android.inject.AccountProvider;
import com.skype.android.push.PushManager;
import com.skype.android.push.PushManagerProvider;
import com.skype.android.ringtone.RingtoneDbHelper;
import com.skype.android.ringtone.RingtoneStorage;
import com.skype.android.skylib.InitializerConfiguration;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.skylib.ObjectIdReflectedMap;
import com.skype.android.skylib.PcmHostCallback;
import com.skype.android.skylib.SkyLibInitializer;
import com.skype.android.sync.ContactIngestionTokenRequest;
import com.skype.android.sync.ContactsIngestTask;
import com.skype.android.sync.LegacyContactsIngestTaskImpl;
import com.skype.android.sync.SkyLibContactsIngest;
import com.skype.android.telemetry.SCTManager;
import com.skype.android.text.SegoeTypeFaceFactory;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.text.TypeFaceTextStyleCallback;
import com.skype.android.update.UpdateManager;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.HttpUtil;
import com.skype.android.util.HttpUtilImpl;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.SpanUtil;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.video.UnifiedVideoHostInitializer;
import com.skype.data.clienttelemetry.NotImplementedException;
import com.skype.data.clienttelemetry.TelemetryManager;
import com.skype.pcmhost.PcmHost;
import com.skype.telemetry.TelemetryProviderFactory;
import com.skype.telemetry.sdk.FlurryAccessInterface;
import java.io.File;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android:
//            SkypeApplication, SkyLibSetup

public class SkypeModule
{

    public SkypeModule()
    {
    }

    static Account a(AccountProvider accountprovider)
    {
        return accountprovider.get();
    }

    static SkyLib a(Application application, AnalyticsPersistentStorage analyticspersistentstorage)
    {
        InitializerConfiguration initializerconfiguration = new InitializerConfiguration();
        initializerconfiguration.a(((SkypeApplication)application).c());
        initializerconfiguration.b(application.getFilesDir().getAbsolutePath());
        initializerconfiguration.a(new SkyLibSetup());
        initializerconfiguration.a(new UnifiedVideoHostInitializer());
        initializerconfiguration.a(ApplicationConfig.getInstance().getLoggingConfig().saveCorelibLogs());
        initializerconfiguration.g();
        initializerconfiguration.c("2015-12-01-129");
        initializerconfiguration.i();
        analyticspersistentstorage = SkyLibInitializer.a().a(application, initializerconfiguration, analyticspersistentstorage);
        analyticspersistentstorage.setLocalizedString(com.skype.SkyLib.LOCALIZED_STRING.LOCALIZED_UPGRADE_MESSAGE_IN_P2P, application.getString(0x7f080407));
        return analyticspersistentstorage;
    }

    static Translator a(Application application, SkyLib skylib, ObjectIdMap objectidmap)
    {
        TranslatorImpl translatorimpl = new TranslatorImpl();
        skylib.getTranslator(1, translatorimpl);
        translatorimpl.registerTranslatorAppId("30000000000000020000020000E0000D");
        translatorimpl.setDisclosureTexts(application.getResources().getStringArray(0x7f0a000d), application.getResources().getStringArray(0x7f0a000e));
        objectidmap.b(translatorimpl);
        objectidmap.a(translatorimpl);
        return translatorimpl;
    }

    static SkypeTokenAccess a(SkypeTokenRequest skypetokenrequest)
    {
        return skypetokenrequest;
    }

    static PushManager a(PushManagerProvider pushmanagerprovider)
    {
        return pushmanagerprovider.get();
    }

    static ObjectIdMap a(SkyLib skylib)
    {
        return new ObjectIdReflectedMap(skylib);
    }

    static SkyLibInitializer a()
    {
        return SkyLibInitializer.a();
    }

    static ContactsIngestTask a(Context context, SkyLib skylib, EcsConfiguration ecsconfiguration, AccountProvider accountprovider, ContactIngestionTokenRequest contactingestiontokenrequest, NetworkUtil networkutil, MnvAnalytics mnvanalytics, ContactUtil contactutil)
    {
        if (ecsconfiguration.isEASIngestEnabled())
        {
            return new SkyLibContactsIngest(context, skylib, mnvanalytics);
        } else
        {
            return new LegacyContactsIngestTaskImpl(context, accountprovider, contactingestiontokenrequest, networkutil, mnvanalytics, contactutil);
        }
    }

    static TypeFaceFactory a(Application application)
    {
        return new SegoeTypeFaceFactory(application);
    }

    static TypeFaceTextStyleCallback a(TypeFaceFactory typefacefactory)
    {
        return new TypeFaceTextStyleCallback(typefacefactory);
    }

    static SpanUtil a(Context context)
    {
        return new SpanUtil(context);
    }

    static TimeAnomalyTelemetry a(Application application, SCTManager sctmanager, EcsClient ecsclient, NetworkUtil networkutil, AnalyticsPersistentStorage analyticspersistentstorage, SkyLib skylib)
    {
        return new TimeAnomalyTelemetry(application, sctmanager, ecsclient, networkutil, analyticspersistentstorage, skylib);
    }

    static PcmHost a(SkyLibInitializer skylibinitializer)
    {
        return skylibinitializer.d();
    }

    static TelemetryProviderFactory a(Application application, AsyncService asyncservice, FlurryAccessInterface flurryaccessinterface, AccountProvider accountprovider, EcsConfiguration ecsconfiguration)
    {
        return new SkypeTelemetryProviderFactory(application, asyncservice, flurryaccessinterface, accountprovider, ecsconfiguration);
    }

    static AnalyticsPersistentStorage b(Application application)
    {
        return new AnalyticsPersistentStorage(application);
    }

    static LayoutExperience b(Context context)
    {
        return new LayoutExperience(context);
    }

    static EcsClient b(SkyLib skylib)
    {
        return new SkyLibEcsClient(skylib);
    }

    static EventBus b()
    {
        return EventBusInstance.a();
    }

    static PcmHostCallback b(SkyLibInitializer skylibinitializer)
    {
        return skylibinitializer.e();
    }

    static ApplicationConfig c()
    {
        return ApplicationConfig.getInstance();
    }

    static RingtoneStorage c(Application application)
    {
        return new RingtoneDbHelper(application);
    }

    static SCTManager c(SkyLib skylib)
    {
        Logger logger = Logger.getLogger("SCTManager");
        try
        {
            skylib = new TelemetryManager(skylib.getClientTelemetry());
            skylib.a();
            skylib = skylib.b();
            logger.info("Telemetry initialized");
            skylib = new SCTManager(skylib, logger);
        }
        // Misplaced declaration of an exception variable
        catch (SkyLib skylib)
        {
            logger.warning("Telemetry initialization failed");
            return null;
        }
        return skylib;
    }

    static HttpUtil d()
    {
        return new HttpUtilImpl();
    }

    static CrashReporter e()
    {
        return new HockeyAppCrashReporter(ApplicationConfig.getInstance());
    }

    static UpdateManager f()
    {
        return UpdateManager.a;
    }

    static AsyncService g()
    {
        return new ConditionalHandlerAsyncService(Executors.newCachedThreadPool(), Looper.getMainLooper());
    }

    static AdPlacer h()
    {
        AdPlacer adplacer;
        try
        {
            adplacer = (AdPlacer)Class.forName("com.skype.android.ads.SkypeAdPlacer").asSubclass(com/skype/android/ads/AdPlacer).newInstance();
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception);
        }
        return adplacer;
    }

    static AdManager i()
    {
        AdManager admanager;
        try
        {
            admanager = (AdManager)Class.forName("com.skype.android.ads.SkypeAdManager").asSubclass(com/skype/android/ads/AdManager).newInstance();
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception);
        }
        return admanager;
    }

    static FlurryAccessInterface j()
    {
        FlurryAccess flurryaccess = new FlurryAccess("J7VY3C6YY822G7JYSVM6");
        FlurryAccess.a();
        FlurryAccess.b();
        FlurryAccess.c();
        FlurryAccess.d();
        FlurryAccess.a("https://data.flurry.com/aap.do");
        FlurryAccess.e();
        return flurryaccess;
    }
}
