// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.globalresources;

import com.google.android.apps.wallet.config.clientconfig.ClientConfigurationManager;
import com.google.android.apps.wallet.datastore.KeyValueStore;
import com.google.android.apps.wallet.keys.PublicKeysManager;
import com.google.android.apps.wallet.user.UserInfoManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.globalresources:
//            GlobalResourceManager, SyncGenerationNumberManager, ExperimentsUpdater

public final class Y extends Binding
    implements Provider
{

    private Binding clientConfigurationManager;
    private Binding experimentsUpdater;
    private Binding generationNumberManager;
    private Binding keyValueStore;
    private Binding latestLegalDocumentManager;
    private Binding publicKeysManager;

    public final void attach(Linker linker)
    {
        publicKeysManager = linker.requestBinding("com.google.android.apps.wallet.keys.PublicKeysManager", com/google/android/apps/wallet/globalresources/GlobalResourceManager, getClass().getClassLoader());
        generationNumberManager = linker.requestBinding("com.google.android.apps.wallet.globalresources.SyncGenerationNumberManager", com/google/android/apps/wallet/globalresources/GlobalResourceManager, getClass().getClassLoader());
        clientConfigurationManager = linker.requestBinding("com.google.android.apps.wallet.config.clientconfig.ClientConfigurationManager", com/google/android/apps/wallet/globalresources/GlobalResourceManager, getClass().getClassLoader());
        latestLegalDocumentManager = linker.requestBinding("com.google.android.apps.wallet.user.UserInfoManager", com/google/android/apps/wallet/globalresources/GlobalResourceManager, getClass().getClassLoader());
        experimentsUpdater = linker.requestBinding("com.google.android.apps.wallet.globalresources.ExperimentsUpdater", com/google/android/apps/wallet/globalresources/GlobalResourceManager, getClass().getClassLoader());
        keyValueStore = linker.requestBinding("@com.google.android.apps.wallet.datastore.BindingAnnotations$DatabaseTable(value=METADATA)/com.google.android.apps.wallet.datastore.KeyValueStore", com/google/android/apps/wallet/globalresources/GlobalResourceManager, getClass().getClassLoader());
    }

    public final GlobalResourceManager get()
    {
        return new GlobalResourceManager((PublicKeysManager)publicKeysManager.get(), (SyncGenerationNumberManager)generationNumberManager.get(), (ClientConfigurationManager)clientConfigurationManager.get(), (UserInfoManager)latestLegalDocumentManager.get(), (ExperimentsUpdater)experimentsUpdater.get(), (KeyValueStore)keyValueStore.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(publicKeysManager);
        set.add(generationNumberManager);
        set.add(clientConfigurationManager);
        set.add(latestLegalDocumentManager);
        set.add(experimentsUpdater);
        set.add(keyValueStore);
    }

    public Y()
    {
        super("com.google.android.apps.wallet.globalresources.GlobalResourceManager", "members/com.google.android.apps.wallet.globalresources.GlobalResourceManager", true, com/google/android/apps/wallet/globalresources/GlobalResourceManager);
    }
}
