// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.tracks.TrackItemMenuPresenter;
import com.soundcloud.android.util.CondensedNumberFormatter;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.profile:
//            PostedTrackItemRenderer

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
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/profile/PostedTrackItemRenderer, getClass().getClassLoader());
        numberFormatter = l1.a("com.soundcloud.android.util.CondensedNumberFormatter", com/soundcloud/android/profile/PostedTrackItemRenderer, getClass().getClassLoader());
        trackItemMenuPresenter = l1.a("com.soundcloud.android.tracks.TrackItemMenuPresenter", com/soundcloud/android/profile/PostedTrackItemRenderer, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/profile/PostedTrackItemRenderer, getClass().getClassLoader());
        screenProvider = l1.a("com.soundcloud.android.analytics.ScreenProvider", com/soundcloud/android/profile/PostedTrackItemRenderer, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/profile/PostedTrackItemRenderer, getClass().getClassLoader());
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/profile/PostedTrackItemRenderer, getClass().getClassLoader());
        trackItemViewFactory = l1.a("com.soundcloud.android.tracks.TrackItemView$Factory", com/soundcloud/android/profile/PostedTrackItemRenderer, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.tracks.TrackItemRenderer", com/soundcloud/android/profile/PostedTrackItemRenderer, getClass().getClassLoader(), false);
    }

    public final PostedTrackItemRenderer get()
    {
        PostedTrackItemRenderer postedtrackitemrenderer = new PostedTrackItemRenderer((ImageOperations)imageOperations.get(), (CondensedNumberFormatter)numberFormatter.get(), (TrackItemMenuPresenter)trackItemMenuPresenter.get(), (EventBus)eventBus.get(), (ScreenProvider)screenProvider.get(), (Navigator)navigator.get(), (FeatureOperations)featureOperations.get(), (com.soundcloud.android.tracks..featureOperations)trackItemViewFactory.get());
        injectMembers(postedtrackitemrenderer);
        return postedtrackitemrenderer;
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
        set1.add(supertype);
    }

    public final void injectMembers(PostedTrackItemRenderer postedtrackitemrenderer)
    {
        supertype.injectMembers(postedtrackitemrenderer);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PostedTrackItemRenderer)obj);
    }

    public ()
    {
        super("com.soundcloud.android.profile.PostedTrackItemRenderer", "members/com.soundcloud.android.profile.PostedTrackItemRenderer", false, com/soundcloud/android/profile/PostedTrackItemRenderer);
    }
}
