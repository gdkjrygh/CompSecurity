// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.device;

import com.google.android.apps.wallet.datastore.KeyValueStore;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.device:
//            DeviceInfoManager

public final class  extends Binding
    implements Provider
{

    private Binding keyValueStore;

    public final void attach(Linker linker)
    {
        keyValueStore = linker.requestBinding("@com.google.android.apps.wallet.datastore.BindingAnnotations$DatabaseTable(value=METADATA)/com.google.android.apps.wallet.datastore.KeyValueStore", com/google/android/apps/wallet/device/DeviceInfoManager, getClass().getClassLoader());
    }

    public final DeviceInfoManager get()
    {
        return new DeviceInfoManager((KeyValueStore)keyValueStore.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(keyValueStore);
    }

    public ()
    {
        super("com.google.android.apps.wallet.device.DeviceInfoManager", "members/com.google.android.apps.wallet.device.DeviceInfoManager", true, com/google/android/apps/wallet/device/DeviceInfoManager);
    }
}
