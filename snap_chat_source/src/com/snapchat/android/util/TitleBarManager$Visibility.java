// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;


// Referenced classes of package com.snapchat.android.util:
//            TitleBarManager

public static final class  extends Enum
{

    private static final HIDDEN $VALUES[];
    public static final HIDDEN HIDDEN;
    public static final HIDDEN VISIBLE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/util/TitleBarManager$Visibility, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        VISIBLE = new <init>("VISIBLE", 0);
        HIDDEN = new <init>("HIDDEN", 1);
        $VALUES = (new .VALUES[] {
            VISIBLE, HIDDEN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
