// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.views;

import android.os.Parcel;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.soundcloud.android.api.legacy.model.PublicApiTrack;

public abstract class PlaybackRemoteViews extends RemoteViews
{

    protected boolean isPlaying;
    private int pauseBtnId;
    private int playBtnId;
    protected PublicApiTrack track;

    public PlaybackRemoteViews(Parcel parcel)
    {
        super(parcel);
    }

    public PlaybackRemoteViews(String s, int i, int j, int k)
    {
        super(s, i);
        playBtnId = j;
        pauseBtnId = k;
    }

    public void setCurrentCreator(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence))
        {
            setViewVisibility(0x7f0f00a9, 8);
            setViewVisibility(0x7f0f00a8, 8);
            return;
        } else
        {
            setTextViewText(0x7f0f00a8, charsequence);
            setViewVisibility(0x7f0f00a9, 0);
            setViewVisibility(0x7f0f00a8, 0);
            return;
        }
    }

    public void setCurrentTrackTitle(CharSequence charsequence)
    {
        setTextViewText(0x7f0f00aa, charsequence);
    }

    public void setLikeShown(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        setViewVisibility(0x7f0f00af, i);
    }

    public void setPlaybackStatus(boolean flag)
    {
        int i;
        if (flag)
        {
            i = pauseBtnId;
        } else
        {
            i = playBtnId;
        }
        setImageViewResource(0x7f0f00ad, i);
    }
}
