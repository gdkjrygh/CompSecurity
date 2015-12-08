// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce;

import android.app.Application;
import android.nfc.NfcAdapter;
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

    private Binding application;
    private Binding isHceSupported;
    private final WalletHceModule module;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/hce/WalletHceModule, getClass().getClassLoader());
        isHceSupported = linker.requestBinding("@com.google.android.apps.wallet.config.featurecontrol.FeatureQualifier(value=NFC_HCE_PPMS)/java.lang.Boolean", com/google/android/apps/wallet/hce/WalletHceModule, getClass().getClassLoader());
    }

    public final NfcAdapter get()
    {
        WalletHceModule wallethcemodule = module;
        return WalletHceModule.getNfcAdapter((Application)application.get(), ((Boolean)isHceSupported.get()).booleanValue());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(isHceSupported);
    }

    public (WalletHceModule wallethcemodule)
    {
        super("android.nfc.NfcAdapter", false, "com.google.android.apps.wallet.hce.WalletHceModule", "getNfcAdapter");
        module = wallethcemodule;
        setLibrary(true);
    }
}
