// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.cloudconfig;

import com.google.android.apps.wallet.config.gservices.GservicesWrapper;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.config.cloudconfig:
//            WalletCloudConfigurationManager

public final class  extends Binding
    implements Provider
{

    private Binding gservices;

    public final void attach(Linker linker)
    {
        gservices = linker.requestBinding("com.google.android.apps.wallet.config.gservices.GservicesWrapper", com/google/android/apps/wallet/config/cloudconfig/WalletCloudConfigurationManager, getClass().getClassLoader());
    }

    public final WalletCloudConfigurationManager get()
    {
        return new WalletCloudConfigurationManager((GservicesWrapper)gservices.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(gservices);
    }

    public ()
    {
        super("com.google.android.apps.wallet.config.cloudconfig.WalletCloudConfigurationManager", "members/com.google.android.apps.wallet.config.cloudconfig.WalletCloudConfigurationManager", true, com/google/android/apps/wallet/config/cloudconfig/WalletCloudConfigurationManager);
    }
}
