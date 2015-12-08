// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineSettingsOperations, OfflineSettingsStorage

public final class  extends b
    implements Provider
{

    private b offlineSettingsStorage;

    public final void attach(l l1)
    {
        offlineSettingsStorage = l1.a("com.soundcloud.android.offline.OfflineSettingsStorage", com/soundcloud/android/offline/OfflineSettingsOperations, getClass().getClassLoader());
    }

    public final OfflineSettingsOperations get()
    {
        return new OfflineSettingsOperations((OfflineSettingsStorage)offlineSettingsStorage.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(offlineSettingsStorage);
    }

    public ()
    {
        super("com.soundcloud.android.offline.OfflineSettingsOperations", "members/com.soundcloud.android.offline.OfflineSettingsOperations", false, com/soundcloud/android/offline/OfflineSettingsOperations);
    }
}
