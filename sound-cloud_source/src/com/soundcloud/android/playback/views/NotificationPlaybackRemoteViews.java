// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.views;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcel;

// Referenced classes of package com.soundcloud.android.playback.views:
//            PlaybackRemoteViews

public class NotificationPlaybackRemoteViews extends PlaybackRemoteViews
{
    public static class Factory
    {

        public NotificationPlaybackRemoteViews create(String s)
        {
            return create(s, 0x7f03008d);
        }

        public NotificationPlaybackRemoteViews create(String s, int i)
        {
            return new NotificationPlaybackRemoteViews(s, i);
        }

        public Factory()
        {
        }
    }


    private static final int PENDING_INTENT_REQUEST_CODE = com/soundcloud/android/playback/views/NotificationPlaybackRemoteViews.hashCode();

    public NotificationPlaybackRemoteViews(Parcel parcel)
    {
        super(parcel);
    }

    NotificationPlaybackRemoteViews(String s, int i)
    {
        super(s, i, 0x7f0201f3, 0x7f0201f2);
    }

    private Intent createIntent(String s)
    {
        return (new Intent(s)).putExtra("play_event_source", "notification");
    }

    private PendingIntent createPendingIntent(Context context, String s)
    {
        return PendingIntent.getBroadcast(context, PENDING_INTENT_REQUEST_CODE, createIntent(s), 0);
    }

    public void linkButtonsNotification(Context context)
    {
        setOnClickPendingIntent(0x7f0f00ad, createPendingIntent(context, "com.soundcloud.android.playback.external.toggleplayback"));
        setOnClickPendingIntent(0x7f0f00ae, createPendingIntent(context, "com.soundcloud.android.playback.external.next"));
        setOnClickPendingIntent(0x7f0f00ac, createPendingIntent(context, "com.soundcloud.android.playback.external.previous"));
        setOnClickPendingIntent(0x7f0f01c0, createPendingIntent(context, "com.soundcloud.android.playback.external.close"));
    }

    public void setCurrentCreator(CharSequence charsequence)
    {
        setTextViewText(0x7f0f00a8, charsequence);
    }

    public void setIcon(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            setImageViewBitmap(0x7f0f0072, bitmap);
            setViewVisibility(0x7f0f0072, 0);
            return;
        } else
        {
            setViewVisibility(0x7f0f0072, 8);
            return;
        }
    }

}
