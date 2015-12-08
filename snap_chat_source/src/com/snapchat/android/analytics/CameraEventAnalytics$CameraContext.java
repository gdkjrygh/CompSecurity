// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;


// Referenced classes of package com.snapchat.android.analytics:
//            CameraEventAnalytics

public static final class  extends Enum
{

    private static final BACKGROUND $VALUES[];
    public static final BACKGROUND BACKGROUND;
    public static final BACKGROUND BACK_PRESSED;
    public static final BACKGROUND CAMERA_BUTTON;
    public static final BACKGROUND CANCEL_PREVIEW;
    public static final BACKGROUND DOUBLE_TAP;
    public static final BACKGROUND KILLED_STATE;
    public static final BACKGROUND SNAP_BUTTON;
    public static final BACKGROUND SWIPE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/analytics/CameraEventAnalytics$CameraContext, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SWIPE = new <init>("SWIPE", 0);
        BACK_PRESSED = new <init>("BACK_PRESSED", 1);
        SNAP_BUTTON = new <init>("SNAP_BUTTON", 2);
        DOUBLE_TAP = new <init>("DOUBLE_TAP", 3);
        CAMERA_BUTTON = new <init>("CAMERA_BUTTON", 4);
        CANCEL_PREVIEW = new <init>("CANCEL_PREVIEW", 5);
        KILLED_STATE = new <init>("KILLED_STATE", 6);
        BACKGROUND = new <init>("BACKGROUND", 7);
        $VALUES = (new .VALUES[] {
            SWIPE, BACK_PRESSED, SNAP_BUTTON, DOUBLE_TAP, CAMERA_BUTTON, CANCEL_PREVIEW, KILLED_STATE, BACKGROUND
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
