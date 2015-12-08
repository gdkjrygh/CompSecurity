// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;

import me.lyft.android.common.INullable;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Preconditions;

// Referenced classes of package me.lyft.android.domain.payment:
//            NullMoney

public class Money
    implements INullable
{

    protected Integer amount;
    protected String amountCurrency;

    protected Money()
    {
    }

    public static Money create(int i, String s)
    {
        Preconditions.checkNotNull(s, "Money currency cannot be null");
        Money money = new Money();
        money.amountCurrency = s;
        money.amount = Integer.valueOf(i);
        return money;
    }

    public static String format(int i)
    {
        StringBuilder stringbuilder;
        int j;
        stringbuilder = new StringBuilder();
        j = i;
        if (i < 0)
        {
            stringbuilder.append('-');
            j = Math.abs(i);
        }
        stringbuilder.append('$');
        i = j;
        if (j < 0x186a0) goto _L2; else goto _L1
_L1:
        stringbuilder.append(j / 0x186a0);
        stringbuilder.append(',');
        j %= 0x186a0;
        if (j >= 1000) goto _L4; else goto _L3
_L3:
        stringbuilder.append("00");
        i = j;
_L2:
        stringbuilder.append(i / 100);
        i %= 100;
        stringbuilder.append('.');
        if (i < 10)
        {
            stringbuilder.append('0');
        }
        stringbuilder.append(i);
        return stringbuilder.toString();
_L4:
        i = j;
        if (j < 10000)
        {
            stringbuilder.append('0');
            i = j;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof Money)
        {
            obj = (Money)obj;
            boolean flag2 = Objects.equals(amount, ((Money) (obj)).amount);
            boolean flag3 = Objects.equals(amountCurrency, ((Money) (obj)).amountCurrency);
            flag = flag1;
            if (flag2)
            {
                flag = flag1;
                if (flag3)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public String format()
    {
        return format(getAmount().intValue());
    }

    public Integer getAmount()
    {
        return (Integer)Objects.firstNonNull(amount, Integer.valueOf(0));
    }

    public String getAmountCurrency()
    {
        return amountCurrency;
    }

    public boolean isNull()
    {
        return NullMoney.isNull(this);
    }

    public void setAmount(Integer integer)
    {
        amount = integer;
    }

    public void setAmountCurrency(String s)
    {
        amountCurrency = s;
    }
}
