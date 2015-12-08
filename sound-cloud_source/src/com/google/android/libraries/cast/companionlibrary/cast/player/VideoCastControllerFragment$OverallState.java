// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.player;


// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.player:
//            VideoCastControllerFragment

private static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN AUTHORIZING;
    public static final UNKNOWN PLAYBACK;
    public static final UNKNOWN UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/libraries/cast/companionlibrary/cast/player/VideoCastControllerFragment$OverallState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        AUTHORIZING = new <init>("AUTHORIZING", 0);
        PLAYBACK = new <init>("PLAYBACK", 1);
        UNKNOWN = new <init>("UNKNOWN", 2);
        $VALUES = (new .VALUES[] {
            AUTHORIZING, PLAYBACK, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
