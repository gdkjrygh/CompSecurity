// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.view.inputmethod.InputMethodManager;
import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.app.Navigation;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.shortcircuit.ProfileServiceTokenRequest;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvManager, MnvCheckingAccountFragment, MnvUtil, MnvBaseFragment, 
//            MnvAnalytics, MnvCases, MnvRequestFragment

public final class MnvCheckingAccountFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider imeProvider;
    private final Provider mnvAnalyticsProvider;
    private final Provider mnvCasesProvider;
    private final Provider mnvManagerProvider;
    private final Provider mnvUtilProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider profileServiceTokenRequestProvider;
    private final Provider userPreferencesProvider;

    public MnvCheckingAccountFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
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
        } else
        {
            mnvUtilProvider = provider8;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8)
    {
        return new MnvCheckingAccountFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static void injectMnvManager(MnvCheckingAccountFragment mnvcheckingaccountfragment, Provider provider)
    {
        mnvcheckingaccountfragment.mnvManager = (MnvManager)provider.get();
    }

    public static void injectMnvUtil(MnvCheckingAccountFragment mnvcheckingaccountfragment, Provider provider)
    {
        mnvcheckingaccountfragment.mnvUtil = (MnvUtil)provider.get();
    }

    public final void injectMembers(MnvCheckingAccountFragment mnvcheckingaccountfragment)
    {
        if (mnvcheckingaccountfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(mnvcheckingaccountfragment, objectInterfaceFinderProvider);
            mnvcheckingaccountfragment.userPreferences = (UserPreferences)userPreferencesProvider.get();
            mnvcheckingaccountfragment.navigation = (Navigation)navigationProvider.get();
            mnvcheckingaccountfragment.mnvManager = (MnvManager)mnvManagerProvider.get();
            mnvcheckingaccountfragment.mnvAnalytics = (MnvAnalytics)mnvAnalyticsProvider.get();
            mnvcheckingaccountfragment.mnvCases = (MnvCases)mnvCasesProvider.get();
            mnvcheckingaccountfragment.ime = (InputMethodManager)imeProvider.get();
            mnvcheckingaccountfragment.mnvManager = (MnvManager)mnvManagerProvider.get();
            mnvcheckingaccountfragment.profileServiceTokenRequest = (ProfileServiceTokenRequest)profileServiceTokenRequestProvider.get();
            mnvcheckingaccountfragment.mnvCases = (MnvCases)mnvCasesProvider.get();
            mnvcheckingaccountfragment.mnvManager = (MnvManager)mnvManagerProvider.get();
            mnvcheckingaccountfragment.mnvUtil = (MnvUtil)mnvUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MnvCheckingAccountFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/mnv/MnvCheckingAccountFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
