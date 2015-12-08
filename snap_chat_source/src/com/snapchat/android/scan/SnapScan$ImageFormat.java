// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.scan;


// Referenced classes of package com.snapchat.android.scan:
//            SnapScan

public static final class  extends Enum
{

    private static final ARGB_8888 $VALUES[];
    public static final ARGB_8888 ARGB_8888;
    public static final ARGB_8888 NV21;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/scan/SnapScan$ImageFormat, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NV21 = new <init>("NV21", 0);
        ARGB_8888 = new <init>("ARGB_8888", 1);
        $VALUES = (new .VALUES[] {
            NV21, ARGB_8888
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
