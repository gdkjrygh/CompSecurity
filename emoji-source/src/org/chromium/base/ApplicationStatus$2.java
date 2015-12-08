// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package org.chromium.base:
//            ApplicationStatus

static final class cleCallbacks
    implements android.app.LifecycleCallbacks
{

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        ApplicationStatus.access$100(activity, 1);
    }

    public void onActivityDestroyed(Activity activity)
    {
        ApplicationStatus.access$100(activity, 6);
    }

    public void onActivityPaused(Activity activity)
    {
        ApplicationStatus.access$100(activity, 4);
    }

    public void onActivityResumed(Activity activity)
    {
        ApplicationStatus.access$100(activity, 3);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
        ApplicationStatus.access$100(activity, 2);
    }

    public void onActivityStopped(Activity activity)
    {
        ApplicationStatus.access$100(activity, 5);
    }

    cleCallbacks()
    {
    }
}
