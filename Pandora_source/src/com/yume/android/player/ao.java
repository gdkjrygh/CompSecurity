// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.media.MediaPlayer;

// Referenced classes of package com.yume.android.player:
//            ai

final class ao
    implements android.media.MediaPlayer.OnSeekCompleteListener
{

    private ai a;

    ao(ai ai1)
    {
        a = ai1;
        super();
    }

    public final void onSeekComplete(MediaPlayer mediaplayer)
    {
        try
        {
            a.i();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediaPlayer mediaplayer)
        {
            mediaplayer.printStackTrace();
        }
    }
}
