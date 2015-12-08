// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.associations.RepostOperations;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.likes.LikeOperations;
import com.soundcloud.android.offline.OfflineContentOperations;
import com.soundcloud.android.offline.OfflinePlaybackOperations;
import com.soundcloud.android.playback.ui.view.PlaybackToastHelper;
import com.soundcloud.android.share.ShareOperations;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistEngagementsPresenter, PlaylistEngagementsView

public final class  extends b
    implements a, Provider
{

    private b accountOperations;
    private b eventBus;
    private b featureOperations;
    private b likeOperations;
    private b navigator;
    private b offlineOperations;
    private b offlinePlaybackOperations;
    private b playbackToastHelper;
    private b playlistEngagementsView;
    private b repostOperations;
    private b shareOperations;
    private b supertype;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playlists/PlaylistEngagementsPresenter, getClass().getClassLoader());
        repostOperations = l1.a("com.soundcloud.android.associations.RepostOperations", com/soundcloud/android/playlists/PlaylistEngagementsPresenter, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/playlists/PlaylistEngagementsPresenter, getClass().getClassLoader());
        likeOperations = l1.a("com.soundcloud.android.likes.LikeOperations", com/soundcloud/android/playlists/PlaylistEngagementsPresenter, getClass().getClassLoader());
        playlistEngagementsView = l1.a("com.soundcloud.android.playlists.PlaylistEngagementsView", com/soundcloud/android/playlists/PlaylistEngagementsPresenter, getClass().getClassLoader());
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/playlists/PlaylistEngagementsPresenter, getClass().getClassLoader());
        offlineOperations = l1.a("com.soundcloud.android.offline.OfflineContentOperations", com/soundcloud/android/playlists/PlaylistEngagementsPresenter, getClass().getClassLoader());
        offlinePlaybackOperations = l1.a("com.soundcloud.android.offline.OfflinePlaybackOperations", com/soundcloud/android/playlists/PlaylistEngagementsPresenter, getClass().getClassLoader());
        playbackToastHelper = l1.a("com.soundcloud.android.playback.ui.view.PlaybackToastHelper", com/soundcloud/android/playlists/PlaylistEngagementsPresenter, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/playlists/PlaylistEngagementsPresenter, getClass().getClassLoader());
        shareOperations = l1.a("com.soundcloud.android.share.ShareOperations", com/soundcloud/android/playlists/PlaylistEngagementsPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle", com/soundcloud/android/playlists/PlaylistEngagementsPresenter, getClass().getClassLoader(), false);
    }

    public final PlaylistEngagementsPresenter get()
    {
        PlaylistEngagementsPresenter playlistengagementspresenter = new PlaylistEngagementsPresenter((EventBus)eventBus.get(), (RepostOperations)repostOperations.get(), (AccountOperations)accountOperations.get(), (LikeOperations)likeOperations.get(), (PlaylistEngagementsView)playlistEngagementsView.get(), (FeatureOperations)featureOperations.get(), (OfflineContentOperations)offlineOperations.get(), (OfflinePlaybackOperations)offlinePlaybackOperations.get(), (PlaybackToastHelper)playbackToastHelper.get(), (Navigator)navigator.get(), (ShareOperations)shareOperations.get());
        injectMembers(playlistengagementspresenter);
        return playlistengagementspresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(repostOperations);
        set.add(accountOperations);
        set.add(likeOperations);
        set.add(playlistEngagementsView);
        set.add(featureOperations);
        set.add(offlineOperations);
        set.add(offlinePlaybackOperations);
        set.add(playbackToastHelper);
        set.add(navigator);
        set.add(shareOperations);
        set1.add(supertype);
    }

    public final void injectMembers(PlaylistEngagementsPresenter playlistengagementspresenter)
    {
        supertype.injectMembers(playlistengagementspresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PlaylistEngagementsPresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.playlists.PlaylistEngagementsPresenter", "members/com.soundcloud.android.playlists.PlaylistEngagementsPresenter", false, com/soundcloud/android/playlists/PlaylistEngagementsPresenter);
    }
}
