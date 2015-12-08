// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.SkypeListFragment_MembersInjector;
import com.skype.android.ads.AdPlacer;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.mnv.MnvAnalytics;
import com.skype.android.app.mnv.MnvCases;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.sync.ContactsIngestManager;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactListFragment, ContactAdapter

public final class ContactListFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityUtilProvider;
    private final Provider accountProvider;
    private final Provider adPlacerProvider;
    private final Provider adapterProvider;
    private final Provider analyticsProvider;
    private final Provider asyncProvider;
    private final Provider contactUtilProvider;
    private final Provider contactsIngestManagerProvider;
    private final Provider conversationUtilProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider mnvAnalyticsProvider;
    private final Provider mnvCasesProvider;
    private final Provider navProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider userPrefsProvider;

    public ContactListFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17)
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
        accessibilityUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        asyncProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        navProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        adapterProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        adPlacerProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        userPrefsProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        contactsIngestManagerProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        mnvCasesProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        }
        mnvAnalyticsProvider = provider15;
        if (!$assertionsDisabled && provider16 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider16;
        if (!$assertionsDisabled && provider17 == null)
        {
            throw new AssertionError();
        } else
        {
            ecsConfigurationProvider = provider17;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17)
    {
        return new ContactListFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }

    public static void injectAccessibilityUtil(ContactListFragment contactlistfragment, Provider provider)
    {
        contactlistfragment.accessibilityUtil = (AccessibilityUtil)provider.get();
    }

    public static void injectAccount(ContactListFragment contactlistfragment, Provider provider)
    {
        contactlistfragment.account = (Account)provider.get();
    }

    public static void injectAdPlacer(ContactListFragment contactlistfragment, Provider provider)
    {
        contactlistfragment.adPlacer = (AdPlacer)provider.get();
    }

    public static void injectAdapter(ContactListFragment contactlistfragment, Provider provider)
    {
        contactlistfragment.adapter = (ContactAdapter)provider.get();
    }

    public static void injectAnalytics(ContactListFragment contactlistfragment, Provider provider)
    {
        contactlistfragment.analytics = (Analytics)provider.get();
    }

    public static void injectAsync(ContactListFragment contactlistfragment, Provider provider)
    {
        contactlistfragment.async = (AsyncService)provider.get();
    }

    public static void injectContactUtil(ContactListFragment contactlistfragment, Provider provider)
    {
        contactlistfragment.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectContactsIngestManager(ContactListFragment contactlistfragment, Provider provider)
    {
        contactlistfragment.contactsIngestManager = (ContactsIngestManager)provider.get();
    }

    public static void injectConversationUtil(ContactListFragment contactlistfragment, Provider provider)
    {
        contactlistfragment.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectEcsConfiguration(ContactListFragment contactlistfragment, Provider provider)
    {
        contactlistfragment.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectLayoutExperience(ContactListFragment contactlistfragment, Provider provider)
    {
        contactlistfragment.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectLib(ContactListFragment contactlistfragment, Provider provider)
    {
        contactlistfragment.lib = (SkyLib)provider.get();
    }

    public static void injectMap(ContactListFragment contactlistfragment, Provider provider)
    {
        contactlistfragment.map = (ObjectIdMap)provider.get();
    }

    public static void injectMnvAnalytics(ContactListFragment contactlistfragment, Provider provider)
    {
        contactlistfragment.mnvAnalytics = (MnvAnalytics)provider.get();
    }

    public static void injectMnvCases(ContactListFragment contactlistfragment, Provider provider)
    {
        contactlistfragment.mnvCases = (MnvCases)provider.get();
    }

    public static void injectNav(ContactListFragment contactlistfragment, Provider provider)
    {
        contactlistfragment.nav = (Navigation)provider.get();
    }

    public static void injectUserPrefs(ContactListFragment contactlistfragment, Provider provider)
    {
        contactlistfragment.userPrefs = (UserPreferences)provider.get();
    }

    public final void injectMembers(ContactListFragment contactlistfragment)
    {
        if (contactlistfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(contactlistfragment, objectInterfaceFinderProvider);
            SkypeListFragment_MembersInjector.injectAccessibilityUtil(contactlistfragment, accessibilityUtilProvider);
            contactlistfragment.async = (AsyncService)asyncProvider.get();
            contactlistfragment.nav = (Navigation)navProvider.get();
            contactlistfragment.lib = (SkyLib)libProvider.get();
            contactlistfragment.map = (ObjectIdMap)mapProvider.get();
            contactlistfragment.contactUtil = (ContactUtil)contactUtilProvider.get();
            contactlistfragment.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            contactlistfragment.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            contactlistfragment.adapter = (ContactAdapter)adapterProvider.get();
            contactlistfragment.adPlacer = (AdPlacer)adPlacerProvider.get();
            contactlistfragment.account = (Account)accountProvider.get();
            contactlistfragment.userPrefs = (UserPreferences)userPrefsProvider.get();
            contactlistfragment.accessibilityUtil = (AccessibilityUtil)accessibilityUtilProvider.get();
            contactlistfragment.contactsIngestManager = (ContactsIngestManager)contactsIngestManagerProvider.get();
            contactlistfragment.mnvCases = (MnvCases)mnvCasesProvider.get();
            contactlistfragment.mnvAnalytics = (MnvAnalytics)mnvAnalyticsProvider.get();
            contactlistfragment.analytics = (Analytics)analyticsProvider.get();
            contactlistfragment.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ContactListFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/contacts/ContactListFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
