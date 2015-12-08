// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.Application;
import com.skype.android.analytics.Analytics;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactAgent

public final class ContactAgent_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider analyticsProvider;
    private final Provider contextProvider;
    private final MembersInjector membersInjector;

    public ContactAgent_Factory(MembersInjector membersinjector, Provider provider, Provider provider1)
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
        } else
        {
            analyticsProvider = provider1;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1)
    {
        return new ContactAgent_Factory(membersinjector, provider, provider1);
    }

    public final ContactAgent get()
    {
        ContactAgent contactagent = new ContactAgent((Application)contextProvider.get(), (Analytics)analyticsProvider.get());
        membersInjector.injectMembers(contactagent);
        return contactagent;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/contacts/ContactAgent_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
