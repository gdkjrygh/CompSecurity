// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising;


// Referenced classes of package com.adobe.mediacore.timeline.advertising:
//            PlacementInformation

public static final class  extends Enum
{

    private static final MARK $VALUES[];
    public static final MARK DELETE;
    public static final MARK INSERT;
    public static final MARK MARK;
    public static final MARK REPLACE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/adobe/mediacore/timeline/advertising/PlacementInformation$Mode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        INSERT = new <init>("INSERT", 0);
        DELETE = new <init>("DELETE", 1);
        REPLACE = new <init>("REPLACE", 2);
        MARK = new <init>("MARK", 3);
        $VALUES = (new .VALUES[] {
            INSERT, DELETE, REPLACE, MARK
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
