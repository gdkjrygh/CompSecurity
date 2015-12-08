// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.offline.OfflineContentOperations;
import com.soundcloud.android.offline.OfflinePlaybackOperations;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.likes:
//            TrackLikesHeaderPresenter, TrackLikesHeaderView

public final class  extends b
    implements a, Provider
{

    private b eventBus;
    private b expandPlayerSubscriberProvider;
    private b featureOperations;
    private b headerView;
    private b offlineContentOperations;
    private b playbackOperations;
    private b supertype;

    public final void attach(l l1)
    {
        headerView = l1.a("com.soundcloud.android.likes.TrackLikesHeaderView", com/soundcloud/android/likes/TrackLikesHeaderPresenter, getClass().getClassLoader());
        offlineContentOperations = l1.a("com.soundcloud.android.offline.OfflineContentOperations", com/soundcloud/android/likes/TrackLikesHeaderPresenter, getClass().getClassLoader());
        playbackOperations = l1.a("com.soundcloud.android.offline.OfflinePlaybackOperations", com/soundcloud/android/likes/TrackLikesHeaderPresenter, getClass().getClassLoader());
        expandPlayerSubscriberProvider = l1.a("javax.inject.Provider<com.soundcloud.android.playback.ExpandPlayerSubscriber>", com/soundcloud/android/likes/TrackLikesHeaderPresenter, getClass().getClassLoader());
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/likes/TrackLikesHeaderPresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/likes/TrackLikesHeaderPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle", com/soundcloud/android/likes/TrackLikesHeaderPresenter, getClass().getClassLoader(), false);
    }

    public final TrackLikesHeaderPresenter get()
    {
        TrackLikesHeaderPresenter tracklikesheaderpresenter = new TrackLikesHeaderPresenter((TrackLikesHeaderView)headerView.get(), (OfflineContentOperations)offlineContentOperations.get(), (OfflinePlaybackOperations)playbackOperations.get(), (Provider)expandPlayerSubscriberProvider.get(), (FeatureOperations)featureOperations.get(), (EventBus)eventBus.get());
        injectMembers(tracklikesheaderpresenter);
        return tracklikesheaderpresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(headerView);
        set.add(offlineContentOperations);
        set.add(playbackOperations);
        set.add(expandPlayerSubscriberProvider);
        set.add(featureOperations);
        set.add(eventBus);
        set1.add(supertype);
    }

    public final void injectMembers(TrackLikesHeaderPresenter tracklikesheaderpresenter)
    {
        supertype.injectMembers(tracklikesheaderpresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((TrackLikesHeaderPresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.likes.TrackLikesHeaderPresenter", "members/com.soundcloud.android.likes.TrackLikesHeaderPresenter", false, com/soundcloud/android/likes/TrackLikesHeaderPresenter);
    }
}
