// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.view.inputmethod.InputMethodManager;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.mnv.MnvAnalytics;
import com.skype.android.app.mnv.MnvCases;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.shortcircuit.PromotedSCDContactsManager;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactDirectorySearchActivity, ContactAdapter

public final class ContactDirectorySearchActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityProvider;
    private final Provider accountProvider;
    private final Provider actionBarCustomizerProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider adapterProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider analyticsProvider;
    private final Provider contactUtilProvider;
    private final Provider contactsManagerProvider;
    private final Provider crashReporterProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider imageCacheProvider;
    private final Provider imeProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider mnvAnalyticsProvider;
    private final Provider mnvCasesProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;
    private final Provider userPrefsProvider;

    public ContactDirectorySearchActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, 
            Provider provider21, Provider provider22, Provider provider23, Provider provider24)
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
        accountProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        actionBarCustomizerProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        adapterProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        }
        imeProvider = provider15;
        if (!$assertionsDisabled && provider16 == null)
        {
            throw new AssertionError();
        }
        accessibilityProvider = provider16;
        if (!$assertionsDisabled && provider17 == null)
        {
            throw new AssertionError();
        }
        contactsManagerProvider = provider17;
        if (!$assertionsDisabled && provider18 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider18;
        if (!$assertionsDisabled && provider19 == null)
        {
            throw new AssertionError();
        }
        userPrefsProvider = provider19;
        if (!$assertionsDisabled && provider20 == null)
        {
            throw new AssertionError();
        }
        mnvCasesProvider = provider20;
        if (!$assertionsDisabled && provider21 == null)
        {
            throw new AssertionError();
        }
        mnvAnalyticsProvider = provider21;
        if (!$assertionsDisabled && provider22 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider22;
        if (!$assertionsDisabled && provider23 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider23;
        if (!$assertionsDisabled && provider24 == null)
        {
            throw new AssertionError();
        } else
        {
            ecsConfigurationProvider = provider24;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, 
            Provider provider22, Provider provider23, Provider provider24)
    {
        return new ContactDirectorySearchActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24);
    }

    public static void injectAccessibility(ContactDirectorySearchActivity contactdirectorysearchactivity, Provider provider)
    {
        contactdirectorysearchactivity.accessibility = (AccessibilityUtil)provider.get();
    }

    public static void injectAccount(ContactDirectorySearchActivity contactdirectorysearchactivity, Provider provider)
    {
        contactdirectorysearchactivity.account = (Account)provider.get();
    }

    public static void injectActionBarCustomizer(ContactDirectorySearchActivity contactdirectorysearchactivity, Provider provider)
    {
        contactdirectorysearchactivity.actionBarCustomizer = (ActionBarCustomizer)provider.get();
    }

    public static void injectAdapter(ContactDirectorySearchActivity contactdirectorysearchactivity, Provider provider)
    {
        contactdirectorysearchactivity.adapter = (ContactAdapter)provider.get();
    }

    public static void injectAnalytics(ContactDirectorySearchActivity contactdirectorysearchactivity, Provider provider)
    {
        contactdirectorysearchactivity.analytics = (Analytics)provider.get();
    }

    public static void injectContactUtil(ContactDirectorySearchActivity contactdirectorysearchactivity, Provider provider)
    {
        contactdirectorysearchactivity.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectContactsManager(ContactDirectorySearchActivity contactdirectorysearchactivity, Provider provider)
    {
        contactdirectorysearchactivity.contactsManager = (PromotedSCDContactsManager)provider.get();
    }

    public static void injectEcsConfiguration(ContactDirectorySearchActivity contactdirectorysearchactivity, Provider provider)
    {
        contactdirectorysearchactivity.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectImageCache(ContactDirectorySearchActivity contactdirectorysearchactivity, Provider provider)
    {
        contactdirectorysearchactivity.imageCache = (ImageCache)provider.get();
    }

    public static void injectIme(ContactDirectorySearchActivity contactdirectorysearchactivity, Provider provider)
    {
        contactdirectorysearchactivity.ime = (InputMethodManager)provider.get();
    }

    public static void injectLayoutExperience(ContactDirectorySearchActivity contactdirectorysearchactivity, Provider provider)
    {
        contactdirectorysearchactivity.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectLib(ContactDirectorySearchActivity contactdirectorysearchactivity, Provider provider)
    {
        contactdirectorysearchactivity.lib = (SkyLib)provider.get();
    }

    public static void injectMap(ContactDirectorySearchActivity contactdirectorysearchactivity, Provider provider)
    {
        contactdirectorysearchactivity.map = (ObjectIdMap)provider.get();
    }

    public static void injectMnvAnalytics(ContactDirectorySearchActivity contactdirectorysearchactivity, Provider provider)
    {
        contactdirectorysearchactivity.mnvAnalytics = (MnvAnalytics)provider.get();
    }

    public static void injectMnvCases(ContactDirectorySearchActivity contactdirectorysearchactivity, Provider provider)
    {
        contactdirectorysearchactivity.mnvCases = (MnvCases)provider.get();
    }

    public static void injectNavigation(ContactDirectorySearchActivity contactdirectorysearchactivity, Provider provider)
    {
        contactdirectorysearchactivity.navigation = (Navigation)provider.get();
    }

    public static void injectUserPrefs(ContactDirectorySearchActivity contactdirectorysearchactivity, Provider provider)
    {
        contactdirectorysearchactivity.userPrefs = (UserPreferences)provider.get();
    }

    public final void injectMembers(ContactDirectorySearchActivity contactdirectorysearchactivity)
    {
        if (contactdirectorysearchactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(contactdirectorysearchactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(contactdirectorysearchactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(contactdirectorysearchactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(contactdirectorysearchactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(contactdirectorysearchactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(contactdirectorysearchactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(contactdirectorysearchactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(contactdirectorysearchactivity, activityAccountStateObserverProvider);
            contactdirectorysearchactivity.account = (Account)accountProvider.get();
            contactdirectorysearchactivity.actionBarCustomizer = (ActionBarCustomizer)actionBarCustomizerProvider.get();
            contactdirectorysearchactivity.lib = (SkyLib)libProvider.get();
            contactdirectorysearchactivity.map = (ObjectIdMap)mapProvider.get();
            contactdirectorysearchactivity.navigation = (Navigation)navigationProvider.get();
            contactdirectorysearchactivity.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            contactdirectorysearchactivity.adapter = (ContactAdapter)adapterProvider.get();
            contactdirectorysearchactivity.ime = (InputMethodManager)imeProvider.get();
            contactdirectorysearchactivity.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            contactdirectorysearchactivity.contactsManager = (PromotedSCDContactsManager)contactsManagerProvider.get();
            contactdirectorysearchactivity.contactUtil = (ContactUtil)contactUtilProvider.get();
            contactdirectorysearchactivity.userPrefs = (UserPreferences)userPrefsProvider.get();
            contactdirectorysearchactivity.mnvCases = (MnvCases)mnvCasesProvider.get();
            contactdirectorysearchactivity.mnvAnalytics = (MnvAnalytics)mnvAnalyticsProvider.get();
            contactdirectorysearchactivity.imageCache = (ImageCache)imageCacheProvider.get();
            contactdirectorysearchactivity.analytics = (Analytics)analyticsProvider.get();
            contactdirectorysearchactivity.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ContactDirectorySearchActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/contacts/ContactDirectorySearchActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
