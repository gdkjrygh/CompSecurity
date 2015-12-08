// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;

import com.fitbit.data.repo.af;
import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.MealMapper;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            DaoSession, Meal

public class MealGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements af
{

    public MealGreenDaoRepository()
    {
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getFoodSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new MealMapper((DaoSession)abstractdaosession);
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getMealDao();
    }

    protected Long getPkFrom(Meal meal)
    {
        return meal.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((Meal)obj);
    }
}
