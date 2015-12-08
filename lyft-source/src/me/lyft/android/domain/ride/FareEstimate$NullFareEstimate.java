// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.payment.NullMoney;

// Referenced classes of package me.lyft.android.domain.ride:
//            FareEstimate

final class  extends FareEstimate
{

    static final FareEstimate INSTANCE = new <init>(NullMoney.getInstance(), NullMoney.getInstance());

    public boolean isNull()
    {
        return true;
    }


    public (Money money, Money money1)
    {
        super(money, money1);
    }
}
