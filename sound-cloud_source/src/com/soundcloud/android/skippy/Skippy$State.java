// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;


// Referenced classes of package com.soundcloud.android.skippy:
//            Skippy

public static final class  extends Enum
{

    private static final PLAYING $VALUES[];
    public static final PLAYING IDLE;
    public static final PLAYING PLAYING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/skippy/Skippy$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        IDLE = new <init>("IDLE", 0);
        PLAYING = new <init>("PLAYING", 1);
        $VALUES = (new .VALUES[] {
            IDLE, PLAYING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
