// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crypto;

import com.soundcloud.android.offline.OfflineSettingsStorage;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.crypto:
//            EncryptionTester, CryptoOperations

public final class  extends b
    implements Provider
{

    private b cryptoOperations;
    private b offlineSettings;
    private b scheduler;

    public final void attach(l l1)
    {
        offlineSettings = l1.a("com.soundcloud.android.offline.OfflineSettingsStorage", com/soundcloud/android/crypto/EncryptionTester, getClass().getClassLoader());
        cryptoOperations = l1.a("com.soundcloud.android.crypto.CryptoOperations", com/soundcloud/android/crypto/EncryptionTester, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=LowPriority)/rx.Scheduler", com/soundcloud/android/crypto/EncryptionTester, getClass().getClassLoader());
    }

    public final EncryptionTester get()
    {
        return new EncryptionTester((OfflineSettingsStorage)offlineSettings.get(), (CryptoOperations)cryptoOperations.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(offlineSettings);
        set.add(cryptoOperations);
        set.add(scheduler);
    }

    public ()
    {
        super("com.soundcloud.android.crypto.EncryptionTester", "members/com.soundcloud.android.crypto.EncryptionTester", false, com/soundcloud/android/crypto/EncryptionTester);
    }
}
