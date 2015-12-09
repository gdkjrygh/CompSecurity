// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import android.app.Activity;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.services.d.t;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsCore

class this._cls0
    implements io.fabric.sdk.android.services.d.._cls0
{

    final CrashlyticsCore this$0;

    public Boolean usingSettings(t t1)
    {
        boolean flag1 = true;
        Activity activity = getFabric().b();
        boolean flag = flag1;
        if (activity != null)
        {
            flag = flag1;
            if (!activity.isFinishing())
            {
                flag = flag1;
                if (shouldPromptUserBeforeSendingCrashReports())
                {
                    flag = CrashlyticsCore.access$100(CrashlyticsCore.this, activity, t1.c);
                }
            }
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object usingSettings(t t1)
    {
        return usingSettings(t1);
    }

    ()
    {
        this$0 = CrashlyticsCore.this;
        super();
    }
}
