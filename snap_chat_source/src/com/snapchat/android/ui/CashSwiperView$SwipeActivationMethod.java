// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;


// Referenced classes of package com.snapchat.android.ui:
//            CashSwiperView

public static final class  extends Enum
{

    private static final HOLD $VALUES[];
    public static final HOLD DOLLARS;
    public static final HOLD HOLD;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/ui/CashSwiperView$SwipeActivationMethod, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DOLLARS = new <init>("DOLLARS", 0);
        HOLD = new <init>("HOLD", 1);
        $VALUES = (new .VALUES[] {
            DOLLARS, HOLD
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
