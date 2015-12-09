// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.activity;

import com.fitbit.data.domain.ActivityItem;
import com.fitbit.data.domain.Entity;
import com.fitbit.data.repo.b;
import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.ActivityItemMapper;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.activity:
//            DaoSession, ActivityItemDao, ActivityItem

public class ActivityItemGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements b
{

    public ActivityItemGreenDaoRepository()
    {
    }

    public void add(ActivityItem activityitem)
    {
        super.add(activityitem);
    }

    public volatile void add(Entity entity)
    {
        add((ActivityItem)entity);
    }

    public void addAll(List list)
    {
        super.addAll(list);
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getActivityDBSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new ActivityItemMapper();
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getActivityItemDao();
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.activity.ActivityItem activityitem)
    {
        return ((ActivityItemDao)getEntityDao()).getKey(activityitem);
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.activity.ActivityItem)obj);
    }
}
