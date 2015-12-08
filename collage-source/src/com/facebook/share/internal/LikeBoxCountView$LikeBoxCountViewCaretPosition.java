// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;


// Referenced classes of package com.facebook.share.internal:
//            LikeBoxCountView

public static final class  extends Enum
{

    private static final BOTTOM $VALUES[];
    public static final BOTTOM BOTTOM;
    public static final BOTTOM LEFT;
    public static final BOTTOM RIGHT;
    public static final BOTTOM TOP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/share/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LEFT = new <init>("LEFT", 0);
        TOP = new <init>("TOP", 1);
        RIGHT = new <init>("RIGHT", 2);
        BOTTOM = new <init>("BOTTOM", 3);
        $VALUES = (new .VALUES[] {
            LEFT, TOP, RIGHT, BOTTOM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
