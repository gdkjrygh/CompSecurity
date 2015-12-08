// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.push:
//            PushMessageRepository, PushHandlingHelper

public final class PushMessageRepository_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider configurationProvider;
    private final Provider eventBusProvider;
    private final Provider pushHandlingHelperProvider;

    public PushMessageRepository_Factory(Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        pushHandlingHelperProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            eventBusProvider = provider2;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2)
    {
        return new PushMessageRepository_Factory(provider, provider1, provider2);
    }

    public final PushMessageRepository get()
    {
        return new PushMessageRepository((EcsConfiguration)configurationProvider.get(), (PushHandlingHelper)pushHandlingHelperProvider.get(), (EventBus)eventBusProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/push/PushMessageRepository_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
