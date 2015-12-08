// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;


// Referenced classes of package com.snapchat.android.model:
//            CashTransaction

public static final class  extends Enum
{

    private static final SENDER_CANCELED $VALUES[];
    public static final SENDER_CANCELED CANCELED;
    public static final SENDER_CANCELED COMPLETED;
    public static final SENDER_CANCELED EXPIRED;
    public static final SENDER_CANCELED INITIATED;
    public static final SENDER_CANCELED RECIPIENT_CANCELED;
    public static final SENDER_CANCELED SENDER_CANCELED;
    public static final SENDER_CANCELED WAITING_ON_RECIPIENT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/model/CashTransaction$TransactionStatus, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        INITIATED = new <init>("INITIATED", 0);
        WAITING_ON_RECIPIENT = new <init>("WAITING_ON_RECIPIENT", 1);
        COMPLETED = new <init>("COMPLETED", 2);
        EXPIRED = new <init>("EXPIRED", 3);
        CANCELED = new <init>("CANCELED", 4);
        RECIPIENT_CANCELED = new <init>("RECIPIENT_CANCELED", 5);
        SENDER_CANCELED = new <init>("SENDER_CANCELED", 6);
        $VALUES = (new .VALUES[] {
            INITIATED, WAITING_ON_RECIPIENT, COMPLETED, EXPIRED, CANCELED, RECIPIENT_CANCELED, SENDER_CANCELED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
