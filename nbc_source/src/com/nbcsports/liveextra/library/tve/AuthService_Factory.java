// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import android.app.Application;
import android.content.SharedPreferences;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import com.nbcsports.liveextra.library.configuration.RuntimeConfiguration;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import com.squareup.okhttp.OkHttpClient;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            AuthService, MvpdLookups

public final class AuthService_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider clientProvider;
    private final Provider configProvider;
    private final Provider contextProvider;
    private final Provider instanceProvider;
    private final Provider lookupsProvider;
    private final Provider preferencesProvider;
    private final Provider trackingHelperProvider;

    public AuthService_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        instanceProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        configProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        trackingHelperProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        lookupsProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        clientProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        } else
        {
            preferencesProvider = provider6;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
    {
        return new AuthService_Factory(provider, provider1, provider2, provider3, provider4, provider5, provider6);
    }

    public AuthService get()
    {
        return new AuthService((AccessEnabler)instanceProvider.get(), (RuntimeConfiguration)configProvider.get(), (TrackingHelper)trackingHelperProvider.get(), (MvpdLookups)lookupsProvider.get(), (OkHttpClient)clientProvider.get(), (Application)contextProvider.get(), (SharedPreferences)preferencesProvider.get());
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/library/tve/AuthService_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
