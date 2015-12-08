// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.media.MediaPlayer;

// Referenced classes of package com.roidapp.photogrid.video:
//            MusicPlayerService

final class l
    implements Runnable
{

    final MusicPlayerService a;
    private MediaPlayer b;

    public l(MusicPlayerService musicplayerservice, MediaPlayer mediaplayer)
    {
        a = musicplayerservice;
        super();
        b = null;
        b = mediaplayer;
    }

    public final void run()
    {
        try
        {
            if (b != null)
            {
                b.release();
                b = null;
            }
            return;
        }
        catch (Throwable throwable)
        {
            (new StringBuilder("runnable System Player Error:")).append(throwable.getMessage());
        }
        try
        {
            if (b != null)
            {
                b.release();
            }
        }
        catch (Throwable throwable1) { }
        b = null;
    }
}
