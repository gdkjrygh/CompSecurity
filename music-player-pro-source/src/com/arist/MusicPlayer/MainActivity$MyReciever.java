// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.arist.Adapter.MusicAdapter;
import com.arist.util.BitmapService;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity, MyApplication

private class <init> extends BroadcastReceiver
{

    final MainActivity this$0;

    public void onReceive(Context context, Intent intent)
    {
        if ("com.MediaPlayer.action.MEDIAPLAYER_INFO".equals(intent.getAction()))
        {
            int i = intent.getIntExtra("musicProgress", 0);
            if (!MainActivity.access$17(MainActivity.this))
            {
                MainActivity.access$18(MainActivity.this).setProgress((i * 1000) / MyApplication.getMusicDuration());
            }
        } else
        {
            if ("com.MediaPlayer.action.MUSIC_CHANGED".equals(intent.getAction()))
            {
                MainActivity.access$19(MainActivity.this);
                MainActivity.access$15(MainActivity.this).notifyDataSetChanged();
                return;
            }
            if ("com.MediaPlayer.action.STATUS_CHANGED".equals(intent.getAction()))
            {
                updatePlayStatusView();
                return;
            }
            if ("com.MediaPlayer.action.UPDATE_NETMUEIC_VIEW".equals(intent.getAction()))
            {
                MainActivity.access$20(MainActivity.this, intent.getStringExtra("name"));
                context = intent.getStringExtra("albumName");
                Toast.makeText(MainActivity.this, (new StringBuilder(String.valueOf(MainActivity.access$4(MainActivity.this)))).append(".mp3").append(" ").append(getString(0x7f080082)).toString(), 1).show();
                MainActivity.access$22(MainActivity.this, new MediaScannerConnection(MyApplication.context, MainActivity.access$21(MainActivity.this)));
                MainActivity.access$3(MainActivity.this).connect();
                BitmapService.copyCachBmp((new StringBuilder(String.valueOf(MainActivity.access$4(MainActivity.this)))).append("-").append(context).append(".jpg").toString());
                return;
            }
            if ("com.MediaPlayer.action.NET_MUSIC_BUFFERING".equals(intent.getAction()))
            {
                context = MainActivity.access$23(MainActivity.this).obtainMessage();
                context.what = 7;
                context.arg1 = 1;
                MainActivity.access$23(MainActivity.this).sendMessage(context);
                return;
            }
        }
    }

    private ()
    {
        this$0 = MainActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
