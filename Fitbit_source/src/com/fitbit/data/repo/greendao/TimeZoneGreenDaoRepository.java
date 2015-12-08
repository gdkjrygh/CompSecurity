// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import com.fitbit.data.domain.TimeZone;
import com.fitbit.data.repo.at;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.TimeZoneMapper;
import com.fitbit.e.a;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.WhereCondition;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            AbstractEntityGreenDaoRepository, DaoSession, TimeZoneDao, TimeZone

public class TimeZoneGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements at
{

    public TimeZoneGreenDaoRepository()
    {
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new TimeZoneMapper();
    }

    public TimeZone getByTimeZoneId(String s)
    {
        List list = getEntitiesWhereAnd(TimeZoneDao.Properties.TimeZoneId.eq(s), new WhereCondition[0]);
        if (list.size() > 1)
        {
            a.e(getClass().getSimpleName(), "TimeZone looked up with more than 1 object matching %s", new Object[] {
                s
            });
        }
        if (list.isEmpty())
        {
            return null;
        } else
        {
            return (TimeZone)list.get(0);
        }
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getTimeZoneDao();
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.TimeZone timezone)
    {
        return ((TimeZoneDao)getEntityDao()).getKey(timezone);
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.TimeZone)obj);
    }
}
