// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.crypto.CryptoOperations;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.offline:
//            SecureFileStorage, OfflineSettingsStorage

public final class  extends b
    implements Provider
{

    private b operations;
    private b settingsStorage;

    public final void attach(l l1)
    {
        operations = l1.a("com.soundcloud.android.crypto.CryptoOperations", com/soundcloud/android/offline/SecureFileStorage, getClass().getClassLoader());
        settingsStorage = l1.a("com.soundcloud.android.offline.OfflineSettingsStorage", com/soundcloud/android/offline/SecureFileStorage, getClass().getClassLoader());
    }

    public final SecureFileStorage get()
    {
        return new SecureFileStorage((CryptoOperations)operations.get(), (OfflineSettingsStorage)settingsStorage.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(operations);
        set.add(settingsStorage);
    }

    public ()
    {
        super("com.soundcloud.android.offline.SecureFileStorage", "members/com.soundcloud.android.offline.SecureFileStorage", false, com/soundcloud/android/offline/SecureFileStorage);
    }
}
