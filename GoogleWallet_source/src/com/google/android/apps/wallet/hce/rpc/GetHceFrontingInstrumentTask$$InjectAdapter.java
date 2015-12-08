// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.rpc;

import com.google.android.apps.wallet.cardlist.FrontingInstrumentClient;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.encryption.CryptorService;
import com.google.android.apps.wallet.hce.database.HceLibraryDatabase;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce.rpc:
//            GetHceFrontingInstrumentTask

public final class  extends Binding
    implements Provider
{

    private Binding encryptionService;
    private Binding featureManager;
    private Binding frontingInstrumentClient;
    private Binding hceSecureElement;

    public final void attach(Linker linker)
    {
        encryptionService = linker.requestBinding("@com.google.android.apps.wallet.encryption.BindingAnnotations$TorinoKeysEncryptionService()/com.google.android.apps.wallet.encryption.CryptorService<byte[]>", com/google/android/apps/wallet/hce/rpc/GetHceFrontingInstrumentTask, getClass().getClassLoader());
        frontingInstrumentClient = linker.requestBinding("com.google.android.apps.wallet.cardlist.FrontingInstrumentClient", com/google/android/apps/wallet/hce/rpc/GetHceFrontingInstrumentTask, getClass().getClassLoader());
        hceSecureElement = linker.requestBinding("com.google.android.apps.wallet.hce.database.HceLibraryDatabase", com/google/android/apps/wallet/hce/rpc/GetHceFrontingInstrumentTask, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/hce/rpc/GetHceFrontingInstrumentTask, getClass().getClassLoader());
    }

    public final GetHceFrontingInstrumentTask get()
    {
        return new GetHceFrontingInstrumentTask((CryptorService)encryptionService.get(), (FrontingInstrumentClient)frontingInstrumentClient.get(), (HceLibraryDatabase)hceSecureElement.get(), (FeatureManager)featureManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(encryptionService);
        set.add(frontingInstrumentClient);
        set.add(hceSecureElement);
        set.add(featureManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.hce.rpc.GetHceFrontingInstrumentTask", "members/com.google.android.apps.wallet.hce.rpc.GetHceFrontingInstrumentTask", false, com/google/android/apps/wallet/hce/rpc/GetHceFrontingInstrumentTask);
    }
}
