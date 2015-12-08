// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;


// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueueItem

static final class  extends Enum
{

    private static final VIDEO $VALUES[];
    public static final VIDEO EMPTY;
    public static final VIDEO TRACK;
    public static final VIDEO VIDEO;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/playback/PlayQueueItem$Kind, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        EMPTY = new <init>("EMPTY", 0);
        TRACK = new <init>("TRACK", 1);
        VIDEO = new <init>("VIDEO", 2);
        $VALUES = (new .VALUES[] {
            EMPTY, TRACK, VIDEO
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
