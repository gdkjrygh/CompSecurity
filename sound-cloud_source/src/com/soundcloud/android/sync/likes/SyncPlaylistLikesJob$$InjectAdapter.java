// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.likes;

import dagger.Lazy;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.likes:
//            SyncPlaylistLikesJob

public final class  extends b
    implements a, Provider
{

    private b playlistLikesSyncer;
    private b supertype;

    public final void attach(l l1)
    {
        playlistLikesSyncer = l1.a("@javax.inject.Named(value=PlaylistLikesSyncer)/dagger.Lazy<com.soundcloud.android.sync.likes.LikesSyncer<com.soundcloud.android.api.model.ApiPlaylist>>", com/soundcloud/android/sync/likes/SyncPlaylistLikesJob, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.sync.likes.DefaultSyncJob", com/soundcloud/android/sync/likes/SyncPlaylistLikesJob, getClass().getClassLoader(), false);
    }

    public final SyncPlaylistLikesJob get()
    {
        SyncPlaylistLikesJob syncplaylistlikesjob = new SyncPlaylistLikesJob((Lazy)playlistLikesSyncer.get());
        injectMembers(syncplaylistlikesjob);
        return syncplaylistlikesjob;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(playlistLikesSyncer);
        set1.add(supertype);
    }

    public final void injectMembers(SyncPlaylistLikesJob syncplaylistlikesjob)
    {
        supertype.injectMembers(syncplaylistlikesjob);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SyncPlaylistLikesJob)obj);
    }

    public ()
    {
        super("com.soundcloud.android.sync.likes.SyncPlaylistLikesJob", "members/com.soundcloud.android.sync.likes.SyncPlaylistLikesJob", false, com/soundcloud/android/sync/likes/SyncPlaylistLikesJob);
    }
}
