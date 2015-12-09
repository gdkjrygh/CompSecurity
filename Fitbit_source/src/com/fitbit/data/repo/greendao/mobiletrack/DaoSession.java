// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mobiletrack;

import android.database.sqlite.SQLiteDatabase;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScope;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;
import java.util.Map;

// Referenced classes of package com.fitbit.data.repo.greendao.mobiletrack:
//            PedometerMinuteDataDao, PedometerMinuteData

public class DaoSession extends AbstractDaoSession
{

    private final PedometerMinuteDataDao pedometerMinuteDataDao;
    private final DaoConfig pedometerMinuteDataDaoConfig;

    public DaoSession(SQLiteDatabase sqlitedatabase, IdentityScopeType identityscopetype, Map map)
    {
        super(sqlitedatabase);
        pedometerMinuteDataDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/mobiletrack/PedometerMinuteDataDao)).clone();
        pedometerMinuteDataDaoConfig.initIdentityScope(identityscopetype);
        pedometerMinuteDataDao = new PedometerMinuteDataDao(pedometerMinuteDataDaoConfig, this);
        registerDao(com/fitbit/data/repo/greendao/mobiletrack/PedometerMinuteData, pedometerMinuteDataDao);
    }

    public void clear()
    {
        pedometerMinuteDataDaoConfig.getIdentityScope().clear();
    }

    public PedometerMinuteDataDao getPedometerMinuteDataDao()
    {
        return pedometerMinuteDataDao;
    }
}
