// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import com.arist.entity.Music;
import com.arist.util.BitmapService;
import com.arist.util.Constant;
import com.yong.jamendo.api.JamendoMusic;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity, MyApplication

class this._cls0
    implements android.content.OnClickListener
{

    final MainActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (new StringBuilder(String.valueOf(currentNetMusic.getMusic_name()))).append("-").append(currentNetMusic.getAlbum_name()).append(".jpg").toString();
        BitmapService.copyBitmap((new StringBuilder(String.valueOf(Constant.BASE_ABLUM_CACHES_PATH))).append(dialoginterface).toString(), (new StringBuilder(String.valueOf(Constant.BASE_ABLUM_PATH))).append(dialoginterface).toString());
        try
        {
            dialoginterface = new Music();
            dialoginterface.setAlbum(currentNetMusic.getAlbum_name());
            dialoginterface.setArtist(currentNetMusic.getArtistName());
            dialoginterface.setDuration(currentNetMusic.getDuration() * 1000);
            dialoginterface.setTitle(currentNetMusic.getMusic_name());
            MyApplication.setCurrentMusic(dialoginterface);
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface) { }
        dialoginterface = new Intent("com.MediaPlayer.action.NET_PLAY");
        dialoginterface.putExtra("netMusic", currentNetMusic);
        sendBroadcast(dialoginterface);
        dialoginterface = MainActivity.access$23(MainActivity.this).obtainMessage();
        dialoginterface.what = 7;
        dialoginterface.arg1 = 0;
        MainActivity.access$23(MainActivity.this).sendMessage(dialoginterface);
        Toast.makeText(MainActivity.this, 0x7f08007c, 1).show();
    }

    kListener()
    {
        this$0 = MainActivity.this;
        super();
    }
}
