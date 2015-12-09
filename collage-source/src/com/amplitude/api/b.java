// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amplitude.api;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

// Referenced classes of package com.amplitude.api:
//            c

class b
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private c a;

    public b(c c1)
    {
        a = null;
        if (c1 == null)
        {
            Log.e("com.amplitude.api.AmplitudeCallbacks", "Need to initialize AmplitudeCallbacks with AmplitudeClient instance");
            return;
        } else
        {
            a = c1;
            c1.b();
            return;
        }
    }

    protected long a()
    {
        return System.currentTimeMillis();
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public void onActivityDestroyed(Activity activity)
    {
    }

    public void onActivityPaused(Activity activity)
    {
        if (a == null)
        {
            Log.e("com.amplitude.api.AmplitudeCallbacks", "Need to initialize AmplitudeCallbacks with AmplitudeClient instance");
            return;
        } else
        {
            a.f(a());
            return;
        }
    }

    public void onActivityResumed(Activity activity)
    {
        if (a == null)
        {
            Log.e("com.amplitude.api.AmplitudeCallbacks", "Need to initialize AmplitudeCallbacks with AmplitudeClient instance");
            return;
        } else
        {
            a.g(a());
            return;
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
    }

    public void onActivityStopped(Activity activity)
    {
    }
}
