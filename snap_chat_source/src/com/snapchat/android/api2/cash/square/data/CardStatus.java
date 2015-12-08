// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2.cash.square.data;


public final class CardStatus extends Enum
{

    private static final CardStatus $VALUES[];
    public static final CardStatus EXPIRED;
    public static final CardStatus INVALID;
    public static final CardStatus NOT_LINKED;
    public static final CardStatus UNSUPPORTED_FOR_ROLE;

    private CardStatus(String s, int i)
    {
        super(s, i);
    }

    public static CardStatus valueOf(String s)
    {
        return (CardStatus)Enum.valueOf(com/snapchat/android/api2/cash/square/data/CardStatus, s);
    }

    public static CardStatus[] values()
    {
        return (CardStatus[])$VALUES.clone();
    }

    static 
    {
        NOT_LINKED = new CardStatus("NOT_LINKED", 0);
        EXPIRED = new CardStatus("EXPIRED", 1);
        UNSUPPORTED_FOR_ROLE = new CardStatus("UNSUPPORTED_FOR_ROLE", 2);
        INVALID = new CardStatus("INVALID", 3);
        $VALUES = (new CardStatus[] {
            NOT_LINKED, EXPIRED, UNSUPPORTED_FOR_ROLE, INVALID
        });
    }
}
