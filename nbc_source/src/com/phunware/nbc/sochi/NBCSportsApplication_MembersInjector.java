// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi;

import android.content.SharedPreferences;
import com.nbcsports.liveextra.core.CustomRxExecutionHook;
import com.nbcsports.liveextra.core.CustomRxJavaErrorHandler;
import com.nbcsports.liveextra.library.configuration.ConfigurationProvider;
import com.nbcsports.liveextra.library.configuration.RuntimeConfiguration;
import com.nbcsports.liveextra.urbanairship.AirTrafficController;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.phunware.nbc.sochi:
//            NBCSportsApplication

public final class NBCSportsApplication_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider airTrafficControllerProvider;
    private final Provider configProvider;
    private final Provider configurationSubscriberProvider;
    private final Provider preferencesProvider;
    private final Provider rxErrorHandlerProvider;
    private final Provider rxExecutionHookProvider;
    private final MembersInjector supertypeInjector;
    private final Provider trackingHelperProvider;

    public NBCSportsApplication_MembersInjector(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
            Provider provider6)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        supertypeInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        configurationSubscriberProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        configProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        airTrafficControllerProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        preferencesProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        trackingHelperProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        rxErrorHandlerProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        } else
        {
            rxExecutionHookProvider = provider6;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
    {
        return new NBCSportsApplication_MembersInjector(membersinjector, provider, provider1, provider2, provider3, provider4, provider5, provider6);
    }

    public void injectMembers(NBCSportsApplication nbcsportsapplication)
    {
        if (nbcsportsapplication == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(nbcsportsapplication);
            nbcsportsapplication.configurationSubscriber = (ConfigurationProvider)configurationSubscriberProvider.get();
            nbcsportsapplication.config = (RuntimeConfiguration)configProvider.get();
            nbcsportsapplication.airTrafficController = (AirTrafficController)airTrafficControllerProvider.get();
            nbcsportsapplication.preferences = (SharedPreferences)preferencesProvider.get();
            nbcsportsapplication.trackingHelper = (TrackingHelper)trackingHelperProvider.get();
            nbcsportsapplication.rxErrorHandler = (CustomRxJavaErrorHandler)rxErrorHandlerProvider.get();
            nbcsportsapplication.rxExecutionHook = (CustomRxExecutionHook)rxExecutionHookProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((NBCSportsApplication)obj);
    }

    static 
    {
        boolean flag;
        if (!com/phunware/nbc/sochi/NBCSportsApplication_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
