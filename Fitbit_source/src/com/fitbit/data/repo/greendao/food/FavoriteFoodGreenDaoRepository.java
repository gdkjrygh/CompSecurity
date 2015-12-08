// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;

import com.fitbit.data.domain.FavoriteFoodItem;
import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.FavoriteFoodMapper;
import com.fitbit.data.repo.s;
import com.fitbit.util.w;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.WhereCondition;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            DaoSession, FavoriteFood

public class FavoriteFoodGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements s
{

    public FavoriteFoodGreenDaoRepository()
    {
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getFoodSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new FavoriteFoodMapper((DaoSession)abstractdaosession);
    }

    public transient FavoriteFoodItem getByEntityId(long l, com.fitbit.data.domain.Entity.EntityStatus aentitystatus[])
    {
        return (FavoriteFoodItem)getDistinctEntityWhere(FavoriteFoodDao.Properties.FoodId.eq(Long.valueOf(l)), new WhereCondition[] {
            FavoriteFoodDao.Properties.EntityStatus.notIn((Object[])w.a(aentitystatus))
        });
    }

    public transient FavoriteFoodItem getByServerId(long l, com.fitbit.data.domain.Entity.EntityStatus aentitystatus[])
    {
        return (FavoriteFoodItem)getDistinctEntityWhere(FavoriteFoodDao.Properties.ServerFoodId.eq(Long.valueOf(l)), new WhereCondition[] {
            FavoriteFoodDao.Properties.EntityStatus.notIn((Object[])w.a(aentitystatus))
        });
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getFavoriteFoodDao();
    }

    protected Long getPkFrom(FavoriteFood favoritefood)
    {
        return favoritefood.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((FavoriteFood)obj);
    }
}
