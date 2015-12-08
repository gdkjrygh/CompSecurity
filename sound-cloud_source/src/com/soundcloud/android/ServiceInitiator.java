// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.soundcloud.android.gcm.GcmRegistrationService;
import com.soundcloud.android.playback.PlaybackItem;
import com.soundcloud.android.playback.PlaybackService;

public class ServiceInitiator
{

    private final Context context;

    public ServiceInitiator(Context context1)
    {
        context = context1;
    }

    private Intent createExplicitServiceIntent(String s)
    {
        Intent intent = new Intent(context, com/soundcloud/android/playback/PlaybackService);
        intent.setAction(s);
        return intent;
    }

    private void playerAction(String s)
    {
        context.startService(createExplicitServiceIntent(s));
    }

    private void startPlayback(PlaybackItem playbackitem, String s)
    {
        Intent intent = new Intent(context, com/soundcloud/android/playback/PlaybackService);
        intent.setAction(s);
        intent.putExtra("playback_item", (Parcelable)playbackitem);
        context.startService(intent);
    }

    public void pause()
    {
        playerAction("com.soundcloud.android.playback.pause");
    }

    public void play(PlaybackItem playbackitem)
    {
        startPlayback(playbackitem, "com.soundcloud.android.playback.play");
    }

    public void resetPlaybackService()
    {
        playerAction("com.soundcloud.android.playback.reset");
    }

    public void resume()
    {
        playerAction("com.soundcloud.android.playback.playcurrent");
    }

    public void seek(long l)
    {
        Intent intent = createExplicitServiceIntent("com.soundcloud.android.playback.seek");
        intent.putExtra("seek_position", l);
        context.startService(intent);
    }

    public void startGcmService(Context context1)
    {
        context1.startService(new Intent(context1, com/soundcloud/android/gcm/GcmRegistrationService));
    }

    public void stopPlaybackService()
    {
        playerAction("com.soundcloud.android.playback.stop");
    }

    public void togglePlayback()
    {
        playerAction("com.soundcloud.android.playback.toggleplayback");
    }
}
