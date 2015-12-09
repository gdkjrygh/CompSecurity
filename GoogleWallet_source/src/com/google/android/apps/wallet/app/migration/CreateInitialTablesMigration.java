// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.migration;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.wallet.datastore.SchemaMigration;
import com.google.android.apps.wallet.datastore.Table;

// Referenced classes of package com.google.android.apps.wallet.app.migration:
//            WalletDatabaseSchema

public final class CreateInitialTablesMigration
    implements SchemaMigration
{

    public CreateInitialTablesMigration()
    {
    }

    public final int getNewDbVersion()
    {
        return 1;
    }

    public final void upgrade(SQLiteDatabase sqlitedatabase)
    {
        WalletDatabaseSchema.createTable(sqlitedatabase, Table.BANK_ACCOUNT);
        WalletDatabaseSchema.createTable(sqlitedatabase, Table.CREDENTIAL);
        WalletDatabaseSchema.createTable(sqlitedatabase, Table.METADATA);
        WalletDatabaseSchema.createTable(sqlitedatabase, Table.NOTIFICATION);
        WalletDatabaseSchema.createTable(sqlitedatabase, Table.PROXY_CARD);
        WalletDatabaseSchema.createTable(sqlitedatabase, Table.SYNC_GENERATION_MANAGER);
        WalletDatabaseSchema.createTable(sqlitedatabase, Table.WALLET_SETTING);
        WalletDatabaseSchema.createTable(sqlitedatabase, Table.WOB_INSTANCE);
        WalletDatabaseSchema.createTable(sqlitedatabase, Table.WOB_UI_LABEL);
    }
}
