// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.app.Application;
import android.app.NotificationManager;
import android.media.AudioManager;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import com.skype.SkyLib;
import com.skype.android.ads.AdManager;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.BackgroundNavigation;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.app2app.App2AppManager;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.res.Sounds;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.skylib.PcmHostCallback;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.ViewStateManager;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.wakeup.ForegroundState;
import com.skype.pcmhost.PcmHost;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.calling:
//            CallAgent, OngoingNotificationsManager, CallQualityFeedbackManager

public final class CallAgent_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityProvider;
    private final Provider adManagerProvider;
    private final Provider analyticsProvider;
    private final Provider app2AppManagerProvider;
    private final Provider audioManagerProvider;
    private final Provider callQualityFeedbackManagerProvider;
    private final Provider contactUtilProvider;
    private final Provider contextProvider;
    private final Provider conversationUtilProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider eventBusProvider;
    private final Provider foregroundStateProvider;
    private final Provider imageCacheProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final MembersInjector membersInjector;
    private final Provider navProvider;
    private final Provider notificationManagerProvider;
    private final Provider ongoingNotificationsManagerProvider;
    private final Provider pcmHostCallbackProvider;
    private final Provider pcmHostProvider;
    private final Provider powerManagerProvider;
    private final Provider soundsProvider;
    private final Provider stateManagerProvider;
    private final Provider telephonyManagerProvider;
    private final Provider translatorProvider;
    private final Provider wifiManagerProvider;

    public CallAgent_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
            Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, 
            Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, 
            Provider provider20, Provider provider21, Provider provider22, Provider provider23, Provider provider24, Provider provider25, Provider provider26)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        eventBusProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        notificationManagerProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        powerManagerProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        telephonyManagerProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        wifiManagerProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        audioManagerProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        stateManagerProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        adManagerProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        ongoingNotificationsManagerProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        app2AppManagerProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        callQualityFeedbackManagerProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        pcmHostProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        }
        pcmHostCallbackProvider = provider15;
        if (!$assertionsDisabled && provider16 == null)
        {
            throw new AssertionError();
        }
        soundsProvider = provider16;
        if (!$assertionsDisabled && provider17 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider17;
        if (!$assertionsDisabled && provider18 == null)
        {
            throw new AssertionError();
        }
        accessibilityProvider = provider18;
        if (!$assertionsDisabled && provider19 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider19;
        if (!$assertionsDisabled && provider20 == null)
        {
            throw new AssertionError();
        }
        ecsConfigurationProvider = provider20;
        if (!$assertionsDisabled && provider21 == null)
        {
            throw new AssertionError();
        }
        navProvider = provider21;
        if (!$assertionsDisabled && provider22 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider22;
        if (!$assertionsDisabled && provider23 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider23;
        if (!$assertionsDisabled && provider24 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider24;
        if (!$assertionsDisabled && provider25 == null)
        {
            throw new AssertionError();
        }
        translatorProvider = provider25;
        if (!$assertionsDisabled && provider26 == null)
        {
            throw new AssertionError();
        } else
        {
            foregroundStateProvider = provider26;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, 
            Provider provider21, Provider provider22, Provider provider23, Provider provider24, Provider provider25, Provider provider26)
    {
        return new CallAgent_Factory(membersinjector, provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26);
    }

    public final CallAgent get()
    {
        CallAgent callagent = new CallAgent((Application)contextProvider.get(), (SkyLib)libProvider.get(), (ObjectIdMap)mapProvider.get(), (EventBus)eventBusProvider.get(), (NotificationManager)notificationManagerProvider.get(), (PowerManager)powerManagerProvider.get(), (TelephonyManager)telephonyManagerProvider.get(), (WifiManager)wifiManagerProvider.get(), (AudioManager)audioManagerProvider.get(), (ViewStateManager)stateManagerProvider.get(), (AdManager)adManagerProvider.get(), (OngoingNotificationsManager)ongoingNotificationsManagerProvider.get(), (App2AppManager)app2AppManagerProvider.get(), (CallQualityFeedbackManager)callQualityFeedbackManagerProvider.get(), (PcmHost)pcmHostProvider.get(), (PcmHostCallback)pcmHostCallbackProvider.get(), (Sounds)soundsProvider.get(), (Analytics)analyticsProvider.get(), (AccessibilityUtil)accessibilityProvider.get(), (LayoutExperience)layoutExperienceProvider.get(), (EcsConfiguration)ecsConfigurationProvider.get(), (BackgroundNavigation)navProvider.get(), (ImageCache)imageCacheProvider.get(), (ConversationUtil)conversationUtilProvider.get(), (ContactUtil)contactUtilProvider.get(), translatorProvider, (ForegroundState)foregroundStateProvider.get());
        membersInjector.injectMembers(callagent);
        return callagent;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/calling/CallAgent_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
