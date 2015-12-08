// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import com.fitbit.data.domain.Goal;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.GoalMapper;
import com.fitbit.data.repo.z;
import com.fitbit.util.o;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.DeleteQueryExt;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            AbstractEntityGreenDaoRepository, DaoSession, Goal

public class GoalGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements z
{

    public GoalGreenDaoRepository()
    {
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new GoalMapper();
    }

    public void deleteByDate(Date date, boolean flag)
    {
        throw new UnsupportedOperationException();
    }

    public void deleteOlderThanDate(Date date, boolean flag)
    {
        date = o.a(date);
        QueryBuilder querybuilder = getEntityDao().queryBuilder();
        ArrayList arraylist = new ArrayList();
        if (flag)
        {
            arraylist.add(GoalDao.Properties.EntityStatus.eq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.SYNCED.getCode())));
        }
        (new DeleteQueryExt(querybuilder.where(GoalDao.Properties.TimeCreated.lt(date), (WhereCondition[])arraylist.toArray(new WhereCondition[0])).buildDelete())).executeDeleteAndClearCache();
    }

    public transient List getByDate(Date date, com.fitbit.data.domain.Entity.EntityStatus aentitystatus[])
    {
        throw new UnsupportedOperationException();
    }

    public List getByType(com.fitbit.data.domain.Goal.GoalType goaltype)
    {
        return fromDbEntities(getEntityDao().queryBuilder().where(GoalDao.Properties.GoalType.eq(goaltype.name()), new WhereCondition[0]).build().list());
    }

    public Goal getByTypeAndDate(com.fitbit.data.domain.Goal.GoalType goaltype, Date date)
    {
        QueryBuilder querybuilder = getEntityDao().queryBuilder();
        goaltype = querybuilder.where(querybuilder.or(GoalDao.Properties.StartDate.lt(date), GoalDao.Properties.StartDate.eq(date), new WhereCondition[0]), new WhereCondition[] {
            querybuilder.or(GoalDao.Properties.DueDate.gt(date), GoalDao.Properties.DueDate.eq(date), new WhereCondition[0]), GoalDao.Properties.GoalType.eq(goaltype.name())
        }).build().list();
        if (goaltype.isEmpty())
        {
            return null;
        } else
        {
            return (Goal)fromDbEntities(goaltype).get(0);
        }
    }

    public Goal getByTypeAndDate(com.fitbit.data.domain.Goal.GoalType goaltype, Date date, Date date1)
    {
        QueryBuilder querybuilder = getEntityDao().queryBuilder();
        WhereCondition wherecondition = GoalDao.Properties.StartDate.isNull();
        Property property = GoalDao.Properties.StartDate;
        if (date == null)
        {
            date = new Date(0L);
        }
        date = querybuilder.or(wherecondition, property.eq(date), new WhereCondition[0]);
        wherecondition = GoalDao.Properties.DueDate.isNull();
        property = GoalDao.Properties.DueDate;
        if (date1 == null)
        {
            date1 = new Date(0L);
        }
        goaltype = querybuilder.where(date, new WhereCondition[] {
            querybuilder.or(wherecondition, property.eq(date1), new WhereCondition[0]), GoalDao.Properties.GoalType.eq(goaltype.name())
        }).build().list();
        if (goaltype.isEmpty())
        {
            return null;
        } else
        {
            return (Goal)fromDbEntities(goaltype).get(0);
        }
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getGoalDao();
    }

    public Goal getLastGoalByType(com.fitbit.data.domain.Goal.GoalType goaltype)
    {
        goaltype = getEntityDao().queryBuilder().where(GoalDao.Properties.StartDate.isNotNull(), new WhereCondition[] {
            GoalDao.Properties.GoalType.eq(goaltype.name())
        }).orderDesc(new Property[] {
            GoalDao.Properties.StartDate
        }).build().list();
        if (goaltype.isEmpty())
        {
            return null;
        } else
        {
            return (Goal)fromDbEntities(goaltype).get(0);
        }
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.Goal goal)
    {
        return goal.getServerId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.Goal)obj);
    }
}
