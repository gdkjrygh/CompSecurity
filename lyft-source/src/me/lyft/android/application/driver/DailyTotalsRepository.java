// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.driver;

import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.payment.NullMoney;
import me.lyft.android.rx.ReactiveProperty;
import rx.Observable;

// Referenced classes of package me.lyft.android.application.driver:
//            IDailyTotalsRepository

public class DailyTotalsRepository
    implements IDailyTotalsRepository
{

    private final ReactiveProperty dailyTotalSubject = ReactiveProperty.create(NullMoney.getInstance());

    public DailyTotalsRepository()
    {
    }

    public Money getDailyTotal()
    {
        return (Money)dailyTotalSubject.get();
    }

    public Observable observeDailyTotalChange()
    {
        return dailyTotalSubject.asObservable();
    }

    public void updateDailyTotal(Money money)
    {
        dailyTotalSubject.onNext(money);
    }
}
