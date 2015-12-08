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
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.dialer:
//            CallHistoryAdapter, CallHistoryFragment

public final class CallHistoryFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityUtilProvider;
    private final Provider adapterProvider;
    private final Provider asyncProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;

    public CallHistoryFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
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
        } else
        {
            mapProvider = provider6;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
    {
        return new CallHistoryFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6);
    }

    public static void injectAdapter(CallHistoryFragment callhistoryfragment, Provider provider)
    {
        callhistoryfragment.adapter = (CallHistoryAdapter)provider.get();
    }

    public static void injectAsync(CallHistoryFragment callhistoryfragment, Provider provider)
    {
        callhistoryfragment.async = (AsyncService)provider.get();
    }

    public static void injectLib(CallHistoryFragment callhistoryfragment, Provider provider)
    {
        callhistoryfragment.lib = (SkyLib)provider.get();
    }

    public static void injectMap(CallHistoryFragment callhistoryfragment, Provider provider)
    {
        callhistoryfragment.map = (ObjectIdMap)provider.get();
    }

    public static void injectNavigation(CallHistoryFragment callhistoryfragment, Provider provider)
    {
        callhistoryfragment.navigation = (Navigation)provider.get();
    }

    public final void injectMembers(CallHistoryFragment callhistoryfragment)
    {
        if (callhistoryfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(callhistoryfragment, objectInterfaceFinderProvider);
            SkypeListFragment_MembersInjector.injectAccessibilityUtil(callhistoryfragment, accessibilityUtilProvider);
            callhistoryfragment.lib = (SkyLib)libProvider.get();
            callhistoryfragment.async = (AsyncService)asyncProvider.get();
            callhistoryfragment.adapter = (CallHistoryAdapter)adapterProvider.get();
            callhistoryfragment.navigation = (Navigation)navigationProvider.get();
            callhistoryfragment.map = (ObjectIdMap)mapProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CallHistoryFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/dialer/CallHistoryFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
