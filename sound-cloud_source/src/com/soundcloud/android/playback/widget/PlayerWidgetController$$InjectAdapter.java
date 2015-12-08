// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.widget;

import android.content.Context;
import com.soundcloud.android.analytics.EngagementsTracking;
import com.soundcloud.android.likes.LikeOperations;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.PlaySessionStateProvider;
import com.soundcloud.android.tracks.TrackRepository;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.widget:
//            PlayerWidgetController, PlayerWidgetPresenter

public final class  extends b
    implements Provider
{

    private b context;
    private b engagementsTracking;
    private b eventBus;
    private b likeOperations;
    private b playQueueManager;
    private b playSessionsStateProvider;
    private b presenter;
    private b trackRepository;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/playback/widget/PlayerWidgetController, getClass().getClassLoader());
        presenter = l1.a("com.soundcloud.android.playback.widget.PlayerWidgetPresenter", com/soundcloud/android/playback/widget/PlayerWidgetController, getClass().getClassLoader());
        playSessionsStateProvider = l1.a("com.soundcloud.android.playback.PlaySessionStateProvider", com/soundcloud/android/playback/widget/PlayerWidgetController, getClass().getClassLoader());
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/playback/widget/PlayerWidgetController, getClass().getClassLoader());
        trackRepository = l1.a("com.soundcloud.android.tracks.TrackRepository", com/soundcloud/android/playback/widget/PlayerWidgetController, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playback/widget/PlayerWidgetController, getClass().getClassLoader());
        likeOperations = l1.a("com.soundcloud.android.likes.LikeOperations", com/soundcloud/android/playback/widget/PlayerWidgetController, getClass().getClassLoader());
        engagementsTracking = l1.a("com.soundcloud.android.analytics.EngagementsTracking", com/soundcloud/android/playback/widget/PlayerWidgetController, getClass().getClassLoader());
    }

    public final PlayerWidgetController get()
    {
        return new PlayerWidgetController((Context)context.get(), (PlayerWidgetPresenter)presenter.get(), (PlaySessionStateProvider)playSessionsStateProvider.get(), (PlayQueueManager)playQueueManager.get(), (TrackRepository)trackRepository.get(), (EventBus)eventBus.get(), (LikeOperations)likeOperations.get(), (EngagementsTracking)engagementsTracking.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(presenter);
        set.add(playSessionsStateProvider);
        set.add(playQueueManager);
        set.add(trackRepository);
        set.add(eventBus);
        set.add(likeOperations);
        set.add(engagementsTracking);
    }

    public ()
    {
        super("com.soundcloud.android.playback.widget.PlayerWidgetController", "members/com.soundcloud.android.playback.widget.PlayerWidgetController", true, com/soundcloud/android/playback/widget/PlayerWidgetController);
    }
}
