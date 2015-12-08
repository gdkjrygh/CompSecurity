// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.NavigationUrl;
import com.skype.android.app.mnv.MnvAnalytics;
import com.skype.android.app.mnv.MnvCases;
import com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient;
import com.skype.android.inject.AccountProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.settings:
//            ManageAliasesFragment, ManageAliasesAdapter

public final class ManageAliasesFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider adapterProvider;
    private final Provider layoutExperienceProvider;
    private final Provider mnvAnalyticsProvider;
    private final Provider mnvCasesProvider;
    private final Provider navigationProvider;
    private final Provider navigationUrlProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider scProfileWebClientProvider;

    public ManageAliasesFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8)
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
        scProfileWebClientProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        adapterProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        navigationUrlProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        mnvCasesProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        } else
        {
            mnvAnalyticsProvider = provider8;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8)
    {
        return new ManageAliasesFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static void injectAccountProvider(ManageAliasesFragment managealiasesfragment, Provider provider)
    {
        managealiasesfragment.accountProvider = (AccountProvider)provider.get();
    }

    public static void injectAdapter(ManageAliasesFragment managealiasesfragment, Provider provider)
    {
        managealiasesfragment.adapter = (ManageAliasesAdapter)provider.get();
    }

    public static void injectLayoutExperience(ManageAliasesFragment managealiasesfragment, Provider provider)
    {
        managealiasesfragment.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectMnvAnalytics(ManageAliasesFragment managealiasesfragment, Provider provider)
    {
        managealiasesfragment.mnvAnalytics = (MnvAnalytics)provider.get();
    }

    public static void injectMnvCases(ManageAliasesFragment managealiasesfragment, Provider provider)
    {
        managealiasesfragment.mnvCases = (MnvCases)provider.get();
    }

    public static void injectNavigation(ManageAliasesFragment managealiasesfragment, Provider provider)
    {
        managealiasesfragment.navigation = (Navigation)provider.get();
    }

    public static void injectNavigationUrl(ManageAliasesFragment managealiasesfragment, Provider provider)
    {
        managealiasesfragment.navigationUrl = (NavigationUrl)provider.get();
    }

    public static void injectScProfileWebClient(ManageAliasesFragment managealiasesfragment, Provider provider)
    {
        managealiasesfragment.scProfileWebClient = (ShortCircuitProfileWebClient)provider.get();
    }

    public final void injectMembers(ManageAliasesFragment managealiasesfragment)
    {
        if (managealiasesfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(managealiasesfragment, objectInterfaceFinderProvider);
            managealiasesfragment.scProfileWebClient = (ShortCircuitProfileWebClient)scProfileWebClientProvider.get();
            managealiasesfragment.adapter = (ManageAliasesAdapter)adapterProvider.get();
            managealiasesfragment.navigation = (Navigation)navigationProvider.get();
            managealiasesfragment.navigationUrl = (NavigationUrl)navigationUrlProvider.get();
            managealiasesfragment.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            managealiasesfragment.accountProvider = (AccountProvider)accountProvider.get();
            managealiasesfragment.mnvCases = (MnvCases)mnvCasesProvider.get();
            managealiasesfragment.mnvAnalytics = (MnvAnalytics)mnvAnalyticsProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ManageAliasesFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/settings/ManageAliasesFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
