// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.notification;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.PropertySet;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback.notification:
//            BackgroundPlaybackNotificationController, PlaybackNotificationPresenter, NotificationBuilder

class this._cls0
    implements f
{

    final BackgroundPlaybackNotificationController this$0;

    public volatile Object call(Object obj)
    {
        return call((PropertySet)obj);
    }

    public b call(PropertySet propertyset)
    {
        BackgroundPlaybackNotificationController.access$100(BackgroundPlaybackNotificationController.this).updateTrackInfo(BackgroundPlaybackNotificationController.access$000(BackgroundPlaybackNotificationController.this), propertyset);
        if (BackgroundPlaybackNotificationController.access$000(BackgroundPlaybackNotificationController.this).hasArtworkSupport())
        {
            BackgroundPlaybackNotificationController.access$200(BackgroundPlaybackNotificationController.this, (Urn)propertyset.get(TrackProperty.URN), BackgroundPlaybackNotificationController.access$000(BackgroundPlaybackNotificationController.this));
        }
        return b.just(BackgroundPlaybackNotificationController.access$000(BackgroundPlaybackNotificationController.this));
    }

    ()
    {
        this$0 = BackgroundPlaybackNotificationController.this;
        super();
    }
}
