// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import com.soundcloud.android.properties.ApplicationProperties;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.settings:
//            SettingsFragment, GeneralSettings

public final class  extends b
    implements a, Provider
{

    private b appProperties;
    private b generalSettings;

    public final void attach(l l1)
    {
        appProperties = l1.a("com.soundcloud.android.properties.ApplicationProperties", com/soundcloud/android/settings/SettingsFragment, getClass().getClassLoader());
        generalSettings = l1.a("com.soundcloud.android.settings.GeneralSettings", com/soundcloud/android/settings/SettingsFragment, getClass().getClassLoader());
    }

    public final SettingsFragment get()
    {
        SettingsFragment settingsfragment = new SettingsFragment();
        injectMembers(settingsfragment);
        return settingsfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(appProperties);
        set1.add(generalSettings);
    }

    public final void injectMembers(SettingsFragment settingsfragment)
    {
        settingsfragment.appProperties = (ApplicationProperties)appProperties.get();
        settingsfragment.generalSettings = (GeneralSettings)generalSettings.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SettingsFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.settings.SettingsFragment", "members/com.soundcloud.android.settings.SettingsFragment", false, com/soundcloud/android/settings/SettingsFragment);
    }
}
