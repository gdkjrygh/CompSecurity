// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup;

import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce.setup:
//            HceSetupModule, NfcFeatureDisabledListener

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding listener;
    private final HceSetupModule module;

    public final void attach(Linker linker)
    {
        listener = linker.requestBinding("com.google.android.apps.wallet.hce.setup.NfcFeatureDisabledListener", com/google/android/apps/wallet/hce/setup/HceSetupModule, getClass().getClassLoader());
    }

    public final InitializedEventPublisher get()
    {
        HceSetupModule hcesetupmodule = module;
        return HceSetupModule.getInitializedEventPublishers((NfcFeatureDisabledListener)listener.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(listener);
    }

    public y(HceSetupModule hcesetupmodule)
    {
        super("com.google.android.apps.wallet.eventbus.InitializedEventPublisher", false, "com.google.android.apps.wallet.hce.setup.HceSetupModule", "getInitializedEventPublishers");
        module = hcesetupmodule;
        setLibrary(true);
    }
}
