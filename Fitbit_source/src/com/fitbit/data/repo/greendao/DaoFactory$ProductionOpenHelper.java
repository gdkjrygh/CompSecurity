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
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            DaoFactory, DaoMaster

public static class  extends 
{

    private static final int SCHEME_UPDATE_SINCE_VERSION = 95;

    public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        a.a("DaoFactory", "Downgrading schema from version [%s] to [%s]", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
        DaoMaster.dropAllTables(sqlitedatabase, true);
        onCreate(sqlitedatabase);
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        a.a("DaoFactory", "Upgrading schema from version [%s] to [%s]", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
        if (i >= 95) goto _L2; else goto _L1
_L1:
        try
        {
            a.e("DaoFactory", "DB version is too old", new Object[0]);
            throw new Throwable("DB version is too old");
        }
        catch (Throwable throwable)
        {
            a.f("DaoFactory", "Unable to upgrade scheme. Trying to recreate whole db", throwable, new Object[0]);
        }
        DaoMaster.dropAllTables(sqlitedatabase, true);
        onCreate(sqlitedatabase);
_L4:
        return;
_L2:
        boolean flag = MigrationHelper.migrate(sqlitedatabase, i, j);
        if (flag)
        {
            FitBitApplication.a().c().a(0x7f11000b).a("user_login_eviction", "migration_error", null, 0);
            com.fitbit.savedstate.d.c(true);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public (Context context, String s, android.database.sqlite.elper elper)
    {
        super(context, s, elper);
    }
}
