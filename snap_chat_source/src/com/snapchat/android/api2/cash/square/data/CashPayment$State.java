// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2.cash.square.data;


// Referenced classes of package com.snapchat.android.api2.cash.square.data:
//            CashPayment

public static final class  extends Enum
{

    private static final CANCELED $VALUES[];
    public static final CANCELED CANCELED;
    public static final CANCELED COMPLETED;
    public static final CANCELED PENDING;
    public static final CANCELED WAITING_ON_RECIPIENT;
    public static final CANCELED WAITING_ON_SENDER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/api2/cash/square/data/CashPayment$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        WAITING_ON_SENDER = new <init>("WAITING_ON_SENDER", 0);
        WAITING_ON_RECIPIENT = new <init>("WAITING_ON_RECIPIENT", 1);
        PENDING = new <init>("PENDING", 2);
        COMPLETED = new <init>("COMPLETED", 3);
        CANCELED = new <init>("CANCELED", 4);
        $VALUES = (new .VALUES[] {
            WAITING_ON_SENDER, WAITING_ON_RECIPIENT, PENDING, COMPLETED, CANCELED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
