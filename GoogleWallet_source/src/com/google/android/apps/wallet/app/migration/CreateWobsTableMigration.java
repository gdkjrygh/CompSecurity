// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.migration;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.wallet.datastore.SchemaMigration;
import com.google.android.apps.wallet.datastore.Table;

// Referenced classes of package com.google.android.apps.wallet.app.migration:
//            WalletDatabaseSchema

public final class CreateWobsTableMigration
    implements SchemaMigration
{

    public CreateWobsTableMigration()
    {
    }

    public final int getNewDbVersion()
    {
        return 39;
    }

    public final void upgrade(SQLiteDatabase sqlitedatabase)
    {
        WalletDatabaseSchema.createTable(sqlitedatabase, Table.WOB);
    }
}
