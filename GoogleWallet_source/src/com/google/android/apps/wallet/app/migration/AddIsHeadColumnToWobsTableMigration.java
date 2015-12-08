// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.migration;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.wallet.datastore.Column;
import com.google.android.apps.wallet.datastore.SchemaMigration;
import com.google.android.apps.wallet.datastore.Table;

// Referenced classes of package com.google.android.apps.wallet.app.migration:
//            WalletDatabaseSchema

public final class AddIsHeadColumnToWobsTableMigration
    implements SchemaMigration
{

    public AddIsHeadColumnToWobsTableMigration()
    {
    }

    public final int getNewDbVersion()
    {
        return 46;
    }

    public final void upgrade(SQLiteDatabase sqlitedatabase)
    {
        if (WalletDatabaseSchema.tableHasColumn(sqlitedatabase, Table.WOB, Column.IS_INSIDE_CACHE_HEAD))
        {
            return;
        } else
        {
            sqlitedatabase.delete(Table.WOB.getTableName(), null, null);
            sqlitedatabase.execSQL(WalletDatabaseSchema.addColumnToTable(Table.WOB, Column.IS_INSIDE_CACHE_HEAD, "INTEGER", "1"));
            return;
        }
    }
}
