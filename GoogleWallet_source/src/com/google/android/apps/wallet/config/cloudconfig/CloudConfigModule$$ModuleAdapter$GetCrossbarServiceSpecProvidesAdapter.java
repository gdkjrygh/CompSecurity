// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.cloudconfig;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.config.cloudconfig:
//            CloudConfigModule, WalletCloudConfigurationManager, CloudServiceSpec

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding cloudConfigurationManager;
    private final CloudConfigModule module;

    public final void attach(Linker linker)
    {
        cloudConfigurationManager = linker.requestBinding("com.google.android.apps.wallet.config.cloudconfig.WalletCloudConfigurationManager", com/google/android/apps/wallet/config/cloudconfig/CloudConfigModule, getClass().getClassLoader());
    }

    public final CloudServiceSpec get()
    {
        CloudConfigModule cloudconfigmodule = module;
        return CloudConfigModule.getCrossbarServiceSpec((WalletCloudConfigurationManager)cloudConfigurationManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(cloudConfigurationManager);
    }

    public (CloudConfigModule cloudconfigmodule)
    {
        super("com.google.android.apps.wallet.config.cloudconfig.CloudServiceSpec", false, "com.google.android.apps.wallet.config.cloudconfig.CloudConfigModule", "getCrossbarServiceSpec");
        module = cloudconfigmodule;
        setLibrary(true);
    }
}
