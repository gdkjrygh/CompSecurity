// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wearable;

import com.skype.SkyLib;
import com.skype.android.wakeup.DreamKeeper;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.wearable:
//            CarReadReceiver

public final class CarReadReceiver_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider dreamKeeperProvider;
    private final Provider libProvider;

    public CarReadReceiver_MembersInjector(Provider provider, Provider provider1)
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
            dreamKeeperProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1)
    {
        return new CarReadReceiver_MembersInjector(provider, provider1);
    }

    public static void injectDreamKeeper(CarReadReceiver carreadreceiver, Provider provider)
    {
        carreadreceiver.dreamKeeper = (DreamKeeper)provider.get();
    }

    public static void injectLib(CarReadReceiver carreadreceiver, Provider provider)
    {
        carreadreceiver.lib = (SkyLib)provider.get();
    }

    public final void injectMembers(CarReadReceiver carreadreceiver)
    {
        if (carreadreceiver == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            carreadreceiver.lib = (SkyLib)libProvider.get();
            carreadreceiver.dreamKeeper = (DreamKeeper)dreamKeeperProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CarReadReceiver)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/wearable/CarReadReceiver_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
