// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.metrics;

import android.app.Application;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.phunware.nbc.sochi.metrics:
//            TrackingHelper

public final class TrackingHelper_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider applicationProvider;
    private final MembersInjector membersInjector;

    public TrackingHelper_Factory(MembersInjector membersinjector, Provider provider)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            applicationProvider = provider;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider)
    {
        return new TrackingHelper_Factory(membersinjector, provider);
    }

    public TrackingHelper get()
    {
        TrackingHelper trackinghelper = new TrackingHelper((Application)applicationProvider.get());
        membersInjector.injectMembers(trackinghelper);
        return trackinghelper;
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/phunware/nbc/sochi/metrics/TrackingHelper_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
