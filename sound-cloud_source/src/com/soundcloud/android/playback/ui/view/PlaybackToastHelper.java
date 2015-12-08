// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.view;

import android.content.Context;
import android.widget.Toast;
import com.soundcloud.android.playback.PlaySessionStateProvider;

public class PlaybackToastHelper
{

    private final Context context;
    private final PlaySessionStateProvider playSessionStateProvider;

    public PlaybackToastHelper(Context context1, PlaySessionStateProvider playsessionstateprovider)
    {
        context = context1;
        playSessionStateProvider = playsessionstateprovider;
    }

    private void showUnableToCastTrack()
    {
        Toast.makeText(context, 0x7f0700ba, 0).show();
    }

    public void showMissingPlayableTracksToast()
    {
        Toast.makeText(context, 0x7f070181, 0).show();
    }

    public void showToastOnPlaybackError(com.soundcloud.android.playback.PlaybackResult.ErrorReason errorreason)
    {
        switch (_cls1..SwitchMap.com.soundcloud.android.playback.PlaybackResult.ErrorReason[errorreason.ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown error reason: ")).append(errorreason).toString());

        case 1: // '\001'
            showUnskippableAdToast();
            return;

        case 2: // '\002'
            showTrackUnavailableOfflineToast();
            return;

        case 3: // '\003'
            showMissingPlayableTracksToast();
            return;

        case 4: // '\004'
            showUnableToCastTrack();
            break;
        }
    }

    public void showTrackUnavailableOfflineToast()
    {
        Toast.makeText(context, 0x7f0702de, 0).show();
    }

    public void showUnskippableAdToast()
    {
        Context context1 = context;
        int i;
        if (playSessionStateProvider.isPlaying())
        {
            i = 0x7f07006a;
        } else
        {
            i = 0x7f070070;
        }
        Toast.makeText(context1, i, 0).show();
    }

    private class _cls1
    {

        static final int $SwitchMap$com$soundcloud$android$playback$PlaybackResult$ErrorReason[];

        static 
        {
            $SwitchMap$com$soundcloud$android$playback$PlaybackResult$ErrorReason = new int[com.soundcloud.android.playback.PlaybackResult.ErrorReason.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$playback$PlaybackResult$ErrorReason[com.soundcloud.android.playback.PlaybackResult.ErrorReason.UNSKIPPABLE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$soundcloud$android$playback$PlaybackResult$ErrorReason[com.soundcloud.android.playback.PlaybackResult.ErrorReason.TRACK_UNAVAILABLE_OFFLINE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$soundcloud$android$playback$PlaybackResult$ErrorReason[com.soundcloud.android.playback.PlaybackResult.ErrorReason.MISSING_PLAYABLE_TRACKS.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$playback$PlaybackResult$ErrorReason[com.soundcloud.android.playback.PlaybackResult.ErrorReason.TRACK_UNAVAILABLE_CAST.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
