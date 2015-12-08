// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.content.SharedPreferences;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.rx.PropellerRx;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsStorage

public final class  extends b
    implements Provider
{

    private b dateProvider;
    private b propellerDatabase;
    private b propellerRx;
    private b sharedPreferences;

    public final void attach(l l1)
    {
        sharedPreferences = l1.a("@javax.inject.Named(value=stations)/android.content.SharedPreferences", com/soundcloud/android/stations/StationsStorage, getClass().getClassLoader());
        propellerDatabase = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/stations/StationsStorage, getClass().getClassLoader());
        propellerRx = l1.a("com.soundcloud.propeller.rx.PropellerRx", com/soundcloud/android/stations/StationsStorage, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/stations/StationsStorage, getClass().getClassLoader());
    }

    public final StationsStorage get()
    {
        return new StationsStorage((SharedPreferences)sharedPreferences.get(), (PropellerDatabase)propellerDatabase.get(), (PropellerRx)propellerRx.get(), (CurrentDateProvider)dateProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(sharedPreferences);
        set.add(propellerDatabase);
        set.add(propellerRx);
        set.add(dateProvider);
    }

    public ()
    {
        super("com.soundcloud.android.stations.StationsStorage", "members/com.soundcloud.android.stations.StationsStorage", false, com/soundcloud/android/stations/StationsStorage);
    }
}
