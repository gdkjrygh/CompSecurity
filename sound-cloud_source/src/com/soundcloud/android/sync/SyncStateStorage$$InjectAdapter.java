// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.SharedPreferences;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.propeller.rx.PropellerRx;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncStateStorage

public final class A extends b
    implements Provider
{

    private b dateProvider;
    private b preferences;
    private b propellerRx;

    public final void attach(l l1)
    {
        propellerRx = l1.a("com.soundcloud.propeller.rx.PropellerRx", com/soundcloud/android/sync/SyncStateStorage, getClass().getClassLoader());
        preferences = l1.a("@javax.inject.Named(value=syncer)/android.content.SharedPreferences", com/soundcloud/android/sync/SyncStateStorage, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/sync/SyncStateStorage, getClass().getClassLoader());
    }

    public final SyncStateStorage get()
    {
        return new SyncStateStorage((PropellerRx)propellerRx.get(), (SharedPreferences)preferences.get(), (CurrentDateProvider)dateProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propellerRx);
        set.add(preferences);
        set.add(dateProvider);
    }

    public A()
    {
        super("com.soundcloud.android.sync.SyncStateStorage", "members/com.soundcloud.android.sync.SyncStateStorage", false, com/soundcloud/android/sync/SyncStateStorage);
    }
}
