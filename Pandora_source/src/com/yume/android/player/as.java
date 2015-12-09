// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.media.MediaPlayer;

// Referenced classes of package com.yume.android.player:
//            ar

final class as
    implements android.media.MediaPlayer.OnSeekCompleteListener
{

    private ar a;

    as(ar ar1)
    {
        a = ar1;
        super();
    }

    public final void onSeekComplete(MediaPlayer mediaplayer)
    {
        if (a.k != null)
        {
            a.k.onSeekComplete(a.d);
        }
    }
}
