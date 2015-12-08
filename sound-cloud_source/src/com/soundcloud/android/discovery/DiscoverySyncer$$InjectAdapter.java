// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.content.SharedPreferences;
import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.android.utils.CurrentDateProvider;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.discovery:
//            DiscoverySyncer

public final class  extends b
    implements Provider
{

    private b dateProvider;
    private b sharedPreferences;
    private b syncInitiator;

    public final void attach(l l1)
    {
        syncInitiator = l1.a("com.soundcloud.android.sync.SyncInitiator", com/soundcloud/android/discovery/DiscoverySyncer, getClass().getClassLoader());
        sharedPreferences = l1.a("@javax.inject.Named(value=RecommendationsSync)/android.content.SharedPreferences", com/soundcloud/android/discovery/DiscoverySyncer, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/discovery/DiscoverySyncer, getClass().getClassLoader());
    }

    public final DiscoverySyncer get()
    {
        return new DiscoverySyncer((SyncInitiator)syncInitiator.get(), (SharedPreferences)sharedPreferences.get(), (CurrentDateProvider)dateProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(syncInitiator);
        set.add(sharedPreferences);
        set.add(dateProvider);
    }

    public ()
    {
        super("com.soundcloud.android.discovery.DiscoverySyncer", "members/com.soundcloud.android.discovery.DiscoverySyncer", false, com/soundcloud/android/discovery/DiscoverySyncer);
    }
}
