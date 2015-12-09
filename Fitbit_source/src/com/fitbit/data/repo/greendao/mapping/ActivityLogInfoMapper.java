// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.activity.ActivityLogInfo;
import com.fitbit.data.repo.greendao.activity.MostRecentActivity;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper

public class ActivityLogInfoMapper
    implements EntityMapper
{

    public ActivityLogInfoMapper()
    {
    }

    public ActivityLogInfo fromDbEntity(MostRecentActivity mostrecentactivity)
    {
        ActivityLogInfo activityloginfo = new ActivityLogInfo();
        activityloginfo.a(mostrecentactivity.getServerId().longValue());
        activityloginfo.a(mostrecentactivity.getName());
        activityloginfo.setEntityId(mostrecentactivity.getId());
        activityloginfo.setTimeCreated(mostrecentactivity.getTimeCreated());
        activityloginfo.setTimeUpdated(mostrecentactivity.getTimeUpdated());
        activityloginfo.b(mostrecentactivity.getCalories().intValue());
        activityloginfo.b(mostrecentactivity.getDescription());
        activityloginfo.a(mostrecentactivity.getDistance().doubleValue());
        activityloginfo.a(mostrecentactivity.getDuration().intValue());
        activityloginfo.a(com.fitbit.activity.ActivityLogInfo.Group.valueOf(mostrecentactivity.getGroup()));
        activityloginfo.a(mostrecentactivity.getDate());
        return activityloginfo;
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((MostRecentActivity)obj);
    }

    public MostRecentActivity toDbEntity(ActivityLogInfo activityloginfo)
    {
        return toDbEntity(activityloginfo, new MostRecentActivity());
    }

    public MostRecentActivity toDbEntity(ActivityLogInfo activityloginfo, MostRecentActivity mostrecentactivity)
    {
        MostRecentActivity mostrecentactivity1 = mostrecentactivity;
        if (mostrecentactivity == null)
        {
            mostrecentactivity1 = new MostRecentActivity();
        }
        if (mostrecentactivity1.getId() == null)
        {
            mostrecentactivity1.setId(activityloginfo.getEntityId());
        }
        mostrecentactivity1.setName(activityloginfo.a());
        mostrecentactivity1.setServerId(Long.valueOf(activityloginfo.c()));
        mostrecentactivity1.setCalories(Integer.valueOf(activityloginfo.d()));
        mostrecentactivity1.setDescription(activityloginfo.e());
        mostrecentactivity1.setDistance(Double.valueOf(activityloginfo.f()));
        mostrecentactivity1.setDuration(Integer.valueOf(activityloginfo.b()));
        mostrecentactivity1.setGroup(activityloginfo.g().name());
        mostrecentactivity1.setDate(activityloginfo.h());
        mostrecentactivity1.setTimeCreated(activityloginfo.getTimeCreated());
        mostrecentactivity1.setTimeUpdated(activityloginfo.getTimeUpdated());
        return mostrecentactivity1;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((ActivityLogInfo)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((ActivityLogInfo)obj, (MostRecentActivity)obj1);
    }
}
