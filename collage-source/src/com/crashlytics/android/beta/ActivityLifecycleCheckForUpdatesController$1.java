// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import android.app.Activity;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.crashlytics.android.beta:
//            ActivityLifecycleCheckForUpdatesController

class this._cls0 extends io.fabric.sdk.android.ller._cls1
{

    final ActivityLifecycleCheckForUpdatesController this$0;

    public void onActivityStarted(Activity activity)
    {
        if (signalExternallyReady())
        {
            ActivityLifecycleCheckForUpdatesController.access$000(ActivityLifecycleCheckForUpdatesController.this).submit(new Runnable() {

                final ActivityLifecycleCheckForUpdatesController._cls1 this$1;

                public void run()
                {
                    checkForUpdates();
                }

            
            {
                this$1 = ActivityLifecycleCheckForUpdatesController._cls1.this;
                super();
            }
            });
        }
    }

    _cls1.this._cls1()
    {
        this$0 = ActivityLifecycleCheckForUpdatesController.this;
        super();
    }
}
