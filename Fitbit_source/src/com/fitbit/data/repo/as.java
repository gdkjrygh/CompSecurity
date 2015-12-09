// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.data.domain.TimeSeriesObject;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo:
//            ao

public interface as
    extends ao
{

    public abstract void deleteByForeignId(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, long l);

    public abstract void deleteByTypeBeforeDate(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date);

    public abstract void deleteByTypeBetweenDates(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, Date date1);

    public abstract List getByForeignId(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, long l);

    public abstract List getByType(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype);

    public abstract List getByType(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, Date date1);

    public abstract TimeSeriesObject getByTypeAfterDate(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date);

    public abstract List getByTypeAndDate(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date);

    public abstract TimeSeriesObject getByTypeBeforeDate(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date);

    public abstract List getByTypeForTime(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, Date date1);
}
