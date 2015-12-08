// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.swap;

import com.fitbit.data.domain.heartrate.HeartRateExerciseSummary;
import com.fitbit.data.repo.ab;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.HeartRateExerciseSummaryMapper;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.WhereCondition;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.swap:
//            AbstractSwapEntityGreenDaoRepository, DaoSession, SwapHeartRateExerciseSummary

public class HeartRateExerciseSummaryGreenDaoRepository extends AbstractSwapEntityGreenDaoRepository
    implements ab
{

    public HeartRateExerciseSummaryGreenDaoRepository()
    {
    }

    protected EntityMapper createMapper(DaoSession daosession)
    {
        return new HeartRateExerciseSummaryMapper();
    }

    protected AbstractDao getDaoFrom(DaoSession daosession)
    {
        return daosession.getSwapHeartRateExerciseSummaryDao();
    }

    public HeartRateExerciseSummary getForStartTime(Date date)
    {
        date = getEntitiesWhereAnd(com.fitbit.data.repo.greendao.heartrate.HeartRateDailySummaryDao.Properties.DateTime.eq(date), new WhereCondition[0]);
        if (date.isEmpty())
        {
            return null;
        } else
        {
            return (HeartRateExerciseSummary)date.get(0);
        }
    }

    protected Long getPkFrom(SwapHeartRateExerciseSummary swapheartrateexercisesummary)
    {
        return swapheartrateexercisesummary.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((SwapHeartRateExerciseSummary)obj);
    }
}
