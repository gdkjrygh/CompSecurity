// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.ActivityItem;
import com.fitbit.data.domain.ActivityLevel;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper, ActivityItemMapper

public class ActivityLevelMapper
    implements EntityMapper
{

    private ActivityItemMapper itemMapper;

    public ActivityLevelMapper()
    {
    }

    public ActivityLevel fromDbEntity(com.fitbit.data.repo.greendao.activity.ActivityLevel activitylevel)
    {
        return fromDbEntity(activitylevel, null);
    }

    public ActivityLevel fromDbEntity(com.fitbit.data.repo.greendao.activity.ActivityLevel activitylevel, ActivityItem activityitem)
    {
        if (activitylevel == null)
        {
            return null;
        }
        ActivityLevel activitylevel1 = new ActivityLevel();
        activitylevel1.setEntityId(activitylevel.getId());
        activitylevel1.c(activitylevel.getMaxSpeedMPH());
        activitylevel1.b(activitylevel.getMinSpeedMPH());
        activitylevel1.a(activitylevel.getMets().doubleValue());
        activitylevel1.b(activitylevel.getName());
        activitylevel1.setServerId(activitylevel.getServerId().longValue());
        if (activityitem != null)
        {
            activitylevel1.a(activityitem);
            return activitylevel1;
        }
        if (itemMapper == null)
        {
            itemMapper = new ActivityItemMapper();
        }
        activitylevel1.a(itemMapper.fromDbEntity(activitylevel.getActivityItem(), activitylevel1));
        return activitylevel1;
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.activity.ActivityLevel)obj);
    }

    public com.fitbit.data.repo.greendao.activity.ActivityLevel toDbEntity(ActivityLevel activitylevel)
    {
        return toDbEntity(activitylevel, new com.fitbit.data.repo.greendao.activity.ActivityLevel());
    }

    public com.fitbit.data.repo.greendao.activity.ActivityLevel toDbEntity(ActivityLevel activitylevel, com.fitbit.data.repo.greendao.activity.ActivityLevel activitylevel1)
    {
        if (activitylevel == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.activity.ActivityLevel activitylevel2 = activitylevel1;
        if (activitylevel1 == null)
        {
            activitylevel2 = new com.fitbit.data.repo.greendao.activity.ActivityLevel();
        }
        if (activitylevel2.getId() == null)
        {
            activitylevel2.setId(activitylevel.getEntityId());
        }
        activitylevel2.setMaxSpeedMPH(activitylevel.g());
        activitylevel2.setMinSpeedMPH(activitylevel.f());
        activitylevel2.setMets(Double.valueOf(activitylevel.h()));
        activitylevel2.setName(activitylevel.d());
        activitylevel2.setActivityItemId(activitylevel.a().getEntityId());
        activitylevel2.setServerId(Long.valueOf(activitylevel.getServerId()));
        return activitylevel2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((ActivityLevel)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((ActivityLevel)obj, (com.fitbit.data.repo.greendao.activity.ActivityLevel)obj1);
    }
}
