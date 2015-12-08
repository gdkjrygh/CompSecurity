// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.exercise;

import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.ExerciseSegmentMapper;
import com.fitbit.data.repo.q;
import com.fitbit.runtrack.data.ExerciseSegment;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.Date;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.data.repo.greendao.exercise:
//            DaoSession, ExerciseSegment

public class ExerciseSegmentGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements q
{

    public ExerciseSegmentGreenDaoRepository()
    {
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getExerciseSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new ExerciseSegmentMapper();
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getExerciseSegmentDao();
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.exercise.ExerciseSegment exercisesegment)
    {
        return exercisesegment.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.exercise.ExerciseSegment)obj);
    }

    public ExerciseSegment getSegment(UUID uuid, long l)
    {
        return (ExerciseSegment)getDistinctEntityWhere(ExerciseSegmentDao.Properties.SessionId.eq(String.valueOf(uuid)), new WhereCondition[] {
            ExerciseSegmentDao.Properties.StartEventId.eq(Long.valueOf(l))
        });
    }

    public ExerciseSegment getSegmentForTime(UUID uuid, long l)
    {
        uuid = getEntitiesWhereAnd(ExerciseSegmentDao.Properties.SessionId.eq(String.valueOf(uuid)), new WhereCondition[] {
            ExerciseSegmentDao.Properties.StartTime.le(new Date(l)), ExerciseSegmentDao.Properties.StopTime.ge(new Date(l))
        });
        if (uuid.size() > 0)
        {
            return (ExerciseSegment)uuid.get(0);
        } else
        {
            return null;
        }
    }

    public List getSegmentsInSession(UUID uuid)
    {
        return fromDbEntities(getEntityDao().queryBuilder().where(ExerciseSegmentDao.Properties.SessionId.eq(String.valueOf(uuid)), new WhereCondition[0]).orderAsc(new Property[] {
            ExerciseSegmentDao.Properties.StartEventId
        }).list());
    }
}
