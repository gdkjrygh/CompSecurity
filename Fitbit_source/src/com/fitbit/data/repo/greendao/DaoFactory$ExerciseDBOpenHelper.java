// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.data.repo.greendao.heartrate.DaoMaster;
import com.fitbit.data.repo.greendao.migration.MigrationHelper;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            DaoFactory

public static class nit> extends com.fitbit.data.repo.greendao.exercise.
{

    private static final int MIGRATION_VERSION = 1;
    private static final String SOCIAL_MIGRATION_ERROR = "social_migration_error";

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        super.(sqlitedatabase);
        DaoMaster.dropAllTables(DaoFactory.access$000(DaoFactory.getInstance()).getWritableDatabase(), true);
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        a.a("DaoFactory", "Upgrading SocialDB schema from version [%s] to [%s]", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
        boolean flag;
        try
        {
            flag = MigrationHelper.migrateSocialDB(sqlitedatabase, i, j);
        }
        catch (Throwable throwable)
        {
            a.f("DaoFactory", "Unable to upgrade schema. Trying to recreate whole db", throwable, new Object[0]);
            com.fitbit.data.repo.greendao.social.DaoMaster.dropAllTables(sqlitedatabase, true);
            onCreate(sqlitedatabase);
            return;
        }
        if (flag)
        {
            FitBitApplication.a().c().a(0x7f11000b).a("user_login_eviction", "social_migration_error", null, 0);
            com.fitbit.savedstate.d.c(true);
        }
    }

    public (Context context)
    {
        super(context, "exercise_db", null);
    }
}
