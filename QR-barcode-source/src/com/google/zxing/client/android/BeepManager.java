// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.IOException;

final class BeepManager
{

    private static final float BEEP_VOLUME = 0.1F;
    private static final String TAG = com/google/zxing/client/android/BeepManager.getSimpleName();
    private static final long VIBRATE_DURATION = 200L;
    private final Activity activity;
    private MediaPlayer mediaPlayer;
    private boolean playBeep;
    private boolean vibrate;

    BeepManager(Activity activity1)
    {
        activity = activity1;
        mediaPlayer = null;
        updatePrefs();
    }

    private static MediaPlayer buildMediaPlayer(Context context)
    {
        MediaPlayer mediaplayer = new MediaPlayer();
        mediaplayer.setAudioStreamType(3);
        mediaplayer.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {

            public void onCompletion(MediaPlayer mediaplayer1)
            {
                mediaplayer1.seekTo(0);
            }

        });
        context = context.getResources().openRawResourceFd(R.raw.beep);
        try
        {
            mediaplayer.setDataSource(context.getFileDescriptor(), context.getStartOffset(), context.getLength());
            context.close();
            mediaplayer.setVolume(0.1F, 0.1F);
            mediaplayer.prepare();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w(TAG, context);
            return null;
        }
        return mediaplayer;
    }

    private static boolean shouldBeep(SharedPreferences sharedpreferences, Context context)
    {
        boolean flag1 = sharedpreferences.getBoolean("preferences_play_beep", true);
        boolean flag = flag1;
        if (flag1)
        {
            flag = flag1;
            if (((AudioManager)context.getSystemService("audio")).getRingerMode() != 2)
            {
                flag = false;
            }
        }
        return flag;
    }

    void playBeepSoundAndVibrate()
    {
        if (playBeep && mediaPlayer != null)
        {
            mediaPlayer.start();
        }
        if (vibrate)
        {
            ((Vibrator)activity.getSystemService("vibrator")).vibrate(200L);
        }
    }

    void updatePrefs()
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(activity);
        playBeep = shouldBeep(sharedpreferences, activity);
        vibrate = sharedpreferences.getBoolean("preferences_vibrate", false);
        if (playBeep && mediaPlayer == null)
        {
            activity.setVolumeControlStream(3);
            mediaPlayer = buildMediaPlayer(activity);
        }
    }

}
