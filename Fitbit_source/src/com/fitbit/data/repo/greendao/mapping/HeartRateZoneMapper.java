// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.heartrate.HeartRateZone;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper

public class HeartRateZoneMapper
    implements EntityMapper
{

    public HeartRateZoneMapper()
    {
    }

    public HeartRateZone fromDbEntity(com.fitbit.data.repo.greendao.heartrate.HeartRateZone heartratezone)
    {
        if (heartratezone == null)
        {
            return null;
        }
        HeartRateZone heartratezone1 = new HeartRateZone();
        heartratezone1.setEntityId(heartratezone.getId());
        heartratezone1.a(heartratezone.getHighValue().intValue());
        heartratezone1.b(heartratezone.getLowValue().intValue());
        heartratezone1.c(heartratezone.getTimeInZone().intValue());
        heartratezone1.a(heartratezone.getName());
        heartratezone1.a(heartratezone.getCaloriesOut().doubleValue());
        try
        {
            heartratezone1.a(com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.valueOf(heartratezone.getType()));
        }
        // Misplaced declaration of an exception variable
        catch (com.fitbit.data.repo.greendao.heartrate.HeartRateZone heartratezone)
        {
            heartratezone1.a(com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.UNKNOWN);
            return heartratezone1;
        }
        // Misplaced declaration of an exception variable
        catch (com.fitbit.data.repo.greendao.heartrate.HeartRateZone heartratezone)
        {
            heartratezone1.a(com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.UNKNOWN);
            return heartratezone1;
        }
        return heartratezone1;
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.heartrate.HeartRateZone)obj);
    }

    public com.fitbit.data.repo.greendao.heartrate.HeartRateZone toDbEntity(HeartRateZone heartratezone)
    {
        return toDbEntity(heartratezone, new com.fitbit.data.repo.greendao.heartrate.HeartRateZone());
    }

    public com.fitbit.data.repo.greendao.heartrate.HeartRateZone toDbEntity(HeartRateZone heartratezone, com.fitbit.data.repo.greendao.heartrate.HeartRateZone heartratezone1)
    {
        if (heartratezone == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.heartrate.HeartRateZone heartratezone2 = heartratezone1;
        if (heartratezone1 == null)
        {
            heartratezone2 = new com.fitbit.data.repo.greendao.heartrate.HeartRateZone();
        }
        if (heartratezone2.getId() == null)
        {
            heartratezone2.setId(heartratezone.getEntityId());
        }
        heartratezone2.setType(heartratezone.c().name());
        heartratezone2.setHighValue(Integer.valueOf(heartratezone.a()));
        heartratezone2.setLowValue(Integer.valueOf(heartratezone.b()));
        heartratezone2.setTimeInZone(Integer.valueOf(heartratezone.e()));
        heartratezone2.setSummaryId(heartratezone.d());
        heartratezone2.setName(heartratezone.f());
        heartratezone2.setCaloriesOut(Double.valueOf(heartratezone.g()));
        return heartratezone2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((HeartRateZone)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((HeartRateZone)obj, (com.fitbit.data.repo.greendao.heartrate.HeartRateZone)obj1);
    }
}
