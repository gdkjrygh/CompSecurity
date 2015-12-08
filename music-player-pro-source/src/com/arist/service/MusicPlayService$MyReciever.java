// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import com.arist.MusicPlayer.MyApplication;
import com.yong.jamendo.api.JamendoMusic;

// Referenced classes of package com.arist.service:
//            MusicPlayService

private class <init> extends BroadcastReceiver
{

    final MusicPlayService this$0;

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = true;
        if (!"com.MediaPlayer.action.PLAY".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        MusicPlayService.access$3(MusicPlayService.this);
_L4:
        return;
_L2:
        if ("com.MediaPlayer.action.PREVIOUS".equals(intent.getAction()))
        {
            MusicPlayService.access$1(MusicPlayService.this);
            return;
        }
        if ("com.MediaPlayer.action.NEXT".equals(intent.getAction()))
        {
            MusicPlayService.access$0(MusicPlayService.this);
            return;
        }
        if (!"com.MediaPlayer.action.SEEK".equals(intent.getAction()))
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            MusicPlayService.access$4(MusicPlayService.this, intent.getIntExtra("seekProgress", 0));
            MyApplication.mediaPlayer.seekTo(MusicPlayService.access$5(MusicPlayService.this));
            if (MyApplication.status == 2 || MyApplication.status == 3)
            {
                MyApplication.mediaPlayer.start();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if ("com.MediaPlayer.action.NET_PLAY".equals(intent.getAction()))
        {
            context = (JamendoMusic)intent.getSerializableExtra("netMusic");
            playNetMusic(context);
            MyApplication.setPlayNetMusic(true);
            sendBroadcast(new Intent("com.MediaPlayer.action.STATUS_CHANGED"));
            sendBroadcast(new Intent("com.MediaPlayer.action.MUSIC_CHANGED"));
            return;
        }
        if ("com.MediaPlayer.action.DESTORY".equals(intent.getAction()))
        {
            MusicPlayService.access$6(MusicPlayService.this);
            stopSelf();
            MyApplication.getInstance().exit();
            return;
        }
        if (!"com.MediaPlayer.action.MEDIA_BUTTON_PRESSED".equals(intent.getAction()))
        {
            break; /* Loop/switch isn't completed */
        }
        if (MyApplication.getDefaultSharedPreferences().getBoolean("headset_control_allow", false))
        {
            if (intent.getLongExtra("event_time", 0L) <= 800L)
            {
                flag = false;
            }
            if (flag)
            {
                MusicPlayService.access$1(MusicPlayService.this);
                return;
            }
            MusicPlayService.access$3(MusicPlayService.this);
            if (System.currentTimeMillis() - MusicPlayService.access$7(MusicPlayService.this) < 1500L)
            {
                MusicPlayService.access$0(MusicPlayService.this);
            }
            MusicPlayService.access$8(MusicPlayService.this, System.currentTimeMillis());
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (!"android.intent.action.HEADSET_PLUG".equals(intent.getAction()))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!MusicPlayService.access$9(MusicPlayService.this))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!MyApplication.getDefaultSharedPreferences().getBoolean("headset_in_play", false) || MyApplication.getInstance().isPlaying()) goto _L4; else goto _L6
_L6:
        MusicPlayService.access$3(MusicPlayService.this);
        return;
        if (!MyApplication.getDefaultSharedPreferences().getBoolean("headset_out_stop", false) || !MyApplication.getInstance().isPlaying()) goto _L4; else goto _L7
_L7:
        MyApplication.mediaPlayer.pause();
        return;
        if (!"com.MediaPlayer.action.START_SLEEP".equals(intent.getAction())) goto _L4; else goto _L8
_L8:
        MusicPlayService.access$10(MusicPlayService.this);
        return;
    }

    private ()
    {
        this$0 = MusicPlayService.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
