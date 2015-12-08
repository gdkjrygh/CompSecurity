// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.ads.AdManager;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.NavigationUrl;
import com.skype.android.app.shortcircuit.AutoBuddyManager;
import com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.res.Urls;
import com.skype.android.telemetry.SCTManager;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.cache.SpannedStringCache;
import com.skype.android.util.permission.PermissionRequest;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.settings:
//            SettingsFragment, UserPreferences

public final class SettingsFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider adManagerProvider;
    private final Provider analyticsProvider;
    private final Provider autoBuddyManagerProvider;
    private final Provider configurationProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider navUrlProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider permissionRequestProvider;
    private final Provider sctManagerProvider;
    private final Provider shortCircuitProfileWebClientProvider;
    private final Provider spannedStringCacheProvider;
    private final Provider timeUtilProvider;
    private final Provider urlsProvider;
    private final Provider userPrefsProvider;

    public SettingsFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15)
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
        accountProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        userPrefsProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        navUrlProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        adManagerProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        urlsProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        sctManagerProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        autoBuddyManagerProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        shortCircuitProfileWebClientProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        spannedStringCacheProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        timeUtilProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        } else
        {
            permissionRequestProvider = provider15;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15)
    {
        return new SettingsFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public static void injectAccount(SettingsFragment settingsfragment, Provider provider)
    {
        settingsfragment.account = (Account)provider.get();
    }

    public static void injectAdManager(SettingsFragment settingsfragment, Provider provider)
    {
        settingsfragment.adManager = (AdManager)provider.get();
    }

    public static void injectAnalytics(SettingsFragment settingsfragment, Provider provider)
    {
        settingsfragment.analytics = (Analytics)provider.get();
    }

    public static void injectAutoBuddyManager(SettingsFragment settingsfragment, Provider provider)
    {
        settingsfragment.autoBuddyManager = (AutoBuddyManager)provider.get();
    }

    public static void injectConfiguration(SettingsFragment settingsfragment, Provider provider)
    {
        settingsfragment.configuration = (EcsConfiguration)provider.get();
    }

    public static void injectLayoutExperience(SettingsFragment settingsfragment, Provider provider)
    {
        settingsfragment.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectLib(SettingsFragment settingsfragment, Provider provider)
    {
        settingsfragment.lib = (SkyLib)provider.get();
    }

    public static void injectNavUrl(SettingsFragment settingsfragment, Provider provider)
    {
        settingsfragment.navUrl = (NavigationUrl)provider.get();
    }

    public static void injectPermissionRequest(SettingsFragment settingsfragment, Provider provider)
    {
        settingsfragment.permissionRequest = (PermissionRequest)provider.get();
    }

    public static void injectSctManager(SettingsFragment settingsfragment, Provider provider)
    {
        settingsfragment.sctManager = (SCTManager)provider.get();
    }

    public static void injectShortCircuitProfileWebClient(SettingsFragment settingsfragment, Provider provider)
    {
        settingsfragment.shortCircuitProfileWebClient = (ShortCircuitProfileWebClient)provider.get();
    }

    public static void injectSpannedStringCache(SettingsFragment settingsfragment, Provider provider)
    {
        settingsfragment.spannedStringCache = (SpannedStringCache)provider.get();
    }

    public static void injectTimeUtil(SettingsFragment settingsfragment, Provider provider)
    {
        settingsfragment.timeUtil = (TimeUtil)provider.get();
    }

    public static void injectUrls(SettingsFragment settingsfragment, Provider provider)
    {
        settingsfragment.urls = (Urls)provider.get();
    }

    public static void injectUserPrefs(SettingsFragment settingsfragment, Provider provider)
    {
        settingsfragment.userPrefs = (UserPreferences)provider.get();
    }

    public final void injectMembers(SettingsFragment settingsfragment)
    {
        if (settingsfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(settingsfragment, objectInterfaceFinderProvider);
            settingsfragment.lib = (SkyLib)libProvider.get();
            settingsfragment.account = (Account)accountProvider.get();
            settingsfragment.userPrefs = (UserPreferences)userPrefsProvider.get();
            settingsfragment.navUrl = (NavigationUrl)navUrlProvider.get();
            settingsfragment.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            settingsfragment.analytics = (Analytics)analyticsProvider.get();
            settingsfragment.adManager = (AdManager)adManagerProvider.get();
            settingsfragment.urls = (Urls)urlsProvider.get();
            settingsfragment.configuration = (EcsConfiguration)configurationProvider.get();
            settingsfragment.sctManager = (SCTManager)sctManagerProvider.get();
            settingsfragment.autoBuddyManager = (AutoBuddyManager)autoBuddyManagerProvider.get();
            settingsfragment.shortCircuitProfileWebClient = (ShortCircuitProfileWebClient)shortCircuitProfileWebClientProvider.get();
            settingsfragment.spannedStringCache = (SpannedStringCache)spannedStringCacheProvider.get();
            settingsfragment.timeUtil = (TimeUtil)timeUtilProvider.get();
            settingsfragment.permissionRequest = (PermissionRequest)permissionRequestProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SettingsFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/settings/SettingsFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
