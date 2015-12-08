// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.startup.migrations;

import android.content.SharedPreferences;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.startup.migrations:
//            MigrationEngine, SettingsMigration, DiskCacheMigration, StreamCacheMigration

public final class  extends b
    implements Provider
{

    private b diskCacheMigration;
    private b settingsMigration;
    private b sharedPreferences;
    private b streamCacheMigration;

    public final void attach(l l1)
    {
        sharedPreferences = l1.a("android.content.SharedPreferences", com/soundcloud/android/startup/migrations/MigrationEngine, getClass().getClassLoader());
        settingsMigration = l1.a("com.soundcloud.android.startup.migrations.SettingsMigration", com/soundcloud/android/startup/migrations/MigrationEngine, getClass().getClassLoader());
        diskCacheMigration = l1.a("com.soundcloud.android.startup.migrations.DiskCacheMigration", com/soundcloud/android/startup/migrations/MigrationEngine, getClass().getClassLoader());
        streamCacheMigration = l1.a("com.soundcloud.android.startup.migrations.StreamCacheMigration", com/soundcloud/android/startup/migrations/MigrationEngine, getClass().getClassLoader());
    }

    public final MigrationEngine get()
    {
        return new MigrationEngine((SharedPreferences)sharedPreferences.get(), (SettingsMigration)settingsMigration.get(), (DiskCacheMigration)diskCacheMigration.get(), (StreamCacheMigration)streamCacheMigration.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(sharedPreferences);
        set.add(settingsMigration);
        set.add(diskCacheMigration);
        set.add(streamCacheMigration);
    }

    public ()
    {
        super("com.soundcloud.android.startup.migrations.MigrationEngine", "members/com.soundcloud.android.startup.migrations.MigrationEngine", false, com/soundcloud/android/startup/migrations/MigrationEngine);
    }
}
