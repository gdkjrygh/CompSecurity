// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.rx.PropellerRx;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.offline:
//            TrackDownloadsStorage

public final class I extends b
    implements Provider
{

    private b dateProvider;
    private b propeller;
    private b propellerRx;

    public final void attach(l l1)
    {
        propeller = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/offline/TrackDownloadsStorage, getClass().getClassLoader());
        propellerRx = l1.a("com.soundcloud.propeller.rx.PropellerRx", com/soundcloud/android/offline/TrackDownloadsStorage, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/offline/TrackDownloadsStorage, getClass().getClassLoader());
    }

    public final TrackDownloadsStorage get()
    {
        return new TrackDownloadsStorage((PropellerDatabase)propeller.get(), (PropellerRx)propellerRx.get(), (CurrentDateProvider)dateProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propeller);
        set.add(propellerRx);
        set.add(dateProvider);
    }

    public I()
    {
        super("com.soundcloud.android.offline.TrackDownloadsStorage", "members/com.soundcloud.android.offline.TrackDownloadsStorage", false, com/soundcloud/android/offline/TrackDownloadsStorage);
    }
}
