// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.likes.TrackLikeOperations;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.playlists.PlaylistOperations;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflinePlaybackOperations, TrackDownloadsStorage

public final class  extends b
    implements Provider
{

    private b connectionHelper;
    private b featureOperations;
    private b likeOperations;
    private b playbackInitiator;
    private b playlistOperations;
    private b scheduler;
    private b trackDownloadsStorage;

    public final void attach(l l1)
    {
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/offline/OfflinePlaybackOperations, getClass().getClassLoader());
        connectionHelper = l1.a("com.soundcloud.android.utils.NetworkConnectionHelper", com/soundcloud/android/offline/OfflinePlaybackOperations, getClass().getClassLoader());
        playbackInitiator = l1.a("com.soundcloud.android.playback.PlaybackInitiator", com/soundcloud/android/offline/OfflinePlaybackOperations, getClass().getClassLoader());
        likeOperations = l1.a("com.soundcloud.android.likes.TrackLikeOperations", com/soundcloud/android/offline/OfflinePlaybackOperations, getClass().getClassLoader());
        playlistOperations = l1.a("com.soundcloud.android.playlists.PlaylistOperations", com/soundcloud/android/offline/OfflinePlaybackOperations, getClass().getClassLoader());
        trackDownloadsStorage = l1.a("com.soundcloud.android.offline.TrackDownloadsStorage", com/soundcloud/android/offline/OfflinePlaybackOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/offline/OfflinePlaybackOperations, getClass().getClassLoader());
    }

    public final OfflinePlaybackOperations get()
    {
        return new OfflinePlaybackOperations((FeatureOperations)featureOperations.get(), (NetworkConnectionHelper)connectionHelper.get(), (PlaybackInitiator)playbackInitiator.get(), (TrackLikeOperations)likeOperations.get(), (PlaylistOperations)playlistOperations.get(), (TrackDownloadsStorage)trackDownloadsStorage.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(featureOperations);
        set.add(connectionHelper);
        set.add(playbackInitiator);
        set.add(likeOperations);
        set.add(playlistOperations);
        set.add(trackDownloadsStorage);
        set.add(scheduler);
    }

    public ()
    {
        super("com.soundcloud.android.offline.OfflinePlaybackOperations", "members/com.soundcloud.android.offline.OfflinePlaybackOperations", false, com/soundcloud/android/offline/OfflinePlaybackOperations);
    }
}
