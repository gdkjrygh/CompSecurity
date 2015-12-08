// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import android.app.Application;
import com.skype.android.config.ecs.EcsClient;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.telemetry.SCTManager;
import com.skype.android.util.NetworkUtil;
import com.skype.android.wakeup.ForegroundState;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.analytics:
//            AnalyticsInAppObserver, Analytics, AnalyticsPersistentStorage

public final class AnalyticsInAppObserver_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider analyticsPersistentStorageProvider;
    private final Provider analyticsProvider;
    private final Provider contextProvider;
    private final Provider ecsClientProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider eventBusProvider;
    private final Provider foregroundStateProvider;
    private final MembersInjector membersInjector;
    private final Provider networkUtilProvider;
    private final Provider sctmProvider;

    public AnalyticsInAppObserver_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
            Provider provider6, Provider provider7, Provider provider8, Provider provider9)
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
        analyticsProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        sctmProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        networkUtilProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        ecsClientProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        ecsConfigurationProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        foregroundStateProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        eventBusProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsPersistentStorageProvider = provider9;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9)
    {
        return new AnalyticsInAppObserver_Factory(membersinjector, provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public final AnalyticsInAppObserver get()
    {
        AnalyticsInAppObserver analyticsinappobserver = new AnalyticsInAppObserver((Application)contextProvider.get(), (Analytics)analyticsProvider.get(), (SCTManager)sctmProvider.get(), (NetworkUtil)networkUtilProvider.get(), (EcsClient)ecsClientProvider.get(), (EcsConfiguration)ecsConfigurationProvider.get(), accountProvider, (ForegroundState)foregroundStateProvider.get(), (EventBus)eventBusProvider.get(), (AnalyticsPersistentStorage)analyticsPersistentStorageProvider.get());
        membersInjector.injectMembers(analyticsinappobserver);
        return analyticsinappobserver;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/analytics/AnalyticsInAppObserver_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
