// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.exercise;

import android.location.Location;
import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.ExerciseEventMapper;
import com.fitbit.data.repo.p;
import com.fitbit.runtrack.data.ExerciseEvent;
import com.fitbit.runtrack.data.ExerciseSegment;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.Date;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.data.repo.greendao.exercise:
//            DaoSession, ExerciseEvent

public class ExerciseEventGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements p
{

    public ExerciseEventGreenDaoRepository()
    {
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getExerciseSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new ExerciseEventMapper();
    }

    public List getAllEventsInSegment(ExerciseSegment exercisesegment)
    {
        QueryBuilder querybuilder = getEntityDao().queryBuilder().where(ExerciseEventDao.Properties.SessionId.eq(String.valueOf(exercisesegment.g())), new WhereCondition[] {
            ExerciseEventDao.Properties.Time.ge(exercisesegment.c())
        });
        if (exercisesegment.a())
        {
            querybuilder.where(ExerciseEventDao.Properties.Time.le(exercisesegment.d()), new WhereCondition[0]);
        }
        querybuilder.orderAsc(new Property[] {
            ExerciseEventDao.Properties.Time
        });
        return fromDbEntities(querybuilder.listLazy());
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getExerciseEventDao();
    }

    public List getEventsInSegment(ExerciseSegment exercisesegment, long l)
    {
        QueryBuilder querybuilder = getEntityDao().queryBuilder().where(ExerciseEventDao.Properties.SessionId.eq(String.valueOf(exercisesegment.g())), new WhereCondition[] {
            ExerciseEventDao.Properties.Id.ge(Long.valueOf(exercisesegment.e())), ExerciseEventDao.Properties.Time.ge(new Date(l))
        });
        if (exercisesegment.a())
        {
            querybuilder.where(ExerciseEventDao.Properties.Id.le(Long.valueOf(exercisesegment.f())), new WhereCondition[0]);
        }
        return fromDbEntities(querybuilder.listLazy());
    }

    public List getEventsInSession(UUID uuid)
    {
        return fromDbEntities(getEntityDao().queryBuilder().where(ExerciseEventDao.Properties.SessionId.eq(String.valueOf(uuid)), new WhereCondition[0]).orderAsc(new Property[] {
            ExerciseEventDao.Properties.Time
        }).build().listLazy());
    }

    public ExerciseEvent getLastEventInSegment(ExerciseSegment exercisesegment)
    {
        if (exercisesegment.a())
        {
            return (ExerciseEvent)getDistinctEntityWhere(ExerciseEventDao.Properties.Id.eq(Long.valueOf(exercisesegment.f())), new WhereCondition[0]);
        }
        exercisesegment = fromDbEntities(getEntityDao().queryBuilder().where(ExerciseEventDao.Properties.SessionId.eq(String.valueOf(exercisesegment.g())), new WhereCondition[] {
            ExerciseEventDao.Properties.Time.ge(exercisesegment.c())
        }).orderDesc(new Property[] {
            ExerciseEventDao.Properties.Time
        }).limit(1).build().listLazy());
        if (exercisesegment.size() > 0)
        {
            return (ExerciseEvent)exercisesegment.get(0);
        } else
        {
            return null;
        }
    }

    public ExerciseEvent getMostRecentEvent(UUID uuid)
    {
        uuid = fromDbEntities(getEntityDao().queryBuilder().where(ExerciseEventDao.Properties.SessionId.eq(String.valueOf(uuid)), new WhereCondition[0]).orderDesc(new Property[] {
            ExerciseEventDao.Properties.Time
        }).limit(1).build().listLazy());
        if (uuid.size() > 0)
        {
            return (ExerciseEvent)uuid.get(0);
        } else
        {
            return null;
        }
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.exercise.ExerciseEvent exerciseevent)
    {
        return exerciseevent.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.exercise.ExerciseEvent)obj);
    }

    public ExerciseEvent recordEvent(UUID uuid, com.fitbit.runtrack.data.ExerciseEvent.Type type, Location location)
    {
        ExerciseEvent exerciseevent1 = (ExerciseEvent)getDistinctEntityWhere(ExerciseEventDao.Properties.SessionId.eq(String.valueOf(uuid)), new WhereCondition[] {
            ExerciseEventDao.Properties.Time.eq(new Date(location.getTime()))
        });
        ExerciseEvent exerciseevent = exerciseevent1;
        if (exerciseevent1 == null)
        {
            exerciseevent = new ExerciseEvent(uuid, type, location);
            add(exerciseevent);
        }
        return exerciseevent;
    }
}
