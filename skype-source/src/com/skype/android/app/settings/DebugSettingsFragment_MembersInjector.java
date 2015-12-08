// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.app.Navigation;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.config.ConfigUpdater;
import com.skype.android.sync.ContactsIngestManager;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.settings:
//            DebugSettingsFragment, UserPreferences

public final class DebugSettingsFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider appConfigProvider;
    private final Provider contactsIngestManagerProvider;
    private final Provider libProvider;
    private final Provider navProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider updaterProvider;
    private final Provider userPreferencesProvider;

    public DebugSettingsFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7)
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
        appConfigProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        updaterProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        contactsIngestManagerProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        userPreferencesProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        } else
        {
            navProvider = provider7;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7)
    {
        return new DebugSettingsFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static void injectAccount(DebugSettingsFragment debugsettingsfragment, Provider provider)
    {
        debugsettingsfragment.account = (Account)provider.get();
    }

    public static void injectAppConfig(DebugSettingsFragment debugsettingsfragment, Provider provider)
    {
        debugsettingsfragment.appConfig = (ApplicationConfig)provider.get();
    }

    public static void injectContactsIngestManager(DebugSettingsFragment debugsettingsfragment, Provider provider)
    {
        debugsettingsfragment.contactsIngestManager = (ContactsIngestManager)provider.get();
    }

    public static void injectLib(DebugSettingsFragment debugsettingsfragment, Provider provider)
    {
        debugsettingsfragment.lib = (SkyLib)provider.get();
    }

    public static void injectNav(DebugSettingsFragment debugsettingsfragment, Provider provider)
    {
        debugsettingsfragment.nav = (Navigation)provider.get();
    }

    public static void injectUpdater(DebugSettingsFragment debugsettingsfragment, Provider provider)
    {
        debugsettingsfragment.updater = (ConfigUpdater)provider.get();
    }

    public static void injectUserPreferences(DebugSettingsFragment debugsettingsfragment, Provider provider)
    {
        debugsettingsfragment.userPreferences = (UserPreferences)provider.get();
    }

    public final void injectMembers(DebugSettingsFragment debugsettingsfragment)
    {
        if (debugsettingsfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(debugsettingsfragment, objectInterfaceFinderProvider);
            debugsettingsfragment.lib = (SkyLib)libProvider.get();
            debugsettingsfragment.account = (Account)accountProvider.get();
            debugsettingsfragment.appConfig = (ApplicationConfig)appConfigProvider.get();
            debugsettingsfragment.updater = (ConfigUpdater)updaterProvider.get();
            debugsettingsfragment.contactsIngestManager = (ContactsIngestManager)contactsIngestManagerProvider.get();
            debugsettingsfragment.userPreferences = (UserPreferences)userPreferencesProvider.get();
            debugsettingsfragment.nav = (Navigation)navProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((DebugSettingsFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/settings/DebugSettingsFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
