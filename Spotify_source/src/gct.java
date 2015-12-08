// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.logging.Logger;
import java.lang.ref.WeakReference;

public class gct
    implements android.app.Application.ActivityLifecycleCallbacks, dmx
{

    private WeakReference a;

    public gct(Application application)
    {
        a = new WeakReference(null);
        Logger.a("Registering activity monitor.", new Object[0]);
        application.registerActivityLifecycleCallbacks(this);
    }

    public final Optional a()
    {
        return Optional.c(a.get());
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
        if (a.get() != activity)
        {
            Logger.a("Recording activity resumed: (%s)", new Object[] {
                activity.toString()
            });
            a = new WeakReference(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
        if (a.get() != activity)
        {
            Logger.a("Recording activity started: (%s)", new Object[] {
                activity.toString()
            });
            a = new WeakReference(activity);
        }
    }

    public void onActivityStopped(Activity activity)
    {
        if (a.get() == activity)
        {
            Logger.a("Recording activity stopped: (%s)", new Object[] {
                activity.toString()
            });
            a.clear();
        }
    }
}
