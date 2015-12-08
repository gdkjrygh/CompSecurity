// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.cameradecor;


// Referenced classes of package com.snapchat.android.camera.cameradecor:
//            CameraDecor

public static final class  extends Enum
{

    private static final START_PASSING_TOUCH_EVENTS_TO_LENSES_VIEW $VALUES[];
    public static final START_PASSING_TOUCH_EVENTS_TO_LENSES_VIEW FINGER_DOWN;
    public static final START_PASSING_TOUCH_EVENTS_TO_LENSES_VIEW FINGER_UP;
    public static final START_PASSING_TOUCH_EVENTS_TO_LENSES_VIEW START_PASSING_TOUCH_EVENTS_TO_LENSES_VIEW;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/camera/cameradecor/CameraDecor$CameraDecorInterface$TakeSnapButtonAction, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FINGER_DOWN = new <init>("FINGER_DOWN", 0);
        FINGER_UP = new <init>("FINGER_UP", 1);
        START_PASSING_TOUCH_EVENTS_TO_LENSES_VIEW = new <init>("START_PASSING_TOUCH_EVENTS_TO_LENSES_VIEW", 2);
        $VALUES = (new .VALUES[] {
            FINGER_DOWN, FINGER_UP, START_PASSING_TOUCH_EVENTS_TO_LENSES_VIEW
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
