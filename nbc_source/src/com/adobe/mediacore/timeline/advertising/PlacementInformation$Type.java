// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising;


// Referenced classes of package com.adobe.mediacore.timeline.advertising:
//            PlacementInformation

public static final class  extends Enum
{

    private static final CUSTOM_TIME_RANGES $VALUES[];
    public static final CUSTOM_TIME_RANGES CUSTOM_TIME_RANGES;
    public static final CUSTOM_TIME_RANGES MID_ROLL;
    public static final CUSTOM_TIME_RANGES POST_ROLL;
    public static final CUSTOM_TIME_RANGES PRE_ROLL;
    public static final CUSTOM_TIME_RANGES SERVER_MAP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/adobe/mediacore/timeline/advertising/PlacementInformation$Type, s);
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
        SERVER_MAP = new <init>("SERVER_MAP", 3);
        CUSTOM_TIME_RANGES = new <init>("CUSTOM_TIME_RANGES", 4);
        $VALUES = (new .VALUES[] {
            PRE_ROLL, MID_ROLL, POST_ROLL, SERVER_MAP, CUSTOM_TIME_RANGES
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
