// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.data.domain.FoodLogEntry;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo:
//            m

public interface v
    extends m
{

    public abstract void deleteByCurrentDate(Date date, boolean flag);

    public abstract List getEntriesBetweenDates(Date date, Date date1);

    public abstract FoodLogEntry getEntryClosesToDateFromPast(Date date);

    public abstract FoodLogEntry getLastFoodLogEntry(long l);
}
