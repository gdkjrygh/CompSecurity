// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.notification;

import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.notification:
//            PlaybackNotificationController, BackgroundPlaybackNotificationController, ForegroundPlaybackNotificationController

public final class  extends b
    implements a, Provider
{

    private b backgroundStrategy;
    private b eventBus;
    private b foregroundStrategy;
    private b supertype;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playback/notification/PlaybackNotificationController, getClass().getClassLoader());
        backgroundStrategy = l1.a("com.soundcloud.android.playback.notification.BackgroundPlaybackNotificationController", com/soundcloud/android/playback/notification/PlaybackNotificationController, getClass().getClassLoader());
        foregroundStrategy = l1.a("com.soundcloud.android.playback.notification.ForegroundPlaybackNotificationController", com/soundcloud/android/playback/notification/PlaybackNotificationController, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/playback/notification/PlaybackNotificationController, getClass().getClassLoader(), false);
    }

    public final PlaybackNotificationController get()
    {
        PlaybackNotificationController playbacknotificationcontroller = new PlaybackNotificationController((EventBus)eventBus.get(), (BackgroundPlaybackNotificationController)backgroundStrategy.get(), (ForegroundPlaybackNotificationController)foregroundStrategy.get());
        injectMembers(playbacknotificationcontroller);
        return playbacknotificationcontroller;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(backgroundStrategy);
        set.add(foregroundStrategy);
        set1.add(supertype);
    }

    public final void injectMembers(PlaybackNotificationController playbacknotificationcontroller)
    {
        supertype.injectMembers(playbacknotificationcontroller);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PlaybackNotificationController)obj);
    }

    public ()
    {
        super("com.soundcloud.android.playback.notification.PlaybackNotificationController", "members/com.soundcloud.android.playback.notification.PlaybackNotificationController", true, com/soundcloud/android/playback/notification/PlaybackNotificationController);
    }
}
