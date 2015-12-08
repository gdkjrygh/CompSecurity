// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.NavigationUrl;
import com.skype.android.app.chat.ChatServiceMonitor;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.res.ChatText;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.SkypeCredit;
import com.skype.android.util.cache.ContactMoodCache;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.account:
//            MyInfoFragment

public final class MyInfoFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider analyticsProvider;
    private final Provider chatServiceMonitorProvider;
    private final Provider chatTextProvider;
    private final Provider contactUtilProvider;
    private final Provider creditProvider;
    private final Provider defaultAvatarsProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider imageCacheProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider navProvider;
    private final Provider navUrlProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider spannedTextProvider;
    private final Provider typeFaceFactoryProvider;
    private final Provider userPrefsProvider;

    public MyInfoFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17)
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
        analyticsProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        navProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        navUrlProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        creditProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        typeFaceFactoryProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        spannedTextProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        chatTextProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        userPrefsProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        defaultAvatarsProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        }
        chatServiceMonitorProvider = provider15;
        if (!$assertionsDisabled && provider16 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider16;
        if (!$assertionsDisabled && provider17 == null)
        {
            throw new AssertionError();
        } else
        {
            ecsConfigurationProvider = provider17;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17)
    {
        return new MyInfoFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }

    public static void injectAccount(MyInfoFragment myinfofragment, Provider provider)
    {
        myinfofragment.account = (Account)provider.get();
    }

    public static void injectAnalytics(MyInfoFragment myinfofragment, Provider provider)
    {
        myinfofragment.analytics = (Analytics)provider.get();
    }

    public static void injectChatServiceMonitor(MyInfoFragment myinfofragment, Provider provider)
    {
        myinfofragment.chatServiceMonitor = (ChatServiceMonitor)provider.get();
    }

    public static void injectChatText(MyInfoFragment myinfofragment, Provider provider)
    {
        myinfofragment.chatText = (ChatText)provider.get();
    }

    public static void injectContactUtil(MyInfoFragment myinfofragment, Provider provider)
    {
        myinfofragment.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectCredit(MyInfoFragment myinfofragment, Provider provider)
    {
        myinfofragment.credit = (SkypeCredit)provider.get();
    }

    public static void injectDefaultAvatars(MyInfoFragment myinfofragment, Provider provider)
    {
        myinfofragment.defaultAvatars = (DefaultAvatars)provider.get();
    }

    public static void injectEcsConfiguration(MyInfoFragment myinfofragment, Provider provider)
    {
        myinfofragment.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectImageCache(MyInfoFragment myinfofragment, Provider provider)
    {
        myinfofragment.imageCache = (ImageCache)provider.get();
    }

    public static void injectLayoutExperience(MyInfoFragment myinfofragment, Provider provider)
    {
        myinfofragment.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectLib(MyInfoFragment myinfofragment, Provider provider)
    {
        myinfofragment.lib = (SkyLib)provider.get();
    }

    public static void injectMap(MyInfoFragment myinfofragment, Provider provider)
    {
        myinfofragment.map = (ObjectIdMap)provider.get();
    }

    public static void injectNav(MyInfoFragment myinfofragment, Provider provider)
    {
        myinfofragment.nav = (Navigation)provider.get();
    }

    public static void injectNavUrl(MyInfoFragment myinfofragment, Provider provider)
    {
        myinfofragment.navUrl = (NavigationUrl)provider.get();
    }

    public static void injectSpannedText(MyInfoFragment myinfofragment, Provider provider)
    {
        myinfofragment.spannedText = (ContactMoodCache)provider.get();
    }

    public static void injectTypeFaceFactory(MyInfoFragment myinfofragment, Provider provider)
    {
        myinfofragment.typeFaceFactory = (TypeFaceFactory)provider.get();
    }

    public static void injectUserPrefs(MyInfoFragment myinfofragment, Provider provider)
    {
        myinfofragment.userPrefs = (UserPreferences)provider.get();
    }

    public final void injectMembers(MyInfoFragment myinfofragment)
    {
        if (myinfofragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(myinfofragment, objectInterfaceFinderProvider);
            myinfofragment.analytics = (Analytics)analyticsProvider.get();
            myinfofragment.nav = (Navigation)navProvider.get();
            myinfofragment.navUrl = (NavigationUrl)navUrlProvider.get();
            myinfofragment.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            myinfofragment.lib = (SkyLib)libProvider.get();
            myinfofragment.contactUtil = (ContactUtil)contactUtilProvider.get();
            myinfofragment.imageCache = (ImageCache)imageCacheProvider.get();
            myinfofragment.account = (Account)accountProvider.get();
            myinfofragment.credit = (SkypeCredit)creditProvider.get();
            myinfofragment.typeFaceFactory = (TypeFaceFactory)typeFaceFactoryProvider.get();
            myinfofragment.spannedText = (ContactMoodCache)spannedTextProvider.get();
            myinfofragment.chatText = (ChatText)chatTextProvider.get();
            myinfofragment.userPrefs = (UserPreferences)userPrefsProvider.get();
            myinfofragment.defaultAvatars = (DefaultAvatars)defaultAvatarsProvider.get();
            myinfofragment.chatServiceMonitor = (ChatServiceMonitor)chatServiceMonitorProvider.get();
            myinfofragment.map = (ObjectIdMap)mapProvider.get();
            myinfofragment.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MyInfoFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/account/MyInfoFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
