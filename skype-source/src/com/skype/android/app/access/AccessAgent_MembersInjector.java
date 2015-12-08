// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.access;

import com.skype.SkyLib;
import com.skype.android.app.Agent_MembersInjector;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.access:
//            AccessAgent

public final class AccessAgent_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider libProvider;
    private final Provider userPrefsProvider;

    public AccessAgent_MembersInjector(Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        userPrefsProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            libProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2)
    {
        return new AccessAgent_MembersInjector(provider, provider1, provider2);
    }

    public static void injectLib(AccessAgent accessagent, Provider provider)
    {
        accessagent.lib = (SkyLib)provider.get();
    }

    public final void injectMembers(AccessAgent accessagent)
    {
        if (accessagent == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            Agent_MembersInjector.injectAccountProvider(accessagent, accountProvider);
            Agent_MembersInjector.injectUserPrefsProvider(accessagent, userPrefsProvider);
            accessagent.lib = (SkyLib)libProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((AccessAgent)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/access/AccessAgent_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
