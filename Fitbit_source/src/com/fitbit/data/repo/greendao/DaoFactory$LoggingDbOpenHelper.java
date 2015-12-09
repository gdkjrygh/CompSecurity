// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.data.repo.greendao.logging.BodyFatLogEntry;
import com.fitbit.data.repo.greendao.logging.BodyFatLogEntryDao;
import com.fitbit.data.repo.greendao.logging.DaoMaster;
import com.fitbit.data.repo.greendao.logging.DaoSession;
import com.fitbit.data.repo.greendao.logging.SleepLogEntry;
import com.fitbit.data.repo.greendao.logging.SleepLogEntryDao;
import com.fitbit.data.repo.greendao.logging.WaterLogEntry;
import com.fitbit.data.repo.greendao.logging.WaterLogEntryDao;
import com.fitbit.data.repo.greendao.logging.WeightLogEntry;
import com.fitbit.data.repo.greendao.logging.WeightLogEntryDao;
import com.fitbit.data.repo.greendao.migration.MigrationHelper;
import com.fitbit.e.a;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            DaoFactory

public static class nit> extends com.fitbit.data.repo.greendao.logging.
{

    private static final String LOGGING_MIGRATION_ERROR = "logging_migration_error";
    private static final int MIGRATION_VERSION = 147;

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        super.(sqlitedatabase);
        Object obj = DaoFactory.access$000(DaoFactory.getInstance()).getWritableDatabase();
        if (((SQLiteDatabase) (obj)).getVersion() == 147)
        {
            DaoMaster.createAllTables(((SQLiteDatabase) (obj)), true);
            sqlitedatabase = (new DaoMaster(sqlitedatabase)).newSession(IdentityScopeType.Session);
            obj = (new DaoMaster(((SQLiteDatabase) (obj)))).newSession(IdentityScopeType.Session);
            Object obj1 = ((DaoSession) (obj)).getBodyFatLogEntryDao();
            Object obj2 = sqlitedatabase.getBodyFatLogEntryDao();
            BodyFatLogEntry bodyfatlogentry;
            for (Iterator iterator1 = ((BodyFatLogEntryDao) (obj1)).loadAll().iterator(); iterator1.hasNext(); ((BodyFatLogEntryDao) (obj2)).insertOrReplace(bodyfatlogentry))
            {
                bodyfatlogentry = (BodyFatLogEntry)iterator1.next();
                ((BodyFatLogEntryDao) (obj1)).detach(bodyfatlogentry);
            }

            obj1 = ((DaoSession) (obj)).getSleepLogEntryDao();
            obj2 = sqlitedatabase.getSleepLogEntryDao();
            SleepLogEntry sleeplogentry;
            for (Iterator iterator2 = ((SleepLogEntryDao) (obj1)).loadAll().iterator(); iterator2.hasNext(); ((SleepLogEntryDao) (obj2)).insertOrReplace(sleeplogentry))
            {
                sleeplogentry = (SleepLogEntry)iterator2.next();
                ((SleepLogEntryDao) (obj1)).detach(sleeplogentry);
            }

            obj1 = ((DaoSession) (obj)).getWaterLogEntryDao();
            obj2 = sqlitedatabase.getWaterLogEntryDao();
            WaterLogEntry waterlogentry;
            for (Iterator iterator3 = ((WaterLogEntryDao) (obj1)).loadAll().iterator(); iterator3.hasNext(); ((WaterLogEntryDao) (obj2)).insertOrReplace(waterlogentry))
            {
                waterlogentry = (WaterLogEntry)iterator3.next();
                ((WaterLogEntryDao) (obj1)).detach(waterlogentry);
            }

            obj = ((DaoSession) (obj)).getWeightLogEntryDao();
            sqlitedatabase = sqlitedatabase.getWeightLogEntryDao();
            WeightLogEntry weightlogentry;
            for (Iterator iterator = ((WeightLogEntryDao) (obj)).loadAll().iterator(); iterator.hasNext(); sqlitedatabase.insertOrReplace(weightlogentry))
            {
                weightlogentry = (WeightLogEntry)iterator.next();
                ((WeightLogEntryDao) (obj)).detach(weightlogentry);
            }

        }
        DaoMaster.dropAllTables(DaoFactory.access$000(DaoFactory.getInstance()).getWritableDatabase(), true);
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        a.a("DaoFactory", "Upgrading LoggingDB schema from version [%s] to [%s]", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
        boolean flag;
        try
        {
            flag = MigrationHelper.migrateLoggingDB(sqlitedatabase, i, j);
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
            FitBitApplication.a().c().a(0x7f11000b).a("user_login_eviction", "logging_migration_error", null, 0);
            com.fitbit.savedstate.d.c(true);
        }
    }

    public (Context context)
    {
        super(context, "logging_db", null);
    }
}
