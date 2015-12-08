// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.app.Application;
import com.skype.SkyLib;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.config.ecs.EcsClient;
import com.skype.android.event.EventBus;
import com.skype.android.inject.AccountProvider;
import com.skype.android.inject.LoginManager;
import com.skype.android.telemetry.SCTManager;
import com.skype.android.util.NetworkUtil;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.push:
//            SkypePushListener, CallPushMessageListener, PushMessageRepository, PushToMobileMessageListener, 
//            ConciergePushMessageListener

public final class SkypePushListener_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider apsAndStorageProvider;
    private final Provider callPushMessageListenerProvider;
    private final Provider conciergePushMessageListenerProvider;
    private final Provider contextProvider;
    private final Provider ecsClientProvider;
    private final Provider eventBusProvider;
    private final Provider libProvider;
    private final Provider loginManagerProvider;
    private final Provider networkUtilProvider;
    private final Provider pushMessageRepositoryProvider;
    private final Provider pushToMobileMessageListenerProvider;
    private final Provider sctManagerProvider;

    public SkypePushListener_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        sctManagerProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        loginManagerProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        networkUtilProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        ecsClientProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        eventBusProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        apsAndStorageProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        callPushMessageListenerProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        pushMessageRepositoryProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        pushToMobileMessageListenerProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        } else
        {
            conciergePushMessageListenerProvider = provider12;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
    {
        return new SkypePushListener_Factory(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public final SkypePushListener get()
    {
        return new SkypePushListener((Application)contextProvider.get(), (SkyLib)libProvider.get(), (SCTManager)sctManagerProvider.get(), (LoginManager)loginManagerProvider.get(), (NetworkUtil)networkUtilProvider.get(), (AccountProvider)accountProvider.get(), (EcsClient)ecsClientProvider.get(), (EventBus)eventBusProvider.get(), (AnalyticsPersistentStorage)apsAndStorageProvider.get(), (CallPushMessageListener)callPushMessageListenerProvider.get(), (PushMessageRepository)pushMessageRepositoryProvider.get(), (PushToMobileMessageListener)pushToMobileMessageListenerProvider.get(), (ConciergePushMessageListener)conciergePushMessageListenerProvider.get(), (AnalyticsPersistentStorage)apsAndStorageProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/push/SkypePushListener_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
