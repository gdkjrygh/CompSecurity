// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackInfoFragment, TrackRepository, TrackInfoPresenter

public final class  extends b
    implements a, Provider
{

    private b eventBus;
    private b imageOperations;
    private b presenter;
    private b trackRepository;

    public final void attach(l l1)
    {
        trackRepository = l1.a("com.soundcloud.android.tracks.TrackRepository", com/soundcloud/android/tracks/TrackInfoFragment, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/tracks/TrackInfoFragment, getClass().getClassLoader());
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/tracks/TrackInfoFragment, getClass().getClassLoader());
        presenter = l1.a("com.soundcloud.android.tracks.TrackInfoPresenter", com/soundcloud/android/tracks/TrackInfoFragment, getClass().getClassLoader());
    }

    public final TrackInfoFragment get()
    {
        TrackInfoFragment trackinfofragment = new TrackInfoFragment();
        injectMembers(trackinfofragment);
        return trackinfofragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(trackRepository);
        set1.add(eventBus);
        set1.add(imageOperations);
        set1.add(presenter);
    }

    public final void injectMembers(TrackInfoFragment trackinfofragment)
    {
        trackinfofragment.trackRepository = (TrackRepository)trackRepository.get();
        trackinfofragment.eventBus = (EventBus)eventBus.get();
        trackinfofragment.imageOperations = (ImageOperations)imageOperations.get();
        trackinfofragment.presenter = (TrackInfoPresenter)presenter.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((TrackInfoFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.tracks.TrackInfoFragment", "members/com.soundcloud.android.tracks.TrackInfoFragment", false, com/soundcloud/android/tracks/TrackInfoFragment);
    }
}
