// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;


// Referenced classes of package com.snapchat.android.ui:
//            SwipeOutTracker

public static final class a extends Enum
{

    private static final AUTO_ADVANCE $VALUES[];
    public static final AUTO_ADVANCE AUTO_ADVANCE;
    public static final AUTO_ADVANCE BACK_PRESSED;
    public static final AUTO_ADVANCE ENTER_BACKGROUND;
    public static final AUTO_ADVANCE SWIPE_BEGINNING;
    public static final AUTO_ADVANCE SWIPE_DOWN;
    public static final AUTO_ADVANCE SWIPE_END;
    private String a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/snapchat/android/ui/SwipeOutTracker$SwipeToExitMethod, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    public final String getName()
    {
        return a;
    }

    static 
    {
        SWIPE_DOWN = new <init>("SWIPE_DOWN", 0, "swipe_down");
        SWIPE_BEGINNING = new <init>("SWIPE_BEGINNING", 1, "swipe_beginning");
        SWIPE_END = new <init>("SWIPE_END", 2, "swipe_end");
        ENTER_BACKGROUND = new <init>("ENTER_BACKGROUND", 3, "enter_background");
        BACK_PRESSED = new <init>("BACK_PRESSED", 4, "back_pressed");
        AUTO_ADVANCE = new <init>("AUTO_ADVANCE", 5, "auto_advance");
        $VALUES = (new .VALUES[] {
            SWIPE_DOWN, SWIPE_BEGINNING, SWIPE_END, ENTER_BACKGROUND, BACK_PRESSED, AUTO_ADVANCE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }
}
