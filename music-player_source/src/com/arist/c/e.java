// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.c;

import android.media.MediaPlayer;
import android.util.Log;

public final class e
{

    public static int a = -1;

    public static MediaPlayer a()
    {
        MediaPlayer mediaplayer = new MediaPlayer();
        mediaplayer.setAudioStreamType(3);
        mediaplayer.setLooping(false);
        if (a < 0)
        {
            a = mediaplayer.getAudioSessionId();
        } else
        {
            mediaplayer.setAudioSessionId(a);
        }
        Log.i("AudioSessionId", (new StringBuilder("AudioSessionId = ")).append(a).toString());
        return mediaplayer;
    }

}
