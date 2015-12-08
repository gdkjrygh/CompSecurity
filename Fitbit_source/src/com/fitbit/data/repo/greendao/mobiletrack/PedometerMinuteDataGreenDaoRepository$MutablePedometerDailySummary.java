// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mobiletrack;

import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.p;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.mobiletrack:
//            PedometerMinuteDataGreenDaoRepository

private class this._cls0 extends p
{

    final PedometerMinuteDataGreenDaoRepository this$0;

    private void setCalories(double d)
    {
        calories = d;
    }

    private void setDate(Date date)
    {
        this.date = date;
    }

    private void setDistance(Length length)
    {
        distance = length;
    }

    private void setSteps(int i)
    {
        steps = i;
    }





    public (int i, double d, Length length, Date date)
    {
        this$0 = PedometerMinuteDataGreenDaoRepository.this;
        super(i, d, length, date);
    }
}
