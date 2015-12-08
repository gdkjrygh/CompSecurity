// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app:
//            Agent, WakeupSchedulerAgent

public final class WakeupSchedulerAgent_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider userPrefsProvider;

    public WakeupSchedulerAgent_MembersInjector(Provider provider, Provider provider1)
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
        return new WakeupSchedulerAgent_MembersInjector(provider, provider1);
    }

    public final void injectMembers(WakeupSchedulerAgent wakeupscheduleragent)
    {
        if (wakeupscheduleragent == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            wakeupscheduleragent.accountProvider = accountProvider;
            wakeupscheduleragent.userPrefsProvider = userPrefsProvider;
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((WakeupSchedulerAgent)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/WakeupSchedulerAgent_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
