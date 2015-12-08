// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.log;

import android.app.Application;
import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager;
import com.google.android.apps.wallet.config.featurecontrol.FeatureSet;
import com.google.android.apps.wallet.device.DeviceInfoManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.log:
//            UserScopedLogModule, WalletContextFactory

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding application;
    private Binding availableLocales;
    private Binding cloudConfigurationManager;
    private Binding deviceInfoManager;
    private Binding featureSet;
    private final UserScopedLogModule module;
    private Binding system;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/log/UserScopedLogModule, getClass().getClassLoader());
        cloudConfigurationManager = linker.requestBinding("com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager", com/google/android/apps/wallet/log/UserScopedLogModule, getClass().getClassLoader());
        deviceInfoManager = linker.requestBinding("com.google.android.apps.wallet.device.DeviceInfoManager", com/google/android/apps/wallet/log/UserScopedLogModule, getClass().getClassLoader());
        system = linker.requestBinding("com.google.android.apps.wallet.base.java.System", com/google/android/apps/wallet/log/UserScopedLogModule, getClass().getClassLoader());
        featureSet = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureSet", com/google/android/apps/wallet/log/UserScopedLogModule, getClass().getClassLoader());
        availableLocales = linker.requestBinding("@com.google.android.apps.wallet.locale.BindingAnnotations$AvailableLocales()/java.util.List<java.util.Locale>", com/google/android/apps/wallet/log/UserScopedLogModule, getClass().getClassLoader());
    }

    public final WalletContextFactory get()
    {
        UserScopedLogModule userscopedlogmodule = module;
        return UserScopedLogModule.getWalletContextFactory((Application)application.get(), (CloudConfigurationManager)cloudConfigurationManager.get(), (DeviceInfoManager)deviceInfoManager.get(), (System)system.get(), (FeatureSet)featureSet.get(), (List)availableLocales.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(cloudConfigurationManager);
        set.add(deviceInfoManager);
        set.add(system);
        set.add(featureSet);
        set.add(availableLocales);
    }

    public (UserScopedLogModule userscopedlogmodule)
    {
        super("com.google.android.apps.wallet.log.WalletContextFactory", true, "com.google.android.apps.wallet.log.UserScopedLogModule", "getWalletContextFactory");
        module = userscopedlogmodule;
        setLibrary(true);
    }
}
