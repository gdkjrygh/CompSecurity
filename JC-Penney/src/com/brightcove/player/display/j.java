// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.media.MediaPlayer;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent

class j
    implements android.media.MediaPlayer.OnErrorListener
{

    final VideoDisplayComponent a;

    j(VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int k)
    {
        switch (i)
        {
        default:
            VideoDisplayComponent.a(a, i, k);
            break;

        case 1: // '\001'
            switch (k)
            {
            default:
                VideoDisplayComponent.a(a, i, k);
                break;

            case -1014: 
            case -1013: 
            case -1012: 
                break;
            }
            break;

        case 100: // 'd'
            break;
        }
        while (true) 
        {
            return false;
        }
    }
}
