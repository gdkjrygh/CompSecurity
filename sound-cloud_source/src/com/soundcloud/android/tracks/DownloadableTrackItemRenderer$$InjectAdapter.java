// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

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

// Referenced classes of package com.soundcloud.android.tracks:
//            DownloadableTrackItemRenderer, TrackItemMenuPresenter

public final class  extends b
    implements a, Provider
{

    private b eventBus;
    private b featureOperations;
    private b imageOperations;
    private b navigator;
    private b numberFormatter;
    private b screenProvider;
    private b supertype;
    private b trackItemMenuPresenter;
    private b trackItemViewFactory;

    public final void attach(l l1)
    {
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/tracks/DownloadableTrackItemRenderer, getClass().getClassLoader());
        numberFormatter = l1.a("com.soundcloud.android.util.CondensedNumberFormatter", com/soundcloud/android/tracks/DownloadableTrackItemRenderer, getClass().getClassLoader());
        trackItemMenuPresenter = l1.a("com.soundcloud.android.tracks.TrackItemMenuPresenter", com/soundcloud/android/tracks/DownloadableTrackItemRenderer, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/tracks/DownloadableTrackItemRenderer, getClass().getClassLoader());
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/tracks/DownloadableTrackItemRenderer, getClass().getClassLoader());
        screenProvider = l1.a("com.soundcloud.android.analytics.ScreenProvider", com/soundcloud/android/tracks/DownloadableTrackItemRenderer, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/tracks/DownloadableTrackItemRenderer, getClass().getClassLoader());
        trackItemViewFactory = l1.a("com.soundcloud.android.tracks.TrackItemView$Factory", com/soundcloud/android/tracks/DownloadableTrackItemRenderer, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.tracks.TrackItemRenderer", com/soundcloud/android/tracks/DownloadableTrackItemRenderer, getClass().getClassLoader(), false);
    }

    public final DownloadableTrackItemRenderer get()
    {
        DownloadableTrackItemRenderer downloadabletrackitemrenderer = new DownloadableTrackItemRenderer((ImageOperations)imageOperations.get(), (CondensedNumberFormatter)numberFormatter.get(), (TrackItemMenuPresenter)trackItemMenuPresenter.get(), (EventBus)eventBus.get(), (FeatureOperations)featureOperations.get(), (ScreenProvider)screenProvider.get(), (Navigator)navigator.get(), (navigator)trackItemViewFactory.get());
        injectMembers(downloadabletrackitemrenderer);
        return downloadabletrackitemrenderer;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(imageOperations);
        set.add(numberFormatter);
        set.add(trackItemMenuPresenter);
        set.add(eventBus);
        set.add(featureOperations);
        set.add(screenProvider);
        set.add(navigator);
        set.add(trackItemViewFactory);
        set1.add(supertype);
    }

    public final void injectMembers(DownloadableTrackItemRenderer downloadabletrackitemrenderer)
    {
        supertype.injectMembers(downloadabletrackitemrenderer);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((DownloadableTrackItemRenderer)obj);
    }

    public ()
    {
        super("com.soundcloud.android.tracks.DownloadableTrackItemRenderer", "members/com.soundcloud.android.tracks.DownloadableTrackItemRenderer", false, com/soundcloud/android/tracks/DownloadableTrackItemRenderer);
    }
}
