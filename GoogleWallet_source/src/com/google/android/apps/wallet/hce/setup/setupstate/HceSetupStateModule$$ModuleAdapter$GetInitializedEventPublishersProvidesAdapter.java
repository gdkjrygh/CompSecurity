// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup.setupstate;

import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce.setup.setupstate:
//            HceSetupStateModule, NfcPaymentSetupManager

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final HceSetupStateModule module;
    private Binding setupManager;

    public final void attach(Linker linker)
    {
        setupManager = linker.requestBinding("com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupManager", com/google/android/apps/wallet/hce/setup/setupstate/HceSetupStateModule, getClass().getClassLoader());
    }

    public final InitializedEventPublisher get()
    {
        HceSetupStateModule hcesetupstatemodule = module;
        return HceSetupStateModule.getInitializedEventPublishers((NfcPaymentSetupManager)setupManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(setupManager);
    }

    public _89_(HceSetupStateModule hcesetupstatemodule)
    {
        super("com.google.android.apps.wallet.eventbus.InitializedEventPublisher", false, "com.google.android.apps.wallet.hce.setup.setupstate.HceSetupStateModule", "getInitializedEventPublishers");
        module = hcesetupstatemodule;
        setLibrary(true);
    }
}
