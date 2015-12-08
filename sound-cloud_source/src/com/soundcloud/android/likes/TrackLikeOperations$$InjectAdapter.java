// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.likes:
//            TrackLikeOperations, LoadLikedTrackUrnsCommand, LikedTrackStorage

public final class  extends b
    implements Provider
{

    private b eventBus;
    private b likedTrackStorage;
    private b loadLikedTrackUrnsCommand;
    private b networkConnectionHelper;
    private b scheduler;
    private b syncInitiator;

    public final void attach(l l1)
    {
        loadLikedTrackUrnsCommand = l1.a("com.soundcloud.android.likes.LoadLikedTrackUrnsCommand", com/soundcloud/android/likes/TrackLikeOperations, getClass().getClassLoader());
        likedTrackStorage = l1.a("com.soundcloud.android.likes.LikedTrackStorage", com/soundcloud/android/likes/TrackLikeOperations, getClass().getClassLoader());
        syncInitiator = l1.a("com.soundcloud.android.sync.SyncInitiator", com/soundcloud/android/likes/TrackLikeOperations, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/likes/TrackLikeOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/likes/TrackLikeOperations, getClass().getClassLoader());
        networkConnectionHelper = l1.a("com.soundcloud.android.utils.NetworkConnectionHelper", com/soundcloud/android/likes/TrackLikeOperations, getClass().getClassLoader());
    }

    public final TrackLikeOperations get()
    {
        return new TrackLikeOperations((LoadLikedTrackUrnsCommand)loadLikedTrackUrnsCommand.get(), (LikedTrackStorage)likedTrackStorage.get(), (SyncInitiator)syncInitiator.get(), (EventBus)eventBus.get(), (R)scheduler.get(), (NetworkConnectionHelper)networkConnectionHelper.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(loadLikedTrackUrnsCommand);
        set.add(likedTrackStorage);
        set.add(syncInitiator);
        set.add(eventBus);
        set.add(scheduler);
        set.add(networkConnectionHelper);
    }

    public ()
    {
        super("com.soundcloud.android.likes.TrackLikeOperations", "members/com.soundcloud.android.likes.TrackLikeOperations", false, com/soundcloud/android/likes/TrackLikeOperations);
    }
}
