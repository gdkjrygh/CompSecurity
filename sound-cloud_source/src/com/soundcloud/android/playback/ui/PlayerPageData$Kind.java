// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;


// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPageData

static final class  extends Enum
{

    private static final VIDEO $VALUES[];
    public static final VIDEO TRACK;
    public static final VIDEO VIDEO;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/playback/ui/PlayerPageData$Kind, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        TRACK = new <init>("TRACK", 0);
        VIDEO = new <init>("VIDEO", 1);
        $VALUES = (new .VALUES[] {
            TRACK, VIDEO
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
