// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import android.app.Activity;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.crashlytics.android.beta:
//            ActivityLifecycleCheckForUpdatesController

class this._cls1
    implements Runnable
{

    final kForUpdates this$1;

    public void run()
    {
        checkForUpdates();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/crashlytics/android/beta/ActivityLifecycleCheckForUpdatesController$1

/* anonymous class */
    class ActivityLifecycleCheckForUpdatesController._cls1 extends io.fabric.sdk.android.a.b
    {

        final ActivityLifecycleCheckForUpdatesController this$0;

        public void onActivityStarted(Activity activity)
        {
            if (signalExternallyReady())
            {
                ActivityLifecycleCheckForUpdatesController.access$000(ActivityLifecycleCheckForUpdatesController.this).submit(new ActivityLifecycleCheckForUpdatesController._cls1._cls1());
            }
        }

            
            {
                this$0 = ActivityLifecycleCheckForUpdatesController.this;
                super();
            }
    }

}
