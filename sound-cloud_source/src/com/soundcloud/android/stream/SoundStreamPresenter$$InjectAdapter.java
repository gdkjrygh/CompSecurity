// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.facebookinvites.FacebookInvitesDialogPresenter;
import com.soundcloud.android.image.ImagePauseOnScrollListener;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.stations.StationsOperations;
import com.soundcloud.android.view.adapters.RecyclerViewParallaxer;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stream:
//            SoundStreamPresenter, SoundStreamOperations, SoundStreamAdapter

public final class ter extends b
    implements a, Provider
{

    private b adapter;
    private b eventBus;
    private b facebookInvitesDialogPresenter;
    private b featureFlags;
    private b imagePauseOnScrollListener;
    private b itemClickListenerFactory;
    private b recyclerViewParallaxer;
    private b stationsOperations;
    private b streamOperations;
    private b supertype;
    private b swipeRefreshAttacher;

    public final void attach(l l1)
    {
        streamOperations = l1.a("com.soundcloud.android.stream.SoundStreamOperations", com/soundcloud/android/stream/SoundStreamPresenter, getClass().getClassLoader());
        adapter = l1.a("com.soundcloud.android.stream.SoundStreamAdapter", com/soundcloud/android/stream/SoundStreamPresenter, getClass().getClassLoader());
        stationsOperations = l1.a("com.soundcloud.android.stations.StationsOperations", com/soundcloud/android/stream/SoundStreamPresenter, getClass().getClassLoader());
        imagePauseOnScrollListener = l1.a("com.soundcloud.android.image.ImagePauseOnScrollListener", com/soundcloud/android/stream/SoundStreamPresenter, getClass().getClassLoader());
        swipeRefreshAttacher = l1.a("com.soundcloud.android.presentation.SwipeRefreshAttacher", com/soundcloud/android/stream/SoundStreamPresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/stream/SoundStreamPresenter, getClass().getClassLoader());
        itemClickListenerFactory = l1.a("com.soundcloud.android.view.adapters.MixedItemClickListener$Factory", com/soundcloud/android/stream/SoundStreamPresenter, getClass().getClassLoader());
        recyclerViewParallaxer = l1.a("com.soundcloud.android.view.adapters.RecyclerViewParallaxer", com/soundcloud/android/stream/SoundStreamPresenter, getClass().getClassLoader());
        facebookInvitesDialogPresenter = l1.a("com.soundcloud.android.facebookinvites.FacebookInvitesDialogPresenter", com/soundcloud/android/stream/SoundStreamPresenter, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/stream/SoundStreamPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.RecyclerViewPresenter", com/soundcloud/android/stream/SoundStreamPresenter, getClass().getClassLoader(), false);
    }

    public final SoundStreamPresenter get()
    {
        SoundStreamPresenter soundstreampresenter = new SoundStreamPresenter((SoundStreamOperations)streamOperations.get(), (SoundStreamAdapter)adapter.get(), (StationsOperations)stationsOperations.get(), (ImagePauseOnScrollListener)imagePauseOnScrollListener.get(), (SwipeRefreshAttacher)swipeRefreshAttacher.get(), (EventBus)eventBus.get(), (com.soundcloud.android.view.adapters.s)itemClickListenerFactory.get(), (RecyclerViewParallaxer)recyclerViewParallaxer.get(), (FacebookInvitesDialogPresenter)facebookInvitesDialogPresenter.get(), (FeatureFlags)featureFlags.get());
        injectMembers(soundstreampresenter);
        return soundstreampresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(streamOperations);
        set.add(adapter);
        set.add(stationsOperations);
        set.add(imagePauseOnScrollListener);
        set.add(swipeRefreshAttacher);
        set.add(eventBus);
        set.add(itemClickListenerFactory);
        set.add(recyclerViewParallaxer);
        set.add(facebookInvitesDialogPresenter);
        set.add(featureFlags);
        set1.add(supertype);
    }

    public final void injectMembers(SoundStreamPresenter soundstreampresenter)
    {
        supertype.injectMembers(soundstreampresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SoundStreamPresenter)obj);
    }

    public ter()
    {
        super("com.soundcloud.android.stream.SoundStreamPresenter", "members/com.soundcloud.android.stream.SoundStreamPresenter", false, com/soundcloud/android/stream/SoundStreamPresenter);
    }
}
