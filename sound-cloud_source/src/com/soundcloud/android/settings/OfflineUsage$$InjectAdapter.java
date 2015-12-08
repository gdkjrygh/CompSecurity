// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import com.soundcloud.android.offline.OfflineSettingsStorage;
import com.soundcloud.android.offline.SecureFileStorage;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.settings:
//            OfflineUsage

public final class A extends b
    implements Provider
{

    private b fileStorage;
    private b offlineSettings;

    public final void attach(l l1)
    {
        fileStorage = l1.a("com.soundcloud.android.offline.SecureFileStorage", com/soundcloud/android/settings/OfflineUsage, getClass().getClassLoader());
        offlineSettings = l1.a("com.soundcloud.android.offline.OfflineSettingsStorage", com/soundcloud/android/settings/OfflineUsage, getClass().getClassLoader());
    }

    public final OfflineUsage get()
    {
        return new OfflineUsage((SecureFileStorage)fileStorage.get(), (OfflineSettingsStorage)offlineSettings.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(fileStorage);
        set.add(offlineSettings);
    }

    public A()
    {
        super("com.soundcloud.android.settings.OfflineUsage", "members/com.soundcloud.android.settings.OfflineUsage", false, com/soundcloud/android/settings/OfflineUsage);
    }
}
