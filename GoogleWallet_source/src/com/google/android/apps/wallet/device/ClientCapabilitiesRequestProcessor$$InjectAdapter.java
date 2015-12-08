// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.device;

import android.app.Application;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.common.collect.ImmutableSet;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.device:
//            ClientCapabilitiesRequestProcessor

public final class  extends Binding
    implements Provider
{

    private Binding application;
    private Binding supportedServerControlledFeatures;
    private Binding uriRegistry;

    public final void attach(Linker linker)
    {
        uriRegistry = linker.requestBinding("com.google.android.apps.wallet.api.UriRegistry", com/google/android/apps/wallet/device/ClientCapabilitiesRequestProcessor, getClass().getClassLoader());
        supportedServerControlledFeatures = linker.requestBinding("@com.google.android.apps.wallet.config.featurecontrol.BindingAnnotations$SupportedServerControlledFeatures()/com.google.common.collect.ImmutableSet<com.google.android.apps.wallet.config.featurecontrol.Feature>", com/google/android/apps/wallet/device/ClientCapabilitiesRequestProcessor, getClass().getClassLoader());
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/device/ClientCapabilitiesRequestProcessor, getClass().getClassLoader());
    }

    public final ClientCapabilitiesRequestProcessor get()
    {
        return new ClientCapabilitiesRequestProcessor((UriRegistry)uriRegistry.get(), (ImmutableSet)supportedServerControlledFeatures.get(), (Application)application.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(uriRegistry);
        set.add(supportedServerControlledFeatures);
        set.add(application);
    }

    public ()
    {
        super("com.google.android.apps.wallet.device.ClientCapabilitiesRequestProcessor", "members/com.google.android.apps.wallet.device.ClientCapabilitiesRequestProcessor", false, com/google/android/apps/wallet/device/ClientCapabilitiesRequestProcessor);
    }
}
