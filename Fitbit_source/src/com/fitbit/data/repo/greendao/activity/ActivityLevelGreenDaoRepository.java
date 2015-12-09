// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.activity;

import com.fitbit.data.repo.c;
import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.ActivityLevelMapper;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;

// Referenced classes of package com.fitbit.data.repo.greendao.activity:
//            DaoSession, ActivityLevelDao, ActivityLevel

public class ActivityLevelGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements c
{

    public ActivityLevelGreenDaoRepository()
    {
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getActivityDBSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new ActivityLevelMapper();
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getActivityLevelDao();
    }

    protected Long getPkFrom(ActivityLevel activitylevel)
    {
        return ((ActivityLevelDao)getEntityDao()).getKey(activitylevel);
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((ActivityLevel)obj);
    }
}
