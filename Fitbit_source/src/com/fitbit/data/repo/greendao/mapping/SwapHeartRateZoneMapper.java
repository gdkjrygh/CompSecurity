// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.heartrate.HeartRateZone;
import com.fitbit.data.repo.greendao.swap.SwapHeartRateZone;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper

public class SwapHeartRateZoneMapper
    implements EntityMapper
{

    public SwapHeartRateZoneMapper()
    {
    }

    public HeartRateZone fromDbEntity(SwapHeartRateZone swapheartratezone)
    {
        if (swapheartratezone == null)
        {
            return null;
        }
        HeartRateZone heartratezone = new HeartRateZone();
        heartratezone.setEntityId(swapheartratezone.getId());
        heartratezone.a(swapheartratezone.getHighValue().intValue());
        heartratezone.b(swapheartratezone.getLowValue().intValue());
        heartratezone.c(swapheartratezone.getTimeInZone().intValue());
        heartratezone.a(swapheartratezone.getName());
        heartratezone.a(swapheartratezone.getCaloriesOut().doubleValue());
        try
        {
            heartratezone.a(com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.valueOf(swapheartratezone.getType()));
        }
        // Misplaced declaration of an exception variable
        catch (SwapHeartRateZone swapheartratezone)
        {
            heartratezone.a(com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.UNKNOWN);
            return heartratezone;
        }
        // Misplaced declaration of an exception variable
        catch (SwapHeartRateZone swapheartratezone)
        {
            heartratezone.a(com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.UNKNOWN);
            return heartratezone;
        }
        return heartratezone;
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((SwapHeartRateZone)obj);
    }

    public SwapHeartRateZone toDbEntity(HeartRateZone heartratezone)
    {
        return toDbEntity(heartratezone, new SwapHeartRateZone());
    }

    public SwapHeartRateZone toDbEntity(HeartRateZone heartratezone, SwapHeartRateZone swapheartratezone)
    {
        if (heartratezone == null)
        {
            return null;
        }
        SwapHeartRateZone swapheartratezone1 = swapheartratezone;
        if (swapheartratezone == null)
        {
            swapheartratezone1 = new SwapHeartRateZone();
        }
        if (swapheartratezone1.getId() == null)
        {
            swapheartratezone1.setId(heartratezone.getEntityId());
        }
        swapheartratezone1.setType(heartratezone.c().name());
        swapheartratezone1.setHighValue(Integer.valueOf(heartratezone.a()));
        swapheartratezone1.setLowValue(Integer.valueOf(heartratezone.b()));
        swapheartratezone1.setTimeInZone(Integer.valueOf(heartratezone.e()));
        swapheartratezone1.setSummaryId(heartratezone.d());
        swapheartratezone1.setName(heartratezone.f());
        swapheartratezone1.setCaloriesOut(Double.valueOf(heartratezone.g()));
        return swapheartratezone1;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((HeartRateZone)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((HeartRateZone)obj, (SwapHeartRateZone)obj1);
    }
}
