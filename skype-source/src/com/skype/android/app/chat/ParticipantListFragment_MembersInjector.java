// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.SkypeListFragment_MembersInjector;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.GroupAvatarUtil;
import com.skype.android.util.ImageCache;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            ParticipantAdapter, ParticipantListFragment

public final class ParticipantListFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityUtilProvider;
    private final Provider adapterProvider;
    private final Provider conversationUtilProvider;
    private final Provider defaultAvatarsProvider;
    private final Provider groupAvatarUtilProvider;
    private final Provider imageCacheProvider;
    private final Provider layoutExperienceProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;

    public ParticipantListFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
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
        accessibilityUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        adapterProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        defaultAvatarsProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        } else
        {
            groupAvatarUtilProvider = provider8;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8)
    {
        return new ParticipantListFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static void injectAdapter(ParticipantListFragment participantlistfragment, Provider provider)
    {
        participantlistfragment.adapter = (ParticipantAdapter)provider.get();
    }

    public static void injectConversationUtil(ParticipantListFragment participantlistfragment, Provider provider)
    {
        participantlistfragment.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectDefaultAvatars(ParticipantListFragment participantlistfragment, Provider provider)
    {
        participantlistfragment.defaultAvatars = (DefaultAvatars)provider.get();
    }

    public static void injectGroupAvatarUtil(ParticipantListFragment participantlistfragment, Provider provider)
    {
        participantlistfragment.groupAvatarUtil = (GroupAvatarUtil)provider.get();
    }

    public static void injectImageCache(ParticipantListFragment participantlistfragment, Provider provider)
    {
        participantlistfragment.imageCache = (ImageCache)provider.get();
    }

    public static void injectLayoutExperience(ParticipantListFragment participantlistfragment, Provider provider)
    {
        participantlistfragment.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectNavigation(ParticipantListFragment participantlistfragment, Provider provider)
    {
        participantlistfragment.navigation = (Navigation)provider.get();
    }

    public final void injectMembers(ParticipantListFragment participantlistfragment)
    {
        if (participantlistfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(participantlistfragment, objectInterfaceFinderProvider);
            SkypeListFragment_MembersInjector.injectAccessibilityUtil(participantlistfragment, accessibilityUtilProvider);
            participantlistfragment.adapter = (ParticipantAdapter)adapterProvider.get();
            participantlistfragment.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            participantlistfragment.imageCache = (ImageCache)imageCacheProvider.get();
            participantlistfragment.navigation = (Navigation)navigationProvider.get();
            participantlistfragment.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            participantlistfragment.defaultAvatars = (DefaultAvatars)defaultAvatarsProvider.get();
            participantlistfragment.groupAvatarUtil = (GroupAvatarUtil)groupAvatarUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ParticipantListFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/ParticipantListFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
