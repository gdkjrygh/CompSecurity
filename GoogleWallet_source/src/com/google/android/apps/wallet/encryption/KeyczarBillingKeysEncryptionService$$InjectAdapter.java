// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.encryption;

import com.google.android.apps.wallet.keys.PublicKeysManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.encryption:
//            KeyczarBillingKeysEncryptionService

public final class  extends Binding
    implements Provider
{

    private Binding publicKeysManager;

    public final void attach(Linker linker)
    {
        publicKeysManager = linker.requestBinding("com.google.android.apps.wallet.keys.PublicKeysManager", com/google/android/apps/wallet/encryption/KeyczarBillingKeysEncryptionService, getClass().getClassLoader());
    }

    public final KeyczarBillingKeysEncryptionService get()
    {
        return new KeyczarBillingKeysEncryptionService((PublicKeysManager)publicKeysManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(publicKeysManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.encryption.KeyczarBillingKeysEncryptionService", "members/com.google.android.apps.wallet.encryption.KeyczarBillingKeysEncryptionService", true, com/google/android/apps/wallet/encryption/KeyczarBillingKeysEncryptionService);
    }
}
