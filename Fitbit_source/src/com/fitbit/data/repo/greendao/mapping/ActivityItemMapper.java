// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.ActivityItem;
import com.fitbit.data.repo.greendao.activity.ActivityLevel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper, ActivityLevelMapper

public class ActivityItemMapper
    implements EntityMapper
{

    private ActivityLevelMapper levelMapper;

    public ActivityItemMapper()
    {
    }

    public ActivityItem fromDbEntity(com.fitbit.data.repo.greendao.activity.ActivityItem activityitem)
    {
        return fromDbEntity(activityitem, null);
    }

    public ActivityItem fromDbEntity(com.fitbit.data.repo.greendao.activity.ActivityItem activityitem, com.fitbit.data.domain.ActivityLevel activitylevel)
    {
        if (activityitem == null)
        {
            return null;
        }
        ActivityItem activityitem1 = new ActivityItem();
        activityitem1.setEntityId(activityitem.getId());
        activityitem1.setServerId(activityitem.getServerId().longValue());
        activityitem1.a(activityitem.getHasSpeed().booleanValue());
        activityitem1.a(activityitem.getName());
        activityitem1.a(activityitem.getMets().doubleValue());
        activityitem1.b(activityitem.getPopulated().booleanValue());
        Object obj = activityitem.getActivityLevelList();
        if (obj != null)
        {
            activityitem = new ArrayList(((List) (obj)).size());
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
            {
                ActivityLevel activitylevel1 = (ActivityLevel)((Iterator) (obj)).next();
                if (activitylevel != null && activitylevel.getEntityId().equals(activitylevel1.getId()))
                {
                    activityitem.add(activitylevel);
                } else
                {
                    levelMapper = new ActivityLevelMapper();
                    activityitem.add(levelMapper.fromDbEntity(activitylevel1, activityitem1));
                }
            }

            activityitem1.a(activityitem);
        }
        return activityitem1;
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.activity.ActivityItem)obj);
    }

    public com.fitbit.data.repo.greendao.activity.ActivityItem toDbEntity(ActivityItem activityitem)
    {
        return toDbEntity(activityitem, new com.fitbit.data.repo.greendao.activity.ActivityItem());
    }

    public com.fitbit.data.repo.greendao.activity.ActivityItem toDbEntity(ActivityItem activityitem, com.fitbit.data.repo.greendao.activity.ActivityItem activityitem1)
    {
        if (activityitem == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.activity.ActivityItem activityitem2 = activityitem1;
        if (activityitem1 == null)
        {
            activityitem2 = new com.fitbit.data.repo.greendao.activity.ActivityItem();
        }
        if (activityitem2.getId() == null)
        {
            activityitem2.setId(activityitem.getEntityId());
        }
        activityitem2.setServerId(Long.valueOf(activityitem.getServerId()));
        activityitem2.setHasSpeed(Boolean.valueOf(activityitem.c()));
        activityitem2.setName(activityitem.a());
        activityitem2.setMets(Double.valueOf(activityitem.b()));
        activityitem2.setPopulated(Boolean.valueOf(activityitem.e()));
        return activityitem2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((ActivityItem)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((ActivityItem)obj, (com.fitbit.data.repo.greendao.activity.ActivityItem)obj1);
    }
}
