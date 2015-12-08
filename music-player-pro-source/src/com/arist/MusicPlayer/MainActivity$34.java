// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.arist.service.MusicDownloadService;
import com.yong.jamendo.api.JamendoMusic;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity

class this._cls0
    implements android.view.ener
{

    final MainActivity this$0;

    public void onClick(View view)
    {
        Toast.makeText(MainActivity.this, 0x7f08007d, 1).show();
        view = new Intent(MainActivity.this, com/arist/service/MusicDownloadService);
        view.putExtra("uri", currentNetMusic.getAudio_link());
        view.putExtra("musicName", currentNetMusic.getMusic_name());
        view.putExtra("AlbumName", currentNetMusic.getAlbum_name());
        startService(view);
        dismissDialog(5);
        removeDialog(5);
    }

    ()
    {
        this$0 = MainActivity.this;
        super();
    }
}
