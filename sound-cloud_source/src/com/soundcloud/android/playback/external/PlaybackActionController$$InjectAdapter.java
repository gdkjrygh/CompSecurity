// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.external;

import com.soundcloud.android.ServiceInitiator;
import com.soundcloud.android.playback.PlaySessionController;
import com.soundcloud.android.playback.PlaySessionStateProvider;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.external:
//            PlaybackActionController

public final class  extends b
    implements Provider
{

    private b eventBus;
    private b playSessionController;
    private b playSessionStateProvider;
    private b serviceInitiator;

    public final void attach(l l1)
    {
        playSessionController = l1.a("com.soundcloud.android.playback.PlaySessionController", com/soundcloud/android/playback/external/PlaybackActionController, getClass().getClassLoader());
        serviceInitiator = l1.a("com.soundcloud.android.ServiceInitiator", com/soundcloud/android/playback/external/PlaybackActionController, getClass().getClassLoader());
        playSessionStateProvider = l1.a("com.soundcloud.android.playback.PlaySessionStateProvider", com/soundcloud/android/playback/external/PlaybackActionController, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playback/external/PlaybackActionController, getClass().getClassLoader());
    }

    public final PlaybackActionController get()
    {
        return new PlaybackActionController((PlaySessionController)playSessionController.get(), (ServiceInitiator)serviceInitiator.get(), (PlaySessionStateProvider)playSessionStateProvider.get(), (EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(playSessionController);
        set.add(serviceInitiator);
        set.add(playSessionStateProvider);
        set.add(eventBus);
    }

    public ()
    {
        super("com.soundcloud.android.playback.external.PlaybackActionController", "members/com.soundcloud.android.playback.external.PlaybackActionController", false, com/soundcloud/android/playback/external/PlaybackActionController);
    }
}
