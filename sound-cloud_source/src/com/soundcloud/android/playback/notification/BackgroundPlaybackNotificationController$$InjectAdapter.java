// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.notification;

import android.app.NotificationManager;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.playback.PlaybackStateProvider;
import com.soundcloud.android.tracks.TrackRepository;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.notification:
//            BackgroundPlaybackNotificationController, PlaybackNotificationPresenter

public final class  extends b
    implements Provider
{

    private b builderProvider;
    private b imageOperations;
    private b notificationManager;
    private b playbackStateProvider;
    private b presenter;
    private b trackRepository;

    public final void attach(l l1)
    {
        trackRepository = l1.a("com.soundcloud.android.tracks.TrackRepository", com/soundcloud/android/playback/notification/BackgroundPlaybackNotificationController, getClass().getClassLoader());
        presenter = l1.a("com.soundcloud.android.playback.notification.PlaybackNotificationPresenter", com/soundcloud/android/playback/notification/BackgroundPlaybackNotificationController, getClass().getClassLoader());
        notificationManager = l1.a("android.app.NotificationManager", com/soundcloud/android/playback/notification/BackgroundPlaybackNotificationController, getClass().getClassLoader());
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/playback/notification/BackgroundPlaybackNotificationController, getClass().getClassLoader());
        builderProvider = l1.a("javax.inject.Provider<com.soundcloud.android.playback.notification.NotificationBuilder>", com/soundcloud/android/playback/notification/BackgroundPlaybackNotificationController, getClass().getClassLoader());
        playbackStateProvider = l1.a("com.soundcloud.android.playback.PlaybackStateProvider", com/soundcloud/android/playback/notification/BackgroundPlaybackNotificationController, getClass().getClassLoader());
    }

    public final BackgroundPlaybackNotificationController get()
    {
        return new BackgroundPlaybackNotificationController((TrackRepository)trackRepository.get(), (PlaybackNotificationPresenter)presenter.get(), (NotificationManager)notificationManager.get(), (ImageOperations)imageOperations.get(), (Provider)builderProvider.get(), (PlaybackStateProvider)playbackStateProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(trackRepository);
        set.add(presenter);
        set.add(notificationManager);
        set.add(imageOperations);
        set.add(builderProvider);
        set.add(playbackStateProvider);
    }

    public ()
    {
        super("com.soundcloud.android.playback.notification.BackgroundPlaybackNotificationController", "members/com.soundcloud.android.playback.notification.BackgroundPlaybackNotificationController", false, com/soundcloud/android/playback/notification/BackgroundPlaybackNotificationController);
    }
}
