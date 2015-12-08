// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.media.MediaPlayer;

final class q
    implements android.media.MediaPlayer.OnPreparedListener
{

    private final int a;

    q(int i)
    {
        a = i;
        super();
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        mediaplayer.setVolume(a, a);
        mediaplayer.start();
    }
}
