// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo:
//            m

public interface aq
    extends m
{

    public abstract List getSleepLogEntities(Date date, int i, int j);

    public abstract List getSleepLogEntriesBetweenDates(Date date, Date date1);
}
