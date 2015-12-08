// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.SkyLib;
import com.skype.android.util.NetworkUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.calling:
//            SeamlessCapabilityReceiver

public final class SeamlessCapabilityReceiver_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider libProvider;
    private final Provider networkUtilProvider;

    public SeamlessCapabilityReceiver_MembersInjector(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        libProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            networkUtilProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1)
    {
        return new SeamlessCapabilityReceiver_MembersInjector(provider, provider1);
    }

    public static void injectLib(SeamlessCapabilityReceiver seamlesscapabilityreceiver, Provider provider)
    {
        seamlesscapabilityreceiver.lib = (SkyLib)provider.get();
    }

    public static void injectNetworkUtil(SeamlessCapabilityReceiver seamlesscapabilityreceiver, Provider provider)
    {
        seamlesscapabilityreceiver.networkUtil = (NetworkUtil)provider.get();
    }

    public final void injectMembers(SeamlessCapabilityReceiver seamlesscapabilityreceiver)
    {
        if (seamlesscapabilityreceiver == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            seamlesscapabilityreceiver.lib = (SkyLib)libProvider.get();
            seamlesscapabilityreceiver.networkUtil = (NetworkUtil)networkUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SeamlessCapabilityReceiver)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/calling/SeamlessCapabilityReceiver_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
