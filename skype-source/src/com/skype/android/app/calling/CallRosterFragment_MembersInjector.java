// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.app.Navigation;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.calling:
//            CallRosterFragment

public final class CallRosterFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider defaultAvatarsProvider;
    private final Provider imageCacheProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;

    public CallRosterFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
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
        navigationProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        } else
        {
            defaultAvatarsProvider = provider5;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        return new CallRosterFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5);
    }

    public static void injectContactUtil(CallRosterFragment callrosterfragment, Provider provider)
    {
        callrosterfragment.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectConversationUtil(CallRosterFragment callrosterfragment, Provider provider)
    {
        callrosterfragment.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectDefaultAvatars(CallRosterFragment callrosterfragment, Provider provider)
    {
        callrosterfragment.defaultAvatars = (DefaultAvatars)provider.get();
    }

    public static void injectImageCache(CallRosterFragment callrosterfragment, Provider provider)
    {
        callrosterfragment.imageCache = (ImageCache)provider.get();
    }

    public static void injectNavigation(CallRosterFragment callrosterfragment, Provider provider)
    {
        callrosterfragment.navigation = (Navigation)provider.get();
    }

    public final void injectMembers(CallRosterFragment callrosterfragment)
    {
        if (callrosterfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(callrosterfragment, objectInterfaceFinderProvider);
            callrosterfragment.navigation = (Navigation)navigationProvider.get();
            callrosterfragment.imageCache = (ImageCache)imageCacheProvider.get();
            callrosterfragment.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            callrosterfragment.contactUtil = (ContactUtil)contactUtilProvider.get();
            callrosterfragment.defaultAvatars = (DefaultAvatars)defaultAvatarsProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CallRosterFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/calling/CallRosterFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
