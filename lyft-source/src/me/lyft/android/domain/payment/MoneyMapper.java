// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;

import me.lyft.android.common.Objects;
import me.lyft.android.common.Preconditions;
import me.lyft.android.infrastructure.lyft.payment.MoneyDTO;

// Referenced classes of package me.lyft.android.domain.payment:
//            NullMoney, Money

public class MoneyMapper
{

    public MoneyMapper()
    {
    }

    public static Money fromMoneyDTO(MoneyDTO moneydto)
    {
        if (moneydto == null)
        {
            return NullMoney.getInstance();
        } else
        {
            return Money.create(((Integer)Objects.firstNonNull(moneydto.getAmount(), Integer.valueOf(0))).intValue(), moneydto.getAmountCurrency());
        }
    }

    public static MoneyDTO fromMoneyDomain(Money money)
    {
        if (money == null || money.isNull())
        {
            return new MoneyDTO(Integer.valueOf(0), "NONE");
        } else
        {
            Preconditions.checkNotNull(money.getAmountCurrency(), "Money currency cannot be null");
            return new MoneyDTO(money.getAmount(), money.getAmountCurrency());
        }
    }
}
