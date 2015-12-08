// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;


// Referenced classes of package me.lyft.android.domain.payment:
//            Money

public class NullMoney extends Money
{

    private static final NullMoney instance = new NullMoney();

    private NullMoney()
    {
        amount = Integer.valueOf(0);
        amountCurrency = "NONE";
    }

    public static Money getInstance()
    {
        return instance;
    }

    public static boolean isNull(Money money)
    {
        return instance.equals(money);
    }

}
