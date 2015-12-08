// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaPlayer;
import android.media.PlaybackParams;

final class jfr
    implements android.media.MediaPlayer.OnPreparedListener
{

    private jfq a;

    jfr(jfq jfq1)
    {
        a = jfq1;
        super();
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        if (jfq.a(a).a())
        {
            noy.a("MediaPlayerWrapper", a);
        }
        jfq.a(a, jfv.d);
        if (jfq.b(a) == jfv.h)
        {
            a.b(false);
        } else
        {
            if (jfq.c(a) != -1 && jfq.d(a))
            {
                jfq.a(a, jfq.c(a));
                jfq.b(a, -1);
            }
            if (jfq.e(a) != -1F)
            {
                jfq.a(a, mediaplayer.getPlaybackParams().getSpeed());
                jfq.b(a, jfq.e(a));
                jfq.c(a, -1F);
            }
            if (jfq.b(a) == jfv.e)
            {
                mediaplayer.start();
            }
            if (jfq.f(a) != null)
            {
                jfq.f(a).onPrepared(mediaplayer);
                return;
            }
        }
    }
}
