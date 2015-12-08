// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;


// Referenced classes of package com.soundcloud.android.skippy:
//            Skippy

public static final class  extends Enum
{

    private static final TIMEOUT $VALUES[];
    public static final TIMEOUT FAILED;
    public static final TIMEOUT FORBIDDEN;
    public static final TIMEOUT MEDIA_NOT_FOUND;
    public static final TIMEOUT OK;
    public static final TIMEOUT TIMEOUT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/skippy/Skippy$Error, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        OK = new <init>("OK", 0);
        FAILED = new <init>("FAILED", 1);
        MEDIA_NOT_FOUND = new <init>("MEDIA_NOT_FOUND", 2);
        FORBIDDEN = new <init>("FORBIDDEN", 3);
        TIMEOUT = new <init>("TIMEOUT", 4);
        $VALUES = (new .VALUES[] {
            OK, FAILED, MEDIA_NOT_FOUND, FORBIDDEN, TIMEOUT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
