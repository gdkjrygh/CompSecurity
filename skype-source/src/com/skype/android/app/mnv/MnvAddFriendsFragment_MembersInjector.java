// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.app.Navigation;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.res.ChatText;
import com.skype.android.util.permission.PermissionRequest;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvAddFriendsFragment, MnvAnalytics, MnvCases, MnvUtil, 
//            MnvBaseFragment, MnvManager

public final class MnvAddFriendsFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider chatTextProvider;
    private final Provider configurationProvider;
    private final Provider mnvAnalyticsProvider;
    private final Provider mnvCasesProvider;
    private final Provider mnvManagerProvider;
    private final Provider mnvUtilProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider permissionRequestProvider;
    private final Provider userPreferencesProvider;

    public MnvAddFriendsFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
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
        chatTextProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        mnvUtilProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        } else
        {
            permissionRequestProvider = provider9;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9)
    {
        return new MnvAddFriendsFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static void injectChatText(MnvAddFriendsFragment mnvaddfriendsfragment, Provider provider)
    {
        mnvaddfriendsfragment.chatText = (ChatText)provider.get();
    }

    public static void injectConfiguration(MnvAddFriendsFragment mnvaddfriendsfragment, Provider provider)
    {
        mnvaddfriendsfragment.configuration = (EcsConfiguration)provider.get();
    }

    public static void injectMnvAnalytics(MnvAddFriendsFragment mnvaddfriendsfragment, Provider provider)
    {
        mnvaddfriendsfragment.mnvAnalytics = (MnvAnalytics)provider.get();
    }

    public static void injectMnvCases(MnvAddFriendsFragment mnvaddfriendsfragment, Provider provider)
    {
        mnvaddfriendsfragment.mnvCases = (MnvCases)provider.get();
    }

    public static void injectMnvUtil(MnvAddFriendsFragment mnvaddfriendsfragment, Provider provider)
    {
        mnvaddfriendsfragment.mnvUtil = (MnvUtil)provider.get();
    }

    public static void injectPermissionRequest(MnvAddFriendsFragment mnvaddfriendsfragment, Provider provider)
    {
        mnvaddfriendsfragment.permissionRequest = (PermissionRequest)provider.get();
    }

    public final void injectMembers(MnvAddFriendsFragment mnvaddfriendsfragment)
    {
        if (mnvaddfriendsfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(mnvaddfriendsfragment, objectInterfaceFinderProvider);
            mnvaddfriendsfragment.userPreferences = (UserPreferences)userPreferencesProvider.get();
            mnvaddfriendsfragment.navigation = (Navigation)navigationProvider.get();
            mnvaddfriendsfragment.mnvManager = (MnvManager)mnvManagerProvider.get();
            mnvaddfriendsfragment.mnvAnalytics = (MnvAnalytics)mnvAnalyticsProvider.get();
            mnvaddfriendsfragment.mnvCases = (MnvCases)mnvCasesProvider.get();
            mnvaddfriendsfragment.chatText = (ChatText)chatTextProvider.get();
            mnvaddfriendsfragment.mnvCases = (MnvCases)mnvCasesProvider.get();
            mnvaddfriendsfragment.mnvUtil = (MnvUtil)mnvUtilProvider.get();
            mnvaddfriendsfragment.configuration = (EcsConfiguration)configurationProvider.get();
            mnvaddfriendsfragment.mnvAnalytics = (MnvAnalytics)mnvAnalyticsProvider.get();
            mnvaddfriendsfragment.permissionRequest = (PermissionRequest)permissionRequestProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MnvAddFriendsFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/mnv/MnvAddFriendsFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
