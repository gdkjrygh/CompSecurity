// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.swap;

import android.database.sqlite.SQLiteDatabase;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScope;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;
import java.util.Map;

// Referenced classes of package com.fitbit.data.repo.greendao.swap:
//            SwapTimeSeriesObjectDao, SwapHeartRateZoneDao, SwapHeartRateExerciseSummaryDao, SwapTimeSeriesObject, 
//            SwapHeartRateZone, SwapHeartRateExerciseSummary

public class DaoSession extends AbstractDaoSession
{

    private final SwapHeartRateExerciseSummaryDao swapHeartRateExerciseSummaryDao;
    private final DaoConfig swapHeartRateExerciseSummaryDaoConfig;
    private final SwapHeartRateZoneDao swapHeartRateZoneDao;
    private final DaoConfig swapHeartRateZoneDaoConfig;
    private final SwapTimeSeriesObjectDao swapTimeSeriesObjectDao;
    private final DaoConfig swapTimeSeriesObjectDaoConfig;

    public DaoSession(SQLiteDatabase sqlitedatabase, IdentityScopeType identityscopetype, Map map)
    {
        super(sqlitedatabase);
        swapTimeSeriesObjectDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/swap/SwapTimeSeriesObjectDao)).clone();
        swapTimeSeriesObjectDaoConfig.initIdentityScope(identityscopetype);
        swapHeartRateZoneDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/swap/SwapHeartRateZoneDao)).clone();
        swapHeartRateZoneDaoConfig.initIdentityScope(identityscopetype);
        swapHeartRateExerciseSummaryDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/swap/SwapHeartRateExerciseSummaryDao)).clone();
        swapHeartRateExerciseSummaryDaoConfig.initIdentityScope(identityscopetype);
        swapTimeSeriesObjectDao = new SwapTimeSeriesObjectDao(swapTimeSeriesObjectDaoConfig, this);
        swapHeartRateZoneDao = new SwapHeartRateZoneDao(swapHeartRateZoneDaoConfig, this);
        swapHeartRateExerciseSummaryDao = new SwapHeartRateExerciseSummaryDao(swapHeartRateExerciseSummaryDaoConfig, this);
        registerDao(com/fitbit/data/repo/greendao/swap/SwapTimeSeriesObject, swapTimeSeriesObjectDao);
        registerDao(com/fitbit/data/repo/greendao/swap/SwapHeartRateZone, swapHeartRateZoneDao);
        registerDao(com/fitbit/data/repo/greendao/swap/SwapHeartRateExerciseSummary, swapHeartRateExerciseSummaryDao);
    }

    public void clear()
    {
        swapTimeSeriesObjectDaoConfig.getIdentityScope().clear();
        swapHeartRateZoneDaoConfig.getIdentityScope().clear();
        swapHeartRateExerciseSummaryDaoConfig.getIdentityScope().clear();
    }

    public SwapHeartRateExerciseSummaryDao getSwapHeartRateExerciseSummaryDao()
    {
        return swapHeartRateExerciseSummaryDao;
    }

    public SwapHeartRateZoneDao getSwapHeartRateZoneDao()
    {
        return swapHeartRateZoneDao;
    }

    public SwapTimeSeriesObjectDao getSwapTimeSeriesObjectDao()
    {
        return swapTimeSeriesObjectDao;
    }
}
