// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2.cash.square.data;


// Referenced classes of package com.snapchat.android.api2.cash.square.data:
//            CashPayment

public static final class  extends Enum
{

    private static final SEND $VALUES[];
    public static final SEND SEND;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/api2/cash/square/data/CashPayment$Action, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SEND = new <init>("SEND");
        $VALUES = (new .VALUES[] {
            SEND
        });
    }

    private (String s)
    {
        super(s, 0);
    }
}
