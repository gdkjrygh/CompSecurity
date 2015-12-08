// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.data.domain.WeightLogEntry;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo:
//            m

public interface ax
    extends m
{

    public abstract WeightLogEntry getBMIForDateOrAfter(Date date);

    public abstract WeightLogEntry getBMIForDateOrBefore(Date date);

    public abstract WeightLogEntry getFirstWeightLogEntry();

    public abstract WeightLogEntry getLastWeightLogEntry();

    public abstract WeightLogEntry getManualLogEntryForDate(Date date);

    public abstract List getWeightLogEntriesBetweenDates(Date date, Date date1);

    public abstract WeightLogEntry getWeightLogEntryForDate(Date date);
}
