// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.exercise;

import android.database.sqlite.SQLiteDatabase;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScope;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;
import java.util.Map;

// Referenced classes of package com.fitbit.data.repo.greendao.exercise:
//            ExerciseSessionDao, ExerciseEventDao, ExerciseSegmentDao, SplitDao, 
//            ExerciseSession, ExerciseEvent, ExerciseSegment, Split

public class DaoSession extends AbstractDaoSession
{

    private final ExerciseEventDao exerciseEventDao;
    private final DaoConfig exerciseEventDaoConfig;
    private final ExerciseSegmentDao exerciseSegmentDao;
    private final DaoConfig exerciseSegmentDaoConfig;
    private final ExerciseSessionDao exerciseSessionDao;
    private final DaoConfig exerciseSessionDaoConfig;
    private final SplitDao splitDao;
    private final DaoConfig splitDaoConfig;

    public DaoSession(SQLiteDatabase sqlitedatabase, IdentityScopeType identityscopetype, Map map)
    {
        super(sqlitedatabase);
        exerciseSessionDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/exercise/ExerciseSessionDao)).clone();
        exerciseSessionDaoConfig.initIdentityScope(identityscopetype);
        exerciseEventDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/exercise/ExerciseEventDao)).clone();
        exerciseEventDaoConfig.initIdentityScope(identityscopetype);
        exerciseSegmentDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/exercise/ExerciseSegmentDao)).clone();
        exerciseSegmentDaoConfig.initIdentityScope(identityscopetype);
        splitDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/exercise/SplitDao)).clone();
        splitDaoConfig.initIdentityScope(identityscopetype);
        exerciseSessionDao = new ExerciseSessionDao(exerciseSessionDaoConfig, this);
        exerciseEventDao = new ExerciseEventDao(exerciseEventDaoConfig, this);
        exerciseSegmentDao = new ExerciseSegmentDao(exerciseSegmentDaoConfig, this);
        splitDao = new SplitDao(splitDaoConfig, this);
        registerDao(com/fitbit/data/repo/greendao/exercise/ExerciseSession, exerciseSessionDao);
        registerDao(com/fitbit/data/repo/greendao/exercise/ExerciseEvent, exerciseEventDao);
        registerDao(com/fitbit/data/repo/greendao/exercise/ExerciseSegment, exerciseSegmentDao);
        registerDao(com/fitbit/data/repo/greendao/exercise/Split, splitDao);
    }

    public void clear()
    {
        exerciseSessionDaoConfig.getIdentityScope().clear();
        exerciseEventDaoConfig.getIdentityScope().clear();
        exerciseSegmentDaoConfig.getIdentityScope().clear();
        splitDaoConfig.getIdentityScope().clear();
    }

    public ExerciseEventDao getExerciseEventDao()
    {
        return exerciseEventDao;
    }

    public ExerciseSegmentDao getExerciseSegmentDao()
    {
        return exerciseSegmentDao;
    }

    public ExerciseSessionDao getExerciseSessionDao()
    {
        return exerciseSessionDao;
    }

    public SplitDao getSplitDao()
    {
        return splitDao;
    }
}
