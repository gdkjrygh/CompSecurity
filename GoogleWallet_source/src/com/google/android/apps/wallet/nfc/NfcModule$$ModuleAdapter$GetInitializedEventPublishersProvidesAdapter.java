// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.nfc;

import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.nfc:
//            NfcModule, NfcAdapterStateEventPublisher

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final NfcModule module;
    private Binding provider;

    public final void attach(Linker linker)
    {
        provider = linker.requestBinding("com.google.android.apps.wallet.nfc.NfcAdapterStateEventPublisher", com/google/android/apps/wallet/nfc/NfcModule, getClass().getClassLoader());
    }

    public final InitializedEventPublisher get()
    {
        NfcModule nfcmodule = module;
        return NfcModule.getInitializedEventPublishers((NfcAdapterStateEventPublisher)provider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(provider);
    }

    public (NfcModule nfcmodule)
    {
        super("com.google.android.apps.wallet.eventbus.InitializedEventPublisher", false, "com.google.android.apps.wallet.nfc.NfcModule", "getInitializedEventPublishers");
        module = nfcmodule;
        setLibrary(true);
    }
}
