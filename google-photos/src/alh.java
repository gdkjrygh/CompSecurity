// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaPlayer;
import androidx.media.filterpacks.video.MediaPlayerSource;

public final class alh
    implements android.media.MediaPlayer.OnPreparedListener
{

    private MediaPlayerSource a;

    public alh(MediaPlayerSource mediaplayersource)
    {
        a = mediaplayersource;
        super();
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        MediaPlayerSource.a(a, "MediaPlayer is prepared");
        synchronized (a)
        {
            MediaPlayerSource.a(a).start();
        }
        return;
        exception;
        mediaplayer;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
