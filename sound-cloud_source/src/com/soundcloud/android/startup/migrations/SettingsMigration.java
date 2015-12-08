// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.startup.migrations;

import android.content.SharedPreferences;

// Referenced classes of package com.soundcloud.android.startup.migrations:
//            Migration

class SettingsMigration
    implements Migration
{

    protected static final String CRASHLOGS_OLD_KEY = "crashlogs";
    private final SharedPreferences sharedPreferences;

    SettingsMigration(SharedPreferences sharedpreferences)
    {
        sharedPreferences = sharedpreferences;
    }

    public void applyMigration()
    {
        android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("analytics_enabled", sharedPreferences.getBoolean("acra.enable", true));
        editor.putBoolean("acra.enable", sharedPreferences.getBoolean("crashlogs", true));
        editor.apply();
    }

    public int getApplicableAppVersionCode()
    {
        return 68;
    }
}
