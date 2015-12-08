// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.SharedPreferences;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncCleanupAction, SyncStateManager

public final class  extends b
    implements Provider
{

    private b activitiesPrefs;
    private b stateManager;
    private b streamPrefs;

    public final void attach(l l1)
    {
        stateManager = l1.a("com.soundcloud.android.sync.SyncStateManager", com/soundcloud/android/sync/SyncCleanupAction, getClass().getClassLoader());
        streamPrefs = l1.a("@javax.inject.Named(value=StreamSync)/android.content.SharedPreferences", com/soundcloud/android/sync/SyncCleanupAction, getClass().getClassLoader());
        activitiesPrefs = l1.a("@javax.inject.Named(value=ActivitiesSync)/android.content.SharedPreferences", com/soundcloud/android/sync/SyncCleanupAction, getClass().getClassLoader());
    }

    public final SyncCleanupAction get()
    {
        return new SyncCleanupAction((SyncStateManager)stateManager.get(), (SharedPreferences)streamPrefs.get(), (SharedPreferences)activitiesPrefs.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(stateManager);
        set.add(streamPrefs);
        set.add(activitiesPrefs);
    }

    public ()
    {
        super("com.soundcloud.android.sync.SyncCleanupAction", "members/com.soundcloud.android.sync.SyncCleanupAction", false, com/soundcloud/android/sync/SyncCleanupAction);
    }
}
