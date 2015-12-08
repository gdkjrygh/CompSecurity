// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.media.MediaPlayer;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent

class i
    implements android.media.MediaPlayer.OnVideoSizeChangedListener
{

    final VideoDisplayComponent a;

    i(VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }

    public void onVideoSizeChanged(MediaPlayer mediaplayer, int j, int k)
    {
        if (j != 0 && k != 0)
        {
            a.a(j, k);
        }
    }
}
