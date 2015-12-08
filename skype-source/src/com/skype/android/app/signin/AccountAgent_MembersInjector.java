// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.app.NotificationManager;
import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.app.Agent_MembersInjector;
import com.skype.android.app.BackgroundNavigation;
import com.skype.android.app.ads.AdManagerInitializer;
import com.skype.android.app.chat.ChatServiceMonitor;
import com.skype.android.app.settings.SkypePreferenceListener;
import com.skype.android.app.signin.tasks.AccountTaskComposition;
import com.skype.android.push.PushManager;
import com.skype.android.res.Sounds;
import com.skype.android.telemetry.TelemetryHelper;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.TimeUtil;
import com.skype.android.wakeup.ForegroundState;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin:
//            AccountAgent

public final class AccountAgent_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider accountTasksProvider;
    private final Provider adManagerInitializerProvider;
    private final Provider analyticsPersistentStorageProvider;
    private final Provider analyticsProvider;
    private final Provider chatServiceMonitorProvider;
    private final Provider contactUtilProvider;
    private final Provider foregroundStateProvider;
    private final Provider imageCacheProvider;
    private final Provider libProvider;
    private final Provider navigationProvider;
    private final Provider networkUtilProvider;
    private final Provider notificationManagerProvider;
    private final Provider pushManagerProvider;
    private final Provider skypePreferenceListenerProvider;
    private final Provider soundsProvider;
    private final Provider telemetryHelperProvider;
    private final Provider timeUtilProvider;
    private final Provider userPrefsProvider;

    public AccountAgent_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        userPrefsProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        foregroundStateProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        soundsProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        notificationManagerProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        pushManagerProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        networkUtilProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        skypePreferenceListenerProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        adManagerInitializerProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        telemetryHelperProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        accountTasksProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider15;
        if (!$assertionsDisabled && provider16 == null)
        {
            throw new AssertionError();
        }
        timeUtilProvider = provider16;
        if (!$assertionsDisabled && provider17 == null)
        {
            throw new AssertionError();
        }
        chatServiceMonitorProvider = provider17;
        if (!$assertionsDisabled && provider18 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsPersistentStorageProvider = provider18;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17, Provider provider18)
    {
        return new AccountAgent_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18);
    }

    public static void injectAccountTasks(AccountAgent accountagent, Provider provider)
    {
        accountagent.accountTasks = (AccountTaskComposition)provider.get();
    }

    public static void injectAdManagerInitializer(AccountAgent accountagent, Provider provider)
    {
        accountagent.adManagerInitializer = (AdManagerInitializer)provider.get();
    }

    public static void injectAnalytics(AccountAgent accountagent, Provider provider)
    {
        accountagent.analytics = (Analytics)provider.get();
    }

    public static void injectAnalyticsPersistentStorage(AccountAgent accountagent, Provider provider)
    {
        accountagent.analyticsPersistentStorage = (AnalyticsPersistentStorage)provider.get();
    }

    public static void injectChatServiceMonitor(AccountAgent accountagent, Provider provider)
    {
        accountagent.chatServiceMonitor = (ChatServiceMonitor)provider.get();
    }

    public static void injectContactUtil(AccountAgent accountagent, Provider provider)
    {
        accountagent.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectForegroundState(AccountAgent accountagent, Provider provider)
    {
        accountagent.foregroundState = (ForegroundState)provider.get();
    }

    public static void injectImageCache(AccountAgent accountagent, Provider provider)
    {
        accountagent.imageCache = (ImageCache)provider.get();
    }

    public static void injectLib(AccountAgent accountagent, Provider provider)
    {
        accountagent.lib = (SkyLib)provider.get();
    }

    public static void injectNavigation(AccountAgent accountagent, Provider provider)
    {
        accountagent.navigation = (BackgroundNavigation)provider.get();
    }

    public static void injectNetworkUtil(AccountAgent accountagent, Provider provider)
    {
        accountagent.networkUtil = (NetworkUtil)provider.get();
    }

    public static void injectNotificationManager(AccountAgent accountagent, Provider provider)
    {
        accountagent.notificationManager = (NotificationManager)provider.get();
    }

    public static void injectPushManager(AccountAgent accountagent, Provider provider)
    {
        accountagent.pushManager = (PushManager)provider.get();
    }

    public static void injectSkypePreferenceListener(AccountAgent accountagent, Provider provider)
    {
        accountagent.skypePreferenceListener = (SkypePreferenceListener)provider.get();
    }

    public static void injectSounds(AccountAgent accountagent, Provider provider)
    {
        accountagent.sounds = (Sounds)provider.get();
    }

    public static void injectTelemetryHelper(AccountAgent accountagent, Provider provider)
    {
        accountagent.telemetryHelper = (TelemetryHelper)provider.get();
    }

    public static void injectTimeUtil(AccountAgent accountagent, Provider provider)
    {
        accountagent.timeUtil = (TimeUtil)provider.get();
    }

    public final void injectMembers(AccountAgent accountagent)
    {
        if (accountagent == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            Agent_MembersInjector.injectAccountProvider(accountagent, accountProvider);
            Agent_MembersInjector.injectUserPrefsProvider(accountagent, userPrefsProvider);
            accountagent.analytics = (Analytics)analyticsProvider.get();
            accountagent.foregroundState = (ForegroundState)foregroundStateProvider.get();
            accountagent.sounds = (Sounds)soundsProvider.get();
            accountagent.notificationManager = (NotificationManager)notificationManagerProvider.get();
            accountagent.pushManager = (PushManager)pushManagerProvider.get();
            accountagent.contactUtil = (ContactUtil)contactUtilProvider.get();
            accountagent.lib = (SkyLib)libProvider.get();
            accountagent.networkUtil = (NetworkUtil)networkUtilProvider.get();
            accountagent.skypePreferenceListener = (SkypePreferenceListener)skypePreferenceListenerProvider.get();
            accountagent.adManagerInitializer = (AdManagerInitializer)adManagerInitializerProvider.get();
            accountagent.navigation = (BackgroundNavigation)navigationProvider.get();
            accountagent.telemetryHelper = (TelemetryHelper)telemetryHelperProvider.get();
            accountagent.accountTasks = (AccountTaskComposition)accountTasksProvider.get();
            accountagent.imageCache = (ImageCache)imageCacheProvider.get();
            accountagent.timeUtil = (TimeUtil)timeUtilProvider.get();
            accountagent.chatServiceMonitor = (ChatServiceMonitor)chatServiceMonitorProvider.get();
            accountagent.analyticsPersistentStorage = (AnalyticsPersistentStorage)analyticsPersistentStorageProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((AccountAgent)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/AccountAgent_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
