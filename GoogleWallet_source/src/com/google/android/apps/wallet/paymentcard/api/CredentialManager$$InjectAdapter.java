// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.api;

import dagger.Lazy;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.paymentcard.api:
//            CredentialManager, CredentialProtoManager

public final class  extends Binding
    implements Provider
{

    private Binding credentialProtoManager;
    private Binding instrumentClient;

    public final void attach(Linker linker)
    {
        credentialProtoManager = linker.requestBinding("com.google.android.apps.wallet.paymentcard.api.CredentialProtoManager", com/google/android/apps/wallet/paymentcard/api/CredentialManager, getClass().getClassLoader());
        instrumentClient = linker.requestBinding("dagger.Lazy<com.google.android.apps.wallet.paymentcard.api.InstrumentClient>", com/google/android/apps/wallet/paymentcard/api/CredentialManager, getClass().getClassLoader());
    }

    public final CredentialManager get()
    {
        return new CredentialManager((CredentialProtoManager)credentialProtoManager.get(), (Lazy)instrumentClient.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(credentialProtoManager);
        set.add(instrumentClient);
    }

    public ()
    {
        super("com.google.android.apps.wallet.paymentcard.api.CredentialManager", "members/com.google.android.apps.wallet.paymentcard.api.CredentialManager", false, com/google/android/apps/wallet/paymentcard/api/CredentialManager);
    }
}
