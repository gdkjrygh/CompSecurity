// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.heartrate.HeartRateDailySummary;
import com.fitbit.data.repo.greendao.heartrate.HeartRateZone;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper, HeartRateZoneMapper

public class HeartRateDailySummaryMapper
    implements EntityMapper
{

    private final HeartRateZoneMapper zoneMapper = new HeartRateZoneMapper();

    public HeartRateDailySummaryMapper()
    {
    }

    public HeartRateDailySummary fromDbEntity(com.fitbit.data.repo.greendao.heartrate.HeartRateDailySummary heartratedailysummary)
    {
        if (heartratedailysummary == null)
        {
            return null;
        }
        HeartRateDailySummary heartratedailysummary1 = new HeartRateDailySummary();
        heartratedailysummary1.setEntityId(heartratedailysummary.getId());
        heartratedailysummary1.a(heartratedailysummary.getDateTime());
        heartratedailysummary1.a(heartratedailysummary.getAverageHeartRate().intValue());
        heartratedailysummary1.b(heartratedailysummary.getRestingHeartRate().intValue());
        heartratedailysummary.resetZones();
        ArrayList arraylist = new ArrayList();
        HeartRateZone heartratezone1;
        for (Iterator iterator = heartratedailysummary.getZones().iterator(); iterator.hasNext(); arraylist.add(zoneMapper.fromDbEntity(heartratezone1)))
        {
            heartratezone1 = (HeartRateZone)iterator.next();
        }

        heartratedailysummary1.b(arraylist);
        heartratedailysummary.resetCustomZones();
        arraylist = new ArrayList();
        HeartRateZone heartratezone;
        for (heartratedailysummary = heartratedailysummary.getCustomZones().iterator(); heartratedailysummary.hasNext(); arraylist.add(zoneMapper.fromDbEntity(heartratezone)))
        {
            heartratezone = (HeartRateZone)heartratedailysummary.next();
        }

        heartratedailysummary1.a(arraylist);
        return heartratedailysummary1;
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.heartrate.HeartRateDailySummary)obj);
    }

    public com.fitbit.data.repo.greendao.heartrate.HeartRateDailySummary toDbEntity(HeartRateDailySummary heartratedailysummary)
    {
        return toDbEntity(heartratedailysummary, new com.fitbit.data.repo.greendao.heartrate.HeartRateDailySummary());
    }

    public com.fitbit.data.repo.greendao.heartrate.HeartRateDailySummary toDbEntity(HeartRateDailySummary heartratedailysummary, com.fitbit.data.repo.greendao.heartrate.HeartRateDailySummary heartratedailysummary1)
    {
        if (heartratedailysummary == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.heartrate.HeartRateDailySummary heartratedailysummary2 = heartratedailysummary1;
        if (heartratedailysummary1 == null)
        {
            heartratedailysummary2 = new com.fitbit.data.repo.greendao.heartrate.HeartRateDailySummary();
        }
        if (heartratedailysummary2.getId() == null)
        {
            heartratedailysummary2.setId(heartratedailysummary.getEntityId());
        }
        heartratedailysummary2.setDateTime(heartratedailysummary.a());
        heartratedailysummary2.setAverageHeartRate(Integer.valueOf(heartratedailysummary.h()));
        heartratedailysummary2.setRestingHeartRate(Integer.valueOf(heartratedailysummary.i()));
        return heartratedailysummary2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((HeartRateDailySummary)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((HeartRateDailySummary)obj, (com.fitbit.data.repo.greendao.heartrate.HeartRateDailySummary)obj1);
    }
}
