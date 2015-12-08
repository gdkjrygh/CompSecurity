// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.EngagementsTracking;
import com.soundcloud.android.likes.LikeOperations;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.PlaySessionController;
import com.soundcloud.android.playback.PlaySessionStateProvider;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            TrackPageListener

public final class I extends b
    implements a, Provider
{

    private b engagementsTracking;
    private b eventBus;
    private b likeOperations;
    private b navigator;
    private b playQueueManager;
    private b playSessionController;
    private b playSessionStateProvider;
    private b supertype;

    public final void attach(l l1)
    {
        playSessionController = l1.a("com.soundcloud.android.playback.PlaySessionController", com/soundcloud/android/playback/ui/TrackPageListener, getClass().getClassLoader());
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/playback/ui/TrackPageListener, getClass().getClassLoader());
        playSessionStateProvider = l1.a("com.soundcloud.android.playback.PlaySessionStateProvider", com/soundcloud/android/playback/ui/TrackPageListener, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playback/ui/TrackPageListener, getClass().getClassLoader());
        likeOperations = l1.a("com.soundcloud.android.likes.LikeOperations", com/soundcloud/android/playback/ui/TrackPageListener, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/playback/ui/TrackPageListener, getClass().getClassLoader());
        engagementsTracking = l1.a("com.soundcloud.android.analytics.EngagementsTracking", com/soundcloud/android/playback/ui/TrackPageListener, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.playback.ui.PageListener", com/soundcloud/android/playback/ui/TrackPageListener, getClass().getClassLoader(), false);
    }

    public final TrackPageListener get()
    {
        TrackPageListener trackpagelistener = new TrackPageListener((PlaySessionController)playSessionController.get(), (PlayQueueManager)playQueueManager.get(), (PlaySessionStateProvider)playSessionStateProvider.get(), (EventBus)eventBus.get(), (LikeOperations)likeOperations.get(), (Navigator)navigator.get(), (EngagementsTracking)engagementsTracking.get());
        injectMembers(trackpagelistener);
        return trackpagelistener;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(playSessionController);
        set.add(playQueueManager);
        set.add(playSessionStateProvider);
        set.add(eventBus);
        set.add(likeOperations);
        set.add(navigator);
        set.add(engagementsTracking);
        set1.add(supertype);
    }

    public final void injectMembers(TrackPageListener trackpagelistener)
    {
        supertype.injectMembers(trackpagelistener);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((TrackPageListener)obj);
    }

    public I()
    {
        super("com.soundcloud.android.playback.ui.TrackPageListener", "members/com.soundcloud.android.playback.ui.TrackPageListener", false, com/soundcloud/android/playback/ui/TrackPageListener);
    }
}
