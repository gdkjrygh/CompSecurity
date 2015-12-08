// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.widget;

import android.content.Context;
import android.graphics.Bitmap;
import com.soundcloud.java.optional.Optional;

// Referenced classes of package com.soundcloud.android.playback.widget:
//            PlayerWidgetRemoteViews, WidgetTrack

public class PlayerWidgetRemoteViewsBuilder
{

    private Optional optionalArtwork;
    private Optional optionalIsPlaying;
    private Optional optionalTrack;

    public PlayerWidgetRemoteViewsBuilder()
    {
        optionalTrack = Optional.absent();
        optionalIsPlaying = Optional.absent();
    }

    private void setEmptyState(Context context, PlayerWidgetRemoteViews playerwidgetremoteviews)
    {
        playerwidgetremoteviews.setEmptyState(context);
    }

    private void setPlayableProperties(Context context, PlayerWidgetRemoteViews playerwidgetremoteviews)
    {
        boolean flag1 = true;
        WidgetTrack widgettrack = (WidgetTrack)optionalTrack.get();
        com.soundcloud.android.model.Urn urn;
        com.soundcloud.android.model.Urn urn1;
        int i;
        boolean flag;
        if (widgettrack.isUserLike())
        {
            i = 0x7f020269;
        } else
        {
            i = 0x7f020268;
        }
        playerwidgetremoteviews.setImageViewResource(0x7f0f00af, i);
        playerwidgetremoteviews.setCurrentTrackTitle(widgettrack.getTitle());
        urn = widgettrack.getUrn();
        urn1 = widgettrack.getUserUrn();
        if (!widgettrack.isUserLike())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        playerwidgetremoteviews.linkButtonsWidget(context, urn, urn1, flag);
        if (widgettrack.isAudioAd())
        {
            context = "";
        } else
        {
            context = widgettrack.getUserName();
        }
        playerwidgetremoteviews.setCurrentCreator(context);
        if (!widgettrack.isAudioAd())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        playerwidgetremoteviews.setLikeShown(flag);
    }

    private void setPlaybackStatus(PlayerWidgetRemoteViews playerwidgetremoteviews)
    {
        playerwidgetremoteviews.setPlaybackStatus(((Boolean)optionalIsPlaying.get()).booleanValue());
    }

    public PlayerWidgetRemoteViews build(Context context)
    {
        PlayerWidgetRemoteViews playerwidgetremoteviews;
label0:
        {
            playerwidgetremoteviews = new PlayerWidgetRemoteViews(context);
            if (!optionalIsPlaying.isPresent() && !optionalTrack.isPresent())
            {
                setEmptyState(context, playerwidgetremoteviews);
            }
            if (optionalIsPlaying.isPresent())
            {
                setPlaybackStatus(playerwidgetremoteviews);
            }
            if (optionalTrack.isPresent())
            {
                setPlayableProperties(context, playerwidgetremoteviews);
            }
            if (optionalArtwork != null)
            {
                if (!optionalArtwork.isPresent())
                {
                    break label0;
                }
                playerwidgetremoteviews.setImageViewBitmap(0x7f0f0072, (Bitmap)optionalArtwork.get());
            }
            return playerwidgetremoteviews;
        }
        playerwidgetremoteviews.setImageViewResource(0x7f0f0072, 0x7f020050);
        return playerwidgetremoteviews;
    }

    public PlayerWidgetRemoteViewsBuilder forArtwork(Bitmap bitmap)
    {
        optionalArtwork = Optional.fromNullable(bitmap);
        return this;
    }

    public PlayerWidgetRemoteViewsBuilder forIsPlaying(WidgetTrack widgettrack, boolean flag)
    {
        optionalIsPlaying = Optional.of(Boolean.valueOf(flag));
        optionalTrack = Optional.of(widgettrack);
        return this;
    }

    public PlayerWidgetRemoteViewsBuilder forTrack(WidgetTrack widgettrack)
    {
        optionalTrack = Optional.of(widgettrack);
        return this;
    }
}
