// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.migration;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.wallet.datastore.SchemaMigration;
import com.google.android.apps.wallet.datastore.Table;

// Referenced classes of package com.google.android.apps.wallet.app.migration:
//            WalletDatabaseSchema

public final class SchemaMigrations
{

    public static SchemaMigration createTable(final int newDbVersion, final Table table)
    {
        return new SchemaMigration() {

            final int val$newDbVersion;
            final Table val$table;

            public final int getNewDbVersion()
            {
                return newDbVersion;
            }

            public final void upgrade(SQLiteDatabase sqlitedatabase)
            {
                WalletDatabaseSchema.createTable(sqlitedatabase, table);
            }

            
            {
                table = table1;
                newDbVersion = i;
                super();
            }
        };
    }
}
