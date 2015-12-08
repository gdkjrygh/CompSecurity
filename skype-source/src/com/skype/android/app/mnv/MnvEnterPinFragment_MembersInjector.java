// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.view.inputmethod.InputMethodManager;
import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.app.Navigation;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.shortcircuit.ProfileServiceTokenRequest;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvEnterPinFragment, MnvAnalytics, MnvUtil, MnvBaseFragment, 
//            MnvManager, MnvCases, MnvRequestFragment

public final class MnvEnterPinFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityUtilProvider;
    private final Provider imeProvider;
    private final Provider mnvAnalyticsProvider;
    private final Provider mnvCasesProvider;
    private final Provider mnvManagerProvider;
    private final Provider mnvUtilProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider profileServiceTokenRequestProvider;
    private final Provider userPreferencesProvider;

    public MnvEnterPinFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9)
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
        accessibilityUtilProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        } else
        {
            mnvUtilProvider = provider9;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9)
    {
        return new MnvEnterPinFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static void injectAccessibilityUtil(MnvEnterPinFragment mnventerpinfragment, Provider provider)
    {
        mnventerpinfragment.accessibilityUtil = (AccessibilityUtil)provider.get();
    }

    public static void injectMnvAnalytics(MnvEnterPinFragment mnventerpinfragment, Provider provider)
    {
        mnventerpinfragment.mnvAnalytics = (MnvAnalytics)provider.get();
    }

    public static void injectMnvUtil(MnvEnterPinFragment mnventerpinfragment, Provider provider)
    {
        mnventerpinfragment.mnvUtil = (MnvUtil)provider.get();
    }

    public final void injectMembers(MnvEnterPinFragment mnventerpinfragment)
    {
        if (mnventerpinfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(mnventerpinfragment, objectInterfaceFinderProvider);
            mnventerpinfragment.userPreferences = (UserPreferences)userPreferencesProvider.get();
            mnventerpinfragment.navigation = (Navigation)navigationProvider.get();
            mnventerpinfragment.mnvManager = (MnvManager)mnvManagerProvider.get();
            mnventerpinfragment.mnvAnalytics = (MnvAnalytics)mnvAnalyticsProvider.get();
            mnventerpinfragment.mnvCases = (MnvCases)mnvCasesProvider.get();
            mnventerpinfragment.ime = (InputMethodManager)imeProvider.get();
            mnventerpinfragment.mnvManager = (MnvManager)mnvManagerProvider.get();
            mnventerpinfragment.profileServiceTokenRequest = (ProfileServiceTokenRequest)profileServiceTokenRequestProvider.get();
            mnventerpinfragment.mnvCases = (MnvCases)mnvCasesProvider.get();
            mnventerpinfragment.mnvAnalytics = (MnvAnalytics)mnvAnalyticsProvider.get();
            mnventerpinfragment.accessibilityUtil = (AccessibilityUtil)accessibilityUtilProvider.get();
            mnventerpinfragment.mnvUtil = (MnvUtil)mnvUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MnvEnterPinFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/mnv/MnvEnterPinFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
