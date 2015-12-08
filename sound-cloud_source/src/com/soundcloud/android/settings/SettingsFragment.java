// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.properties.ApplicationProperties;
import dagger.b;

// Referenced classes of package com.soundcloud.android.settings:
//            GeneralSettings

public class SettingsFragment extends PreferenceFragment
{

    ApplicationProperties appProperties;
    GeneralSettings generalSettings;

    public SettingsFragment()
    {
        SoundCloudApplication.getObjectGraph().a(this);
    }

    public static SettingsFragment create()
    {
        return new SettingsFragment();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        generalSettings.addTo(this);
    }
}
