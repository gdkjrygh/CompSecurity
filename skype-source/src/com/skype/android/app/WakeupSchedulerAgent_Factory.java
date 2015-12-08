// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.app.Application;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.inject.LoginManager;
import com.skype.android.wakeup.DreamKeeper;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app:
//            WakeupSchedulerAgent

public final class WakeupSchedulerAgent_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider configProvider;
    private final Provider contextProvider;
    private final Provider dreamKeeperProvider;
    private final Provider loginManagerProvider;
    private final MembersInjector membersInjector;
    private final Provider skyLibProvider;

    public WakeupSchedulerAgent_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
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
        configProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        dreamKeeperProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        skyLibProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        } else
        {
            loginManagerProvider = provider4;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        return new WakeupSchedulerAgent_Factory(membersinjector, provider, provider1, provider2, provider3, provider4);
    }

    public final WakeupSchedulerAgent get()
    {
        WakeupSchedulerAgent wakeupscheduleragent = new WakeupSchedulerAgent((Application)contextProvider.get(), (ApplicationConfig)configProvider.get(), (DreamKeeper)dreamKeeperProvider.get(), skyLibProvider, (LoginManager)loginManagerProvider.get());
        membersInjector.injectMembers(wakeupscheduleragent);
        return wakeupscheduleragent;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/WakeupSchedulerAgent_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
