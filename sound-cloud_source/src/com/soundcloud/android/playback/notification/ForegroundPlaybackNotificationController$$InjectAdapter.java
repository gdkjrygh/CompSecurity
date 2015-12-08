// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.notification;

import android.app.NotificationManager;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.notification:
//            ForegroundPlaybackNotificationController

public final class  extends b
    implements Provider
{

    private b notificationManager;

    public final void attach(l l1)
    {
        notificationManager = l1.a("android.app.NotificationManager", com/soundcloud/android/playback/notification/ForegroundPlaybackNotificationController, getClass().getClassLoader());
    }

    public final ForegroundPlaybackNotificationController get()
    {
        return new ForegroundPlaybackNotificationController((NotificationManager)notificationManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(notificationManager);
    }

    public ()
    {
        super("com.soundcloud.android.playback.notification.ForegroundPlaybackNotificationController", "members/com.soundcloud.android.playback.notification.ForegroundPlaybackNotificationController", false, com/soundcloud/android/playback/notification/ForegroundPlaybackNotificationController);
    }
}
