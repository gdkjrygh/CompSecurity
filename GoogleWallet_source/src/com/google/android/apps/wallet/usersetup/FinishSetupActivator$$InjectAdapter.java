// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.gservices.GservicesWrapper;
import com.google.android.apps.wallet.device.DeviceClient;
import com.google.android.apps.wallet.notifications.GcmRegistrar;
import com.google.android.apps.wallet.usersetup.service.SetupWalletServiceClient;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            FinishSetupActivator

public final class  extends Binding
    implements Provider
{

    private Binding application;
    private Binding deviceClient;
    private Binding featureManager;
    private Binding gcmRegistrar;
    private Binding gservicesWrapper;
    private Binding setupWalletServiceClient;
    private Binding sharedPreferences;
    private Binding system;

    public final void attach(Linker linker)
    {
        setupWalletServiceClient = linker.requestBinding("com.google.android.apps.wallet.usersetup.service.SetupWalletServiceClient", com/google/android/apps/wallet/usersetup/FinishSetupActivator, getClass().getClassLoader());
        sharedPreferences = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/usersetup/FinishSetupActivator, getClass().getClassLoader());
        system = linker.requestBinding("com.google.android.apps.wallet.base.java.System", com/google/android/apps/wallet/usersetup/FinishSetupActivator, getClass().getClassLoader());
        gcmRegistrar = linker.requestBinding("com.google.android.apps.wallet.notifications.GcmRegistrar", com/google/android/apps/wallet/usersetup/FinishSetupActivator, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/usersetup/FinishSetupActivator, getClass().getClassLoader());
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/usersetup/FinishSetupActivator, getClass().getClassLoader());
        gservicesWrapper = linker.requestBinding("com.google.android.apps.wallet.config.gservices.GservicesWrapper", com/google/android/apps/wallet/usersetup/FinishSetupActivator, getClass().getClassLoader());
        deviceClient = linker.requestBinding("com.google.android.apps.wallet.device.DeviceClient", com/google/android/apps/wallet/usersetup/FinishSetupActivator, getClass().getClassLoader());
    }

    public final FinishSetupActivator get()
    {
        return new FinishSetupActivator((SetupWalletServiceClient)setupWalletServiceClient.get(), (SharedPreferences)sharedPreferences.get(), (System)system.get(), (GcmRegistrar)gcmRegistrar.get(), (FeatureManager)featureManager.get(), (Application)application.get(), (GservicesWrapper)gservicesWrapper.get(), (DeviceClient)deviceClient.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(setupWalletServiceClient);
        set.add(sharedPreferences);
        set.add(system);
        set.add(gcmRegistrar);
        set.add(featureManager);
        set.add(application);
        set.add(gservicesWrapper);
        set.add(deviceClient);
    }

    public ()
    {
        super("com.google.android.apps.wallet.usersetup.FinishSetupActivator", "members/com.google.android.apps.wallet.usersetup.FinishSetupActivator", false, com/google/android/apps/wallet/usersetup/FinishSetupActivator);
    }
}
