// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import android.content.res.Resources;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.playlists.PlaylistItemMenuPresenter;
import com.soundcloud.android.util.CondensedNumberFormatter;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.view.adapters:
//            PlaylistItemRenderer

public final class  extends b
    implements Provider
{

    private b eventBus;
    private b imageOperations;
    private b navigator;
    private b numberFormatter;
    private b playlistItemMenuPresenter;
    private b resources;
    private b screenProvider;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/view/adapters/PlaylistItemRenderer, getClass().getClassLoader());
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/view/adapters/PlaylistItemRenderer, getClass().getClassLoader());
        numberFormatter = l1.a("com.soundcloud.android.util.CondensedNumberFormatter", com/soundcloud/android/view/adapters/PlaylistItemRenderer, getClass().getClassLoader());
        playlistItemMenuPresenter = l1.a("com.soundcloud.android.playlists.PlaylistItemMenuPresenter", com/soundcloud/android/view/adapters/PlaylistItemRenderer, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/view/adapters/PlaylistItemRenderer, getClass().getClassLoader());
        screenProvider = l1.a("com.soundcloud.android.analytics.ScreenProvider", com/soundcloud/android/view/adapters/PlaylistItemRenderer, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/view/adapters/PlaylistItemRenderer, getClass().getClassLoader());
    }

    public final PlaylistItemRenderer get()
    {
        return new PlaylistItemRenderer((Resources)resources.get(), (ImageOperations)imageOperations.get(), (CondensedNumberFormatter)numberFormatter.get(), (PlaylistItemMenuPresenter)playlistItemMenuPresenter.get(), (EventBus)eventBus.get(), (ScreenProvider)screenProvider.get(), (Navigator)navigator.get());
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
        set.add(eventBus);
        set.add(screenProvider);
        set.add(navigator);
    }

    public ()
    {
        super("com.soundcloud.android.view.adapters.PlaylistItemRenderer", "members/com.soundcloud.android.view.adapters.PlaylistItemRenderer", false, com/soundcloud/android/view/adapters/PlaylistItemRenderer);
    }
}
