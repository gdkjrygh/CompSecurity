// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.gesture;


// Referenced classes of package com.snapchat.android.gesture:
//            SwipeListener

public static final class  extends Enum
{

    private static final DOWN $VALUES[];
    public static final DOWN DOWN;
    public static final DOWN LEFT;
    public static final DOWN RIGHT;
    public static final DOWN TOP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/gesture/SwipeListener$Direction, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LEFT = new <init>("LEFT", 0);
        RIGHT = new <init>("RIGHT", 1);
        TOP = new <init>("TOP", 2);
        DOWN = new <init>("DOWN", 3);
        $VALUES = (new .VALUES[] {
            LEFT, RIGHT, TOP, DOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
