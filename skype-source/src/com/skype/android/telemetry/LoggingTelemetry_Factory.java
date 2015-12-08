// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.telemetry;

import android.app.Application;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.config.ecs.EcsClient;
import com.skype.android.util.NetworkUtil;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.telemetry:
//            LoggingTelemetry, SCTManager

public final class LoggingTelemetry_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;
    private final Provider ecsClientProvider;
    private final MembersInjector membersInjector;
    private final Provider networkUtilProvider;
    private final Provider sctManagerProvider;
    private final Provider storageProvider;

    public LoggingTelemetry_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
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
        } else
        {
            storageProvider = provider4;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        return new LoggingTelemetry_Factory(membersinjector, provider, provider1, provider2, provider3, provider4);
    }

    public final LoggingTelemetry get()
    {
        LoggingTelemetry loggingtelemetry = new LoggingTelemetry((Application)contextProvider.get(), (SCTManager)sctManagerProvider.get(), (EcsClient)ecsClientProvider.get(), (NetworkUtil)networkUtilProvider.get(), (AnalyticsPersistentStorage)storageProvider.get());
        membersInjector.injectMembers(loggingtelemetry);
        return loggingtelemetry;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/telemetry/LoggingTelemetry_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
