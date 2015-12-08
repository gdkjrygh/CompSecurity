// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2.cash.blockers;


public final class CardInputError extends Enum
{

    private static final CardInputError $VALUES[];
    public static final CardInputError BLOCKED_CARD;
    public static final CardInputError CARD_TYPE_UNSUPPORTED;
    public static final CardInputError INVALID_CARD_NUMBER;
    public static final CardInputError INVALID_EXPIRATION;
    public static final CardInputError INVALID_POSTAL_CODE;
    public static final CardInputError INVALID_SECURITY_CODE;
    public static final CardInputError NETWORK_FAILURE;
    public static final CardInputError TOO_MANY_ATTEMPTS;
    public static final CardInputError UNKNOWN;
    public static final CardInputError UNSUPPORTED_REGION;

    private CardInputError(String s, int i)
    {
        super(s, i);
    }

    public static CardInputError valueOf(String s)
    {
        return (CardInputError)Enum.valueOf(com/snapchat/android/api2/cash/blockers/CardInputError, s);
    }

    public static CardInputError[] values()
    {
        return (CardInputError[])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new CardInputError("UNKNOWN", 0);
        TOO_MANY_ATTEMPTS = new CardInputError("TOO_MANY_ATTEMPTS", 1);
        BLOCKED_CARD = new CardInputError("BLOCKED_CARD", 2);
        CARD_TYPE_UNSUPPORTED = new CardInputError("CARD_TYPE_UNSUPPORTED", 3);
        INVALID_CARD_NUMBER = new CardInputError("INVALID_CARD_NUMBER", 4);
        INVALID_EXPIRATION = new CardInputError("INVALID_EXPIRATION", 5);
        INVALID_SECURITY_CODE = new CardInputError("INVALID_SECURITY_CODE", 6);
        INVALID_POSTAL_CODE = new CardInputError("INVALID_POSTAL_CODE", 7);
        UNSUPPORTED_REGION = new CardInputError("UNSUPPORTED_REGION", 8);
        NETWORK_FAILURE = new CardInputError("NETWORK_FAILURE", 9);
        $VALUES = (new CardInputError[] {
            UNKNOWN, TOO_MANY_ATTEMPTS, BLOCKED_CARD, CARD_TYPE_UNSUPPORTED, INVALID_CARD_NUMBER, INVALID_EXPIRATION, INVALID_SECURITY_CODE, INVALID_POSTAL_CODE, UNSUPPORTED_REGION, NETWORK_FAILURE
        });
    }
}
