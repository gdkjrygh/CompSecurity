// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.app.Activity;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.services.settings.SettingsData;

// Referenced classes of package com.crashlytics.android:
//            Crashlytics

class this._cls0
    implements io.fabric.sdk.android.services.settings.ngsAccess
{

    final Crashlytics this$0;

    public Boolean usingSettings(SettingsData settingsdata)
    {
        boolean flag1 = true;
        Activity activity = getFabric().getCurrentActivity();
        boolean flag = flag1;
        if (activity != null)
        {
            flag = flag1;
            if (!activity.isFinishing())
            {
                flag = flag1;
                if (shouldPromptUserBeforeSendingCrashReports())
                {
                    flag = Crashlytics.access$100(Crashlytics.this, activity, settingsdata.promptData);
                }
            }
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object usingSettings(SettingsData settingsdata)
    {
        return usingSettings(settingsdata);
    }

    s.SettingsData()
    {
        this$0 = Crashlytics.this;
        super();
    }
}
