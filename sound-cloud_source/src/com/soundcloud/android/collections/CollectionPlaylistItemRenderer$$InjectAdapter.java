// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.content.res.Resources;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.playlists.PlaylistItemMenuPresenter;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.collections:
//            CollectionPlaylistItemRenderer

public final class  extends b
    implements Provider
{

    private b featureOperations;
    private b imageOperations;
    private b navigator;
    private b playlistItemMenuPresenter;
    private b resources;

    public final void attach(l l1)
    {
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/collections/CollectionPlaylistItemRenderer, getClass().getClassLoader());
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/collections/CollectionPlaylistItemRenderer, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/collections/CollectionPlaylistItemRenderer, getClass().getClassLoader());
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/collections/CollectionPlaylistItemRenderer, getClass().getClassLoader());
        playlistItemMenuPresenter = l1.a("com.soundcloud.android.playlists.PlaylistItemMenuPresenter", com/soundcloud/android/collections/CollectionPlaylistItemRenderer, getClass().getClassLoader());
    }

    public final CollectionPlaylistItemRenderer get()
    {
        return new CollectionPlaylistItemRenderer((ImageOperations)imageOperations.get(), (Resources)resources.get(), (Navigator)navigator.get(), (FeatureOperations)featureOperations.get(), (PlaylistItemMenuPresenter)playlistItemMenuPresenter.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(imageOperations);
        set.add(resources);
        set.add(navigator);
        set.add(featureOperations);
        set.add(playlistItemMenuPresenter);
    }

    public ()
    {
        super("com.soundcloud.android.collections.CollectionPlaylistItemRenderer", "members/com.soundcloud.android.collections.CollectionPlaylistItemRenderer", false, com/soundcloud/android/collections/CollectionPlaylistItemRenderer);
    }
}
