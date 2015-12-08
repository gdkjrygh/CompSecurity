// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;

import me.lyft.android.common.INullable;
import me.lyft.android.common.Objects;
import me.lyft.android.infrastructure.lyft.payment.LineItemDTO;

// Referenced classes of package me.lyft.android.domain.payment:
//            MoneyMapper, Money

public class LineItem
    implements INullable
{

    Money amount;
    String title;

    public LineItem(Money money, String s)
    {
        amount = money;
        title = s;
    }

    public static LineItem empty()
    {
        return NullLineItem.INSTANCE;
    }

    public static LineItem fromDTO(LineItemDTO lineitemdto)
    {
        if (lineitemdto == null)
        {
            return empty();
        } else
        {
            return new LineItem(MoneyMapper.fromMoneyDTO(lineitemdto.getMoney()), (String)Objects.firstNonNull(lineitemdto.getTitle(), ""));
        }
    }

    public Money getAmount()
    {
        return amount;
    }

    public String getTitle()
    {
        return title;
    }

    public boolean isNull()
    {
        return false;
    }

    private class NullLineItem extends LineItem
    {

        private static final LineItem INSTANCE = new NullLineItem();

        public boolean isNull()
        {
            return true;
        }



        public NullLineItem()
        {
            super(NullMoney.getInstance(), "");
        }
    }

}
