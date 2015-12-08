// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;

import me.lyft.android.common.Objects;

// Referenced classes of package me.lyft.android.domain.payment:
//            NullMoney, Money

public class Coupon
{

    private String id;
    private String lineItemTitle;
    private Money money;

    public Coupon()
    {
    }

    public String getId()
    {
        return (String)Objects.firstNonNull(id, "");
    }

    public String getLineItemTitle()
    {
        return (String)Objects.firstNonNull(lineItemTitle, "");
    }

    public Money getMoney()
    {
        return (Money)Objects.firstNonNull(money, NullMoney.getInstance());
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLineItemTitle(String s)
    {
        lineItemTitle = s;
    }

    public void setMoney(Money money1)
    {
        money = money1;
    }
}
