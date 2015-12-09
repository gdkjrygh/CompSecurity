// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce;

import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce:
//            WalletHceModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding adapter;
    private final WalletHceModule module;

    public final void attach(Linker linker)
    {
        adapter = linker.requestBinding("android.nfc.NfcAdapter", com/google/android/apps/wallet/hce/WalletHceModule, getClass().getClassLoader());
    }

    public final CardEmulation get()
    {
        WalletHceModule wallethcemodule = module;
        return WalletHceModule.getCardEmulationManager((NfcAdapter)adapter.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(adapter);
    }

    public (WalletHceModule wallethcemodule)
    {
        super("android.nfc.cardemulation.CardEmulation", true, "com.google.android.apps.wallet.hce.WalletHceModule", "getCardEmulationManager");
        module = wallethcemodule;
        setLibrary(true);
    }
}
