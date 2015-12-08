// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaPlayer;
import androidx.media.filterpacks.video.MediaPlayerSource;

public final class alj
    implements android.media.MediaPlayer.OnCompletionListener
{

    private MediaPlayerSource a;

    public alj(MediaPlayerSource mediaplayersource)
    {
        a = mediaplayersource;
        super();
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        MediaPlayerSource.a(a, "MediaPlayer has completed playback");
        synchronized (MediaPlayerSource.b(a))
        {
            MediaPlayerSource.a(a, true);
        }
        MediaPlayerSource.c(a);
        return;
        exception;
        mediaplayer;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
