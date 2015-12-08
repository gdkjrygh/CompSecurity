// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.heartrate;

import com.fitbit.data.repo.ac;
import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.HeartRateZoneMapper;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;

// Referenced classes of package com.fitbit.data.repo.greendao.heartrate:
//            DaoSession, HeartRateZone

public class HeartRateZoneGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements ac
{

    public HeartRateZoneGreenDaoRepository()
    {
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getHeartRateSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new HeartRateZoneMapper();
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getHeartRateZoneDao();
    }

    protected Long getPkFrom(HeartRateZone heartratezone)
    {
        return heartratezone.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((HeartRateZone)obj);
    }
}
