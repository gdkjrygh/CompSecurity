// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.app.Activity;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.services.settings.SettingsData;

// Referenced classes of package com.crashlytics.android:
//            Crashlytics

class a
    implements io.fabric.sdk.android.services.settings.ngsAccess
{

    final Crashlytics a;

    public Boolean a(SettingsData settingsdata)
    {
        boolean flag1 = true;
        Activity activity = a.D().b();
        boolean flag = flag1;
        if (activity != null)
        {
            flag = flag1;
            if (!activity.isFinishing())
            {
                flag = flag1;
                if (a.v())
                {
                    flag = Crashlytics.a(a, activity, settingsdata.c);
                }
            }
        }
        return Boolean.valueOf(flag);
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
