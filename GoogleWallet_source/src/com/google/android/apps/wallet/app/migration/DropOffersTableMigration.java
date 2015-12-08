// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.migration;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.wallet.datastore.SchemaMigration;

// Referenced classes of package com.google.android.apps.wallet.app.migration:
//            WalletDatabaseSchema

public final class DropOffersTableMigration
    implements SchemaMigration
{

    public DropOffersTableMigration()
    {
    }

    public final int getNewDbVersion()
    {
        return 36;
    }

    public final void upgrade(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL(WalletDatabaseSchema.dropTableSql("offer"));
    }
}
