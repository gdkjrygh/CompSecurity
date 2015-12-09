// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.clientconfig;

import android.content.SharedPreferences;
import com.google.android.apps.wallet.datastore.KeyValueStore;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.config.clientconfig:
//            ClientConfigurationManager

public final class tionFeatureListener extends Binding
    implements Provider
{

    private Binding featureListener;
    private Binding keyValueStore;
    private Binding sharedPreferences;

    public final void attach(Linker linker)
    {
        keyValueStore = linker.requestBinding("@com.google.android.apps.wallet.datastore.BindingAnnotations$DatabaseTable(value=METADATA)/com.google.android.apps.wallet.datastore.KeyValueStore", com/google/android/apps/wallet/config/clientconfig/ClientConfigurationManager, getClass().getClassLoader());
        sharedPreferences = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/config/clientconfig/ClientConfigurationManager, getClass().getClassLoader());
        featureListener = linker.requestBinding("com.google.android.apps.wallet.config.clientconfig.ClientConfigurationManager$ClientConfigurationFeatureListener", com/google/android/apps/wallet/config/clientconfig/ClientConfigurationManager, getClass().getClassLoader());
    }

    public final ClientConfigurationManager get()
    {
        return new ClientConfigurationManager((KeyValueStore)keyValueStore.get(), (SharedPreferences)sharedPreferences.get(), (tionFeatureListener)featureListener.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(keyValueStore);
        set.add(sharedPreferences);
        set.add(featureListener);
    }

    public tionFeatureListener()
    {
        super("com.google.android.apps.wallet.config.clientconfig.ClientConfigurationManager", "members/com.google.android.apps.wallet.config.clientconfig.ClientConfigurationManager", true, com/google/android/apps/wallet/config/clientconfig/ClientConfigurationManager);
    }
}
