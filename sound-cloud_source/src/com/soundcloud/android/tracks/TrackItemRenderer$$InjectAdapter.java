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
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackItemRenderer, TrackItemMenuPresenter

public final class  extends b
    implements Provider
{

    private b eventBus;
    private b featureOperations;
    private b imageOperations;
    private b navigator;
    private b numberFormatter;
    private b screenProvider;
    private b trackItemMenuPresenter;
    private b trackItemViewFactory;

    public final void attach(l l1)
    {
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/tracks/TrackItemRenderer, getClass().getClassLoader());
        numberFormatter = l1.a("com.soundcloud.android.util.CondensedNumberFormatter", com/soundcloud/android/tracks/TrackItemRenderer, getClass().getClassLoader());
        trackItemMenuPresenter = l1.a("com.soundcloud.android.tracks.TrackItemMenuPresenter", com/soundcloud/android/tracks/TrackItemRenderer, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/tracks/TrackItemRenderer, getClass().getClassLoader());
        screenProvider = l1.a("com.soundcloud.android.analytics.ScreenProvider", com/soundcloud/android/tracks/TrackItemRenderer, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/tracks/TrackItemRenderer, getClass().getClassLoader());
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/tracks/TrackItemRenderer, getClass().getClassLoader());
        trackItemViewFactory = l1.a("com.soundcloud.android.tracks.TrackItemView$Factory", com/soundcloud/android/tracks/TrackItemRenderer, getClass().getClassLoader());
    }

    public final TrackItemRenderer get()
    {
        return new TrackItemRenderer((ImageOperations)imageOperations.get(), (CondensedNumberFormatter)numberFormatter.get(), (TrackItemMenuPresenter)trackItemMenuPresenter.get(), (EventBus)eventBus.get(), (ScreenProvider)screenProvider.get(), (Navigator)navigator.get(), (FeatureOperations)featureOperations.get(), (featureOperations)trackItemViewFactory.get());
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
        set.add(screenProvider);
        set.add(navigator);
        set.add(featureOperations);
        set.add(trackItemViewFactory);
    }

    public ()
    {
        super("com.soundcloud.android.tracks.TrackItemRenderer", "members/com.soundcloud.android.tracks.TrackItemRenderer", false, com/soundcloud/android/tracks/TrackItemRenderer);
    }
}
