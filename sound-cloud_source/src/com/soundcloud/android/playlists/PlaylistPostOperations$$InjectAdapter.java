// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistPostOperations, PlaylistPostStorage

public final class  extends b
    implements Provider
{

    private b networkConnectionHelper;
    private b playlistPostStorage;
    private b scheduler;
    private b syncInitiator;

    public final void attach(l l1)
    {
        playlistPostStorage = l1.a("com.soundcloud.android.playlists.PlaylistPostStorage", com/soundcloud/android/playlists/PlaylistPostOperations, getClass().getClassLoader());
        syncInitiator = l1.a("com.soundcloud.android.sync.SyncInitiator", com/soundcloud/android/playlists/PlaylistPostOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/playlists/PlaylistPostOperations, getClass().getClassLoader());
        networkConnectionHelper = l1.a("com.soundcloud.android.utils.NetworkConnectionHelper", com/soundcloud/android/playlists/PlaylistPostOperations, getClass().getClassLoader());
    }

    public final PlaylistPostOperations get()
    {
        return new PlaylistPostOperations((PlaylistPostStorage)playlistPostStorage.get(), (SyncInitiator)syncInitiator.get(), (R)scheduler.get(), (NetworkConnectionHelper)networkConnectionHelper.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(playlistPostStorage);
        set.add(syncInitiator);
        set.add(scheduler);
        set.add(networkConnectionHelper);
    }

    public ()
    {
        super("com.soundcloud.android.playlists.PlaylistPostOperations", "members/com.soundcloud.android.playlists.PlaylistPostOperations", false, com/soundcloud/android/playlists/PlaylistPostOperations);
    }
}
