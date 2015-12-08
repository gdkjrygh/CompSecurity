// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

// Referenced classes of package org.chromium.base:
//            ApplicationStatusManager, WindowCallbackWrapper

static final class backs
    implements android.app.leCallbacks
{

    static final boolean $assertionsDisabled;

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        ApplicationStatusManager.access$000(activity);
    }

    public void onActivityDestroyed(Activity activity)
    {
        if (!$assertionsDisabled && !(activity.getWindow().getCallback() instanceof WindowCallbackWrapper))
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    public void onActivityPaused(Activity activity)
    {
        if (!$assertionsDisabled && !(activity.getWindow().getCallback() instanceof WindowCallbackWrapper))
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    public void onActivityResumed(Activity activity)
    {
        if (!$assertionsDisabled && !(activity.getWindow().getCallback() instanceof WindowCallbackWrapper))
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        if (!$assertionsDisabled && !(activity.getWindow().getCallback() instanceof WindowCallbackWrapper))
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    public void onActivityStarted(Activity activity)
    {
        if (!$assertionsDisabled && !(activity.getWindow().getCallback() instanceof WindowCallbackWrapper))
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    public void onActivityStopped(Activity activity)
    {
        if (!$assertionsDisabled && !(activity.getWindow().getCallback() instanceof WindowCallbackWrapper))
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!org/chromium/base/ApplicationStatusManager.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    backs()
    {
    }
}
