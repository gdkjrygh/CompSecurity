// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc.api;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.kyc.api:
//            KycApiModule, KycStatusPublisher, KycExperimentPublisher

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding experimentPublisher;
    private final KycApiModule module;
    private Binding statusPublisher;

    public final void attach(Linker linker)
    {
        statusPublisher = linker.requestBinding("com.google.android.apps.wallet.kyc.api.KycStatusPublisher", com/google/android/apps/wallet/kyc/api/KycApiModule, getClass().getClassLoader());
        experimentPublisher = linker.requestBinding("com.google.android.apps.wallet.kyc.api.KycExperimentPublisher", com/google/android/apps/wallet/kyc/api/KycApiModule, getClass().getClassLoader());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final Set get()
    {
        KycApiModule kycapimodule = module;
        return KycApiModule.getInitializedEventPublishers((KycStatusPublisher)statusPublisher.get(), (KycExperimentPublisher)experimentPublisher.get());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(statusPublisher);
        set.add(experimentPublisher);
    }

    public (KycApiModule kycapimodule)
    {
        super("java.util.Set<com.google.android.apps.wallet.eventbus.InitializedEventPublisher>", false, "com.google.android.apps.wallet.kyc.api.KycApiModule", "getInitializedEventPublishers");
        module = kycapimodule;
        setLibrary(true);
    }
}
