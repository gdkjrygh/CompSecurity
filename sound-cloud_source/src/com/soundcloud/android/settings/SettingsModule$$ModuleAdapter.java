// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import dagger.a.r;

// Referenced classes of package com.soundcloud.android.settings:
//            SettingsModule

public final class INCLUDES extends r
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/com.soundcloud.android.settings.SettingsActivity", "members/com.soundcloud.android.settings.SettingsFragment", "members/com.soundcloud.android.settings.OfflineSettingsActivity", "members/com.soundcloud.android.settings.NotificationSettingsFragment", "members/com.soundcloud.android.settings.OfflineSettingsFragment", "members/com.soundcloud.android.settings.ClearCacheDialog", "members/com.soundcloud.android.settings.NotificationSettingsActivity", "members/com.soundcloud.android.settings.LegalActivity", "members/com.soundcloud.android.settings.LicensesActivity"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final SettingsModule newModule()
    {
        return new SettingsModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public ()
    {
        super(com/soundcloud/android/settings/SettingsModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, true, false);
    }
}
