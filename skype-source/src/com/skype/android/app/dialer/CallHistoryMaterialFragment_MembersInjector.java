// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import com.skype.SkyLib;
import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.SkypeListFragment_MembersInjector;
import com.skype.android.app.Navigation;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.dialer:
//            CallHistoryMaterialAdapter, CallHistoryMaterialFragment

public final class CallHistoryMaterialFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityUtilProvider;
    private final Provider adapterProvider;
    private final Provider asyncProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider imageCacheProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;

    public CallHistoryMaterialFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
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
        accessibilityUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        asyncProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        adapterProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        } else
        {
            contactUtilProvider = provider9;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9)
    {
        return new CallHistoryMaterialFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static void injectAdapter(CallHistoryMaterialFragment callhistorymaterialfragment, Provider provider)
    {
        callhistorymaterialfragment.adapter = (CallHistoryMaterialAdapter)provider.get();
    }

    public static void injectAsync(CallHistoryMaterialFragment callhistorymaterialfragment, Provider provider)
    {
        callhistorymaterialfragment.async = (AsyncService)provider.get();
    }

    public static void injectContactUtil(CallHistoryMaterialFragment callhistorymaterialfragment, Provider provider)
    {
        callhistorymaterialfragment.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectConversationUtil(CallHistoryMaterialFragment callhistorymaterialfragment, Provider provider)
    {
        callhistorymaterialfragment.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectImageCache(CallHistoryMaterialFragment callhistorymaterialfragment, Provider provider)
    {
        callhistorymaterialfragment.imageCache = (ImageCache)provider.get();
    }

    public static void injectLib(CallHistoryMaterialFragment callhistorymaterialfragment, Provider provider)
    {
        callhistorymaterialfragment.lib = (SkyLib)provider.get();
    }

    public static void injectMap(CallHistoryMaterialFragment callhistorymaterialfragment, Provider provider)
    {
        callhistorymaterialfragment.map = (ObjectIdMap)provider.get();
    }

    public static void injectNavigation(CallHistoryMaterialFragment callhistorymaterialfragment, Provider provider)
    {
        callhistorymaterialfragment.navigation = (Navigation)provider.get();
    }

    public final void injectMembers(CallHistoryMaterialFragment callhistorymaterialfragment)
    {
        if (callhistorymaterialfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(callhistorymaterialfragment, objectInterfaceFinderProvider);
            SkypeListFragment_MembersInjector.injectAccessibilityUtil(callhistorymaterialfragment, accessibilityUtilProvider);
            callhistorymaterialfragment.lib = (SkyLib)libProvider.get();
            callhistorymaterialfragment.async = (AsyncService)asyncProvider.get();
            callhistorymaterialfragment.adapter = (CallHistoryMaterialAdapter)adapterProvider.get();
            callhistorymaterialfragment.navigation = (Navigation)navigationProvider.get();
            callhistorymaterialfragment.map = (ObjectIdMap)mapProvider.get();
            callhistorymaterialfragment.imageCache = (ImageCache)imageCacheProvider.get();
            callhistorymaterialfragment.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            callhistorymaterialfragment.contactUtil = (ContactUtil)contactUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CallHistoryMaterialFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/dialer/CallHistoryMaterialFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
