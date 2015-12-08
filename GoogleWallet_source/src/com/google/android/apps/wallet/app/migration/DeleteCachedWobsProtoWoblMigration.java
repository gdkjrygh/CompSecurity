// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.migration;

import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.datastore.SchemaMigration;
import com.google.android.apps.wallet.datastore.Table;

public final class DeleteCachedWobsProtoWoblMigration
    implements SchemaMigration
{

    private final int newDbVersion;
    private final SharedPreferences sharedPreferences;

    public DeleteCachedWobsProtoWoblMigration(int i, SharedPreferences sharedpreferences)
    {
        newDbVersion = i;
        sharedPreferences = sharedpreferences;
    }

    public final int getNewDbVersion()
    {
        return newDbVersion;
    }

    public final void upgrade(SQLiteDatabase sqlitedatabase)
    {
        SharedPreference.WOBS_LAST_SYNC_TIME.put(sharedPreferences, Long.valueOf(0L));
        sqlitedatabase.delete(Table.WOB_INSTANCE.getTableName(), null, null);
        sqlitedatabase.delete(Table.WOB.getTableName(), null, null);
        sqlitedatabase.delete(Table.WOB_CATEGORY.getTableName(), null, null);
    }
}
