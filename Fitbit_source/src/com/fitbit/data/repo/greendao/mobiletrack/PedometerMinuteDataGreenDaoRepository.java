// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mobiletrack;

import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Entity;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.PedometerMinuteData;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.p;
import com.fitbit.data.repo.ak;
import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.PedometerMinuteDataMapper;
import com.fitbit.util.ao;
import com.fitbit.util.o;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.DeleteQueryExt;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.mobiletrack:
//            DaoSession, PedometerMinuteDataDao, PedometerMinuteData

public class PedometerMinuteDataGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements ak
{
    private class MutablePedometerDailySummary extends p
    {

        final PedometerMinuteDataGreenDaoRepository this$0;

        private void setCalories(double d)
        {
            calories = d;
        }

        private void setDate(Date date)
        {
            this.date = date;
        }

        private void setDistance(Length length)
        {
            distance = length;
        }

        private void setSteps(int i)
        {
            steps = i;
        }





        public MutablePedometerDailySummary(int i, double d, Length length, Date date)
        {
            this$0 = PedometerMinuteDataGreenDaoRepository.this;
            super(i, d, length, date);
        }
    }


    private MutablePedometerDailySummary cachedDailySummary;

    public PedometerMinuteDataGreenDaoRepository()
    {
        cachedDailySummary = null;
    }

    private void addToCachedSummary(PedometerMinuteData pedometerminutedata)
    {
        if (cachedDailySummary != null && isDataFromDate(pedometerminutedata, cachedDailySummary.getDate()))
        {
            cachedDailySummary.setSteps(cachedDailySummary.getSteps() + pedometerminutedata.b());
            cachedDailySummary.setCalories(cachedDailySummary.getCalories() + caloriesFromMinuteData(pedometerminutedata));
            cachedDailySummary.setDistance(ao.a(cachedDailySummary.getDistance(), distanceFromMinuteDate(pedometerminutedata)));
            Date date1 = cachedDailySummary.getDate();
            Date date = date1;
            if (date1.getTime() < pedometerminutedata.a())
            {
                date = new Date(pedometerminutedata.a());
            }
            cachedDailySummary.setDate(date);
        }
    }

    private double caloriesFromMinuteData(PedometerMinuteData pedometerminutedata)
    {
        Profile profile = an.a().b();
        if (profile == null)
        {
            return 0.0D;
        } else
        {
            return 0.0D + (ActivityBusinessLogic.a().a(profile, new Date()) / 1440D) * pedometerminutedata.c();
        }
    }

    private Length distanceFromMinuteDate(PedometerMinuteData pedometerminutedata)
    {
        Object obj = an.a().b();
        if (obj == null)
        {
            return new Length(0.0D, com.fitbit.data.domain.Length.LengthUnits.MM);
        }
        if (pedometerminutedata.d() == com.fitbit.data.domain.PedometerMinuteData.PedometerMinuteType.RUNNING)
        {
            obj = ((Profile) (obj)).e();
        } else
        {
            obj = ((Profile) (obj)).f();
        }
        return new Length((double)pedometerminutedata.b() * ((Length) (obj)).a(com.fitbit.data.domain.Length.LengthUnits.MM).b(), com.fitbit.data.domain.Length.LengthUnits.MM);
    }

    private boolean isDataFromDate(PedometerMinuteData pedometerminutedata, Date date)
    {
        return o.j(date, new Date(pedometerminutedata.a()));
    }

    private void removeFromCachedSummary(PedometerMinuteData pedometerminutedata)
    {
        if (cachedDailySummary != null && isDataFromDate(pedometerminutedata, cachedDailySummary.getDate()))
        {
            cachedDailySummary.setSteps(cachedDailySummary.getSteps() - pedometerminutedata.b());
            cachedDailySummary.setCalories(cachedDailySummary.getCalories() - caloriesFromMinuteData(pedometerminutedata));
            cachedDailySummary.setDistance(ao.b(cachedDailySummary.getDistance(), distanceFromMinuteDate(pedometerminutedata)));
        }
    }

    public volatile void add(Entity entity)
    {
        add((PedometerMinuteData)entity);
    }

    public void add(PedometerMinuteData pedometerminutedata)
    {
        super.add(pedometerminutedata);
        addToCachedSummary(pedometerminutedata);
    }

    public void clearCachedDailySummary()
    {
        cachedDailySummary = null;
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getMobileTrackSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new PedometerMinuteDataMapper();
    }

    public volatile void delete(Entity entity)
    {
        delete((PedometerMinuteData)entity);
    }

    public void delete(PedometerMinuteData pedometerminutedata)
    {
        super.delete(pedometerminutedata);
        removeFromCachedSummary(pedometerminutedata);
    }

    public void deleteByDate(Date date, boolean flag)
    {
        long l = o.a(date).getTime();
        long l1 = o.e(date).getTime();
        date = new ArrayList();
        if (flag)
        {
            date.add(PedometerMinuteDataDao.Properties.EntityStatus.eq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.SYNCED.getCode())));
        }
        (new DeleteQueryExt(getEntityDao().queryBuilder().where(PedometerMinuteDataDao.Properties.Timestamp.between(Long.valueOf(l), Long.valueOf(l1)), (WhereCondition[])date.toArray(new WhereCondition[0])).buildDelete())).executeDeleteAndClearCache();
    }

    public void deleteOlderThanDate(Date date, boolean flag)
    {
        long l = o.a(date).getTime();
        date = new ArrayList();
        if (flag)
        {
            date.add(PedometerMinuteDataDao.Properties.EntityStatus.eq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.SYNCED.getCode())));
        }
        (new DeleteQueryExt(getEntityDao().queryBuilder().where(PedometerMinuteDataDao.Properties.Timestamp.le(Long.valueOf(l)), (WhereCondition[])date.toArray(new WhereCondition[0])).buildDelete())).executeDeleteAndClearCache();
    }

    public transient List getByDate(Date date, com.fitbit.data.domain.Entity.EntityStatus aentitystatus[])
    {
        long l = o.a(date).getTime();
        long l1 = o.e(date).getTime();
        return getEntitiesWhereAnd(PedometerMinuteDataDao.Properties.Timestamp.between(Long.valueOf(l), Long.valueOf(l1)), new WhereCondition[] {
            PedometerMinuteDataDao.Properties.EntityStatus.notIn((Object[])aentitystatus)
        });
    }

    public p getDailySummary(Date date)
    {
        int i = 0;
        double d = 0.0D;
        if (cachedDailySummary != null && o.j(date, cachedDailySummary.getDate()))
        {
            return cachedDailySummary.clone();
        }
        long l = o.a(date).getTime();
        Object obj = getEntitiesWhereAnd(PedometerMinuteDataDao.Properties.Timestamp.ge(Long.valueOf(l)), new WhereCondition[0]);
        Length length = new Length(0.0D, com.fitbit.data.domain.Length.LengthUnits.MM);
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            PedometerMinuteData pedometerminutedata = (PedometerMinuteData)((Iterator) (obj)).next();
            i += pedometerminutedata.b();
            d += caloriesFromMinuteData(pedometerminutedata);
            length = ao.a(length, distanceFromMinuteDate(pedometerminutedata));
            if (l < pedometerminutedata.a())
            {
                l = pedometerminutedata.a();
            }
        } while (true);
        if (o.i(date))
        {
            cachedDailySummary = new MutablePedometerDailySummary(i, d, length, new Date(l));
            return cachedDailySummary.clone();
        } else
        {
            return new p(i, d, length, new Date(l));
        }
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getPedometerMinuteDataDao();
    }

    public List getMinuteDataStartingFrom(long l)
    {
        return getEntitiesWhereAnd(PedometerMinuteDataDao.Properties.Timestamp.ge(Long.valueOf(l)), new WhereCondition[0]);
    }

    public List getPendingPedometerMinutesDataForDate(Date date)
    {
        return getByDate(date, new com.fitbit.data.domain.Entity.EntityStatus[] {
            com.fitbit.data.domain.Entity.EntityStatus.SYNCED, com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE
        });
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.mobiletrack.PedometerMinuteData pedometerminutedata)
    {
        return ((PedometerMinuteDataDao)getEntityDao()).getKey(pedometerminutedata);
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.mobiletrack.PedometerMinuteData)obj);
    }

    public volatile void save(Entity entity)
    {
        save((PedometerMinuteData)entity);
    }

    public void save(PedometerMinuteData pedometerminutedata)
    {
        super.save(pedometerminutedata);
    }
}
