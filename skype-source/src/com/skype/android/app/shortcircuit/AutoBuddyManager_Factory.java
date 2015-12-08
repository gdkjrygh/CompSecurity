// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.shortcircuit;

import com.skype.android.app.token.SkypeTokenAccess;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.sync.ContactsIngestManager;
import com.skype.android.util.HttpUtil;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.shortcircuit:
//            AutoBuddyManager

public final class AutoBuddyManager_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contactsIngestManagerProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider eventBusProvider;
    private final Provider httpUtilProvider;
    private final Provider skypeTokenAccessProvider;
    private final Provider userPrefsProvider;

    public AutoBuddyManager_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contactsIngestManagerProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        userPrefsProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        skypeTokenAccessProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        httpUtilProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        eventBusProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        } else
        {
            ecsConfigurationProvider = provider5;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        return new AutoBuddyManager_Factory(provider, provider1, provider2, provider3, provider4, provider5);
    }

    public final AutoBuddyManager get()
    {
        return new AutoBuddyManager((ContactsIngestManager)contactsIngestManagerProvider.get(), userPrefsProvider, (SkypeTokenAccess)skypeTokenAccessProvider.get(), (HttpUtil)httpUtilProvider.get(), (EventBus)eventBusProvider.get(), (EcsConfiguration)ecsConfigurationProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/shortcircuit/AutoBuddyManager_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
