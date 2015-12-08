// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.payment;


public class MoneyDTO
{

    public final Integer amount;
    public final String amountCurrency;

    public MoneyDTO(Integer integer, String s)
    {
        amount = integer;
        amountCurrency = s;
    }

    public Integer getAmount()
    {
        return amount;
    }

    public String getAmountCurrency()
    {
        return amountCurrency;
    }
}
