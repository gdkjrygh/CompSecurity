// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import android.media.MediaPlayer;

// Referenced classes of package com.comscore.streaming:
//            StreamSenseMediaPlayer

class i
    implements android.media.MediaPlayer.OnSeekCompleteListener
{

    final StreamSenseMediaPlayer a;

    i(StreamSenseMediaPlayer streamsensemediaplayer)
    {
        a = streamsensemediaplayer;
        super();
    }

    public void onSeekComplete(MediaPlayer mediaplayer)
    {
        if (StreamSenseMediaPlayer.b(a))
        {
            StreamSenseMediaPlayer.a(a, false);
            StreamSenseMediaPlayer.b(a, mediaplayer);
        }
        if (StreamSenseMediaPlayer.g(a) != null)
        {
            StreamSenseMediaPlayer.g(a).onSeekComplete(mediaplayer);
        }
    }
}
