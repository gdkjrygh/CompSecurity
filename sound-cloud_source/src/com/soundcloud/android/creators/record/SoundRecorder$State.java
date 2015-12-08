// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import java.util.EnumSet;

// Referenced classes of package com.soundcloud.android.creators.record:
//            SoundRecorder

public static final class  extends Enum
{

    private static final SEEKING $VALUES[];
    public static final EnumSet ACTIVE;
    public static final SEEKING ERROR;
    public static final SEEKING IDLE;
    public static final EnumSet PLAYBACK;
    public static final SEEKING PLAYING;
    public static final SEEKING READING;
    public static final SEEKING RECORDING;
    public static final SEEKING SEEKING;
    public static final SEEKING STOPPING;
    public static final SEEKING TRIMMING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/creators/record/SoundRecorder$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public final boolean isActive()
    {
        return ACTIVE.contains(this);
    }

    public final boolean isPlaying()
    {
        return PLAYBACK.contains(this);
    }

    public final boolean isRecording()
    {
        return this == RECORDING;
    }

    public final boolean isTrimming()
    {
        return this == TRIMMING;
    }

    static 
    {
        IDLE = new <init>("IDLE", 0);
        READING = new <init>("READING", 1);
        RECORDING = new <init>("RECORDING", 2);
        ERROR = new <init>("ERROR", 3);
        STOPPING = new <init>("STOPPING", 4);
        PLAYING = new <init>("PLAYING", 5);
        SEEKING = new <init>("SEEKING", 6);
        TRIMMING = new <init>("TRIMMING", 7);
        $VALUES = (new .VALUES[] {
            IDLE, READING, RECORDING, ERROR, STOPPING, PLAYING, SEEKING, TRIMMING
        });
        ACTIVE = EnumSet.of(RECORDING, PLAYING, SEEKING, TRIMMING);
        PLAYBACK = EnumSet.of(PLAYING, SEEKING);
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
