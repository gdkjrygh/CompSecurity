// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.shortcircuit;

import com.skype.SkyLib;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.util.ContactUtil;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.shortcircuit:
//            PromotedSCDContactsManager

public final class PromotedSCDContactsManager_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider configurationProvider;
    private final Provider contactUtilProvider;
    private final Provider eventBusProvider;
    private final Provider libProvider;
    private final MembersInjector membersInjector;
    private final Provider userPrefsProvider;

    public PromotedSCDContactsManager_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        libProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        userPrefsProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        } else
        {
            eventBusProvider = provider4;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        return new PromotedSCDContactsManager_Factory(membersinjector, provider, provider1, provider2, provider3, provider4);
    }

    public final PromotedSCDContactsManager get()
    {
        PromotedSCDContactsManager promotedscdcontactsmanager = new PromotedSCDContactsManager((SkyLib)libProvider.get(), (ContactUtil)contactUtilProvider.get(), userPrefsProvider, (EcsConfiguration)configurationProvider.get(), (EventBus)eventBusProvider.get());
        membersInjector.injectMembers(promotedscdcontactsmanager);
        return promotedscdcontactsmanager;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/shortcircuit/PromotedSCDContactsManager_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
