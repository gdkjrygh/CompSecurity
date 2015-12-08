// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.heartrate.HeartRateExerciseSummary;
import com.fitbit.data.repo.greendao.swap.SwapHeartRateExerciseSummary;
import com.fitbit.data.repo.greendao.swap.SwapHeartRateZone;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper, SwapHeartRateZoneMapper

public class HeartRateExerciseSummaryMapper
    implements EntityMapper
{

    private final SwapHeartRateZoneMapper zoneMapper = new SwapHeartRateZoneMapper();

    public HeartRateExerciseSummaryMapper()
    {
    }

    public HeartRateExerciseSummary fromDbEntity(SwapHeartRateExerciseSummary swapheartrateexercisesummary)
    {
        if (swapheartrateexercisesummary == null)
        {
            return null;
        }
        HeartRateExerciseSummary heartrateexercisesummary = new HeartRateExerciseSummary();
        heartrateexercisesummary.setEntityId(swapheartrateexercisesummary.getId());
        heartrateexercisesummary.a(swapheartrateexercisesummary.getDateTime());
        heartrateexercisesummary.a(swapheartrateexercisesummary.getAverageHeartRate().intValue());
        heartrateexercisesummary.b(swapheartrateexercisesummary.getRestingHeartRate().intValue());
        swapheartrateexercisesummary.resetZones();
        ArrayList arraylist = new ArrayList();
        SwapHeartRateZone swapheartratezone1;
        for (Iterator iterator = swapheartrateexercisesummary.getZones().iterator(); iterator.hasNext(); arraylist.add(zoneMapper.fromDbEntity(swapheartratezone1)))
        {
            swapheartratezone1 = (SwapHeartRateZone)iterator.next();
        }

        heartrateexercisesummary.b(arraylist);
        swapheartrateexercisesummary.resetCustomZones();
        arraylist = new ArrayList();
        SwapHeartRateZone swapheartratezone;
        for (swapheartrateexercisesummary = swapheartrateexercisesummary.getCustomZones().iterator(); swapheartrateexercisesummary.hasNext(); arraylist.add(zoneMapper.fromDbEntity(swapheartratezone)))
        {
            swapheartratezone = (SwapHeartRateZone)swapheartrateexercisesummary.next();
        }

        heartrateexercisesummary.a(arraylist);
        return heartrateexercisesummary;
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((SwapHeartRateExerciseSummary)obj);
    }

    public SwapHeartRateExerciseSummary toDbEntity(HeartRateExerciseSummary heartrateexercisesummary)
    {
        return toDbEntity(heartrateexercisesummary, new SwapHeartRateExerciseSummary());
    }

    public SwapHeartRateExerciseSummary toDbEntity(HeartRateExerciseSummary heartrateexercisesummary, SwapHeartRateExerciseSummary swapheartrateexercisesummary)
    {
        if (heartrateexercisesummary == null)
        {
            return null;
        }
        SwapHeartRateExerciseSummary swapheartrateexercisesummary1 = swapheartrateexercisesummary;
        if (swapheartrateexercisesummary == null)
        {
            swapheartrateexercisesummary1 = new SwapHeartRateExerciseSummary();
        }
        if (swapheartrateexercisesummary1.getId() == null)
        {
            swapheartrateexercisesummary1.setId(heartrateexercisesummary.getEntityId());
        }
        swapheartrateexercisesummary1.setDateTime(heartrateexercisesummary.a());
        swapheartrateexercisesummary1.setAverageHeartRate(Integer.valueOf(heartrateexercisesummary.h()));
        swapheartrateexercisesummary1.setRestingHeartRate(Integer.valueOf(heartrateexercisesummary.i()));
        return swapheartrateexercisesummary1;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((HeartRateExerciseSummary)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((HeartRateExerciseSummary)obj, (SwapHeartRateExerciseSummary)obj1);
    }
}
