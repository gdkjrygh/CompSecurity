// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.media.MediaPlayer;

// Referenced classes of package com.yume.android.player:
//            ai, B, aq

final class al
    implements android.media.MediaPlayer.OnErrorListener
{

    private ai a;

    al(ai ai1)
    {
        a = ai1;
        super();
    }

    public final boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        if (i == 1)
        {
            a.a.c("Media Error: MEDIA_ERROR_UNKNOWN.");
        } else
        if (i == 100)
        {
            a.a.c("Media Error: MEDIA_ERROR_SERVER_DIED.");
        } else
        if (i == 200)
        {
            a.a.c("Media Error: MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK.");
        } else
        {
            a.a.c((new StringBuilder("Media Error: UNDEFINED (")).append(i).append(", ").append(j).append(").").toString());
        }
        a.d = true;
        a.h = aq.d;
        a.d();
        return true;
    }
}
