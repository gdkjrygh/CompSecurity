// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.exercise;

import com.fitbit.data.repo.ar;
import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.SplitMapper;
import com.fitbit.runtrack.Split;
import com.fitbit.runtrack.data.ExerciseStat;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.data.repo.greendao.exercise:
//            DaoSession, Split

public class SplitGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements ar
{

    public SplitGreenDaoRepository()
    {
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getExerciseSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new SplitMapper();
    }

    public List getCompletedSplits(UUID uuid)
    {
        return getEntitiesWhereAnd(SplitDao.Properties.SessionId.eq(String.valueOf(uuid)), new WhereCondition[] {
            SplitDao.Properties.StartEventId.isNotNull()
        });
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getSplitDao();
    }

    public ExerciseStat getOverallStat(UUID uuid)
    {
        if (uuid == null)
        {
            return null;
        }
        uuid = (com.fitbit.data.repo.greendao.exercise.Split)getEntityDao().queryBuilder().where(SplitDao.Properties.SessionId.eq(String.valueOf(uuid)), new WhereCondition[] {
            SplitDao.Properties.StartEventId.isNull()
        }).unique();
        uuid = (Split)getMapper().fromDbEntity(uuid);
        if (uuid == null || uuid.a() == null)
        {
            uuid = null;
        } else
        {
            uuid = uuid.b();
        }
        return uuid;
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.exercise.Split split)
    {
        return split.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.exercise.Split)obj);
    }

    public Split getSplit(UUID uuid, Long long1)
    {
        if (long1 != null)
        {
            return (Split)getDistinctEntityWhere(SplitDao.Properties.SessionId.eq(String.valueOf(uuid)), new WhereCondition[] {
                SplitDao.Properties.StartEventId.eq(long1)
            });
        } else
        {
            return (Split)getDistinctEntityWhere(SplitDao.Properties.SessionId.eq(String.valueOf(uuid)), new WhereCondition[] {
                SplitDao.Properties.StartEventId.isNull()
            });
        }
    }
}
