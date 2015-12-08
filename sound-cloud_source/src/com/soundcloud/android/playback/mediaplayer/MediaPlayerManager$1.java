// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.mediaplayer;

import android.media.MediaPlayer;

// Referenced classes of package com.soundcloud.android.playback.mediaplayer:
//            MediaPlayerManager

class val.mediaPlayer extends Thread
{

    final MediaPlayerManager this$0;
    final MediaPlayer val$mediaPlayer;

    public void run()
    {
        stopAndRelease(val$mediaPlayer);
    }

    ()
    {
        this$0 = final_mediaplayermanager;
        val$mediaPlayer = MediaPlayer.this;
        super();
    }
}
