// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.Intent;
import java.util.EnumSet;

// Referenced classes of package com.soundcloud.android.playback:
//            Player

public static final class  extends Enum
{

    private static final ERROR_FORBIDDEN $VALUES[];
    public static final EnumSet ERRORS;
    public static final ERROR_FORBIDDEN ERROR_FAILED;
    public static final ERROR_FORBIDDEN ERROR_FORBIDDEN;
    public static final ERROR_FORBIDDEN ERROR_NOT_FOUND;
    public static final ERROR_FORBIDDEN NONE;
    public static final EnumSet PLAYBACK_STOPPED;
    static final String PLAYER_REASON_EXTRA = "PLAYER_REASON_EXTRA";
    public static final ERROR_FORBIDDEN PLAY_QUEUE_COMPLETE;
    public static final ERROR_FORBIDDEN TRACK_COMPLETE;

    private void addToIntent(Intent intent)
    {
        intent.putExtra("PLAYER_REASON_EXTRA", ordinal());
    }

    public static ordinal valueOf(String s)
    {
        return (ordinal)Enum.valueOf(com/soundcloud/android/playback/Player$Reason, s);
    }

    public static ordinal[] values()
    {
        return (ordinal[])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        TRACK_COMPLETE = new <init>("TRACK_COMPLETE", 1);
        PLAY_QUEUE_COMPLETE = new <init>("PLAY_QUEUE_COMPLETE", 2);
        ERROR_FAILED = new <init>("ERROR_FAILED", 3);
        ERROR_NOT_FOUND = new <init>("ERROR_NOT_FOUND", 4);
        ERROR_FORBIDDEN = new <init>("ERROR_FORBIDDEN", 5);
        $VALUES = (new .VALUES[] {
            NONE, TRACK_COMPLETE, PLAY_QUEUE_COMPLETE, ERROR_FAILED, ERROR_NOT_FOUND, ERROR_FORBIDDEN
        });
        ERRORS = EnumSet.of(ERROR_FAILED, ERROR_NOT_FOUND, ERROR_FORBIDDEN);
        PLAYBACK_STOPPED = EnumSet.of(TRACK_COMPLETE, ERROR_FAILED, ERROR_NOT_FOUND, ERROR_FORBIDDEN);
    }


    private (String s, int i)
    {
        super(s, i);
    }
}
