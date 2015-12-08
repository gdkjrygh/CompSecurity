// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.service;

import android.app.Application;
import com.skype.SkyLib;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.sync.ContactsObserver;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.service:
//            ContactsScrapeAgent

public final class ContactsScrapeAgent_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider configurationProvider;
    private final Provider contactObserverProvider;
    private final Provider contextProvider;
    private final Provider libProvider;
    private final MembersInjector membersInjector;

    public ContactsScrapeAgent_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3)
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
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        contactObserverProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            libProvider = provider3;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new ContactsScrapeAgent_Factory(membersinjector, provider, provider1, provider2, provider3);
    }

    public final ContactsScrapeAgent get()
    {
        ContactsScrapeAgent contactsscrapeagent = new ContactsScrapeAgent((Application)contextProvider.get(), (ContactsObserver)contactObserverProvider.get(), (EcsConfiguration)configurationProvider.get(), (SkyLib)libProvider.get());
        membersInjector.injectMembers(contactsscrapeagent);
        return contactsscrapeagent;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/service/ContactsScrapeAgent_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
