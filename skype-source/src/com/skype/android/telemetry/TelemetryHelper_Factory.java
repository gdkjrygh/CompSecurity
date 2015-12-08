// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.telemetry;

import android.app.Application;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.config.ecs.EcsClient;
import com.skype.android.util.NetworkUtil;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.telemetry:
//            TelemetryHelper, SCTManager

public final class TelemetryHelper_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;
    private final Provider ecsClientProvider;
    private final Provider networkUtilProvider;
    private final Provider sctManagerProvider;
    private final Provider storageProvider;

    public TelemetryHelper_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
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
        } else
        {
            storageProvider = provider4;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        return new TelemetryHelper_Factory(provider, provider1, provider2, provider3, provider4);
    }

    public final TelemetryHelper get()
    {
        return new TelemetryHelper((Application)contextProvider.get(), (SCTManager)sctManagerProvider.get(), (EcsClient)ecsClientProvider.get(), (NetworkUtil)networkUtilProvider.get(), (AnalyticsPersistentStorage)storageProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/telemetry/TelemetryHelper_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
