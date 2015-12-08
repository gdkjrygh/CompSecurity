// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.content.Context;
import com.soundcloud.android.playlists.PlaylistOperations;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineServiceInitiator, OfflineSettingsStorage, OfflineContentOperations

public final class  extends b
    implements Provider
{

    private b context;
    private b eventBus;
    private b offlineContentOperations;
    private b playlistOperations;
    private b scheduler;
    private b settingsStorage;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/offline/OfflineServiceInitiator, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/offline/OfflineServiceInitiator, getClass().getClassLoader());
        settingsStorage = l1.a("com.soundcloud.android.offline.OfflineSettingsStorage", com/soundcloud/android/offline/OfflineServiceInitiator, getClass().getClassLoader());
        playlistOperations = l1.a("com.soundcloud.android.playlists.PlaylistOperations", com/soundcloud/android/offline/OfflineServiceInitiator, getClass().getClassLoader());
        offlineContentOperations = l1.a("com.soundcloud.android.offline.OfflineContentOperations", com/soundcloud/android/offline/OfflineServiceInitiator, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/offline/OfflineServiceInitiator, getClass().getClassLoader());
    }

    public final OfflineServiceInitiator get()
    {
        return new OfflineServiceInitiator((Context)context.get(), (EventBus)eventBus.get(), (OfflineSettingsStorage)settingsStorage.get(), (PlaylistOperations)playlistOperations.get(), (OfflineContentOperations)offlineContentOperations.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(eventBus);
        set.add(settingsStorage);
        set.add(playlistOperations);
        set.add(offlineContentOperations);
        set.add(scheduler);
    }

    public ()
    {
        super("com.soundcloud.android.offline.OfflineServiceInitiator", "members/com.soundcloud.android.offline.OfflineServiceInitiator", true, com/soundcloud/android/offline/OfflineServiceInitiator);
    }
}
