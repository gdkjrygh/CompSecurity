// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.window;


// Referenced classes of package com.snapchat.android.ui.window:
//            WindowConfiguration

public static final class  extends Enum
{

    private static final DRAW_BELOW_FOR_ADJUSTABLE_UI $VALUES[];
    public static final DRAW_BELOW_FOR_ADJUSTABLE_UI DRAW_BACKGROUND_BEHIND;
    public static final DRAW_BELOW_FOR_ADJUSTABLE_UI DRAW_BEHIND;
    public static final DRAW_BELOW_FOR_ADJUSTABLE_UI DRAW_BELOW_FOR_ADJUSTABLE_UI;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/ui/window/WindowConfiguration$StatusBarDrawMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DRAW_BEHIND = new <init>("DRAW_BEHIND", 0);
        DRAW_BACKGROUND_BEHIND = new <init>("DRAW_BACKGROUND_BEHIND", 1);
        DRAW_BELOW_FOR_ADJUSTABLE_UI = new <init>("DRAW_BELOW_FOR_ADJUSTABLE_UI", 2);
        $VALUES = (new .VALUES[] {
            DRAW_BEHIND, DRAW_BACKGROUND_BEHIND, DRAW_BELOW_FOR_ADJUSTABLE_UI
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
