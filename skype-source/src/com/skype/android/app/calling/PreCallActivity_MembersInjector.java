// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.media.AudioManager;
import android.telephony.TelephonyManager;
import com.skype.SkyLib;
import com.skype.Translator;
import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.Navigation;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.res.Sounds;
import com.skype.android.ringtone.RingtoneStorage;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.telemetry.TelemetryHelper;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.ViewStateManager;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.pcmhost.PcmHost;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.calling:
//            PreCallActivity, b

public final class PreCallActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider analyticsProvider;
    private final Provider audioManagerProvider;
    private final Provider callEndOverlayProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider crashReporterProvider;
    private final Provider defaultAvatarsProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider imageCacheProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider navigationProvider;
    private final Provider networkUtilProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider pcmHostProvider;
    private final Provider ringtoneStorageProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider soundsProvider;
    private final Provider stateManagerProvider;
    private final Provider telemetryHelperProvider;
    private final Provider telephonyManagerProvider;
    private final Provider translatorProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;

    public PreCallActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, 
            Provider provider21, Provider provider22, Provider provider23, Provider provider24, Provider provider25, Provider provider26, Provider provider27)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        upActionObserverProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        analyticsObserverProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        analyticsInAppObserverProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        shakeBugReportObserverProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        crashReporterProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        typeFaceTextStyleCallbackProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        objectInterfaceFinderProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        activityAccountStateObserverProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        pcmHostProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        soundsProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider15;
        if (!$assertionsDisabled && provider16 == null)
        {
            throw new AssertionError();
        }
        audioManagerProvider = provider16;
        if (!$assertionsDisabled && provider17 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider17;
        if (!$assertionsDisabled && provider18 == null)
        {
            throw new AssertionError();
        }
        stateManagerProvider = provider18;
        if (!$assertionsDisabled && provider19 == null)
        {
            throw new AssertionError();
        }
        telephonyManagerProvider = provider19;
        if (!$assertionsDisabled && provider20 == null)
        {
            throw new AssertionError();
        }
        callEndOverlayProvider = provider20;
        if (!$assertionsDisabled && provider21 == null)
        {
            throw new AssertionError();
        }
        networkUtilProvider = provider21;
        if (!$assertionsDisabled && provider22 == null)
        {
            throw new AssertionError();
        }
        accessibilityProvider = provider22;
        if (!$assertionsDisabled && provider23 == null)
        {
            throw new AssertionError();
        }
        ringtoneStorageProvider = provider23;
        if (!$assertionsDisabled && provider24 == null)
        {
            throw new AssertionError();
        }
        telemetryHelperProvider = provider24;
        if (!$assertionsDisabled && provider25 == null)
        {
            throw new AssertionError();
        }
        defaultAvatarsProvider = provider25;
        if (!$assertionsDisabled && provider26 == null)
        {
            throw new AssertionError();
        }
        translatorProvider = provider26;
        if (!$assertionsDisabled && provider27 == null)
        {
            throw new AssertionError();
        } else
        {
            ecsConfigurationProvider = provider27;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, 
            Provider provider22, Provider provider23, Provider provider24, Provider provider25, Provider provider26, Provider provider27)
    {
        return new PreCallActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27);
    }

    public static void injectAccessibility(PreCallActivity precallactivity, Provider provider)
    {
        precallactivity.accessibility = (AccessibilityUtil)provider.get();
    }

    public static void injectAnalytics(PreCallActivity precallactivity, Provider provider)
    {
        precallactivity.analytics = (Analytics)provider.get();
    }

    public static void injectAudioManager(PreCallActivity precallactivity, Provider provider)
    {
        precallactivity.audioManager = (AudioManager)provider.get();
    }

    public static void injectCallEndOverlay(PreCallActivity precallactivity, Provider provider)
    {
        precallactivity.callEndOverlay = (b)provider.get();
    }

    public static void injectContactUtil(PreCallActivity precallactivity, Provider provider)
    {
        precallactivity.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectConversationUtil(PreCallActivity precallactivity, Provider provider)
    {
        precallactivity.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectDefaultAvatars(PreCallActivity precallactivity, Provider provider)
    {
        precallactivity.defaultAvatars = (DefaultAvatars)provider.get();
    }

    public static void injectEcsConfiguration(PreCallActivity precallactivity, Provider provider)
    {
        precallactivity.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectImageCache(PreCallActivity precallactivity, Provider provider)
    {
        precallactivity.imageCache = (ImageCache)provider.get();
    }

    public static void injectLib(PreCallActivity precallactivity, Provider provider)
    {
        precallactivity.lib = (SkyLib)provider.get();
    }

    public static void injectMap(PreCallActivity precallactivity, Provider provider)
    {
        precallactivity.map = (ObjectIdMap)provider.get();
    }

    public static void injectNavigation(PreCallActivity precallactivity, Provider provider)
    {
        precallactivity.navigation = (Navigation)provider.get();
    }

    public static void injectNetworkUtil(PreCallActivity precallactivity, Provider provider)
    {
        precallactivity.networkUtil = (NetworkUtil)provider.get();
    }

    public static void injectPcmHost(PreCallActivity precallactivity, Provider provider)
    {
        precallactivity.pcmHost = (PcmHost)provider.get();
    }

    public static void injectRingtoneStorage(PreCallActivity precallactivity, Provider provider)
    {
        precallactivity.ringtoneStorage = (RingtoneStorage)provider.get();
    }

    public static void injectSounds(PreCallActivity precallactivity, Provider provider)
    {
        precallactivity.sounds = (Sounds)provider.get();
    }

    public static void injectStateManager(PreCallActivity precallactivity, Provider provider)
    {
        precallactivity.stateManager = (ViewStateManager)provider.get();
    }

    public static void injectTelemetryHelper(PreCallActivity precallactivity, Provider provider)
    {
        precallactivity.telemetryHelper = (TelemetryHelper)provider.get();
    }

    public static void injectTelephonyManager(PreCallActivity precallactivity, Provider provider)
    {
        precallactivity.telephonyManager = (TelephonyManager)provider.get();
    }

    public static void injectTranslator(PreCallActivity precallactivity, Provider provider)
    {
        precallactivity.translator = (Translator)provider.get();
    }

    public final void injectMembers(PreCallActivity precallactivity)
    {
        if (precallactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(precallactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(precallactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(precallactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(precallactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(precallactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(precallactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(precallactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(precallactivity, activityAccountStateObserverProvider);
            precallactivity.lib = (SkyLib)libProvider.get();
            precallactivity.pcmHost = (PcmHost)pcmHostProvider.get();
            precallactivity.map = (ObjectIdMap)mapProvider.get();
            precallactivity.navigation = (Navigation)navigationProvider.get();
            precallactivity.imageCache = (ImageCache)imageCacheProvider.get();
            precallactivity.sounds = (Sounds)soundsProvider.get();
            precallactivity.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            precallactivity.contactUtil = (ContactUtil)contactUtilProvider.get();
            precallactivity.audioManager = (AudioManager)audioManagerProvider.get();
            precallactivity.analytics = (Analytics)analyticsProvider.get();
            precallactivity.stateManager = (ViewStateManager)stateManagerProvider.get();
            precallactivity.telephonyManager = (TelephonyManager)telephonyManagerProvider.get();
            precallactivity.callEndOverlay = (b)callEndOverlayProvider.get();
            precallactivity.networkUtil = (NetworkUtil)networkUtilProvider.get();
            precallactivity.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            precallactivity.ringtoneStorage = (RingtoneStorage)ringtoneStorageProvider.get();
            precallactivity.telemetryHelper = (TelemetryHelper)telemetryHelperProvider.get();
            precallactivity.defaultAvatars = (DefaultAvatars)defaultAvatarsProvider.get();
            precallactivity.translator = (Translator)translatorProvider.get();
            precallactivity.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PreCallActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/calling/PreCallActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
