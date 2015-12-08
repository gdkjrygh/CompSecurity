// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.media.MediaPlayer;

// Referenced classes of package com.facebook.ads.internal.view:
//            d

class a
    implements android.media.aPlayer.OnPreparedListener
{

    final d a;

    public void onPrepared(MediaPlayer mediaplayer)
    {
        MediaPlayer mediaplayer1 = mediaplayer;
        try
        {
            if (mediaplayer.isPlaying())
            {
                mediaplayer.stop();
                mediaplayer.release();
                mediaplayer1 = new MediaPlayer();
            }
            mediaplayer1.setVolume(a.getVolume(), a.getVolume());
            mediaplayer1.setLooping(false);
            mediaplayer1.start();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediaPlayer mediaplayer)
        {
            mediaplayer.printStackTrace();
        }
    }

    dListener(d d1)
    {
        a = d1;
        super();
    }
}
