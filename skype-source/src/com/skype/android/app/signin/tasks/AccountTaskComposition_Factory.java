// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin.tasks;

import com.skype.android.analytics.AnalyticsInAppObserver;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin.tasks:
//            AccountTaskComposition, c, e, d, 
//            a, f, b, ExternalCacheCleanup

public final class AccountTaskComposition_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider analyticsInAppObserverProvider;
    private final Provider configUpdateProvider;
    private final Provider crashReporterContactProvider;
    private final Provider createDeviceAccountProvider;
    private final Provider externalCacheCleanupProvider;
    private final Provider migratePreferencesProvider;
    private final Provider pushServiceRegisterProvider;
    private final Provider reportAccountStatsProvider;

    public AccountTaskComposition_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        createDeviceAccountProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        pushServiceRegisterProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        migratePreferencesProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        configUpdateProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        reportAccountStatsProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        crashReporterContactProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        externalCacheCleanupProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsInAppObserverProvider = provider7;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7)
    {
        return new AccountTaskComposition_Factory(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public final AccountTaskComposition get()
    {
        return new AccountTaskComposition((c)createDeviceAccountProvider.get(), (e)pushServiceRegisterProvider.get(), (d)migratePreferencesProvider.get(), (a)configUpdateProvider.get(), (f)reportAccountStatsProvider.get(), (b)crashReporterContactProvider.get(), (ExternalCacheCleanup)externalCacheCleanupProvider.get(), (AnalyticsInAppObserver)analyticsInAppObserverProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/tasks/AccountTaskComposition_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
