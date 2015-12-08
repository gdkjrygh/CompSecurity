// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import android.app.Activity;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android.beta:
//            ActivityLifecycleCheckForUpdatesController, AbstractCheckForUpdatesController

class a
    implements Runnable
{

    final a a;

    public void run()
    {
        a.a.a();
    }

    Q(Q q)
    {
        a = q;
        super();
    }

    // Unreferenced inner class com/crashlytics/android/beta/ActivityLifecycleCheckForUpdatesController$1

/* anonymous class */
    class ActivityLifecycleCheckForUpdatesController._cls1 extends io.fabric.sdk.android.a.b
    {

        final ActivityLifecycleCheckForUpdatesController a;

        public final void b(Activity activity)
        {
            activity = a;
            ((AbstractCheckForUpdatesController) (activity)).b.set(true);
            if (((AbstractCheckForUpdatesController) (activity)).a.get())
            {
                ActivityLifecycleCheckForUpdatesController.a(a).submit(new ActivityLifecycleCheckForUpdatesController._cls1._cls1(this));
            }
        }

            
            {
                a = activitylifecyclecheckforupdatescontroller;
                super();
            }
    }

}
