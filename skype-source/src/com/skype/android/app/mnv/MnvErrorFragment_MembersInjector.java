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
//            MnvAnalytics, MnvErrorFragment, MnvBaseFragment, MnvManager, 
//            MnvCases

public final class MnvErrorFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider mnvAnalyticsProvider;
    private final Provider mnvCasesProvider;
    private final Provider mnvManagerProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider userPreferencesProvider;

    public MnvErrorFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
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
        return new MnvErrorFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5);
    }

    public static void injectMnvAnalytics(MnvErrorFragment mnverrorfragment, Provider provider)
    {
        mnverrorfragment.mnvAnalytics = (MnvAnalytics)provider.get();
    }

    public final void injectMembers(MnvErrorFragment mnverrorfragment)
    {
        if (mnverrorfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(mnverrorfragment, objectInterfaceFinderProvider);
            mnverrorfragment.userPreferences = (UserPreferences)userPreferencesProvider.get();
            mnverrorfragment.navigation = (Navigation)navigationProvider.get();
            mnverrorfragment.mnvManager = (MnvManager)mnvManagerProvider.get();
            mnverrorfragment.mnvAnalytics = (MnvAnalytics)mnvAnalyticsProvider.get();
            mnverrorfragment.mnvCases = (MnvCases)mnvCasesProvider.get();
            mnverrorfragment.mnvAnalytics = (MnvAnalytics)mnvAnalyticsProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MnvErrorFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/mnv/MnvErrorFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
