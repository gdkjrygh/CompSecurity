// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.ads;

import android.app.Application;
import com.skype.android.ads.AdManager;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.event.EventBus;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.ads:
//            AdManagerInitializer

public final class AdManagerInitializer_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider adManagerProvider;
    private final Provider appConfigProvider;
    private final Provider asyncServiceProvider;
    private final Provider contextProvider;
    private final Provider eventBusProvider;
    private final Provider userPrefsProvider;

    public AdManagerInitializer_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
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
        adManagerProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        appConfigProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        userPrefsProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        asyncServiceProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        } else
        {
            eventBusProvider = provider5;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        return new AdManagerInitializer_Factory(provider, provider1, provider2, provider3, provider4, provider5);
    }

    public final AdManagerInitializer get()
    {
        return new AdManagerInitializer((Application)contextProvider.get(), (AdManager)adManagerProvider.get(), (ApplicationConfig)appConfigProvider.get(), userPrefsProvider, (AsyncService)asyncServiceProvider.get(), (EventBus)eventBusProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/ads/AdManagerInitializer_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
