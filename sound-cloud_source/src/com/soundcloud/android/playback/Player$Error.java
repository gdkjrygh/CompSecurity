// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;


// Referenced classes of package com.soundcloud.android.playback:
//            Player

public static final class  extends Enum
{

    private static final FORBIDDEN $VALUES[];
    public static final FORBIDDEN FAILED;
    public static final FORBIDDEN FORBIDDEN;
    public static final FORBIDDEN MEDIA_NOT_FOUND;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/playback/Player$Error, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FAILED = new <init>("FAILED", 0);
        MEDIA_NOT_FOUND = new <init>("MEDIA_NOT_FOUND", 1);
        FORBIDDEN = new <init>("FORBIDDEN", 2);
        $VALUES = (new .VALUES[] {
            FAILED, MEDIA_NOT_FOUND, FORBIDDEN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
