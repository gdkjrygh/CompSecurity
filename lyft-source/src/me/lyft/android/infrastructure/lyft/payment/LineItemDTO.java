// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.payment;


// Referenced classes of package me.lyft.android.infrastructure.lyft.payment:
//            MoneyDTO

public class LineItemDTO
{

    public final Double courierDiscountRatio;
    public final MoneyDTO money;
    public final Double primeTimeRatio;
    public final String title;
    public final String type;

    public LineItemDTO(String s, MoneyDTO moneydto, String s1, Double double1, Double double2)
    {
        title = s;
        money = moneydto;
        type = s1;
        courierDiscountRatio = double1;
        primeTimeRatio = double2;
    }

    public MoneyDTO getMoney()
    {
        return money;
    }

    public String getTitle()
    {
        return title;
    }
}
