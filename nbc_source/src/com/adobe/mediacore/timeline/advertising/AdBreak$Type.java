// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising;


// Referenced classes of package com.adobe.mediacore.timeline.advertising:
//            AdBreak

public static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN MID_ROLL;
    public static final UNKNOWN POST_ROLL;
    public static final UNKNOWN PRE_ROLL;
    public static final UNKNOWN UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/adobe/mediacore/timeline/advertising/AdBreak$Type, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PRE_ROLL = new <init>("PRE_ROLL", 0);
        MID_ROLL = new <init>("MID_ROLL", 1);
        POST_ROLL = new <init>("POST_ROLL", 2);
        UNKNOWN = new <init>("UNKNOWN", 3);
        $VALUES = (new .VALUES[] {
            PRE_ROLL, MID_ROLL, POST_ROLL, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
