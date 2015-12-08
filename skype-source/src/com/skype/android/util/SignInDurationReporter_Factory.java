// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.config.ecs.EcsConfiguration;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.util:
//            SignInDurationReporter

public final class SignInDurationReporter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider analyticsPersistentStorageProvider;
    private final Provider analyticsProvider;
    private final Provider configurationProvider;

    public SignInDurationReporter_Factory(Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsPersistentStorageProvider = provider2;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2)
    {
        return new SignInDurationReporter_Factory(provider, provider1, provider2);
    }

    public final SignInDurationReporter get()
    {
        return new SignInDurationReporter((Analytics)analyticsProvider.get(), (EcsConfiguration)configurationProvider.get(), (AnalyticsPersistentStorage)analyticsPersistentStorageProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/util/SignInDurationReporter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
