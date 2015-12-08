// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.user;

import android.content.SharedPreferences;
import com.google.android.apps.wallet.datastore.KeyValueStore;
import dagger.Lazy;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.user:
//            UserInfoManager

public final class  extends Binding
    implements Provider
{

    private Binding currentAccountName;
    private Binding globalPrefs;
    private Binding keyValueStore;
    private Binding setupWalletServiceClient;

    public final void attach(Linker linker)
    {
        currentAccountName = linker.requestBinding("@com.google.android.apps.wallet.userscope.api.BindingAnnotations$AccountName()/java.lang.String", com/google/android/apps/wallet/user/UserInfoManager, getClass().getClassLoader());
        globalPrefs = linker.requestBinding("@com.google.android.apps.wallet.config.sharedpreferences.BindingAnnotations$Global()/android.content.SharedPreferences", com/google/android/apps/wallet/user/UserInfoManager, getClass().getClassLoader());
        keyValueStore = linker.requestBinding("@com.google.android.apps.wallet.datastore.BindingAnnotations$DatabaseTable(value=METADATA)/com.google.android.apps.wallet.datastore.KeyValueStore", com/google/android/apps/wallet/user/UserInfoManager, getClass().getClassLoader());
        setupWalletServiceClient = linker.requestBinding("dagger.Lazy<com.google.android.apps.wallet.usersetup.service.SetupWalletServiceClient>", com/google/android/apps/wallet/user/UserInfoManager, getClass().getClassLoader());
    }

    public final UserInfoManager get()
    {
        return new UserInfoManager((String)currentAccountName.get(), (SharedPreferences)globalPrefs.get(), (KeyValueStore)keyValueStore.get(), (Lazy)setupWalletServiceClient.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(currentAccountName);
        set.add(globalPrefs);
        set.add(keyValueStore);
        set.add(setupWalletServiceClient);
    }

    public ()
    {
        super("com.google.android.apps.wallet.user.UserInfoManager", "members/com.google.android.apps.wallet.user.UserInfoManager", true, com/google/android/apps/wallet/user/UserInfoManager);
    }
}
