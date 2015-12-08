// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import com.fitbit.data.repo.ad;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.LocaleInfoMapper;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            AbstractEntityGreenDaoRepository, DaoSession, LocaleInfo

public class LocaleInfoGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements ad
{

    public LocaleInfoGreenDaoRepository()
    {
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new LocaleInfoMapper();
    }

    public List getByLocale(String s)
    {
        return fromDbEntities(getEntityDao().queryBuilder().where(LocaleInfoDao.Properties.Locale.eq(s), new WhereCondition[0]).build().list());
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getLocaleInfoDao();
    }

    protected Long getPkFrom(LocaleInfo localeinfo)
    {
        return localeinfo.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((LocaleInfo)obj);
    }
}
