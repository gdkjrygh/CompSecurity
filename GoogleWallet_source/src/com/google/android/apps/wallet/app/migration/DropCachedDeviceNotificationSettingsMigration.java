// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.migration;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.wallet.datastore.Column;
import com.google.android.apps.wallet.datastore.SchemaMigration;
import com.google.android.apps.wallet.datastore.Table;

public final class DropCachedDeviceNotificationSettingsMigration
    implements SchemaMigration
{

    public DropCachedDeviceNotificationSettingsMigration()
    {
    }

    public final int getNewDbVersion()
    {
        return 37;
    }

    public final void upgrade(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.delete(Table.METADATA.getTableName(), String.valueOf(Column.ID.getColumnName()).concat("=?"), new String[] {
            "devicenotificationsettings"
        });
    }
}
