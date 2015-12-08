// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.activity;

import com.fitbit.activity.ActivityLogInfo;
import com.fitbit.data.repo.ah;
import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.ActivityLogInfoMapper;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.util.w;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.DeleteQueryExt;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.activity:
//            DaoSession, MostRecentActivity

public class MostRecentActivitiesGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements ah
{

    public MostRecentActivitiesGreenDaoRepository()
    {
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getActivityDBSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new ActivityLogInfoMapper();
    }

    public transient void deleteAll(com.fitbit.activity.ActivityLogInfo.Group agroup[])
    {
        (new DeleteQueryExt(getEntityDao().queryBuilder().where(MostRecentActivityDao.Properties.Group.in((Object[])w.b(agroup)), new WhereCondition[0]).buildDelete())).executeDeleteAndClearCache();
    }

    public ActivityLogInfo getByServerId(List list, com.fitbit.activity.ActivityLogInfo.Group group)
    {
        list = getEntitiesWhereAnd(MostRecentActivityDao.Properties.Group.eq(group.name()), new WhereCondition[] {
            MostRecentActivityDao.Properties.ServerId.in(list)
        });
        if (list.size() > 0)
        {
            return (ActivityLogInfo)list.get(0);
        } else
        {
            return null;
        }
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getMostRecentActivityDao();
    }

    public List getOftenActivities(int i)
    {
        QueryBuilder querybuilder = getEntityDao().queryBuilder();
        querybuilder.where(MostRecentActivityDao.Properties.Group.eq(com.fitbit.activity.ActivityLogInfo.Group.b.name()), new WhereCondition[0]).orderDesc(new Property[] {
            MostRecentActivityDao.Properties.Date
        });
        if (i >= 0)
        {
            querybuilder.limit(i);
        }
        return fromDbEntities(querybuilder.list());
    }

    protected Long getPkFrom(MostRecentActivity mostrecentactivity)
    {
        return mostrecentactivity.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((MostRecentActivity)obj);
    }

    public List getRecentActivities(int i)
    {
        QueryBuilder querybuilder = getEntityDao().queryBuilder();
        querybuilder.where(MostRecentActivityDao.Properties.Group.eq(com.fitbit.activity.ActivityLogInfo.Group.a.name()), new WhereCondition[0]).orderDesc(new Property[] {
            MostRecentActivityDao.Properties.Date
        }).orderAsc(new Property[] {
            MostRecentActivityDao.Properties.Name
        });
        if (i >= 0)
        {
            querybuilder.limit(i);
        }
        return fromDbEntities(querybuilder.list());
    }
}
