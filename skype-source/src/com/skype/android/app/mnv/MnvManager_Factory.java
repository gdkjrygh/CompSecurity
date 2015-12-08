// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.app.Application;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.event.EventBus;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvManager, ProfileServicesClient, MnvManagerEvents, MnvCases, 
//            MnvAnalytics, MnvPostRequest

public final class MnvManager_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;
    private final Provider eventBusProvider;
    private final Provider mnvAnalyticsProvider;
    private final Provider mnvCasesProvider;
    private final Provider mnvManagerEventsProvider;
    private final Provider mnvPostRequestProvider;
    private final Provider profileServicesProvider;
    private final Provider userPreferencesProvider;

    public MnvManager_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7)
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
        profileServicesProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        mnvManagerEventsProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        mnvCasesProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        mnvAnalyticsProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        mnvPostRequestProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        eventBusProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        } else
        {
            userPreferencesProvider = provider7;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7)
    {
        return new MnvManager_Factory(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public final MnvManager get()
    {
        return new MnvManager((Application)contextProvider.get(), (ProfileServicesClient)profileServicesProvider.get(), (MnvManagerEvents)mnvManagerEventsProvider.get(), (MnvCases)mnvCasesProvider.get(), (MnvAnalytics)mnvAnalyticsProvider.get(), (MnvPostRequest)mnvPostRequestProvider.get(), (EventBus)eventBusProvider.get(), (UserPreferences)userPreferencesProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/mnv/MnvManager_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
