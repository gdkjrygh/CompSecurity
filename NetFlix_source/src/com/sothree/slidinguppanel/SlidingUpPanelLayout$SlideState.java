// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sothree.slidinguppanel;


// Referenced classes of package com.sothree.slidinguppanel:
//            SlidingUpPanelLayout

private static final class  extends Enum
{

    private static final ANCHORED $VALUES[];
    public static final ANCHORED ANCHORED;
    public static final ANCHORED COLLAPSED;
    public static final ANCHORED EXPANDED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sothree/slidinguppanel/SlidingUpPanelLayout$SlideState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        EXPANDED = new <init>("EXPANDED", 0);
        COLLAPSED = new <init>("COLLAPSED", 1);
        ANCHORED = new <init>("ANCHORED", 2);
        $VALUES = (new .VALUES[] {
            EXPANDED, COLLAPSED, ANCHORED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
