// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.app.Navigation;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.GroupAvatarUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            SideBarFragment

public final class SideBarFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider defaultAvatarsProvider;
    private final Provider groupAvatarUtilProvider;
    private final Provider imageCacheProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;

    public SideBarFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
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
        imageCacheProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        accessibilityProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        defaultAvatarsProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        } else
        {
            groupAvatarUtilProvider = provider7;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7)
    {
        return new SideBarFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static void injectAccessibility(SideBarFragment sidebarfragment, Provider provider)
    {
        sidebarfragment.accessibility = (AccessibilityUtil)provider.get();
    }

    public static void injectContactUtil(SideBarFragment sidebarfragment, Provider provider)
    {
        sidebarfragment.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectConversationUtil(SideBarFragment sidebarfragment, Provider provider)
    {
        sidebarfragment.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectDefaultAvatars(SideBarFragment sidebarfragment, Provider provider)
    {
        sidebarfragment.defaultAvatars = (DefaultAvatars)provider.get();
    }

    public static void injectGroupAvatarUtil(SideBarFragment sidebarfragment, Provider provider)
    {
        sidebarfragment.groupAvatarUtil = (GroupAvatarUtil)provider.get();
    }

    public static void injectImageCache(SideBarFragment sidebarfragment, Provider provider)
    {
        sidebarfragment.imageCache = (ImageCache)provider.get();
    }

    public static void injectNavigation(SideBarFragment sidebarfragment, Provider provider)
    {
        sidebarfragment.navigation = (Navigation)provider.get();
    }

    public final void injectMembers(SideBarFragment sidebarfragment)
    {
        if (sidebarfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(sidebarfragment, objectInterfaceFinderProvider);
            sidebarfragment.imageCache = (ImageCache)imageCacheProvider.get();
            sidebarfragment.contactUtil = (ContactUtil)contactUtilProvider.get();
            sidebarfragment.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            sidebarfragment.navigation = (Navigation)navigationProvider.get();
            sidebarfragment.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            sidebarfragment.defaultAvatars = (DefaultAvatars)defaultAvatarsProvider.get();
            sidebarfragment.groupAvatarUtil = (GroupAvatarUtil)groupAvatarUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SideBarFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/SideBarFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
