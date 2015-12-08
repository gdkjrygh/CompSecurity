// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.payment;


// Referenced classes of package me.lyft.android.infrastructure.lyft.payment:
//            MoneyDTO

public class PaymentDTO
{

    public final String chargeToken;
    public final String id;
    public final PaymentMethod method;
    public final MoneyDTO money;

    public PaymentDTO(PaymentMethod paymentmethod, String s, MoneyDTO moneydto, String s1)
    {
        method = paymentmethod;
        id = s;
        money = moneydto;
        chargeToken = s1;
    }

    public String getChargeToken()
    {
        return chargeToken;
    }

    public String getId()
    {
        return id;
    }

    public PaymentMethod getMethod()
    {
        return method;
    }

    public MoneyDTO getMoney()
    {
        return money;
    }
}
