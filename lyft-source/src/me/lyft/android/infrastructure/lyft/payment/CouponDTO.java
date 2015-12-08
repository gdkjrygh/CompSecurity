// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.payment;


// Referenced classes of package me.lyft.android.infrastructure.lyft.payment:
//            MoneyDTO

public class CouponDTO
{

    public final String id;
    public final String lineItemTitle;
    public final MoneyDTO money;

    public CouponDTO(String s, MoneyDTO moneydto, String s1)
    {
        id = s;
        money = moneydto;
        lineItemTitle = s1;
    }

    public String getId()
    {
        return id;
    }

    public String getLineItemTitle()
    {
        return lineItemTitle;
    }

    public MoneyDTO getMoney()
    {
        return money;
    }
}
