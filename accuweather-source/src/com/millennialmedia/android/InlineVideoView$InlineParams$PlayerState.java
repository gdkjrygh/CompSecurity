// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;


// Referenced classes of package com.millennialmedia.android:
//            InlineVideoView

static final class  extends Enum
{

    private static final RESUME $VALUES[];
    public static final RESUME DEFAULT;
    public static final RESUME PAUSE;
    public static final RESUME PLAY;
    public static final RESUME RESUME;
    public static final RESUME STOP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/millennialmedia/android/InlineVideoView$InlineParams$PlayerState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DEFAULT = new <init>("DEFAULT", 0);
        STOP = new <init>("STOP", 1);
        PLAY = new <init>("PLAY", 2);
        PAUSE = new <init>("PAUSE", 3);
        RESUME = new <init>("RESUME", 4);
        $VALUES = (new .VALUES[] {
            DEFAULT, STOP, PLAY, PAUSE, RESUME
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
