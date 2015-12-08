// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.content.Context;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.associations.RepostOperations;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.likes.LikeOperations;
import com.soundcloud.android.offline.OfflineContentOperations;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.share.ShareOperations;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistItemMenuPresenter, PlaylistOperations

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b appContext;
    private b eventBus;
    private b featureFlags;
    private b featureOperations;
    private b likeOperations;
    private b navigator;
    private b offlineContentOperations;
    private b playlistOperations;
    private b popupMenuWrapperFactory;
    private b repostOperations;
    private b screenProvider;
    private b shareOperations;

    public final void attach(l l1)
    {
        appContext = l1.a("android.content.Context", com/soundcloud/android/playlists/PlaylistItemMenuPresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playlists/PlaylistItemMenuPresenter, getClass().getClassLoader());
        popupMenuWrapperFactory = l1.a("com.soundcloud.android.view.menu.PopupMenuWrapper$Factory", com/soundcloud/android/playlists/PlaylistItemMenuPresenter, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/playlists/PlaylistItemMenuPresenter, getClass().getClassLoader());
        playlistOperations = l1.a("com.soundcloud.android.playlists.PlaylistOperations", com/soundcloud/android/playlists/PlaylistItemMenuPresenter, getClass().getClassLoader());
        likeOperations = l1.a("com.soundcloud.android.likes.LikeOperations", com/soundcloud/android/playlists/PlaylistItemMenuPresenter, getClass().getClassLoader());
        repostOperations = l1.a("com.soundcloud.android.associations.RepostOperations", com/soundcloud/android/playlists/PlaylistItemMenuPresenter, getClass().getClassLoader());
        shareOperations = l1.a("com.soundcloud.android.share.ShareOperations", com/soundcloud/android/playlists/PlaylistItemMenuPresenter, getClass().getClassLoader());
        screenProvider = l1.a("com.soundcloud.android.analytics.ScreenProvider", com/soundcloud/android/playlists/PlaylistItemMenuPresenter, getClass().getClassLoader());
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/playlists/PlaylistItemMenuPresenter, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/playlists/PlaylistItemMenuPresenter, getClass().getClassLoader());
        offlineContentOperations = l1.a("com.soundcloud.android.offline.OfflineContentOperations", com/soundcloud/android/playlists/PlaylistItemMenuPresenter, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/playlists/PlaylistItemMenuPresenter, getClass().getClassLoader());
    }

    public final PlaylistItemMenuPresenter get()
    {
        return new PlaylistItemMenuPresenter((Context)appContext.get(), (EventBus)eventBus.get(), (com.soundcloud.android.view.menu.eventBus)popupMenuWrapperFactory.get(), (AccountOperations)accountOperations.get(), (PlaylistOperations)playlistOperations.get(), (LikeOperations)likeOperations.get(), (RepostOperations)repostOperations.get(), (ShareOperations)shareOperations.get(), (ScreenProvider)screenProvider.get(), (FeatureOperations)featureOperations.get(), (FeatureFlags)featureFlags.get(), (OfflineContentOperations)offlineContentOperations.get(), (Navigator)navigator.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(appContext);
        set.add(eventBus);
        set.add(popupMenuWrapperFactory);
        set.add(accountOperations);
        set.add(playlistOperations);
        set.add(likeOperations);
        set.add(repostOperations);
        set.add(shareOperations);
        set.add(screenProvider);
        set.add(featureOperations);
        set.add(featureFlags);
        set.add(offlineContentOperations);
        set.add(navigator);
    }

    public ()
    {
        super("com.soundcloud.android.playlists.PlaylistItemMenuPresenter", "members/com.soundcloud.android.playlists.PlaylistItemMenuPresenter", false, com/soundcloud/android/playlists/PlaylistItemMenuPresenter);
    }
}
