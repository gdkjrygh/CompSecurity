// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arist.MusicPlayer.MyApplication;
import com.arist.notify.MyNotiofation;

// Referenced classes of package com.arist.service:
//            MusicPlayService

public static class  extends BroadcastReceiver
{

    public void onReceive(Context context, Intent intent)
    {
        if (MyApplication.getInstance() != null)
        {
            MusicPlayService.access$2(MyApplication.musicList);
            if ("com.MediaPlayer.action.WIDGET_PLAY".equals(intent.getAction()))
            {
                MyApplication.context.sendBroadcast(new Intent("com.MediaPlayer.action.PLAY"));
            } else
            {
                if ("com.MediaPlayer.action.WIDGET_NEXT".equals(intent.getAction()))
                {
                    MyApplication.context.sendBroadcast(new Intent("com.MediaPlayer.action.NEXT"));
                    return;
                }
                if ("com.MediaPlayer.action.WIDGET_PREVIOUS".equals(intent.getAction()))
                {
                    MyApplication.context.sendBroadcast(new Intent("com.MediaPlayer.action.PREVIOUS"));
                    return;
                }
                if ("com.MediaPlayer.action.WIDGET_EXIT".equals(intent.getAction()))
                {
                    MyNotiofation.clearNotification();
                    MyApplication.context.sendBroadcast(new Intent("com.MediaPlayer.action.PLAY"));
                    return;
                }
            }
        }
    }

    public ()
    {
    }
}
