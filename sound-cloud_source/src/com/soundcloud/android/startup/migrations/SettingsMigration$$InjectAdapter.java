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
//            SettingsMigration

public final class  extends b
    implements Provider
{

    private b sharedPreferences;

    public final void attach(l l1)
    {
        sharedPreferences = l1.a("android.content.SharedPreferences", com/soundcloud/android/startup/migrations/SettingsMigration, getClass().getClassLoader());
    }

    public final SettingsMigration get()
    {
        return new SettingsMigration((SharedPreferences)sharedPreferences.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(sharedPreferences);
    }

    public ()
    {
        super("com.soundcloud.android.startup.migrations.SettingsMigration", "members/com.soundcloud.android.startup.migrations.SettingsMigration", false, com/soundcloud/android/startup/migrations/SettingsMigration);
    }
}
