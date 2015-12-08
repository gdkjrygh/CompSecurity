// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.billing;


// Referenced classes of package com.snapchat.android.billing:
//            InAppBillingManager

public static final class  extends Enum
{

    private static final LENS $VALUES[];
    public static final LENS LENS;
    public static final LENS REPLAY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/billing/InAppBillingManager$SkuType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        REPLAY = new <init>("REPLAY", 0);
        LENS = new <init>("LENS", 1);
        $VALUES = (new .VALUES[] {
            REPLAY, LENS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
