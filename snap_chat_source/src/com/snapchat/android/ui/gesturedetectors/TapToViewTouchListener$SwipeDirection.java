// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.gesturedetectors;


// Referenced classes of package com.snapchat.android.ui.gesturedetectors:
//            TapToViewTouchListener

public static final class  extends Enum
{

    private static final RIGHT $VALUES[];
    public static final RIGHT DOWN;
    public static final RIGHT LEFT;
    public static final RIGHT RIGHT;
    public static final RIGHT UP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/ui/gesturedetectors/TapToViewTouchListener$SwipeDirection, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UP = new <init>("UP", 0);
        DOWN = new <init>("DOWN", 1);
        LEFT = new <init>("LEFT", 2);
        RIGHT = new <init>("RIGHT", 3);
        $VALUES = (new .VALUES[] {
            UP, DOWN, LEFT, RIGHT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
