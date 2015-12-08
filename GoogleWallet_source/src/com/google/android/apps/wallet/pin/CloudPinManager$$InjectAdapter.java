// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.device.DeviceInfoManager;
import com.google.android.apps.wallet.encryption.EncryptionService;
import dagger.Lazy;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            CloudPinManager, AppPinToken

public final class  extends Binding
    implements Provider
{

    private Binding appPinToken;
    private Binding deviceInfoManager;
    private Binding encryptionService;
    private Binding rpcCaller;
    private Binding settingProtoManager;
    private Binding system;

    public final void attach(Linker linker)
    {
        deviceInfoManager = linker.requestBinding("com.google.android.apps.wallet.device.DeviceInfoManager", com/google/android/apps/wallet/pin/CloudPinManager, getClass().getClassLoader());
        rpcCaller = linker.requestBinding("javax.inject.Provider<com.google.android.apps.wallet.rpc.RpcCaller>", com/google/android/apps/wallet/pin/CloudPinManager, getClass().getClassLoader());
        system = linker.requestBinding("com.google.android.apps.wallet.base.java.System", com/google/android/apps/wallet/pin/CloudPinManager, getClass().getClassLoader());
        settingProtoManager = linker.requestBinding("dagger.Lazy<com.google.android.apps.wallet.settings.SettingProtoManager>", com/google/android/apps/wallet/pin/CloudPinManager, getClass().getClassLoader());
        appPinToken = linker.requestBinding("com.google.android.apps.wallet.pin.AppPinToken", com/google/android/apps/wallet/pin/CloudPinManager, getClass().getClassLoader());
        encryptionService = linker.requestBinding("@com.google.android.apps.wallet.encryption.BindingAnnotations$BillingKeysEncryptionService()/com.google.android.apps.wallet.encryption.EncryptionService<java.lang.String>", com/google/android/apps/wallet/pin/CloudPinManager, getClass().getClassLoader());
    }

    public final CloudPinManager get()
    {
        return new CloudPinManager((DeviceInfoManager)deviceInfoManager.get(), (Provider)rpcCaller.get(), (System)system.get(), (Lazy)settingProtoManager.get(), (AppPinToken)appPinToken.get(), (EncryptionService)encryptionService.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(deviceInfoManager);
        set.add(rpcCaller);
        set.add(system);
        set.add(settingProtoManager);
        set.add(appPinToken);
        set.add(encryptionService);
    }

    public ()
    {
        super("com.google.android.apps.wallet.pin.CloudPinManager", "members/com.google.android.apps.wallet.pin.CloudPinManager", false, com/google/android/apps/wallet/pin/CloudPinManager);
    }
}
