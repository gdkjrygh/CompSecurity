// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import io.fabric.sdk.android.services.settings.FeaturesSettingsData;
import io.fabric.sdk.android.services.settings.SettingsData;

// Referenced classes of package com.crashlytics.android:
//            Crashlytics

class a
    implements io.fabric.sdk.android.services.settings.ngsAccess
{

    final Crashlytics a;

    public Boolean a(SettingsData settingsdata)
    {
        boolean flag = false;
        if (settingsdata.d.a)
        {
            if (!a.w())
            {
                flag = true;
            }
            return Boolean.valueOf(flag);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    public Object b(SettingsData settingsdata)
    {
        return a(settingsdata);
    }

    s.SettingsData(Crashlytics crashlytics)
    {
        a = crashlytics;
        super();
    }
}
