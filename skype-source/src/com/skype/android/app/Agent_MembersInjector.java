// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app:
//            Agent

public final class Agent_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider userPrefsProvider;

    public Agent_MembersInjector(Provider provider, Provider provider1)
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
        return new Agent_MembersInjector(provider, provider1);
    }

    public static void injectAccountProvider(Agent agent, Provider provider)
    {
        agent.accountProvider = provider;
    }

    public static void injectUserPrefsProvider(Agent agent, Provider provider)
    {
        agent.userPrefsProvider = provider;
    }

    public final void injectMembers(Agent agent)
    {
        if (agent == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            agent.accountProvider = accountProvider;
            agent.userPrefsProvider = userPrefsProvider;
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((Agent)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/Agent_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
