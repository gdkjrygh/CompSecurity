// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.data.domain.p;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo:
//            ao, m

public interface ak
    extends ao, m
{

    public abstract void clearCachedDailySummary();

    public abstract p getDailySummary(Date date);

    public abstract List getMinuteDataStartingFrom(long l);

    public abstract List getPendingPedometerMinutesDataForDate(Date date);
}
