// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import android.app.Application;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.telemetry.TelemetryProviderFactory;
import com.skype.telemetry.sdk.FlurryAccessInterface;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.analytics:
//            Analytics

public final class Analytics_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider applicationProvider;
    private final Provider asyncProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider flurryAccessProvider;
    private final MembersInjector membersInjector;
    private final Provider telemetryProviderFactoryProvider;

    public Analytics_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
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
        applicationProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        asyncProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        ecsConfigurationProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        flurryAccessProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        } else
        {
            telemetryProviderFactoryProvider = provider4;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        return new Analytics_Factory(membersinjector, provider, provider1, provider2, provider3, provider4);
    }

    public final Analytics get()
    {
        Analytics analytics = new Analytics((Application)applicationProvider.get(), (AsyncService)asyncProvider.get(), (EcsConfiguration)ecsConfigurationProvider.get(), (FlurryAccessInterface)flurryAccessProvider.get(), (TelemetryProviderFactory)telemetryProviderFactoryProvider.get());
        membersInjector.injectMembers(analytics);
        return analytics;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/analytics/Analytics_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
