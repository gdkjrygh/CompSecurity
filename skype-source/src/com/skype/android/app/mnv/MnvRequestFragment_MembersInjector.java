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
//            MnvRequestFragment, MnvCases, MnvManager, MnvBaseFragment, 
//            MnvAnalytics

public final class MnvRequestFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider imeProvider;
    private final Provider mnvAnalyticsProvider;
    private final Provider mnvCasesProvider;
    private final Provider mnvManagerProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider profileServiceTokenRequestProvider;
    private final Provider userPreferencesProvider;

    public MnvRequestFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
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
        } else
        {
            profileServiceTokenRequestProvider = provider7;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7)
    {
        return new MnvRequestFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static void injectIme(MnvRequestFragment mnvrequestfragment, Provider provider)
    {
        mnvrequestfragment.ime = (InputMethodManager)provider.get();
    }

    public static void injectMnvCases(MnvRequestFragment mnvrequestfragment, Provider provider)
    {
        mnvrequestfragment.mnvCases = (MnvCases)provider.get();
    }

    public static void injectMnvManager(MnvRequestFragment mnvrequestfragment, Provider provider)
    {
        mnvrequestfragment.mnvManager = (MnvManager)provider.get();
    }

    public static void injectProfileServiceTokenRequest(MnvRequestFragment mnvrequestfragment, Provider provider)
    {
        mnvrequestfragment.profileServiceTokenRequest = (ProfileServiceTokenRequest)provider.get();
    }

    public final void injectMembers(MnvRequestFragment mnvrequestfragment)
    {
        if (mnvrequestfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(mnvrequestfragment, objectInterfaceFinderProvider);
            mnvrequestfragment.userPreferences = (UserPreferences)userPreferencesProvider.get();
            mnvrequestfragment.navigation = (Navigation)navigationProvider.get();
            mnvrequestfragment.mnvManager = (MnvManager)mnvManagerProvider.get();
            mnvrequestfragment.mnvAnalytics = (MnvAnalytics)mnvAnalyticsProvider.get();
            mnvrequestfragment.mnvCases = (MnvCases)mnvCasesProvider.get();
            mnvrequestfragment.ime = (InputMethodManager)imeProvider.get();
            mnvrequestfragment.mnvManager = (MnvManager)mnvManagerProvider.get();
            mnvrequestfragment.profileServiceTokenRequest = (ProfileServiceTokenRequest)profileServiceTokenRequestProvider.get();
            mnvrequestfragment.mnvCases = (MnvCases)mnvCasesProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MnvRequestFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/mnv/MnvRequestFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
