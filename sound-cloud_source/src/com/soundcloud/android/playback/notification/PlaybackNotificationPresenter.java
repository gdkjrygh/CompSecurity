// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.notification;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.soundcloud.android.analytics.Referrer;
import com.soundcloud.android.main.MainActivity;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.playback.NotificationTrack;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.playback.notification:
//            NotificationBuilder

public class PlaybackNotificationPresenter
{

    protected final Context context;

    public PlaybackNotificationPresenter(Context context1)
    {
        context = context1;
    }

    private void updatePlaybackStatusFunc(NotificationBuilder notificationbuilder, boolean flag)
    {
        notificationbuilder.setPlayingStatus(flag);
    }

    protected PendingIntent createPendingIntent(Context context1)
    {
        Intent intent = (new Intent(context1, com/soundcloud/android/main/MainActivity)).addFlags(0x400000).putExtra("expand_player", true);
        Screen.NOTIFICATION.addToIntent(intent);
        Referrer.PLAYBACK_NOTIFICATION.addToIntent(intent);
        return PendingIntent.getActivity(context1, 0, intent, 0x10000000);
    }

    void init(NotificationBuilder notificationbuilder, boolean flag)
    {
        notificationbuilder.setSmallIcon(0x7f02015d);
        notificationbuilder.setContentIntent(createPendingIntent(context));
        notificationbuilder.setPlayingStatus(flag);
    }

    void updateToIdleState(NotificationBuilder notificationbuilder)
    {
        updatePlaybackStatusFunc(notificationbuilder, false);
    }

    void updateToPlayingState(NotificationBuilder notificationbuilder)
    {
        updatePlaybackStatusFunc(notificationbuilder, true);
    }

    void updateTrackInfo(NotificationBuilder notificationbuilder, PropertySet propertyset)
    {
        propertyset = new NotificationTrack(context.getResources(), propertyset);
        notificationbuilder.setTrackTitle(propertyset.getTitle());
        notificationbuilder.setCreatorName(propertyset.getCreatorName());
    }
}
