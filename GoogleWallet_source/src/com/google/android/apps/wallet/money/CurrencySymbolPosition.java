// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.money;


public final class CurrencySymbolPosition extends Enum
{

    private static final CurrencySymbolPosition $VALUES[];
    public static final CurrencySymbolPosition FOLLOW_AMOUNT;
    public static final CurrencySymbolPosition PRECEDE_AMOUNT;
    public static final CurrencySymbolPosition UNKNOWN;

    private CurrencySymbolPosition(String s, int i)
    {
        super(s, i);
    }

    public static CurrencySymbolPosition valueOf(String s)
    {
        return (CurrencySymbolPosition)Enum.valueOf(com/google/android/apps/wallet/money/CurrencySymbolPosition, s);
    }

    public static CurrencySymbolPosition[] values()
    {
        return (CurrencySymbolPosition[])$VALUES.clone();
    }

    static 
    {
        PRECEDE_AMOUNT = new CurrencySymbolPosition("PRECEDE_AMOUNT", 0);
        FOLLOW_AMOUNT = new CurrencySymbolPosition("FOLLOW_AMOUNT", 1);
        UNKNOWN = new CurrencySymbolPosition("UNKNOWN", 2);
        $VALUES = (new CurrencySymbolPosition[] {
            PRECEDE_AMOUNT, FOLLOW_AMOUNT, UNKNOWN
        });
    }
}
