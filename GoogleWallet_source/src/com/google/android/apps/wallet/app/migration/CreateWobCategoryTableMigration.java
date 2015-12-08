// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.migration;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.wallet.datastore.SchemaMigration;

public final class CreateWobCategoryTableMigration
    implements SchemaMigration
{

    public CreateWobCategoryTableMigration()
    {
    }

    public final int getNewDbVersion()
    {
        return 41;
    }

    public final void upgrade(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE IF NOT EXISTS ")).append("wob_category (wob_category ").append(com.google.android.apps.wallet.datastore.Column.ColumnType.LONG).append(" NOT NULL PRIMARY KEY, next_page_token ").append(com.google.android.apps.wallet.datastore.Column.ColumnType.BLOB).append(" DEFAULT NULL, head_state ").append(com.google.android.apps.wallet.datastore.Column.ColumnType.BLOB).append(" DEFAULT NULL);").toString());
    }
}
