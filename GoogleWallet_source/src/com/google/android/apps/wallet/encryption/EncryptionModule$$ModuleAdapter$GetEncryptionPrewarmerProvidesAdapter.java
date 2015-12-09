// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.encryption;

import com.google.android.apps.wallet.encryption.api.PinEncryptionPrewarmer;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.encryption:
//            EncryptionModule, KeyczarPrewarmerImpl

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding impl;
    private final EncryptionModule module;

    public final void attach(Linker linker)
    {
        impl = linker.requestBinding("com.google.android.apps.wallet.encryption.KeyczarPrewarmerImpl", com/google/android/apps/wallet/encryption/EncryptionModule, getClass().getClassLoader());
    }

    public final PinEncryptionPrewarmer get()
    {
        EncryptionModule encryptionmodule = module;
        return EncryptionModule.getEncryptionPrewarmer((KeyczarPrewarmerImpl)impl.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(impl);
    }

    public (EncryptionModule encryptionmodule)
    {
        super("com.google.android.apps.wallet.encryption.api.PinEncryptionPrewarmer", false, "com.google.android.apps.wallet.encryption.EncryptionModule", "getEncryptionPrewarmer");
        module = encryptionmodule;
        setLibrary(true);
    }
}
