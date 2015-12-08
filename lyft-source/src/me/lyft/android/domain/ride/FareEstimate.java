// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import me.lyft.android.common.INullable;
import me.lyft.android.domain.payment.Money;

public class FareEstimate
    implements INullable
{

    Money highMoney;
    Money lowMoney;

    public FareEstimate(Money money, Money money1)
    {
        lowMoney = money1;
        highMoney = money;
    }

    public static FareEstimate empty()
    {
        return NullFareEstimate.INSTANCE;
    }

    public Money getHighMoney()
    {
        return highMoney;
    }

    public Money getLowMoney()
    {
        return lowMoney;
    }

    public boolean isNull()
    {
        return false;
    }

    private class NullFareEstimate extends FareEstimate
    {

        static final FareEstimate INSTANCE = new NullFareEstimate(NullMoney.getInstance(), NullMoney.getInstance());

        public boolean isNull()
        {
            return true;
        }


        public NullFareEstimate(Money money, Money money1)
        {
            super(money, money1);
        }
    }

}
