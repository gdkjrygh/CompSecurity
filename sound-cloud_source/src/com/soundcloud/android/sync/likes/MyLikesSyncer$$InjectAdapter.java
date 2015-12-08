// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.likes;

import dagger.Lazy;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.likes:
//            MyLikesSyncer

public final class  extends b
    implements Provider
{

    private b playlistLikesSyncer;
    private b trackLikesSyncer;

    public final void attach(l l1)
    {
        trackLikesSyncer = l1.a("@javax.inject.Named(value=TrackLikesSyncer)/dagger.Lazy<com.soundcloud.android.sync.likes.LikesSyncer<com.soundcloud.android.api.model.ApiTrack>>", com/soundcloud/android/sync/likes/MyLikesSyncer, getClass().getClassLoader());
        playlistLikesSyncer = l1.a("@javax.inject.Named(value=PlaylistLikesSyncer)/dagger.Lazy<com.soundcloud.android.sync.likes.LikesSyncer<com.soundcloud.android.api.model.ApiPlaylist>>", com/soundcloud/android/sync/likes/MyLikesSyncer, getClass().getClassLoader());
    }

    public final MyLikesSyncer get()
    {
        return new MyLikesSyncer((Lazy)trackLikesSyncer.get(), (Lazy)playlistLikesSyncer.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(trackLikesSyncer);
        set.add(playlistLikesSyncer);
    }

    public ()
    {
        super("com.soundcloud.android.sync.likes.MyLikesSyncer", "members/com.soundcloud.android.sync.likes.MyLikesSyncer", false, com/soundcloud/android/sync/likes/MyLikesSyncer);
    }
}
