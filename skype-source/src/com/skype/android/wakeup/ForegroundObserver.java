// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.wakeup;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.skype.android.wakeup:
//            ForegroundState, DreamKeeper

public class ForegroundObserver
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private DreamKeeper a;
    private ForegroundState b;
    private final AtomicInteger c = new AtomicInteger(0);

    public ForegroundObserver(Application application, DreamKeeper dreamkeeper, ForegroundState foregroundstate)
    {
        a = dreamkeeper;
        b = foregroundstate;
        application.registerActivityLifecycleCallbacks(this);
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public void onActivityDestroyed(Activity activity)
    {
    }

    public void onActivityPaused(Activity activity)
    {
    }

    public void onActivityResumed(Activity activity)
    {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
        if (c.incrementAndGet() == 1)
        {
            b.b();
            a.b(activity);
        }
    }

    public void onActivityStopped(Activity activity)
    {
        if (c.decrementAndGet() == 0)
        {
            b.a();
            a.a(activity);
        }
    }
}
