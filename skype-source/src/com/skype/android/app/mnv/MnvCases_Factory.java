// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import com.skype.android.app.shortcircuit.AutoBuddyManager;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.AccountProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvCases, MnvAnalytics, MnvUtil

public final class MnvCases_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider autoBuddyManagerProvider;
    private final Provider configurationProvider;
    private final Provider mnvAnalyticsProvider;
    private final Provider mnvUtilProvider;
    private final Provider userPrefsProvider;

    public MnvCases_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        mnvAnalyticsProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        userPrefsProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        mnvUtilProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        autoBuddyManagerProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        } else
        {
            accountProvider = provider5;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        return new MnvCases_Factory(provider, provider1, provider2, provider3, provider4, provider5);
    }

    public final MnvCases get()
    {
        return new MnvCases((EcsConfiguration)configurationProvider.get(), (MnvAnalytics)mnvAnalyticsProvider.get(), userPrefsProvider, (MnvUtil)mnvUtilProvider.get(), (AutoBuddyManager)autoBuddyManagerProvider.get(), (AccountProvider)accountProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/mnv/MnvCases_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
