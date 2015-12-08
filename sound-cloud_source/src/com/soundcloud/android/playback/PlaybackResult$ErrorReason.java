// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;


// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackResult

public static final class  extends Enum
{

    private static final MISSING_PLAYABLE_TRACKS $VALUES[];
    public static final MISSING_PLAYABLE_TRACKS MISSING_PLAYABLE_TRACKS;
    public static final MISSING_PLAYABLE_TRACKS NONE;
    public static final MISSING_PLAYABLE_TRACKS TRACK_UNAVAILABLE_CAST;
    public static final MISSING_PLAYABLE_TRACKS TRACK_UNAVAILABLE_OFFLINE;
    public static final MISSING_PLAYABLE_TRACKS UNSKIPPABLE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/playback/PlaybackResult$ErrorReason, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        UNSKIPPABLE = new <init>("UNSKIPPABLE", 1);
        TRACK_UNAVAILABLE_OFFLINE = new <init>("TRACK_UNAVAILABLE_OFFLINE", 2);
        TRACK_UNAVAILABLE_CAST = new <init>("TRACK_UNAVAILABLE_CAST", 3);
        MISSING_PLAYABLE_TRACKS = new <init>("MISSING_PLAYABLE_TRACKS", 4);
        $VALUES = (new .VALUES[] {
            NONE, UNSKIPPABLE, TRACK_UNAVAILABLE_OFFLINE, TRACK_UNAVAILABLE_CAST, MISSING_PLAYABLE_TRACKS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
