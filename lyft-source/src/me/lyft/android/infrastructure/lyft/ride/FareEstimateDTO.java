// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ride;

import me.lyft.android.domain.payment.Money;

public class FareEstimateDTO
{

    public final Money highMoney;
    public final Money lowMoney;

    public FareEstimateDTO(Money money, Money money1)
    {
        highMoney = money;
        lowMoney = money1;
    }
}
