// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import android.app.Activity;
import io.fabric.sdk.android.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android.beta:
//            AbstractCheckForUpdatesController

class ActivityLifecycleCheckForUpdatesController extends AbstractCheckForUpdatesController
{

    private final io.fabric.sdk.android.a.b c = new io.fabric.sdk.android.a.b() {

        final ActivityLifecycleCheckForUpdatesController a;

        public final void b(Activity activity)
        {
            activity = a;
            ((AbstractCheckForUpdatesController) (activity)).b.set(true);
            if (((AbstractCheckForUpdatesController) (activity)).a.get())
            {
                com.crashlytics.android.beta.ActivityLifecycleCheckForUpdatesController.a(a).submit(new Runnable(this) {

                    final _cls1 a;

                    public void run()
                    {
                        a.a.a();
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
            }
        }

            
            {
                a = ActivityLifecycleCheckForUpdatesController.this;
                super();
            }
    };
    private final ExecutorService d;

    public ActivityLifecycleCheckForUpdatesController(a a1, ExecutorService executorservice)
    {
        d = executorservice;
        a1.a(c);
    }

    static ExecutorService a(ActivityLifecycleCheckForUpdatesController activitylifecyclecheckforupdatescontroller)
    {
        return activitylifecyclecheckforupdatescontroller.d;
    }
}
