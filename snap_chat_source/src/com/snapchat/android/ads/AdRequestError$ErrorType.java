// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ads;


// Referenced classes of package com.snapchat.android.ads:
//            AdRequestError

public static final class  extends Enum
{

    private static final CLIENT_SIDE_ERROR $VALUES[];
    public static final CLIENT_SIDE_ERROR CLIENT_SIDE_ERROR;
    public static final CLIENT_SIDE_ERROR SERVER_SIDE_ERROR;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/ads/AdRequestError$ErrorType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SERVER_SIDE_ERROR = new <init>("SERVER_SIDE_ERROR", 0);
        CLIENT_SIDE_ERROR = new <init>("CLIENT_SIDE_ERROR", 1);
        $VALUES = (new .VALUES[] {
            SERVER_SIDE_ERROR, CLIENT_SIDE_ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
