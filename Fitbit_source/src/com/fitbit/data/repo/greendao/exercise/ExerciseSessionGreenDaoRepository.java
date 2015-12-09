// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.exercise;

import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.ExerciseSessionMapper;
import com.fitbit.data.repo.r;
import com.fitbit.runtrack.data.ExerciseSession;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.WhereCondition;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.exercise:
//            DaoSession, ExerciseSession

public class ExerciseSessionGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements r
{

    public ExerciseSessionGreenDaoRepository()
    {
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getExerciseSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new ExerciseSessionMapper();
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getExerciseSessionDao();
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.exercise.ExerciseSession exercisesession)
    {
        return exercisesession.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.exercise.ExerciseSession)obj);
    }

    public List getSessions(com.fitbit.runtrack.data.ExerciseSession.Status status)
    {
        return getEntitiesWhereAnd(ExerciseSessionDao.Properties.Status.eq(status.statusLabel), new WhereCondition[0]);
    }

    public boolean updateCueIndex(ExerciseSession exercisesession, int i)
    {
        exercisesession = (ExerciseSession)getDistinctEntityWhere(ExerciseSessionDao.Properties.Uuid.eq(String.valueOf(exercisesession.getUuid())), new WhereCondition[] {
            ExerciseSessionDao.Properties.CueIndex.eq(Integer.valueOf(exercisesession.f()))
        });
        if (exercisesession == null || exercisesession.f() == i)
        {
            return false;
        } else
        {
            exercisesession.a(i);
            save(exercisesession);
            return true;
        }
    }
}
