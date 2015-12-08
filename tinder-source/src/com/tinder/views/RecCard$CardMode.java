// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;


// Referenced classes of package com.tinder.views:
//            RecCard

public static final class  extends Enum
{

    private static final VIDEO_AD $VALUES[];
    public static final VIDEO_AD PROMOTED_REC;
    public static final VIDEO_AD REC;
    public static final VIDEO_AD SUPER_LIKE;
    public static final VIDEO_AD VIDEO_AD;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/tinder/views/RecCard$CardMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        REC = new <init>("REC", 0);
        PROMOTED_REC = new <init>("PROMOTED_REC", 1);
        SUPER_LIKE = new <init>("SUPER_LIKE", 2);
        VIDEO_AD = new <init>("VIDEO_AD", 3);
        $VALUES = (new .VALUES[] {
            REC, PROMOTED_REC, SUPER_LIKE, VIDEO_AD
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
