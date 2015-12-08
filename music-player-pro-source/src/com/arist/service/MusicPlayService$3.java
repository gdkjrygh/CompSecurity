// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.content.Intent;
import android.media.MediaPlayer;

// Referenced classes of package com.arist.service:
//            MusicPlayService

class this._cls0
    implements android.media.redListener
{

    final MusicPlayService this$0;

    public void onPrepared(MediaPlayer mediaplayer)
    {
        mediaplayer.start();
        mediaplayer.setLooping(true);
        mediaplayer = new Intent("com.MediaPlayer.action.NET_MUSIC_BUFFERING");
        sendBroadcast(mediaplayer);
        startNotificationHandler();
    }

    istener()
    {
        this$0 = MusicPlayService.this;
        super();
    }
}
