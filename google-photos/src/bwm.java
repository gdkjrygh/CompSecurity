// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaPlayer;
import android.util.Log;

final class bwm
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener
{

    private bwl a;

    bwm(bwl bwl1)
    {
        a = bwl1;
        super();
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        a.a();
    }

    public final boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        Log.e(bwl.b(), (new StringBuilder(43)).append("Media player error: ").append(i).append(" ").append(j).toString());
        a.a();
        return true;
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        mediaplayer.start();
    }
}
