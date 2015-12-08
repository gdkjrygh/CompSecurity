// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2.cash.square.data;


// Referenced classes of package com.snapchat.android.api2.cash.square.data:
//            CashPayment

public static final class  extends Enum
{

    private static final EXPIRED_WAITING_ON_RECIPIENT $VALUES[];
    public static final EXPIRED_WAITING_ON_RECIPIENT DECLINED;
    public static final EXPIRED_WAITING_ON_RECIPIENT EXPIRED_WAITING_ON_RECIPIENT;
    public static final EXPIRED_WAITING_ON_RECIPIENT EXPIRED_WAITING_ON_SENDER;
    public static final EXPIRED_WAITING_ON_RECIPIENT LIMIT_EXCEEDED;
    public static final EXPIRED_WAITING_ON_RECIPIENT OTHER;
    public static final EXPIRED_WAITING_ON_RECIPIENT RECIPIENT_CANCELED;
    public static final EXPIRED_WAITING_ON_RECIPIENT SENDER_CANCELED;
    public static final EXPIRED_WAITING_ON_RECIPIENT SQUARE_CANCELED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/api2/cash/square/data/CashPayment$CancellationReason, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SENDER_CANCELED = new <init>("SENDER_CANCELED", 0);
        RECIPIENT_CANCELED = new <init>("RECIPIENT_CANCELED", 1);
        SQUARE_CANCELED = new <init>("SQUARE_CANCELED", 2);
        LIMIT_EXCEEDED = new <init>("LIMIT_EXCEEDED", 3);
        DECLINED = new <init>("DECLINED", 4);
        OTHER = new <init>("OTHER", 5);
        EXPIRED_WAITING_ON_SENDER = new <init>("EXPIRED_WAITING_ON_SENDER", 6);
        EXPIRED_WAITING_ON_RECIPIENT = new <init>("EXPIRED_WAITING_ON_RECIPIENT", 7);
        $VALUES = (new .VALUES[] {
            SENDER_CANCELED, RECIPIENT_CANCELED, SQUARE_CANCELED, LIMIT_EXCEEDED, DECLINED, OTHER, EXPIRED_WAITING_ON_SENDER, EXPIRED_WAITING_ON_RECIPIENT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
