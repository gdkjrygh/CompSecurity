// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.recommendations;


// Referenced classes of package com.soundcloud.android.sync.recommendations:
//            ApiRecommendation

static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN LIKED;
    public static final UNKNOWN LISTENED_TO;
    public static final UNKNOWN UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/sync/recommendations/ApiRecommendation$Reason, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LIKED = new <init>("LIKED", 0);
        LISTENED_TO = new <init>("LISTENED_TO", 1);
        UNKNOWN = new <init>("UNKNOWN", 2);
        $VALUES = (new .VALUES[] {
            LIKED, LISTENED_TO, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
