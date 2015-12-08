// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.media.MediaPlayer;

// Referenced classes of package com.yume.android.player:
//            ai, B

final class am
    implements android.media.MediaPlayer.OnInfoListener
{

    private ai a;

    am(ai ai1)
    {
        a = ai1;
        super();
    }

    public final boolean onInfo(MediaPlayer mediaplayer, int i, int j)
    {
        if (i == 1)
        {
            a.a.b("Media Info: MEDIA_INFO_UNKNOWN.");
            return true;
        }
        if (i == 700)
        {
            a.a.b("Media Info: MEDIA_INFO_VIDEO_TRACK_LAGGING.");
            return true;
        }
        if (i == 800)
        {
            a.a.b("Media Info: MEDIA_INFO_BAD_INTERLEAVING.");
            return true;
        }
        if (i == 801)
        {
            a.a.b("Media Info: MEDIA_INFO_NOT_SEEKABLE.");
            return true;
        }
        if (i == 802)
        {
            a.a.b("Media Info: MEDIA_INFO_METADATA_UPDATE.");
            return true;
        } else
        {
            a.a.b((new StringBuilder("Media Info: UNDEFINED (")).append(i).append(", ").append(j).append(").").toString());
            return true;
        }
    }
}
