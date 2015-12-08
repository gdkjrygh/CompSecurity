// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.social;

import com.fitbit.data.domain.badges.Badge;
import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.BadgeMapper;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.h;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.DeleteQueryExt;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;

// Referenced classes of package com.fitbit.data.repo.greendao.social:
//            Badge, DaoSession

public class BadgeGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements h
{

    public BadgeGreenDaoRepository()
    {
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getSocialSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new BadgeMapper();
    }

    public void deleteByUserId(Long long1)
    {
        (new DeleteQueryExt(getEntityDao().queryBuilder().where(BadgeDao.Properties.UserId.eq(long1), new WhereCondition[0]).buildDelete())).executeDeleteAndClearCache();
    }

    public Badge getByUserId(String s, Long long1)
    {
        if (s == null || long1 == null)
        {
            return null;
        } else
        {
            return (new BadgeMapper()).fromDbEntity((com.fitbit.data.repo.greendao.social.Badge)getEntityDao().queryBuilder().where(BadgeDao.Properties.EncodedId.eq(s), new WhereCondition[] {
                BadgeDao.Properties.UserId.eq(long1)
            }).unique());
        }
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getBadgeDao();
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.social.Badge badge)
    {
        return badge.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.social.Badge)obj);
    }
}
