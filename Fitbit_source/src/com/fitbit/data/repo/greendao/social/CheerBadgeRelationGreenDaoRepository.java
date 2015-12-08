// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.social;

import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.CheerBadgeRelationMapper;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.k;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.social:
//            CheerBadgeRelation, DaoSession

public class CheerBadgeRelationGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements k
{

    public CheerBadgeRelationGreenDaoRepository()
    {
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getSocialSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new CheerBadgeRelationMapper();
    }

    public List getCheeresEncodedIdsByBadge(String s)
    {
        Object obj = getEntityDao().queryBuilder().where(CheerBadgeRelationDao.Properties.BadgeEncodedId.eq(s), new WhereCondition[0]).build().list();
        s = new ArrayList();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.add(((CheerBadgeRelation)((Iterator) (obj)).next()).getUserEncodedId())) { }
        return s;
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getCheerBadgeRelationDao();
    }

    protected Long getPkFrom(CheerBadgeRelation cheerbadgerelation)
    {
        return cheerbadgerelation.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((CheerBadgeRelation)obj);
    }
}
