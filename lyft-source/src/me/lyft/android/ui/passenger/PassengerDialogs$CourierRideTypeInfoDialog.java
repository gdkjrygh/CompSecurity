// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.common.Objects;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.payment.NullMoney;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerDialogs

public class isComparison extends PassengerDialogs
{

    private Money comparisonMoney;
    private String comparisonText;
    private Money fareMoney;
    private boolean isComparison;

    public Money getComparisonMoney()
    {
        return (Money)Objects.firstNonNull(comparisonMoney, NullMoney.getInstance());
    }

    public String getComparisonText()
    {
        return (String)Objects.firstNonNull(comparisonText, "");
    }

    public Money getFareMoney()
    {
        return (Money)Objects.firstNonNull(fareMoney, NullMoney.getInstance());
    }

    public boolean isComparison()
    {
        return isComparison;
    }

    public ()
    {
        isComparison = false;
    }

    public isComparison(Money money, Money money1, String s)
    {
        isComparison = false;
        fareMoney = money;
        comparisonMoney = money1;
        comparisonText = s;
        isComparison = true;
    }
}
