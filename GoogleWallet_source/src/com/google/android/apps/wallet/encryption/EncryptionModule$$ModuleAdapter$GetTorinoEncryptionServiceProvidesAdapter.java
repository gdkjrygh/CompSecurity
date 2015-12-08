// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.encryption;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.encryption:
//            EncryptionModule, KeyczarTorinoKeysEncryptionService, CryptorService

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding keyczarEncryptionService;
    private final EncryptionModule module;

    public final void attach(Linker linker)
    {
        keyczarEncryptionService = linker.requestBinding("com.google.android.apps.wallet.encryption.KeyczarTorinoKeysEncryptionService", com/google/android/apps/wallet/encryption/EncryptionModule, getClass().getClassLoader());
    }

    public final CryptorService get()
    {
        EncryptionModule encryptionmodule = module;
        return EncryptionModule.getTorinoEncryptionService((KeyczarTorinoKeysEncryptionService)keyczarEncryptionService.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(keyczarEncryptionService);
    }

    public y(EncryptionModule encryptionmodule)
    {
        super("@com.google.android.apps.wallet.encryption.BindingAnnotations$TorinoKeysEncryptionService()/com.google.android.apps.wallet.encryption.CryptorService<byte[]>", false, "com.google.android.apps.wallet.encryption.EncryptionModule", "getTorinoEncryptionService");
        module = encryptionmodule;
        setLibrary(true);
    }
}
