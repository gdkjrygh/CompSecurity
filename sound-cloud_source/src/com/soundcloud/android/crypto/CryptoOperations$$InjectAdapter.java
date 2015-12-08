// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crypto;

import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.crypto:
//            CryptoOperations, KeyStorage, KeyGeneratorWrapper, Encryptor

public final class  extends b
    implements Provider
{

    private b encryptor;
    private b eventBus;
    private b keyGenerator;
    private b scheduler;
    private b storage;

    public final void attach(l l1)
    {
        storage = l1.a("com.soundcloud.android.crypto.KeyStorage", com/soundcloud/android/crypto/CryptoOperations, getClass().getClassLoader());
        keyGenerator = l1.a("com.soundcloud.android.crypto.KeyGeneratorWrapper", com/soundcloud/android/crypto/CryptoOperations, getClass().getClassLoader());
        encryptor = l1.a("com.soundcloud.android.crypto.Encryptor", com/soundcloud/android/crypto/CryptoOperations, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/crypto/CryptoOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/crypto/CryptoOperations, getClass().getClassLoader());
    }

    public final CryptoOperations get()
    {
        return new CryptoOperations((KeyStorage)storage.get(), (KeyGeneratorWrapper)keyGenerator.get(), (Encryptor)encryptor.get(), (EventBus)eventBus.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(storage);
        set.add(keyGenerator);
        set.add(encryptor);
        set.add(eventBus);
        set.add(scheduler);
    }

    public ()
    {
        super("com.soundcloud.android.crypto.CryptoOperations", "members/com.soundcloud.android.crypto.CryptoOperations", false, com/soundcloud/android/crypto/CryptoOperations);
    }
}
