// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.offline.OfflineContentOperations;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.configuration:
//            ConfigurationManager, ConfigurationOperations, DeviceManagementStorage

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b configurationOperations;
    private b deviceManagementStorage;
    private b offlineContentOperations;

    public final void attach(l l1)
    {
        configurationOperations = l1.a("com.soundcloud.android.configuration.ConfigurationOperations", com/soundcloud/android/configuration/ConfigurationManager, getClass().getClassLoader());
        offlineContentOperations = l1.a("com.soundcloud.android.offline.OfflineContentOperations", com/soundcloud/android/configuration/ConfigurationManager, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/configuration/ConfigurationManager, getClass().getClassLoader());
        deviceManagementStorage = l1.a("com.soundcloud.android.configuration.DeviceManagementStorage", com/soundcloud/android/configuration/ConfigurationManager, getClass().getClassLoader());
    }

    public final ConfigurationManager get()
    {
        return new ConfigurationManager((ConfigurationOperations)configurationOperations.get(), (OfflineContentOperations)offlineContentOperations.get(), (AccountOperations)accountOperations.get(), (DeviceManagementStorage)deviceManagementStorage.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(configurationOperations);
        set.add(offlineContentOperations);
        set.add(accountOperations);
        set.add(deviceManagementStorage);
    }

    public ()
    {
        super("com.soundcloud.android.configuration.ConfigurationManager", "members/com.soundcloud.android.configuration.ConfigurationManager", false, com/soundcloud/android/configuration/ConfigurationManager);
    }
}
