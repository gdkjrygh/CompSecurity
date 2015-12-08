// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.offline.OfflineContentOperations;
import com.soundcloud.android.offline.OfflinePlaybackOperations;
import com.soundcloud.android.paywall.PaywallImpressionController;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.utils.CollapsingScrollHelper;
import com.soundcloud.android.view.adapters.PagedTracksRecyclerItemAdapter;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.likes:
//            TrackLikesPresenter, TrackLikeOperations, TrackLikesHeaderPresenter

public final class ter extends b
    implements a, Provider
{

    private b adapter;
    private b eventBus;
    private b expandPlayerSubscriberProvider;
    private b featureOperations;
    private b headerPresenter;
    private b likeOperations;
    private b navigator;
    private b offlineContentOperations;
    private b paywallImpressionController;
    private b playbackOperations;
    private b scrollHelper;
    private b supertype;
    private b swipeRefreshAttacher;

    public final void attach(l l1)
    {
        likeOperations = l1.a("com.soundcloud.android.likes.TrackLikeOperations", com/soundcloud/android/likes/TrackLikesPresenter, getClass().getClassLoader());
        playbackOperations = l1.a("com.soundcloud.android.offline.OfflinePlaybackOperations", com/soundcloud/android/likes/TrackLikesPresenter, getClass().getClassLoader());
        offlineContentOperations = l1.a("com.soundcloud.android.offline.OfflineContentOperations", com/soundcloud/android/likes/TrackLikesPresenter, getClass().getClassLoader());
        adapter = l1.a("com.soundcloud.android.view.adapters.PagedTracksRecyclerItemAdapter", com/soundcloud/android/likes/TrackLikesPresenter, getClass().getClassLoader());
        headerPresenter = l1.a("com.soundcloud.android.likes.TrackLikesHeaderPresenter", com/soundcloud/android/likes/TrackLikesPresenter, getClass().getClassLoader());
        expandPlayerSubscriberProvider = l1.a("javax.inject.Provider<com.soundcloud.android.playback.ExpandPlayerSubscriber>", com/soundcloud/android/likes/TrackLikesPresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/likes/TrackLikesPresenter, getClass().getClassLoader());
        swipeRefreshAttacher = l1.a("com.soundcloud.android.presentation.SwipeRefreshAttacher", com/soundcloud/android/likes/TrackLikesPresenter, getClass().getClassLoader());
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/likes/TrackLikesPresenter, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/likes/TrackLikesPresenter, getClass().getClassLoader());
        scrollHelper = l1.a("com.soundcloud.android.utils.CollapsingScrollHelper", com/soundcloud/android/likes/TrackLikesPresenter, getClass().getClassLoader());
        paywallImpressionController = l1.a("com.soundcloud.android.paywall.PaywallImpressionController", com/soundcloud/android/likes/TrackLikesPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.RecyclerViewPresenter", com/soundcloud/android/likes/TrackLikesPresenter, getClass().getClassLoader(), false);
    }

    public final TrackLikesPresenter get()
    {
        TrackLikesPresenter tracklikespresenter = new TrackLikesPresenter((TrackLikeOperations)likeOperations.get(), (OfflinePlaybackOperations)playbackOperations.get(), (OfflineContentOperations)offlineContentOperations.get(), (PagedTracksRecyclerItemAdapter)adapter.get(), (TrackLikesHeaderPresenter)headerPresenter.get(), (Provider)expandPlayerSubscriberProvider.get(), (EventBus)eventBus.get(), (SwipeRefreshAttacher)swipeRefreshAttacher.get(), (FeatureOperations)featureOperations.get(), (Navigator)navigator.get(), (CollapsingScrollHelper)scrollHelper.get(), (PaywallImpressionController)paywallImpressionController.get());
        injectMembers(tracklikespresenter);
        return tracklikespresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(likeOperations);
        set.add(playbackOperations);
        set.add(offlineContentOperations);
        set.add(adapter);
        set.add(headerPresenter);
        set.add(expandPlayerSubscriberProvider);
        set.add(eventBus);
        set.add(swipeRefreshAttacher);
        set.add(featureOperations);
        set.add(navigator);
        set.add(scrollHelper);
        set.add(paywallImpressionController);
        set1.add(supertype);
    }

    public final void injectMembers(TrackLikesPresenter tracklikespresenter)
    {
        supertype.injectMembers(tracklikespresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((TrackLikesPresenter)obj);
    }

    public ter()
    {
        super("com.soundcloud.android.likes.TrackLikesPresenter", "members/com.soundcloud.android.likes.TrackLikesPresenter", false, com/soundcloud/android/likes/TrackLikesPresenter);
    }
}
