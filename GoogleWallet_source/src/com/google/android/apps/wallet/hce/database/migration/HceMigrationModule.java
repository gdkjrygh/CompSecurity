// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.database.migration;

import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.datastore.SchemaMigration;
import com.google.common.collect.ImmutableList;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.hce.database.migration:
//            CreateDatabaseMigration, RemoveUnusedTimeLimitsMigration

public class HceMigrationModule
{

    public HceMigrationModule()
    {
    }

    public static List provideSchemaMigrations(FeatureManager featuremanager)
    {
        return ImmutableList.builder().add(new CreateDatabaseMigration()).add(new RemoveUnusedTimeLimitsMigration()).build();
    }

    public static int provideSchemaVersion(List list)
    {
        return ((SchemaMigration)list.get(list.size() - 1)).getNewDbVersion();
    }
}
