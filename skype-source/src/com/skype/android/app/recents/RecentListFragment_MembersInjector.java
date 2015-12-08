// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.recents;

import com.skype.SkyLib;
import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.SkypeListFragment_MembersInjector;
import com.skype.android.ads.AdPlacer;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.recents:
//            RecentListFragment, RecentAdapter

public final class RecentListFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityUtilProvider;
    private final Provider adPlacerProvider;
    private final Provider adapterProvider;
    private final Provider analyticsProvider;
    private final Provider asyncProvider;
    private final Provider configurationProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider imageCacheProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;

    public RecentListFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13)
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
        accessibilityUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        asyncProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        adapterProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        adPlacerProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        } else
        {
            configurationProvider = provider13;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13)
    {
        return new RecentListFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static void injectAccessibilityUtil(RecentListFragment recentlistfragment, Provider provider)
    {
        recentlistfragment.accessibilityUtil = (AccessibilityUtil)provider.get();
    }

    public static void injectAdPlacer(RecentListFragment recentlistfragment, Provider provider)
    {
        recentlistfragment.adPlacer = (AdPlacer)provider.get();
    }

    public static void injectAdapter(RecentListFragment recentlistfragment, Provider provider)
    {
        recentlistfragment.adapter = (RecentAdapter)provider.get();
    }

    public static void injectAnalytics(RecentListFragment recentlistfragment, Provider provider)
    {
        recentlistfragment.analytics = (Analytics)provider.get();
    }

    public static void injectAsync(RecentListFragment recentlistfragment, Provider provider)
    {
        recentlistfragment.async = (AsyncService)provider.get();
    }

    public static void injectConfiguration(RecentListFragment recentlistfragment, Provider provider)
    {
        recentlistfragment.configuration = (EcsConfiguration)provider.get();
    }

    public static void injectContactUtil(RecentListFragment recentlistfragment, Provider provider)
    {
        recentlistfragment.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectConversationUtil(RecentListFragment recentlistfragment, Provider provider)
    {
        recentlistfragment.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectImageCache(RecentListFragment recentlistfragment, Provider provider)
    {
        recentlistfragment.imageCache = (ImageCache)provider.get();
    }

    public static void injectLayoutExperience(RecentListFragment recentlistfragment, Provider provider)
    {
        recentlistfragment.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectLib(RecentListFragment recentlistfragment, Provider provider)
    {
        recentlistfragment.lib = (SkyLib)provider.get();
    }

    public static void injectMap(RecentListFragment recentlistfragment, Provider provider)
    {
        recentlistfragment.map = (ObjectIdMap)provider.get();
    }

    public static void injectNavigation(RecentListFragment recentlistfragment, Provider provider)
    {
        recentlistfragment.navigation = (Navigation)provider.get();
    }

    public final void injectMembers(RecentListFragment recentlistfragment)
    {
        if (recentlistfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(recentlistfragment, objectInterfaceFinderProvider);
            SkypeListFragment_MembersInjector.injectAccessibilityUtil(recentlistfragment, accessibilityUtilProvider);
            recentlistfragment.navigation = (Navigation)navigationProvider.get();
            recentlistfragment.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            recentlistfragment.async = (AsyncService)asyncProvider.get();
            recentlistfragment.lib = (SkyLib)libProvider.get();
            recentlistfragment.map = (ObjectIdMap)mapProvider.get();
            recentlistfragment.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            recentlistfragment.contactUtil = (ContactUtil)contactUtilProvider.get();
            recentlistfragment.adapter = (RecentAdapter)adapterProvider.get();
            recentlistfragment.adPlacer = (AdPlacer)adPlacerProvider.get();
            recentlistfragment.accessibilityUtil = (AccessibilityUtil)accessibilityUtilProvider.get();
            recentlistfragment.analytics = (Analytics)analyticsProvider.get();
            recentlistfragment.imageCache = (ImageCache)imageCacheProvider.get();
            recentlistfragment.configuration = (EcsConfiguration)configurationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((RecentListFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/recents/RecentListFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
