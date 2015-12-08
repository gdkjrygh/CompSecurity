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
//            SyncTrackLikesJob

public final class  extends b
    implements a, Provider
{

    private b supertype;
    private b trackLikesSyncer;

    public final void attach(l l1)
    {
        trackLikesSyncer = l1.a("@javax.inject.Named(value=TrackLikesSyncer)/dagger.Lazy<com.soundcloud.android.sync.likes.LikesSyncer<com.soundcloud.android.api.model.ApiTrack>>", com/soundcloud/android/sync/likes/SyncTrackLikesJob, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.sync.likes.DefaultSyncJob", com/soundcloud/android/sync/likes/SyncTrackLikesJob, getClass().getClassLoader(), false);
    }

    public final SyncTrackLikesJob get()
    {
        SyncTrackLikesJob synctracklikesjob = new SyncTrackLikesJob((Lazy)trackLikesSyncer.get());
        injectMembers(synctracklikesjob);
        return synctracklikesjob;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(trackLikesSyncer);
        set1.add(supertype);
    }

    public final void injectMembers(SyncTrackLikesJob synctracklikesjob)
    {
        supertype.injectMembers(synctracklikesjob);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SyncTrackLikesJob)obj);
    }

    public ()
    {
        super("com.soundcloud.android.sync.likes.SyncTrackLikesJob", "members/com.soundcloud.android.sync.likes.SyncTrackLikesJob", false, com/soundcloud/android/sync/likes/SyncTrackLikesJob);
    }
}
