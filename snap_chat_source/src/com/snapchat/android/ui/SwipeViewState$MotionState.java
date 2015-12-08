// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;


// Referenced classes of package com.snapchat.android.ui:
//            SwipeViewState

public static final class  extends Enum
{

    private static final AUTO_SCROLLING $VALUES[];
    public static final AUTO_SCROLLING AUTO_SCROLLING;
    public static final AUTO_SCROLLING NOT_MOVING;
    public static final AUTO_SCROLLING SWIPING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/ui/SwipeViewState$MotionState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NOT_MOVING = new <init>("NOT_MOVING", 0);
        SWIPING = new <init>("SWIPING", 1);
        AUTO_SCROLLING = new <init>("AUTO_SCROLLING", 2);
        $VALUES = (new .VALUES[] {
            NOT_MOVING, SWIPING, AUTO_SCROLLING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
