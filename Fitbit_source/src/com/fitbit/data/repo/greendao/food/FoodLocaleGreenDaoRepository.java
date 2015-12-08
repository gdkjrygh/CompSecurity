// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;

import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.FoodLocaleMapper;
import com.fitbit.data.repo.u;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            DaoSession, FoodLocale

public class FoodLocaleGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements u
{

    public FoodLocaleGreenDaoRepository()
    {
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getFoodSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new FoodLocaleMapper();
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getFoodLocaleDao();
    }

    protected Long getPkFrom(FoodLocale foodlocale)
    {
        return foodlocale.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((FoodLocale)obj);
    }
}
