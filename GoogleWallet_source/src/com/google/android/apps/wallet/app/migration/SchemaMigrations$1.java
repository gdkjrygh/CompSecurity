// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.migration;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.wallet.datastore.SchemaMigration;
import com.google.android.apps.wallet.datastore.Table;

// Referenced classes of package com.google.android.apps.wallet.app.migration:
//            SchemaMigrations, WalletDatabaseSchema

final class val.newDbVersion
    implements SchemaMigration
{

    final int val$newDbVersion;
    final Table val$table;

    public final int getNewDbVersion()
    {
        return val$newDbVersion;
    }

    public final void upgrade(SQLiteDatabase sqlitedatabase)
    {
        WalletDatabaseSchema.createTable(sqlitedatabase, val$table);
    }

    a()
    {
        val$table = table1;
        val$newDbVersion = i;
        super();
    }
}
