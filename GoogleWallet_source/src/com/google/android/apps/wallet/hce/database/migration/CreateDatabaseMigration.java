// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.database.migration;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.wallet.datastore.SchemaMigration;
import com.google.android.apps.wallet.hce.database.PayPassMagStripeTable;
import com.google.android.apps.wallet.hce.database.RotatingAtcTable;

public final class CreateDatabaseMigration
    implements SchemaMigration
{

    public CreateDatabaseMigration()
    {
    }

    public final int getNewDbVersion()
    {
        return 1;
    }

    public final void upgrade(SQLiteDatabase sqlitedatabase)
    {
        RotatingAtcTable.createTable(sqlitedatabase);
        PayPassMagStripeTable.createTable(sqlitedatabase);
    }
}
