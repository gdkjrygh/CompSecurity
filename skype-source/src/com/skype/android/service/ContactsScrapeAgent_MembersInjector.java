// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.service;

import com.skype.android.app.Agent_MembersInjector;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.service:
//            ContactsScrapeAgent

public final class ContactsScrapeAgent_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider userPrefsProvider;

    public ContactsScrapeAgent_MembersInjector(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            userPrefsProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1)
    {
        return new ContactsScrapeAgent_MembersInjector(provider, provider1);
    }

    public final void injectMembers(ContactsScrapeAgent contactsscrapeagent)
    {
        if (contactsscrapeagent == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            Agent_MembersInjector.injectAccountProvider(contactsscrapeagent, accountProvider);
            Agent_MembersInjector.injectUserPrefsProvider(contactsscrapeagent, userPrefsProvider);
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ContactsScrapeAgent)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/service/ContactsScrapeAgent_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
