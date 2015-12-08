// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.app.Navigation;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvVerifiedFragment, MnvAnalytics, MnvBaseFragment, MnvManager, 
//            MnvCases

public final class MnvVerifiedFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityUtilProvider;
    private final Provider mnvAnalyticsProvider;
    private final Provider mnvCasesProvider;
    private final Provider mnvManagerProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider userPreferencesProvider;

    public MnvVerifiedFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
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
        }
        mnvCasesProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        } else
        {
            accessibilityUtilProvider = provider6;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
    {
        return new MnvVerifiedFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6);
    }

    public static void injectAccessibilityUtil(MnvVerifiedFragment mnvverifiedfragment, Provider provider)
    {
        mnvverifiedfragment.accessibilityUtil = (AccessibilityUtil)provider.get();
    }

    public static void injectMnvAnalytics(MnvVerifiedFragment mnvverifiedfragment, Provider provider)
    {
        mnvverifiedfragment.mnvAnalytics = (MnvAnalytics)provider.get();
    }

    public final void injectMembers(MnvVerifiedFragment mnvverifiedfragment)
    {
        if (mnvverifiedfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(mnvverifiedfragment, objectInterfaceFinderProvider);
            mnvverifiedfragment.userPreferences = (UserPreferences)userPreferencesProvider.get();
            mnvverifiedfragment.navigation = (Navigation)navigationProvider.get();
            mnvverifiedfragment.mnvManager = (MnvManager)mnvManagerProvider.get();
            mnvverifiedfragment.mnvAnalytics = (MnvAnalytics)mnvAnalyticsProvider.get();
            mnvverifiedfragment.mnvCases = (MnvCases)mnvCasesProvider.get();
            mnvverifiedfragment.mnvAnalytics = (MnvAnalytics)mnvAnalyticsProvider.get();
            mnvverifiedfragment.accessibilityUtil = (AccessibilityUtil)accessibilityUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MnvVerifiedFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/mnv/MnvVerifiedFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
