// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.settings:
//            SettingsActivity

public final class  extends b
    implements a, Provider
{

    private b baseLayoutHelper;
    private b featureFlags;
    private b navigator;
    private b supertype;

    public final void attach(l l1)
    {
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/settings/SettingsActivity, getClass().getClassLoader());
        baseLayoutHelper = l1.a("com.soundcloud.android.view.screen.BaseLayoutHelper", com/soundcloud/android/settings/SettingsActivity, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/settings/SettingsActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.main.ScActivity", com/soundcloud/android/settings/SettingsActivity, getClass().getClassLoader(), false);
    }

    public final SettingsActivity get()
    {
        SettingsActivity settingsactivity = new SettingsActivity();
        injectMembers(settingsactivity);
        return settingsactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(featureFlags);
        set1.add(baseLayoutHelper);
        set1.add(navigator);
        set1.add(supertype);
    }

    public final void injectMembers(SettingsActivity settingsactivity)
    {
        settingsactivity.featureFlags = (FeatureFlags)featureFlags.get();
        settingsactivity.baseLayoutHelper = (BaseLayoutHelper)baseLayoutHelper.get();
        settingsactivity.navigator = (Navigator)navigator.get();
        supertype.injectMembers(settingsactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SettingsActivity)obj);
    }

    public ()
    {
        super("com.soundcloud.android.settings.SettingsActivity", "members/com.soundcloud.android.settings.SettingsActivity", false, com/soundcloud/android/settings/SettingsActivity);
    }
}
