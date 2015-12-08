// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;


// Referenced classes of package me.lyft.android.domain.payment:
//            Money

public abstract class Payment
{

    private final Money money;

    protected Payment(Money money1)
    {
        money = money1;
    }

    public Money getMoney()
    {
        return money;
    }
}
