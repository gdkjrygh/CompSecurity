// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;


// Referenced classes of package com.snapchat.android.ui:
//            VerticalFlinger

public static final class  extends Enum
{

    private static final DEACTIVATED $VALUES[];
    public static final DEACTIVATED CENTER;
    public static final DEACTIVATED DEACTIVATED;
    public static final DEACTIVATED DRAG;
    public static final DEACTIVATED FLING;
    public static final DEACTIVATED GONE;
    public static final DEACTIVATED RETURN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/ui/VerticalFlinger$MovementState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CENTER = new <init>("CENTER", 0);
        DRAG = new <init>("DRAG", 1);
        FLING = new <init>("FLING", 2);
        GONE = new <init>("GONE", 3);
        RETURN = new <init>("RETURN", 4);
        DEACTIVATED = new <init>("DEACTIVATED", 5);
        $VALUES = (new .VALUES[] {
            CENTER, DRAG, FLING, GONE, RETURN, DEACTIVATED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
