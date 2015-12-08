// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;


// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueueOperations

static final class  extends Enum
{

    private static final TRACK_ID $VALUES[];
    public static final TRACK_ID PLAY_POSITION;
    public static final TRACK_ID SEEK_POSITION;
    public static final TRACK_ID TRACK_ID;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/playback/PlayQueueOperations$Keys, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PLAY_POSITION = new <init>("PLAY_POSITION", 0);
        SEEK_POSITION = new <init>("SEEK_POSITION", 1);
        TRACK_ID = new <init>("TRACK_ID", 2);
        $VALUES = (new .VALUES[] {
            PLAY_POSITION, SEEK_POSITION, TRACK_ID
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
