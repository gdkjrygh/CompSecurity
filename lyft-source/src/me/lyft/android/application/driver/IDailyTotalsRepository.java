// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.driver;

import me.lyft.android.domain.payment.Money;
import rx.Observable;

public interface IDailyTotalsRepository
{

    public abstract Money getDailyTotal();

    public abstract Observable observeDailyTotalChange();

    public abstract void updateDailyTotal(Money money);
}
