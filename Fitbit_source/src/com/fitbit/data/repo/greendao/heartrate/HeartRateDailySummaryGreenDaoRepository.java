// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.heartrate;

import com.fitbit.data.repo.aa;
import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.HeartRateDailySummaryMapper;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.heartrate:
//            DaoSession, HeartRateDailySummary

public class HeartRateDailySummaryGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements aa
{

    public HeartRateDailySummaryGreenDaoRepository()
    {
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getHeartRateSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new HeartRateDailySummaryMapper();
    }

    public List getBetweenDates(Date date, Date date1)
    {
        return fromDbEntities(getEntityDao().queryBuilder().where(HeartRateDailySummaryDao.Properties.DateTime.between(date, date1), new WhereCondition[0]).orderAsc(new Property[] {
            HeartRateDailySummaryDao.Properties.DateTime
        }).build().list());
    }

    public List getByDate(Date date)
    {
        return getEntitiesWhereAnd(HeartRateDailySummaryDao.Properties.DateTime.eq(date), new WhereCondition[0]);
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getHeartRateDailySummaryDao();
    }

    protected Long getPkFrom(HeartRateDailySummary heartratedailysummary)
    {
        return heartratedailysummary.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((HeartRateDailySummary)obj);
    }
}
