// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.Intent;

// Referenced classes of package com.soundcloud.android.playback:
//            Player

public static final class  extends Enum
{

    private static final IDLE $VALUES[];
    public static final IDLE BUFFERING;
    public static final IDLE IDLE;
    static final String PLAYER_STATE_EXTRA = "PLAYER_STATE_EXTRA";
    public static final IDLE PLAYING;

    private void addToIntent(Intent intent)
    {
        intent.putExtra("PLAYER_STATE_EXTRA", ordinal());
    }

    public static ordinal valueOf(String s)
    {
        return (ordinal)Enum.valueOf(com/soundcloud/android/playback/Player$PlayerState, s);
    }

    public static ordinal[] values()
    {
        return (ordinal[])$VALUES.clone();
    }

    public final boolean isBuffering()
    {
        return this == BUFFERING;
    }

    public final boolean isIdle()
    {
        return this == IDLE;
    }

    public final boolean isPlayerPlaying()
    {
        return this == PLAYING;
    }

    public final boolean isPlaying()
    {
        return this == PLAYING || this == BUFFERING;
    }

    static 
    {
        BUFFERING = new <init>("BUFFERING", 0);
        PLAYING = new <init>("PLAYING", 1);
        IDLE = new <init>("IDLE", 2);
        $VALUES = (new .VALUES[] {
            BUFFERING, PLAYING, IDLE
        });
    }


    private (String s, int i)
    {
        super(s, i);
    }
}
