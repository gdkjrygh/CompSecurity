// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.app.Application;
import com.skype.SkyLib;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.config.ecs.EcsClient;
import com.skype.android.telemetry.SCTManager;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.util:
//            TimeAnomalyTelemetry, NetworkUtil

public final class TimeAnomalyTelemetry_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;
    private final Provider ecsClientProvider;
    private final Provider libProvider;
    private final MembersInjector membersInjector;
    private final Provider networkUtilProvider;
    private final Provider sctManagerProvider;
    private final Provider storageProvider;

    public TimeAnomalyTelemetry_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
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
        sctManagerProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        ecsClientProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        networkUtilProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        storageProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        } else
        {
            libProvider = provider5;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        return new TimeAnomalyTelemetry_Factory(membersinjector, provider, provider1, provider2, provider3, provider4, provider5);
    }

    public final TimeAnomalyTelemetry get()
    {
        TimeAnomalyTelemetry timeanomalytelemetry = new TimeAnomalyTelemetry((Application)contextProvider.get(), (SCTManager)sctManagerProvider.get(), (EcsClient)ecsClientProvider.get(), (NetworkUtil)networkUtilProvider.get(), (AnalyticsPersistentStorage)storageProvider.get(), (SkyLib)libProvider.get());
        membersInjector.injectMembers(timeanomalytelemetry);
        return timeanomalytelemetry;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/util/TimeAnomalyTelemetry_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
