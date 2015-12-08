// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

// Referenced classes of package com.arist.MusicPlayer:
//            MusicPlayActivity

private class <init> extends BroadcastReceiver
{

    final MusicPlayActivity this$0;

    public void onReceive(Context context, Intent intent)
    {
        if ("com.MediaPlayer.action.DESTORY".equals(intent.getAction()))
        {
            finish();
        } else
        {
            if ("com.MediaPlayer.action.MUSIC_CHANGED".equals(intent.getAction()))
            {
                MusicPlayActivity.access$7(MusicPlayActivity.this);
                MusicPlayActivity.access$6(MusicPlayActivity.this).sendMessage(MusicPlayActivity.access$6(MusicPlayActivity.this).obtainMessage(3));
                return;
            }
            if ("com.MediaPlayer.action.STATUS_CHANGED".equals(intent.getAction()))
            {
                MusicPlayActivity.access$7(MusicPlayActivity.this);
                return;
            }
        }
    }

    private ()
    {
        this$0 = MusicPlayActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
