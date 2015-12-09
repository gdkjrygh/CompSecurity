// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.data.repo.greendao.migration.MigrationHelper;
import com.fitbit.data.repo.greendao.mobiletrack.DaoMaster;
import com.fitbit.data.repo.greendao.mobiletrack.DaoSession;
import com.fitbit.data.repo.greendao.mobiletrack.PedometerMinuteData;
import com.fitbit.data.repo.greendao.mobiletrack.PedometerMinuteDataDao;
import com.fitbit.e.a;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            DaoFactory

public static class nit> extends com.fitbit.data.repo.greendao.mobiletrack._0F_
{

    private static final int MIGRATION_VERSION = 147;
    private static final String MOBILETRACK_MIGRATION_ERROR = "mobiletrack_migration_error";

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        super._01_(sqlitedatabase);
        Object obj = DaoFactory.access$000(DaoFactory.getInstance()).WritableDatabase();
        if (((SQLiteDatabase) (obj)).getVersion() == 147)
        {
            DaoMaster.createAllTables(((SQLiteDatabase) (obj)), true);
            DaoSession daosession = (new DaoMaster(sqlitedatabase)).newSession(IdentityScopeType.Session);
            sqlitedatabase = (new DaoMaster(((SQLiteDatabase) (obj)))).newSession(IdentityScopeType.Session).getPedometerMinuteDataDao();
            obj = daosession.getPedometerMinuteDataDao();
            PedometerMinuteData pedometerminutedata;
            for (Iterator iterator = sqlitedatabase.loadAll().iterator(); iterator.hasNext(); ((PedometerMinuteDataDao) (obj)).insertOrReplace(pedometerminutedata))
            {
                pedometerminutedata = (PedometerMinuteData)iterator.next();
                sqlitedatabase.detach(pedometerminutedata);
            }

        }
        DaoMaster.dropAllTables(DaoFactory.access$000(DaoFactory.getInstance()).WritableDatabase(), true);
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        a.a("DaoFactory", "Upgrading MobileTrackDB schema from version [%s] to [%s]", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
        boolean flag;
        try
        {
            flag = MigrationHelper.migrateMobileTrackDB(sqlitedatabase, i, j);
        }
        catch (Throwable throwable)
        {
            a.f("DaoFactory", "Unable to upgrade schema. Trying to recreate whole db", throwable, new Object[0]);
            DaoMaster.dropAllTables(sqlitedatabase, true);
            onCreate(sqlitedatabase);
            return;
        }
        if (flag)
        {
            FitBitApplication.a().c().a(0x7f11000b).a("user_login_eviction", "mobiletrack_migration_error", null, 0);
            com.fitbit.savedstate.d.c(true);
        }
    }

    public (Context context)
    {
        super(context, "mobile_track_db", null);
    }
}
