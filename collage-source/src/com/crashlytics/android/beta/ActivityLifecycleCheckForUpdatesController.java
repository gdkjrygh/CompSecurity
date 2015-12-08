// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import android.app.Activity;
import io.fabric.sdk.android.a;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.crashlytics.android.beta:
//            AbstractCheckForUpdatesController

class ActivityLifecycleCheckForUpdatesController extends AbstractCheckForUpdatesController
{

    private final io.fabric.sdk.android.a.b callbacks = new io.fabric.sdk.android.a.b() {

        final ActivityLifecycleCheckForUpdatesController this$0;

        public void onActivityStarted(Activity activity)
        {
            if (signalExternallyReady())
            {
                executorService.submit(new Runnable() {

                    final _cls1 this$1;

                    public void run()
                    {
                        checkForUpdates();
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
            }
        }

            
            {
                this$0 = ActivityLifecycleCheckForUpdatesController.this;
                super();
            }
    };
    private final ExecutorService executorService;

    public ActivityLifecycleCheckForUpdatesController(a a1, ExecutorService executorservice)
    {
        executorService = executorservice;
        a1.a(callbacks);
    }

    public boolean isActivityLifecycleTriggered()
    {
        return true;
    }

}
