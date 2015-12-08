// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.view.inputmethod.InputMethodManager;
import com.skype.SkyLib;
import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.app.Navigation;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.shortcircuit.ProfileServiceTokenRequest;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvAddNumberFragment, MnvAnalytics, MnvUtil, MnvBaseFragment, 
//            MnvManager, MnvCases, MnvRequestFragment

public final class MnvAddNumberFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityUtilProvider;
    private final Provider configurationProvider;
    private final Provider contactUtilProvider;
    private final Provider imeProvider;
    private final Provider libProvider;
    private final Provider mnvAnalyticsProvider;
    private final Provider mnvCasesProvider;
    private final Provider mnvManagerProvider;
    private final Provider mnvUtilProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider profileServiceTokenRequestProvider;
    private final Provider userPreferencesProvider;

    public MnvAddNumberFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
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
        }
        imeProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        profileServiceTokenRequestProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        mnvUtilProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        accessibilityUtilProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        } else
        {
            libProvider = provider12;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
    {
        return new MnvAddNumberFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static void injectAccessibilityUtil(MnvAddNumberFragment mnvaddnumberfragment, Provider provider)
    {
        mnvaddnumberfragment.accessibilityUtil = (AccessibilityUtil)provider.get();
    }

    public static void injectConfiguration(MnvAddNumberFragment mnvaddnumberfragment, Provider provider)
    {
        mnvaddnumberfragment.configuration = (EcsConfiguration)provider.get();
    }

    public static void injectContactUtil(MnvAddNumberFragment mnvaddnumberfragment, Provider provider)
    {
        mnvaddnumberfragment.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectLib(MnvAddNumberFragment mnvaddnumberfragment, Provider provider)
    {
        mnvaddnumberfragment.lib = (SkyLib)provider.get();
    }

    public static void injectMnvAnalytics(MnvAddNumberFragment mnvaddnumberfragment, Provider provider)
    {
        mnvaddnumberfragment.mnvAnalytics = (MnvAnalytics)provider.get();
    }

    public static void injectMnvUtil(MnvAddNumberFragment mnvaddnumberfragment, Provider provider)
    {
        mnvaddnumberfragment.mnvUtil = (MnvUtil)provider.get();
    }

    public final void injectMembers(MnvAddNumberFragment mnvaddnumberfragment)
    {
        if (mnvaddnumberfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(mnvaddnumberfragment, objectInterfaceFinderProvider);
            mnvaddnumberfragment.userPreferences = (UserPreferences)userPreferencesProvider.get();
            mnvaddnumberfragment.navigation = (Navigation)navigationProvider.get();
            mnvaddnumberfragment.mnvManager = (MnvManager)mnvManagerProvider.get();
            mnvaddnumberfragment.mnvAnalytics = (MnvAnalytics)mnvAnalyticsProvider.get();
            mnvaddnumberfragment.mnvCases = (MnvCases)mnvCasesProvider.get();
            mnvaddnumberfragment.ime = (InputMethodManager)imeProvider.get();
            mnvaddnumberfragment.mnvManager = (MnvManager)mnvManagerProvider.get();
            mnvaddnumberfragment.profileServiceTokenRequest = (ProfileServiceTokenRequest)profileServiceTokenRequestProvider.get();
            mnvaddnumberfragment.mnvCases = (MnvCases)mnvCasesProvider.get();
            mnvaddnumberfragment.configuration = (EcsConfiguration)configurationProvider.get();
            mnvaddnumberfragment.mnvUtil = (MnvUtil)mnvUtilProvider.get();
            mnvaddnumberfragment.contactUtil = (ContactUtil)contactUtilProvider.get();
            mnvaddnumberfragment.accessibilityUtil = (AccessibilityUtil)accessibilityUtilProvider.get();
            mnvaddnumberfragment.mnvAnalytics = (MnvAnalytics)mnvAnalyticsProvider.get();
            mnvaddnumberfragment.lib = (SkyLib)libProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MnvAddNumberFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/mnv/MnvAddNumberFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
