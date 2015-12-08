// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.content.res.Resources;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.util.CondensedNumberFormatter;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            DownloadablePlaylistItemRenderer, PlaylistItemMenuPresenter

public final class  extends b
    implements a, Provider
{

    private b eventBus;
    private b featureOperations;
    private b imageOperations;
    private b navigator;
    private b numberFormatter;
    private b playlistItemMenuPresenter;
    private b resources;
    private b screenProvider;
    private b supertype;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/playlists/DownloadablePlaylistItemRenderer, getClass().getClassLoader());
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/playlists/DownloadablePlaylistItemRenderer, getClass().getClassLoader());
        numberFormatter = l1.a("com.soundcloud.android.util.CondensedNumberFormatter", com/soundcloud/android/playlists/DownloadablePlaylistItemRenderer, getClass().getClassLoader());
        playlistItemMenuPresenter = l1.a("com.soundcloud.android.playlists.PlaylistItemMenuPresenter", com/soundcloud/android/playlists/DownloadablePlaylistItemRenderer, getClass().getClassLoader());
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/playlists/DownloadablePlaylistItemRenderer, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playlists/DownloadablePlaylistItemRenderer, getClass().getClassLoader());
        screenProvider = l1.a("com.soundcloud.android.analytics.ScreenProvider", com/soundcloud/android/playlists/DownloadablePlaylistItemRenderer, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/playlists/DownloadablePlaylistItemRenderer, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.view.adapters.PlaylistItemRenderer", com/soundcloud/android/playlists/DownloadablePlaylistItemRenderer, getClass().getClassLoader(), false);
    }

    public final DownloadablePlaylistItemRenderer get()
    {
        DownloadablePlaylistItemRenderer downloadableplaylistitemrenderer = new DownloadablePlaylistItemRenderer((Resources)resources.get(), (ImageOperations)imageOperations.get(), (CondensedNumberFormatter)numberFormatter.get(), (PlaylistItemMenuPresenter)playlistItemMenuPresenter.get(), (FeatureOperations)featureOperations.get(), (EventBus)eventBus.get(), (ScreenProvider)screenProvider.get(), (Navigator)navigator.get());
        injectMembers(downloadableplaylistitemrenderer);
        return downloadableplaylistitemrenderer;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resources);
        set.add(imageOperations);
        set.add(numberFormatter);
        set.add(playlistItemMenuPresenter);
        set.add(featureOperations);
        set.add(eventBus);
        set.add(screenProvider);
        set.add(navigator);
        set1.add(supertype);
    }

    public final void injectMembers(DownloadablePlaylistItemRenderer downloadableplaylistitemrenderer)
    {
        supertype.injectMembers(downloadableplaylistitemrenderer);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((DownloadablePlaylistItemRenderer)obj);
    }

    public ()
    {
        super("com.soundcloud.android.playlists.DownloadablePlaylistItemRenderer", "members/com.soundcloud.android.playlists.DownloadablePlaylistItemRenderer", false, com/soundcloud/android/playlists/DownloadablePlaylistItemRenderer);
    }
}
