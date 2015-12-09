// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.user;


public final class  extends Enum
{

    private static final GENERAL_CREDIT_CARD_ERROR $VALUES[];
    public static final GENERAL_CREDIT_CARD_ERROR CARD_ON_FILE_LIMIT_EXCEEDED;
    public static final GENERAL_CREDIT_CARD_ERROR DUPLICATE_NICKNAME;
    public static final GENERAL_CREDIT_CARD_ERROR GENERAL_CREDIT_CARD_ERROR;
    public static final GENERAL_CREDIT_CARD_ERROR GET_CARD_LIST_ERROR;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/android/sdk/core/user/UserProfileManager$CreditCardErrorType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DUPLICATE_NICKNAME = new <init>("DUPLICATE_NICKNAME", 0);
        GET_CARD_LIST_ERROR = new <init>("GET_CARD_LIST_ERROR", 1);
        CARD_ON_FILE_LIMIT_EXCEEDED = new <init>("CARD_ON_FILE_LIMIT_EXCEEDED", 2);
        GENERAL_CREDIT_CARD_ERROR = new <init>("GENERAL_CREDIT_CARD_ERROR", 3);
        $VALUES = (new .VALUES[] {
            DUPLICATE_NICKNAME, GET_CARD_LIST_ERROR, CARD_ON_FILE_LIMIT_EXCEEDED, GENERAL_CREDIT_CARD_ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
