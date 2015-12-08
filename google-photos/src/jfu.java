// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaPlayer;

final class jfu
    implements android.media.MediaPlayer.OnBufferingUpdateListener
{

    private jfq a;

    jfu(jfq jfq1)
    {
        a = jfq1;
        super();
    }

    public final void onBufferingUpdate(MediaPlayer mediaplayer, int i)
    {
        jfq.d(a, i);
    }
}
