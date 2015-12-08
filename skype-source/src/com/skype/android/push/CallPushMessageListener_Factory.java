// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import com.skype.SkyLib;
import com.skype.android.event.EventBus;
import com.skype.android.inject.LoginManager;
import com.skype.android.wakeup.DreamKeeper;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.push:
//            CallPushMessageListener

public final class CallPushMessageListener_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider dreamKeeperProvider;
    private final Provider eventBusProvider;
    private final Provider libProvider;
    private final Provider loginManagerProvider;

    public CallPushMessageListener_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        loginManagerProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        dreamKeeperProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            eventBusProvider = provider3;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new CallPushMessageListener_Factory(provider, provider1, provider2, provider3);
    }

    public final CallPushMessageListener get()
    {
        return new CallPushMessageListener((LoginManager)loginManagerProvider.get(), (SkyLib)libProvider.get(), (DreamKeeper)dreamKeeperProvider.get(), (EventBus)eventBusProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/push/CallPushMessageListener_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
