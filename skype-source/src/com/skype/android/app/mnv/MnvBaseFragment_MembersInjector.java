// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.app.Navigation;
import com.skype.android.app.settings.UserPreferences;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvAnalytics, MnvBaseFragment, MnvCases, MnvManager

public final class MnvBaseFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider mnvAnalyticsProvider;
    private final Provider mnvCasesProvider;
    private final Provider mnvManagerProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider userPreferencesProvider;

    public MnvBaseFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
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
        userPreferencesProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        mnvManagerProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        mnvAnalyticsProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        } else
        {
            mnvCasesProvider = provider5;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        return new MnvBaseFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5);
    }

    public static void injectMnvAnalytics(MnvBaseFragment mnvbasefragment, Provider provider)
    {
        mnvbasefragment.mnvAnalytics = (MnvAnalytics)provider.get();
    }

    public static void injectMnvCases(MnvBaseFragment mnvbasefragment, Provider provider)
    {
        mnvbasefragment.mnvCases = (MnvCases)provider.get();
    }

    public static void injectMnvManager(MnvBaseFragment mnvbasefragment, Provider provider)
    {
        mnvbasefragment.mnvManager = (MnvManager)provider.get();
    }

    public static void injectNavigation(MnvBaseFragment mnvbasefragment, Provider provider)
    {
        mnvbasefragment.navigation = (Navigation)provider.get();
    }

    public static void injectUserPreferences(MnvBaseFragment mnvbasefragment, Provider provider)
    {
        mnvbasefragment.userPreferences = (UserPreferences)provider.get();
    }

    public final void injectMembers(MnvBaseFragment mnvbasefragment)
    {
        if (mnvbasefragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(mnvbasefragment, objectInterfaceFinderProvider);
            mnvbasefragment.userPreferences = (UserPreferences)userPreferencesProvider.get();
            mnvbasefragment.navigation = (Navigation)navigationProvider.get();
            mnvbasefragment.mnvManager = (MnvManager)mnvManagerProvider.get();
            mnvbasefragment.mnvAnalytics = (MnvAnalytics)mnvAnalyticsProvider.get();
            mnvbasefragment.mnvCases = (MnvCases)mnvCasesProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MnvBaseFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/mnv/MnvBaseFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
