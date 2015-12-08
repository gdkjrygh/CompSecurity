// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

public final class ffj
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnPreparedListener
{

    final Context a;
    public final MediaPlayer b;
    android.media.MediaPlayer.OnPreparedListener c;
    android.media.MediaPlayer.OnCompletionListener d;
    public boolean e;
    boolean f;
    private final AudioManager g;

    public ffj(Context context, MediaPlayer mediaplayer, AudioManager audiomanager)
    {
        a = context;
        b = mediaplayer;
        g = audiomanager;
        b.setOnPreparedListener(this);
        b.setOnCompletionListener(this);
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            g.requestAudioFocus(null, 3, 3);
            return;
        } else
        {
            g.abandonAudioFocus(null);
            return;
        }
    }

    public final boolean a()
    {
        return !f && b.isPlaying();
    }

    public final boolean b()
    {
        return !f && e;
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        if (d != null)
        {
            d.onCompletion(mediaplayer);
        }
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        e = false;
        if (c != null)
        {
            c.onPrepared(mediaplayer);
        }
    }
}
