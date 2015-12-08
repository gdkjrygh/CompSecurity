// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import me.lyft.android.domain.payment.Money;

public class TipOption
{

    private final Money money;
    private final String title;

    public TipOption(Money money1, String s)
    {
        money = money1;
        title = s;
    }

    public Money getTipMoney()
    {
        return money;
    }

    public String getTitle()
    {
        return title;
    }
}
