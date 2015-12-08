// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.android.app.Agent_MembersInjector;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.calling:
//            CallAgent

public final class CallAgent_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider userPrefsProvider;

    public CallAgent_MembersInjector(Provider provider, Provider provider1)
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
        return new CallAgent_MembersInjector(provider, provider1);
    }

    public final void injectMembers(CallAgent callagent)
    {
        if (callagent == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            Agent_MembersInjector.injectAccountProvider(callagent, accountProvider);
            Agent_MembersInjector.injectUserPrefsProvider(callagent, userPrefsProvider);
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CallAgent)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/calling/CallAgent_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
