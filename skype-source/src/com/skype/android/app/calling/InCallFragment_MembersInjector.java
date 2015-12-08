// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.ads.AdPlacer;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.res.Sounds;
import com.skype.android.res.Vibration;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.PropertyAnimationUtil;
import com.skype.android.util.ViewStateManager;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.calling:
//            InCallFragment, CallAgent

public final class InCallFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityProvider;
    private final Provider accountProvider;
    private final Provider adPlacerProvider;
    private final Provider analyticsProvider;
    private final Provider animationUtilProvider;
    private final Provider audioManagerProvider;
    private final Provider callAgentProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider defaultAvatarsProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider imageCacheProvider;
    private final Provider layoutExpierenceProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider powerManagerProvider;
    private final Provider sensorManagerProvider;
    private final Provider soundsProvider;
    private final Provider stateManagerProvider;
    private final Provider telephonyManagerProvider;
    private final Provider userPrefsProvider;
    private final Provider vibrationProvider;

    public InCallFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, 
            Provider provider21, Provider provider22, Provider provider23)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        objectInterfaceFinderProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        soundsProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        stateManagerProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        audioManagerProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        adPlacerProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        animationUtilProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        telephonyManagerProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        powerManagerProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        userPrefsProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        }
        sensorManagerProvider = provider15;
        if (!$assertionsDisabled && provider16 == null)
        {
            throw new AssertionError();
        }
        vibrationProvider = provider16;
        if (!$assertionsDisabled && provider17 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider17;
        if (!$assertionsDisabled && provider18 == null)
        {
            throw new AssertionError();
        }
        layoutExpierenceProvider = provider18;
        if (!$assertionsDisabled && provider19 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider19;
        if (!$assertionsDisabled && provider20 == null)
        {
            throw new AssertionError();
        }
        accessibilityProvider = provider20;
        if (!$assertionsDisabled && provider21 == null)
        {
            throw new AssertionError();
        }
        callAgentProvider = provider21;
        if (!$assertionsDisabled && provider22 == null)
        {
            throw new AssertionError();
        }
        defaultAvatarsProvider = provider22;
        if (!$assertionsDisabled && provider23 == null)
        {
            throw new AssertionError();
        } else
        {
            ecsConfigurationProvider = provider23;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, 
            Provider provider22, Provider provider23)
    {
        return new InCallFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23);
    }

    public static void injectAccessibility(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.accessibility = (AccessibilityUtil)provider.get();
    }

    public static void injectAccount(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.account = (Account)provider.get();
    }

    public static void injectAdPlacer(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.adPlacer = (AdPlacer)provider.get();
    }

    public static void injectAnalytics(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.analytics = (Analytics)provider.get();
    }

    public static void injectAnimationUtil(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.animationUtil = (PropertyAnimationUtil)provider.get();
    }

    public static void injectAudioManager(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.audioManager = (AudioManager)provider.get();
    }

    public static void injectCallAgent(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.callAgent = (CallAgent)provider.get();
    }

    public static void injectContactUtil(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectConversationUtil(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectDefaultAvatars(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.defaultAvatars = (DefaultAvatars)provider.get();
    }

    public static void injectEcsConfiguration(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectImageCache(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.imageCache = (ImageCache)provider.get();
    }

    public static void injectLayoutExpierence(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.layoutExpierence = (LayoutExperience)provider.get();
    }

    public static void injectLib(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.lib = (SkyLib)provider.get();
    }

    public static void injectMap(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.map = (ObjectIdMap)provider.get();
    }

    public static void injectNavigation(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.navigation = (Navigation)provider.get();
    }

    public static void injectPowerManager(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.powerManager = (PowerManager)provider.get();
    }

    public static void injectSensorManager(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.sensorManager = (SensorManager)provider.get();
    }

    public static void injectSounds(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.sounds = (Sounds)provider.get();
    }

    public static void injectStateManager(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.stateManager = (ViewStateManager)provider.get();
    }

    public static void injectTelephonyManager(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.telephonyManager = (TelephonyManager)provider.get();
    }

    public static void injectUserPrefs(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.userPrefs = (UserPreferences)provider.get();
    }

    public static void injectVibration(InCallFragment incallfragment, Provider provider)
    {
        incallfragment.vibration = (Vibration)provider.get();
    }

    public final void injectMembers(InCallFragment incallfragment)
    {
        if (incallfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(incallfragment, objectInterfaceFinderProvider);
            incallfragment.lib = (SkyLib)libProvider.get();
            incallfragment.imageCache = (ImageCache)imageCacheProvider.get();
            incallfragment.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            incallfragment.contactUtil = (ContactUtil)contactUtilProvider.get();
            incallfragment.sounds = (Sounds)soundsProvider.get();
            incallfragment.stateManager = (ViewStateManager)stateManagerProvider.get();
            incallfragment.audioManager = (AudioManager)audioManagerProvider.get();
            incallfragment.adPlacer = (AdPlacer)adPlacerProvider.get();
            incallfragment.animationUtil = (PropertyAnimationUtil)animationUtilProvider.get();
            incallfragment.telephonyManager = (TelephonyManager)telephonyManagerProvider.get();
            incallfragment.powerManager = (PowerManager)powerManagerProvider.get();
            incallfragment.analytics = (Analytics)analyticsProvider.get();
            incallfragment.userPrefs = (UserPreferences)userPrefsProvider.get();
            incallfragment.map = (ObjectIdMap)mapProvider.get();
            incallfragment.sensorManager = (SensorManager)sensorManagerProvider.get();
            incallfragment.vibration = (Vibration)vibrationProvider.get();
            incallfragment.account = (Account)accountProvider.get();
            incallfragment.layoutExpierence = (LayoutExperience)layoutExpierenceProvider.get();
            incallfragment.navigation = (Navigation)navigationProvider.get();
            incallfragment.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            incallfragment.callAgent = (CallAgent)callAgentProvider.get();
            incallfragment.defaultAvatars = (DefaultAvatars)defaultAvatarsProvider.get();
            incallfragment.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((InCallFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/calling/InCallFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
