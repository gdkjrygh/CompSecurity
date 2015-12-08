// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaPlayer;

final class jfs
    implements android.media.MediaPlayer.OnCompletionListener
{

    private jfq a;

    jfs(jfq jfq1)
    {
        a = jfq1;
        super();
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        if (jfq.a(a).a())
        {
            noy.a("MediaPlayerWrapper", a);
        }
        jfq.a(a, jfv.g);
        jfq.b(a, jfv.g);
        if (jfq.g(a) != null)
        {
            jfq.g(a).onCompletion(mediaplayer);
        }
    }
}
