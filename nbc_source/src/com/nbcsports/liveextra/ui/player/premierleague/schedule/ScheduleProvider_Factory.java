// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.schedule;

import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.schedule:
//            ScheduleProvider

public final class ScheduleProvider_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider engineProvider;
    private final MembersInjector membersInjector;
    private final Provider subscriberProvider;

    public ScheduleProvider_Factory(MembersInjector membersinjector, Provider provider, Provider provider1)
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
        engineProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            subscriberProvider = provider1;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1)
    {
        return new ScheduleProvider_Factory(membersinjector, provider, provider1);
    }

    public ScheduleProvider get()
    {
        ScheduleProvider scheduleprovider = new ScheduleProvider((PremierLeagueEngine)engineProvider.get(), (ScheduleProvider.ScheduleSubscriber)subscriberProvider.get());
        membersInjector.injectMembers(scheduleprovider);
        return scheduleprovider;
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/premierleague/schedule/ScheduleProvider_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
