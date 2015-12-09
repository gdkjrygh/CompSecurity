// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.FitBitApplication;
import com.fitbit.data.domain.ActivityItem;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Type;
import com.fitbit.data.domain.b;
import com.fitbit.data.repo.greendao.activity.ActivityItemDao;
import com.fitbit.data.repo.greendao.activity.DaoSession;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper, ActivityItemMapper, MappingUtils

public class ActivityLogEntryMapper
    implements EntityMapper
{

    private final ActivityItemDao activityItemDao;
    private final ActivityItemMapper activityItemMapper = new ActivityItemMapper();

    public ActivityLogEntryMapper(DaoSession daosession)
    {
        activityItemDao = daosession.getActivityItemDao();
    }

    public ActivityLogEntry fromDbEntity(com.fitbit.data.repo.greendao.activity.ActivityLogEntry activitylogentry)
    {
        if (activitylogentry == null)
        {
            return null;
        }
        ActivityLogEntry activitylogentry1 = new ActivityLogEntry();
        activitylogentry1.a(activitylogentry.getHasDetails().booleanValue());
        activitylogentry1.setEntityId(activitylogentry.getId());
        activitylogentry1.setServerId(activitylogentry.getServerId().longValue());
        activitylogentry1.setLogDate(activitylogentry.getLogDate());
        activitylogentry1.setTimeCreated(activitylogentry.getTimeCreated());
        activitylogentry1.setTimeUpdated(activitylogentry.getTimeUpdated());
        activitylogentry1.setUuid(UUID.fromString(activitylogentry.getUuid()));
        if (activitylogentry.getActivityItem() != null)
        {
            activitylogentry1.a(activityItemMapper.fromDbEntity(activitylogentry.getActivityItem()));
        }
        activitylogentry1.c(activitylogentry.getCalories().intValue());
        activitylogentry1.a(new com.fitbit.data.domain.ActivityLogEntry.a(activitylogentry.getStartTime().getTime()));
        activitylogentry1.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.valueOf(activitylogentry.getEntityStatus().intValue()));
        if (activitylogentry.getDuration() != null)
        {
            activitylogentry1.a(activitylogentry.getDuration().intValue(), TimeUnit.SECONDS);
        }
        if (activitylogentry.getDistance() != null)
        {
            activitylogentry1.a(new Length(activitylogentry.getDistance().doubleValue(), com.fitbit.data.domain.Length.LengthUnits.KM));
        }
        activitylogentry1.d(activitylogentry.getCaloriesOnServer().intValue());
        activitylogentry1.b(activitylogentry.getManualCaloriesPopulated().booleanValue());
        Object obj = Type.getByTag(activitylogentry.getDetailsType());
        if (obj != null)
        {
            activitylogentry1.a(((Type) (obj)).getDetails(FitBitApplication.a(), activitylogentry.getDetailsId()));
        }
        activitylogentry1.a(activitylogentry.getHeartRateLink());
        activitylogentry1.b(activitylogentry.getCaloriesLink());
        activitylogentry1.e(activitylogentry.getFatBurnHeartRateZoneMinutes().intValue());
        activitylogentry1.f(activitylogentry.getCardioHeartRateZoneMinutes().intValue());
        activitylogentry1.g(activitylogentry.getPeakHeartRateZoneMinutes().intValue());
        int i;
        if (activitylogentry.getSteps() == null)
        {
            i = 0;
        } else
        {
            i = activitylogentry.getSteps().intValue();
        }
        activitylogentry1.a(i);
        if (activitylogentry.getLastModified() != null)
        {
            activitylogentry1.b(new com.fitbit.data.domain.ActivityLogEntry.a(activitylogentry.getLastModified().getTime()));
        }
        activitylogentry1.h(activitylogentry.getVeryActiveMinutes().intValue());
        activitylogentry1.i(activitylogentry.getModeratelyActiveMinutes().intValue());
        activitylogentry1.j(activitylogentry.getAverageHeartRate().intValue());
        obj = activitylogentry.getName();
        activitylogentry = ((com.fitbit.data.repo.greendao.activity.ActivityLogEntry) (obj));
        if (((String) (obj)).isEmpty())
        {
            activitylogentry = ((com.fitbit.data.repo.greendao.activity.ActivityLogEntry) (obj));
            if (activitylogentry1.a() != null)
            {
                activitylogentry = activitylogentry1.a().a();
            }
        }
        activitylogentry1.c(activitylogentry);
        return activitylogentry1;
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.activity.ActivityLogEntry)obj);
    }

    public com.fitbit.data.repo.greendao.activity.ActivityLogEntry toDbEntity(ActivityLogEntry activitylogentry)
    {
        return toDbEntity(activitylogentry, new com.fitbit.data.repo.greendao.activity.ActivityLogEntry());
    }

    public com.fitbit.data.repo.greendao.activity.ActivityLogEntry toDbEntity(ActivityLogEntry activitylogentry, com.fitbit.data.repo.greendao.activity.ActivityLogEntry activitylogentry1)
    {
        if (activitylogentry == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.activity.ActivityLogEntry activitylogentry2 = activitylogentry1;
        if (activitylogentry1 == null)
        {
            activitylogentry2 = new com.fitbit.data.repo.greendao.activity.ActivityLogEntry();
        }
        if (activitylogentry2.getId() == null)
        {
            activitylogentry2.setId(activitylogentry.getEntityId());
        }
        activitylogentry2.setHasDetails(Boolean.valueOf(activitylogentry.f()));
        activitylogentry2.setServerId(Long.valueOf(activitylogentry.getServerId()));
        activitylogentry2.setLogDate(activitylogentry.getLogDate());
        activitylogentry2.setTimeCreated(activitylogentry.getTimeCreated());
        activitylogentry2.setTimeUpdated(activitylogentry.getTimeUpdated());
        activitylogentry2.setUuid(MappingUtils.uuidToString(activitylogentry.getUuid()));
        if (activitylogentry.a() != null)
        {
            MappingUtils.assertEntityHasId(activitylogentry.a());
            activitylogentry2.setActivityItem((com.fitbit.data.repo.greendao.activity.ActivityItem)activityItemDao.load(activitylogentry.a().getEntityId()));
            activitylogentry2.setActivityItemServerId(Long.valueOf(activitylogentry.a().getServerId()));
        } else
        {
            activitylogentry2.setActivityItem(null);
            activitylogentry2.setActivityItemId(null);
            activitylogentry2.setActivityItemServerId(null);
        }
        if (activitylogentry.b() != null)
        {
            activitylogentry2.setDistance(Double.valueOf(activitylogentry.b().a(com.fitbit.data.domain.Length.LengthUnits.KM).b()));
        } else
        {
            activitylogentry2.setDistance(null);
        }
        activitylogentry2.setCalories(Integer.valueOf(activitylogentry.k()));
        activitylogentry2.setStartTime(new Date(activitylogentry.d().a()));
        activitylogentry2.setEntityStatus(Integer.valueOf(activitylogentry.getEntityStatus().getCode()));
        activitylogentry2.setDuration(Integer.valueOf(activitylogentry.a(TimeUnit.SECONDS)));
        activitylogentry2.setCaloriesOnServer(Integer.valueOf(activitylogentry.n()));
        activitylogentry2.setManualCaloriesPopulated(Boolean.valueOf(activitylogentry.o()));
        activitylogentry1 = activitylogentry.p();
        if (activitylogentry1 != null)
        {
            activitylogentry2.setDetailsId(activitylogentry1.a());
            activitylogentry2.setDetailsType(activitylogentry1.b().value);
        }
        activitylogentry2.setHeartRateLink(activitylogentry.q());
        activitylogentry2.setCaloriesLink(activitylogentry.r());
        activitylogentry2.setFatBurnHeartRateZoneMinutes(Integer.valueOf(activitylogentry.s()));
        activitylogentry2.setCardioHeartRateZoneMinutes(Integer.valueOf(activitylogentry.t()));
        activitylogentry2.setPeakHeartRateZoneMinutes(Integer.valueOf(activitylogentry.u()));
        activitylogentry2.setSteps(Integer.valueOf(activitylogentry.c()));
        if (activitylogentry.v() != null)
        {
            activitylogentry2.setLastModified(new Date(activitylogentry.v().a()));
        } else
        {
            activitylogentry2.setLastModified(null);
        }
        activitylogentry2.setVeryActiveMinutes(Integer.valueOf(activitylogentry.w()));
        activitylogentry2.setModeratelyActiveMinutes(Integer.valueOf(activitylogentry.x()));
        activitylogentry2.setAverageHeartRate(Integer.valueOf(activitylogentry.y()));
        activitylogentry2.setName(activitylogentry.z());
        return activitylogentry2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((ActivityLogEntry)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((ActivityLogEntry)obj, (com.fitbit.data.repo.greendao.activity.ActivityLogEntry)obj1);
    }
}
