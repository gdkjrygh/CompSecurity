// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.wakeup.DreamKeeper;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.sync:
//            ContactsIngestManager

public final class ContactsIngestManager_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider analyticsProvider;
    private final Provider configurationProvider;
    private final Provider contactsIngestTaskProvider;
    private final Provider dreamKeeperProvider;
    private final Provider eventBusProvider;
    private final Provider libProvider;
    private final Provider userPrefsProvider;

    public ContactsIngestManager_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        userPrefsProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        contactsIngestTaskProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        dreamKeeperProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        } else
        {
            eventBusProvider = provider7;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7)
    {
        return new ContactsIngestManager_Factory(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public final ContactsIngestManager get()
    {
        return new ContactsIngestManager(userPrefsProvider, (EcsConfiguration)configurationProvider.get(), (SkyLib)libProvider.get(), accountProvider, (Analytics)analyticsProvider.get(), contactsIngestTaskProvider, (DreamKeeper)dreamKeeperProvider.get(), (EventBus)eventBusProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/sync/ContactsIngestManager_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
