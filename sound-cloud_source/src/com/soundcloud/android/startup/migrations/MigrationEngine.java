// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.startup.migrations;

import android.content.SharedPreferences;
import com.soundcloud.java.collections.Lists;
import com.soundcloud.java.collections.MoreCollections;
import com.soundcloud.java.functions.Predicate;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.android.startup.migrations:
//            Migration, SettingsMigration, DiskCacheMigration, StreamCacheMigration

public class MigrationEngine
{
    private static class ApplicableMigrationsPredicate
        implements Predicate
    {

        private final int currentVersion;
        private final int previousVersionCode;

        public boolean apply(Migration migration)
        {
            return migration.getApplicableAppVersionCode() > previousVersionCode && migration.getApplicableAppVersionCode() <= currentVersion;
        }

        public volatile boolean apply(Object obj)
        {
            return apply((Migration)obj);
        }

        public ApplicableMigrationsPredicate(int i, int j)
        {
            previousVersionCode = i;
            currentVersion = j;
        }
    }


    private static final int DEFAULT_APP_VERSION_CODE = -1;
    protected static final String VERSION_KEY = "changeLogVersionCode";
    private final int currentVersion;
    private final List migrations;
    private final SharedPreferences sharedPreferences;

    transient MigrationEngine(int i, SharedPreferences sharedpreferences, Migration amigration[])
    {
        sharedPreferences = sharedpreferences;
        currentVersion = i;
        migrations = Lists.newArrayList(amigration);
    }

    public MigrationEngine(SharedPreferences sharedpreferences, SettingsMigration settingsmigration, DiskCacheMigration diskcachemigration, StreamCacheMigration streamcachemigration)
    {
        this(313, sharedpreferences, new Migration[] {
            settingsmigration, diskcachemigration, streamcachemigration
        });
    }

    private void updateVersionKey()
    {
        android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("changeLogVersionCode", currentVersion);
        editor.apply();
    }

    public void migrate()
    {
        int i = sharedPreferences.getInt("changeLogVersionCode", -1);
        if (i != -1 && i < currentVersion)
        {
            Object obj = Lists.newArrayList(MoreCollections.filter(migrations, new ApplicableMigrationsPredicate(i, currentVersion)));
            Collections.sort(((List) (obj)), Migration.APPLICABLE_VERSION_COMPARATOR);
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Migration)((Iterator) (obj)).next()).applyMigration()) { }
        }
        updateVersionKey();
    }
}
