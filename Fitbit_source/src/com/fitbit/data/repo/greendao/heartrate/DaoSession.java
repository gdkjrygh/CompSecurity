// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.heartrate;

import android.database.sqlite.SQLiteDatabase;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScope;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;
import java.util.Map;

// Referenced classes of package com.fitbit.data.repo.greendao.heartrate:
//            HeartRateZoneDao, HeartRateDailySummaryDao, HeartRateZone, HeartRateDailySummary

public class DaoSession extends AbstractDaoSession
{

    private final HeartRateDailySummaryDao heartRateDailySummaryDao;
    private final DaoConfig heartRateDailySummaryDaoConfig;
    private final HeartRateZoneDao heartRateZoneDao;
    private final DaoConfig heartRateZoneDaoConfig;

    public DaoSession(SQLiteDatabase sqlitedatabase, IdentityScopeType identityscopetype, Map map)
    {
        super(sqlitedatabase);
        heartRateZoneDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/heartrate/HeartRateZoneDao)).clone();
        heartRateZoneDaoConfig.initIdentityScope(identityscopetype);
        heartRateDailySummaryDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/heartrate/HeartRateDailySummaryDao)).clone();
        heartRateDailySummaryDaoConfig.initIdentityScope(identityscopetype);
        heartRateZoneDao = new HeartRateZoneDao(heartRateZoneDaoConfig, this);
        heartRateDailySummaryDao = new HeartRateDailySummaryDao(heartRateDailySummaryDaoConfig, this);
        registerDao(com/fitbit/data/repo/greendao/heartrate/HeartRateZone, heartRateZoneDao);
        registerDao(com/fitbit/data/repo/greendao/heartrate/HeartRateDailySummary, heartRateDailySummaryDao);
    }

    public void clear()
    {
        heartRateZoneDaoConfig.getIdentityScope().clear();
        heartRateDailySummaryDaoConfig.getIdentityScope().clear();
    }

    public HeartRateDailySummaryDao getHeartRateDailySummaryDao()
    {
        return heartRateDailySummaryDao;
    }

    public HeartRateZoneDao getHeartRateZoneDao()
    {
        return heartRateZoneDao;
    }
}
