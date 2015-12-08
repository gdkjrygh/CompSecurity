// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.analytics:
//            AnalyticsLifecycleObserver, SessionReporter

public final class AnalyticsLifecycleObserver_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;
    private final MembersInjector membersInjector;
    private final Provider sessionReporterProvider;

    public AnalyticsLifecycleObserver_Factory(MembersInjector membersinjector, Provider provider, Provider provider1)
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
        } else
        {
            sessionReporterProvider = provider1;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1)
    {
        return new AnalyticsLifecycleObserver_Factory(membersinjector, provider, provider1);
    }

    public final AnalyticsLifecycleObserver get()
    {
        AnalyticsLifecycleObserver analyticslifecycleobserver = new AnalyticsLifecycleObserver((Context)contextProvider.get(), (SessionReporter)sessionReporterProvider.get());
        membersInjector.injectMembers(analyticslifecycleobserver);
        return analyticslifecycleobserver;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/analytics/AnalyticsLifecycleObserver_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
