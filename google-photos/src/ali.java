// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaPlayer;
import androidx.media.filterpacks.video.MediaPlayerSource;

public final class ali
    implements android.media.MediaPlayer.OnVideoSizeChangedListener
{

    private MediaPlayerSource a;

    public ali(MediaPlayerSource mediaplayersource)
    {
        a = mediaplayersource;
        super();
    }

    public final void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
    {
        MediaPlayerSource.a(a, (new StringBuilder(54)).append("MediaPlayer sent dimensions: ").append(i).append(" x ").append(j).toString());
        synchronized (MediaPlayerSource.b(a))
        {
            MediaPlayerSource.a(a, i);
            MediaPlayerSource.b(a, j);
        }
        return;
        exception;
        mediaplayer;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
