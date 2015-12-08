// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.payment;


// Referenced classes of package me.lyft.android.infrastructure.lyft.payment:
//            MoneyDTO

public class TipOptionDTO
{

    public final MoneyDTO money;
    public final String title;

    public TipOptionDTO(MoneyDTO moneydto, String s)
    {
        money = moneydto;
        title = s;
    }

    public MoneyDTO getTipMoney()
    {
        return money;
    }

    public String getTitle()
    {
        return title;
    }
}
