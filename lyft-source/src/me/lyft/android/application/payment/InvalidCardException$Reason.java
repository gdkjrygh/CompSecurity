// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.payment;


public final class  extends Enum
{

    private static final STRIPE_ERROR $VALUES[];
    public static final STRIPE_ERROR CLIENT_VALIDATION_ERROR;
    public static final STRIPE_ERROR INVALID_CARD_ERROR;
    public static final STRIPE_ERROR SERVER_VALIDATION_ERROR;
    public static final STRIPE_ERROR STRIPE_ERROR;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(me/lyft/android/application/payment/InvalidCardException$Reason, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CLIENT_VALIDATION_ERROR = new <init>("CLIENT_VALIDATION_ERROR", 0);
        SERVER_VALIDATION_ERROR = new <init>("SERVER_VALIDATION_ERROR", 1);
        INVALID_CARD_ERROR = new <init>("INVALID_CARD_ERROR", 2);
        STRIPE_ERROR = new <init>("STRIPE_ERROR", 3);
        $VALUES = (new .VALUES[] {
            CLIENT_VALIDATION_ERROR, SERVER_VALIDATION_ERROR, INVALID_CARD_ERROR, STRIPE_ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
