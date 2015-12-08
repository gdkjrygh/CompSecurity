// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.window;


// Referenced classes of package com.snapchat.android.ui.window:
//            WindowConfiguration

public static final class  extends Enum
{

    private static final SHOW_ALL_OS_DECOR $VALUES[];
    public static final SHOW_ALL_OS_DECOR HIDE_ALL_OS_DECOR;
    public static final SHOW_ALL_OS_DECOR HIDE_STATUS_BAR;
    public static final SHOW_ALL_OS_DECOR SHOW_ALL_OS_DECOR;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/ui/window/WindowConfiguration$DecorVisibility, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        HIDE_ALL_OS_DECOR = new <init>("HIDE_ALL_OS_DECOR", 0);
        HIDE_STATUS_BAR = new <init>("HIDE_STATUS_BAR", 1);
        SHOW_ALL_OS_DECOR = new <init>("SHOW_ALL_OS_DECOR", 2);
        $VALUES = (new .VALUES[] {
            HIDE_ALL_OS_DECOR, HIDE_STATUS_BAR, SHOW_ALL_OS_DECOR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
