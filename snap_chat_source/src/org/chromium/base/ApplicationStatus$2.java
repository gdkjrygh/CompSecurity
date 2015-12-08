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

    public final void onActivityCreated(Activity activity, Bundle bundle)
    {
        ApplicationStatus.a(activity, 1);
    }

    public final void onActivityDestroyed(Activity activity)
    {
        ApplicationStatus.a(activity, 6);
    }

    public final void onActivityPaused(Activity activity)
    {
        ApplicationStatus.a(activity, 4);
    }

    public final void onActivityResumed(Activity activity)
    {
        ApplicationStatus.a(activity, 3);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public final void onActivityStarted(Activity activity)
    {
        ApplicationStatus.a(activity, 2);
    }

    public final void onActivityStopped(Activity activity)
    {
        ApplicationStatus.a(activity, 5);
    }

    cleCallbacks()
    {
    }
}
