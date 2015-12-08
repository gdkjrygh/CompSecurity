// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;

import java.util.List;
import me.lyft.android.common.INullable;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.payment.LineItem;
import me.lyft.android.infrastructure.lyft.driver.ExpressPayDTO;
import me.lyft.android.infrastructure.lyft.payment.LineItemDTO;
import rx.functions.Func1;

public class ExpressPay
    implements INullable
{

    private final List lineItems;
    private final String payoutInfoText;

    public ExpressPay(List list, String s)
    {
        lineItems = list;
        payoutInfoText = Strings.nullToEmpty(s);
    }

    public static ExpressPay empty()
    {
        return NullExpressPay.INSTANCE;
    }

    public static ExpressPay fromDTO(ExpressPayDTO expresspaydto)
    {
        return new ExpressPay(Iterables.select(expresspaydto.lineItems, new Func1() {

            public volatile Object call(Object obj)
            {
                return call((LineItemDTO)obj);
            }

            public LineItem call(LineItemDTO lineitemdto)
            {
                return LineItem.fromDTO(lineitemdto);
            }

        }), expresspaydto.payoutInfoText);
    }

    public List getLineItems()
    {
        return lineItems;
    }

    public String getPayoutInfoText()
    {
        return payoutInfoText;
    }

    public boolean isLastItem(int i)
    {
        return lineItems.size() == i;
    }

    public boolean isNull()
    {
        return false;
    }

    private class NullExpressPay extends ExpressPay
    {

        private static final ExpressPay INSTANCE = new NullExpressPay();

        public boolean isNull()
        {
            return true;
        }



        private NullExpressPay()
        {
            super(Collections.emptyList(), "");
        }
    }

}
