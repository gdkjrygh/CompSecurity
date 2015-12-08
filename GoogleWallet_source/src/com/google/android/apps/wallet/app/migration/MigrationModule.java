// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.migration;

import android.content.SharedPreferences;
import com.google.android.apps.wallet.datastore.SchemaMigration;
import com.google.android.apps.wallet.datastore.Table;
import com.google.common.collect.ImmutableList;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.app.migration:
//            CreateInitialTablesMigration, DropOffersTableMigration, DropCachedDeviceNotificationSettingsMigration, SchemaMigrations, 
//            CreateWobsTableMigration, CreateWobCategoryTableMigration, DeleteCachedWobsQuantumMigration, EventLogUsesAutoIncrementingKeyMigration, 
//            DeleteCachedWobsProtoWoblMigration, AddIsHeadColumnToWobsTableMigration, DeleteCachedWobsForWobsTableNewSchemaMigration

public class MigrationModule
{

    public MigrationModule()
    {
    }

    public static List getSchemaMigrations(SharedPreferences sharedpreferences)
    {
        return ImmutableList.of(new CreateInitialTablesMigration(), new DropOffersTableMigration(), new DropCachedDeviceNotificationSettingsMigration(), SchemaMigrations.createTable(38, Table.IMAGE_UPLOAD), new CreateWobsTableMigration(), new CreateWobCategoryTableMigration(), new DeleteCachedWobsQuantumMigration(sharedpreferences), new EventLogUsesAutoIncrementingKeyMigration(), SchemaMigrations.createTable(44, Table.FOZZIE_BEAR), new DeleteCachedWobsProtoWoblMigration(45, sharedpreferences), new AddIsHeadColumnToWobsTableMigration(), new DeleteCachedWobsForWobsTableNewSchemaMigration(sharedpreferences), new SchemaMigration[] {
            new DeleteCachedWobsProtoWoblMigration(48, sharedpreferences)
        });
    }

    public static int getSchemaVersion()
    {
        return 48;
    }
}
