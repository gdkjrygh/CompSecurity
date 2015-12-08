// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;


// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackService

private static final class  extends Enum
{

    private static final LOST $VALUES[];
    public static final LOST LOST;
    public static final LOST NONE;
    public static final LOST TRANSIENT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/playback/PlaybackService$FocusLossState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        TRANSIENT = new <init>("TRANSIENT", 1);
        LOST = new <init>("LOST", 2);
        $VALUES = (new .VALUES[] {
            NONE, TRANSIENT, LOST
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
