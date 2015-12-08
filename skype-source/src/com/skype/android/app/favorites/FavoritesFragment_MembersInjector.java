// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.favorites;

import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.SkypeListFragment_MembersInjector;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.favorites:
//            FavoritesFragment, FavoriteGridListAdapter, a

public final class FavoritesFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityAndAccessibilityUtilProvider;
    private final Provider accountProvider;
    private final Provider adapterProvider;
    private final Provider asyncProvider;
    private final Provider conversationUtilProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider navProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider taskProvider;

    public FavoritesFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10)
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
        accessibilityAndAccessibilityUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        asyncProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        navProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        adapterProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        taskProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        } else
        {
            mapProvider = provider10;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10)
    {
        return new FavoritesFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static void injectAccessibility(FavoritesFragment favoritesfragment, Provider provider)
    {
        favoritesfragment.accessibility = (AccessibilityUtil)provider.get();
    }

    public static void injectAccount(FavoritesFragment favoritesfragment, Provider provider)
    {
        favoritesfragment.account = (Account)provider.get();
    }

    public static void injectAdapter(FavoritesFragment favoritesfragment, Provider provider)
    {
        favoritesfragment.adapter = (FavoriteGridListAdapter)provider.get();
    }

    public static void injectAsync(FavoritesFragment favoritesfragment, Provider provider)
    {
        favoritesfragment.async = (AsyncService)provider.get();
    }

    public static void injectConversationUtil(FavoritesFragment favoritesfragment, Provider provider)
    {
        favoritesfragment.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectLayoutExperience(FavoritesFragment favoritesfragment, Provider provider)
    {
        favoritesfragment.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectLib(FavoritesFragment favoritesfragment, Provider provider)
    {
        favoritesfragment.lib = (SkyLib)provider.get();
    }

    public static void injectMap(FavoritesFragment favoritesfragment, Provider provider)
    {
        favoritesfragment.map = (ObjectIdMap)provider.get();
    }

    public static void injectNav(FavoritesFragment favoritesfragment, Provider provider)
    {
        favoritesfragment.nav = (Navigation)provider.get();
    }

    public static void injectTask(FavoritesFragment favoritesfragment, Provider provider)
    {
        favoritesfragment.task = (a)provider.get();
    }

    public final void injectMembers(FavoritesFragment favoritesfragment)
    {
        if (favoritesfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(favoritesfragment, objectInterfaceFinderProvider);
            SkypeListFragment_MembersInjector.injectAccessibilityUtil(favoritesfragment, accessibilityAndAccessibilityUtilProvider);
            favoritesfragment.account = (Account)accountProvider.get();
            favoritesfragment.async = (AsyncService)asyncProvider.get();
            favoritesfragment.nav = (Navigation)navProvider.get();
            favoritesfragment.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            favoritesfragment.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            favoritesfragment.adapter = (FavoriteGridListAdapter)adapterProvider.get();
            favoritesfragment.task = (a)taskProvider.get();
            favoritesfragment.lib = (SkyLib)libProvider.get();
            favoritesfragment.map = (ObjectIdMap)mapProvider.get();
            favoritesfragment.accessibility = (AccessibilityUtil)accessibilityAndAccessibilityUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((FavoritesFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/favorites/FavoritesFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
