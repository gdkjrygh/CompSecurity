// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import android.media.MediaPlayer;

// Referenced classes of package com.comscore.streaming:
//            StreamSenseVideoView

class p
    implements android.media.MediaPlayer.OnCompletionListener
{

    final StreamSenseVideoView a;

    p(StreamSenseVideoView streamsensevideoview)
    {
        a = streamsensevideoview;
        super();
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        StreamSenseVideoView.a(a, mediaplayer);
        if (StreamSenseVideoView.j(a) != null)
        {
            StreamSenseVideoView.j(a).onCompletion(mediaplayer);
        }
    }
}
