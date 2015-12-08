// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.encryption;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.encryption:
//            KeyczarPrewarmerImpl, KeyczarBillingKeysEncryptionService

public final class  extends Binding
    implements Provider
{

    private Binding encryptionService;
    private Binding executor;

    public final void attach(Linker linker)
    {
        encryptionService = linker.requestBinding("com.google.android.apps.wallet.encryption.KeyczarBillingKeysEncryptionService", com/google/android/apps/wallet/encryption/KeyczarPrewarmerImpl, getClass().getClassLoader());
        executor = linker.requestBinding("@com.google.android.apps.wallet.util.async.BindingAnnotations$Parallel()/java.util.concurrent.Executor", com/google/android/apps/wallet/encryption/KeyczarPrewarmerImpl, getClass().getClassLoader());
    }

    public final KeyczarPrewarmerImpl get()
    {
        return new KeyczarPrewarmerImpl((KeyczarBillingKeysEncryptionService)encryptionService.get(), (Executor)executor.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(encryptionService);
        set.add(executor);
    }

    public ()
    {
        super("com.google.android.apps.wallet.encryption.KeyczarPrewarmerImpl", "members/com.google.android.apps.wallet.encryption.KeyczarPrewarmerImpl", false, com/google/android/apps/wallet/encryption/KeyczarPrewarmerImpl);
    }
}
