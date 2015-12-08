// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.ValueGoal;
import java.util.Date;

// Referenced classes of package com.fitbit.data.bl:
//            fa, t, bs

public class cp extends fa
{

    public cp(bs bs, Date date, Date date1, boolean flag)
    {
        super(bs, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_IN, date, date1, flag);
    }

    public cp(bs bs, boolean flag)
    {
        super(bs, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_IN, flag);
    }

    protected ValueGoal a(Date date)
    {
        return t.a().b(date);
    }
}
