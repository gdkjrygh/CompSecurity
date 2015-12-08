// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.SharedPreferences;
import com.soundcloud.android.sync.timeline.TimelineSyncStorage;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncModule

public static final class setLibrary extends t
    implements Provider
{

    private final SyncModule module;
    private b preferences;

    public final void attach(l l1)
    {
        preferences = l1.a("@javax.inject.Named(value=ActivitiesSync)/android.content.SharedPreferences", com/soundcloud/android/sync/SyncModule, getClass().getClassLoader());
    }

    public final TimelineSyncStorage get()
    {
        return module.activitiesSyncStorage((SharedPreferences)preferences.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(preferences);
    }

    public (SyncModule syncmodule)
    {
        super("@javax.inject.Named(value=ActivitiesSyncStorage)/com.soundcloud.android.sync.timeline.TimelineSyncStorage", false, "com.soundcloud.android.sync.SyncModule", "activitiesSyncStorage");
        module = syncmodule;
        setLibrary(false);
    }
}
