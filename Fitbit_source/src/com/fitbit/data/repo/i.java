// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.data.domain.BodyFatLogEntry;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo:
//            m

public interface i
    extends m
{

    public abstract BodyFatLogEntry getBodyFatEntryForDate(Date date);

    public abstract BodyFatLogEntry getBodyFatEntryForDateExactly(Date date);

    public abstract List getBodyFatsBetweenDates(Date date, Date date1);

    public abstract BodyFatLogEntry getFirstBodyFatEntry();

    public abstract BodyFatLogEntry getManualBodyFatEntryForDate(Date date);
}
