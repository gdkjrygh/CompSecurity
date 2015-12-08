// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.app.NavigationUrl;
import com.skype.android.app.settings.UserPreferences;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvAnalytics, MnvLearnMoreFragment, MnvManager

public final class MnvLearnMoreFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider mnvAnalyticsProvider;
    private final Provider mnvManagerProvider;
    private final Provider navigationUrlProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider userPreferencesProvider;

    public MnvLearnMoreFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
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
        navigationUrlProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        mnvManagerProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        mnvAnalyticsProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        } else
        {
            userPreferencesProvider = provider4;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        return new MnvLearnMoreFragment_MembersInjector(provider, provider1, provider2, provider3, provider4);
    }

    public static void injectMnvAnalytics(MnvLearnMoreFragment mnvlearnmorefragment, Provider provider)
    {
        mnvlearnmorefragment.mnvAnalytics = (MnvAnalytics)provider.get();
    }

    public static void injectMnvManager(MnvLearnMoreFragment mnvlearnmorefragment, Provider provider)
    {
        mnvlearnmorefragment.mnvManager = (MnvManager)provider.get();
    }

    public static void injectNavigationUrl(MnvLearnMoreFragment mnvlearnmorefragment, Provider provider)
    {
        mnvlearnmorefragment.navigationUrl = (NavigationUrl)provider.get();
    }

    public static void injectUserPreferences(MnvLearnMoreFragment mnvlearnmorefragment, Provider provider)
    {
        mnvlearnmorefragment.userPreferences = (UserPreferences)provider.get();
    }

    public final void injectMembers(MnvLearnMoreFragment mnvlearnmorefragment)
    {
        if (mnvlearnmorefragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(mnvlearnmorefragment, objectInterfaceFinderProvider);
            mnvlearnmorefragment.navigationUrl = (NavigationUrl)navigationUrlProvider.get();
            mnvlearnmorefragment.mnvManager = (MnvManager)mnvManagerProvider.get();
            mnvlearnmorefragment.mnvAnalytics = (MnvAnalytics)mnvAnalyticsProvider.get();
            mnvlearnmorefragment.userPreferences = (UserPreferences)userPreferencesProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MnvLearnMoreFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/mnv/MnvLearnMoreFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
